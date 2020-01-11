package com.chen.damo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "ip_tran_line_info")
public class IpTranLineInfo {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "GUID")
    private String guid;

    /**
     * 业务场景ID
     */
    @Column(name = "MARKET_ID")
    private String marketId;

    /**
     * 业务场景名称
     */
    @Column(name = "MARKET_NAME")
    private String marketName;

    /**
     * 年度
     */
    @Column(name = "FYEAR")
    private String fyear;

    /**
     * 月份
     */
    @Column(name = "FMONTH")
    private String fmonth;

    /**
     * 线路ID
     */
    @Column(name = "LINE_ID")
    private String lineId;

    /**
     * 线路名称
     */
    @Column(name = "LINE_NAME")
    private String lineName;

    /**
     * 线路类型
            1  跨国
            2  跨网
            3  跨区
            4  跨省
            5  省内
     */
    @Column(name = "LINE_TYPE")
    private String lineType;

    /**
     * 线路类型名称
     */
    @Column(name = "LINE_TYPE_NAME")
    private String lineTypeName;

    /**
     * 线路电压等级
     */
    @Column(name = "VOLTAGE_LEVEL")
    private String voltageLevel;

    /**
     * 线路电压等级名称
     */
    @Column(name = "VOLTAGE_LEVEL_NAME")
    private String voltageLevelName;

    /**
     * 线路容量
     */
    @Column(name = "LINE_CAPACITY")
    private BigDecimal lineCapacity;

    /**
     * 线路长度
     */
    @Column(name = "LINE_LENGTH")
    private BigDecimal lineLength;

    /**
     * 投运日期
     */
    @Column(name = "START_DATE_PROD")
    private Date startDateProd;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_DATE")
    private Date updateDate;

    /**
     * 是否发布
     */
    @Column(name = "IS_PUBLISH")
    private String isPublish;

    /**
     * 获取主键ID
     *
     * @return GUID - 主键ID
     */
    public String getGuid() {
        return guid;
    }

    /**
     * 设置主键ID
     *
     * @param guid 主键ID
     */
    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    /**
     * 获取业务场景ID
     *
     * @return MARKET_ID - 业务场景ID
     */
    public String getMarketId() {
        return marketId;
    }

    /**
     * 设置业务场景ID
     *
     * @param marketId 业务场景ID
     */
    public void setMarketId(String marketId) {
        this.marketId = marketId == null ? null : marketId.trim();
    }

    /**
     * 获取业务场景名称
     *
     * @return MARKET_NAME - 业务场景名称
     */
    public String getMarketName() {
        return marketName;
    }

    /**
     * 设置业务场景名称
     *
     * @param marketName 业务场景名称
     */
    public void setMarketName(String marketName) {
        this.marketName = marketName == null ? null : marketName.trim();
    }

    /**
     * 获取年度
     *
     * @return FYEAR - 年度
     */
    public String getFyear() {
        return fyear;
    }

    /**
     * 设置年度
     *
     * @param fyear 年度
     */
    public void setFyear(String fyear) {
        this.fyear = fyear == null ? null : fyear.trim();
    }

    /**
     * 获取月份
     *
     * @return FMONTH - 月份
     */
    public String getFmonth() {
        return fmonth;
    }

    /**
     * 设置月份
     *
     * @param fmonth 月份
     */
    public void setFmonth(String fmonth) {
        this.fmonth = fmonth == null ? null : fmonth.trim();
    }

    /**
     * 获取线路ID
     *
     * @return LINE_ID - 线路ID
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * 设置线路ID
     *
     * @param lineId 线路ID
     */
    public void setLineId(String lineId) {
        this.lineId = lineId == null ? null : lineId.trim();
    }

    /**
     * 获取线路名称
     *
     * @return LINE_NAME - 线路名称
     */
    public String getLineName() {
        return lineName;
    }

    /**
     * 设置线路名称
     *
     * @param lineName 线路名称
     */
    public void setLineName(String lineName) {
        this.lineName = lineName == null ? null : lineName.trim();
    }

    /**
     * 获取线路类型
            1  跨国
            2  跨网
            3  跨区
            4  跨省
            5  省内
     *
     * @return LINE_TYPE - 线路类型
            1  跨国
            2  跨网
            3  跨区
            4  跨省
            5  省内
     */
    public String getLineType() {
        return lineType;
    }

    /**
     * 设置线路类型
            1  跨国
            2  跨网
            3  跨区
            4  跨省
            5  省内
     *
     * @param lineType 线路类型
            1  跨国
            2  跨网
            3  跨区
            4  跨省
            5  省内
     */
    public void setLineType(String lineType) {
        this.lineType = lineType == null ? null : lineType.trim();
    }

    /**
     * 获取线路类型名称
     *
     * @return LINE_TYPE_NAME - 线路类型名称
     */
    public String getLineTypeName() {
        return lineTypeName;
    }

    /**
     * 设置线路类型名称
     *
     * @param lineTypeName 线路类型名称
     */
    public void setLineTypeName(String lineTypeName) {
        this.lineTypeName = lineTypeName == null ? null : lineTypeName.trim();
    }

    /**
     * 获取线路电压等级
     *
     * @return VOLTAGE_LEVEL - 线路电压等级
     */
    public String getVoltageLevel() {
        return voltageLevel;
    }

    /**
     * 设置线路电压等级
     *
     * @param voltageLevel 线路电压等级
     */
    public void setVoltageLevel(String voltageLevel) {
        this.voltageLevel = voltageLevel == null ? null : voltageLevel.trim();
    }

    /**
     * 获取线路电压等级名称
     *
     * @return VOLTAGE_LEVEL_NAME - 线路电压等级名称
     */
    public String getVoltageLevelName() {
        return voltageLevelName;
    }

    /**
     * 设置线路电压等级名称
     *
     * @param voltageLevelName 线路电压等级名称
     */
    public void setVoltageLevelName(String voltageLevelName) {
        this.voltageLevelName = voltageLevelName == null ? null : voltageLevelName.trim();
    }

    /**
     * 获取线路容量
     *
     * @return LINE_CAPACITY - 线路容量
     */
    public BigDecimal getLineCapacity() {
        return lineCapacity;
    }

    /**
     * 设置线路容量
     *
     * @param lineCapacity 线路容量
     */
    public void setLineCapacity(BigDecimal lineCapacity) {
        this.lineCapacity = lineCapacity;
    }

    /**
     * 获取线路长度
     *
     * @return LINE_LENGTH - 线路长度
     */
    public BigDecimal getLineLength() {
        return lineLength;
    }

    /**
     * 设置线路长度
     *
     * @param lineLength 线路长度
     */
    public void setLineLength(BigDecimal lineLength) {
        this.lineLength = lineLength;
    }

    /**
     * 获取投运日期
     *
     * @return START_DATE_PROD - 投运日期
     */
    public Date getStartDateProd() {
        return startDateProd;
    }

    /**
     * 设置投运日期
     *
     * @param startDateProd 投运日期
     */
    public void setStartDateProd(Date startDateProd) {
        this.startDateProd = startDateProd;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_DATE - 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间
     *
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取是否发布
     *
     * @return IS_PUBLISH - 是否发布
     */
    public String getIsPublish() {
        return isPublish;
    }

    /**
     * 设置是否发布
     *
     * @param isPublish 是否发布
     */
    public void setIsPublish(String isPublish) {
        this.isPublish = isPublish == null ? null : isPublish.trim();
    }
}