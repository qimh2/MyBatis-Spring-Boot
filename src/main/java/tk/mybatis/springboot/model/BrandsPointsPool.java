package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "brands_points_pool")
public class BrandsPointsPool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 品牌
     */
    @Column(name = "brand_code")
    private Integer brandCode;

    /**
     * 开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 初始积分
     */
    @Column(name = "init_points")
    private Integer initPoints;

    /**
     * 剩余积分
     */
    @Column(name = "available_point")
    private String availablePoint;

    /**
     * PR
     */
    private String pr;

    /**
     * 说明
     */
    private String remark;

    /**
     * 状态
     */
    private String status;

    @Column(name = "is_del")
    private Integer isDel;



    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取品牌
     *
     * @return brand_code - 品牌
     */
    public Integer getBrandCode() {
        return brandCode;
    }

    /**
     * 设置品牌
     *
     * @param brandCode 品牌
     */
    public void setBrandCode(Integer brandCode) {
        this.brandCode = brandCode;
    }

    /**
     * 获取开始时间
     *
     * @return start_time - 开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开始时间
     *
     * @param startTime 开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取初始积分
     *
     * @return init_points - 初始积分
     */
    public Integer getInitPoints() {
        return initPoints;
    }

    /**
     * 设置初始积分
     *
     * @param initPoints 初始积分
     */
    public void setInitPoints(Integer initPoints) {
        this.initPoints = initPoints;
    }

    /**
     * 获取剩余积分
     *
     * @return available_point - 剩余积分
     */
    public String getAvailablePoint() {
        return availablePoint;
    }

    /**
     * 设置剩余积分
     *
     * @param availablePoint 剩余积分
     */
    public void setAvailablePoint(String availablePoint) {
        this.availablePoint = availablePoint;
    }

    /**
     * 获取PR
     *
     * @return pr - PR
     */
    public String getPr() {
        return pr;
    }

    /**
     * 设置PR
     *
     * @param pr PR
     */
    public void setPr(String pr) {
        this.pr = pr;
    }

    /**
     * 获取说明
     *
     * @return remark - 说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置说明
     *
     * @param remark 说明
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return is_del
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * @param isDel
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

}