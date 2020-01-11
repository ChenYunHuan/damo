package com.chen.damo.aspect;

import com.chen.damo.annotation.LogMessageSign;
import com.chen.damo.dao.LogInfoMapper;
import com.chen.damo.entity.Loginfo;
import com.chen.damo.util.UUIDUtli;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Aspect
@Component
public class HttpAspect {
    @Resource
    LogInfoMapper logInfoMapper;

    /*
     * service层通过注解自动记录日志
     */
    @Around("execution(public * com.chen.damo.service.*.*(..))")
    public Object serviceAround(ProceedingJoinPoint pjp) throws Throwable {
        Date startDate = new Date();
        Object object = pjp.proceed();
        Loginfo loginfo = new Loginfo();
        try {
            MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
            LogMessageSign logMessageSign = methodSignature.getMethod().getAnnotation(LogMessageSign.class);
            if (logMessageSign!=null){
                loginfo.setEvent(String.valueOf(logMessageSign.eventContent()));
                loginfo.setType(String.valueOf(logMessageSign.operationType()));
            }
            loginfo.setGuid(UUIDUtli.createId());
            loginfo.setUpdateTime(startDate);
            loginfo.setOperaterMan("admin");
            logInfoMapper.insertSelective(loginfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }
}
