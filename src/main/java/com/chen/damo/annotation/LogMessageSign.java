package com.chen.damo.annotation;

import com.chen.damo.enums.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * service层自动记录日志
 * @author cyh
 *
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface LogMessageSign {

    String eventContent();
    
    OperationType operationType();
}
