package com.chen.damo.entity;

import javax.persistence.Column;
import java.util.Date;

public class Loginfo {
    /**
     * 主键
     */
    @Column(name = "GUID")
    private String guid;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 操作人
     */
    @Column(name = "OPERATER_MAN")
    private String operaterMan;

    /**
     * 操作类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 事项
     */
    @Column(name = "EVENT")
    private String event;

    /**
     * 获取主键
     *
     * @return GUID - 主键
     */
    public String getGuid() {
        return guid;
    }

    /**
     * 设置主键
     *
     * @param guid 主键
     */
    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_TIME - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取操作人
     *
     * @return OPERATER_MAN - 操作人
     */
    public String getOperaterMan() {
        return operaterMan;
    }

    /**
     * 设置操作人
     *
     * @param operaterMan 操作人
     */
    public void setOperaterMan(String operaterMan) {
        this.operaterMan = operaterMan == null ? null : operaterMan.trim();
    }

    /**
     * 获取操作类型
     *
     * @return TYPE - 操作类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置操作类型
     *
     * @param type 操作类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
    /**
     * 获取事项
     */
    public String getEvent() {
        return event;
    }

    /**
     * 设置事项
     * @param event
     */
    public void setEvent(String event) {
        this.event = event;
    }
}