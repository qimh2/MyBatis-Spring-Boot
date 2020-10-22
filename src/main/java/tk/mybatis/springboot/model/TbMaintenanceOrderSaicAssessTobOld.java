package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_maintenance_order_saic_assess_tob_old")
public class TbMaintenanceOrderSaicAssessTobOld {
    /**
     * 主键
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 预约维保订单ID
     */
    @Column(name = "booking_order_id")
    private String bookingOrderId;

    /**
     * 评价类型
     */
    @Column(name = "assess_type")
    private String assessType;

    /**
     * 评价标签
     */
    @Column(name = "assess_label")
    private String assessLabel;

    /**
     * 评价级别
     */
    @Column(name = "assess_level")
    private Byte assessLevel;

    /**
     * 是否删除 Y-是 N-否
     */
    private String deleted;

    /**
     * 创建人
     */
    @Column(name = "create_user_id")
    private Long createUserId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新人
     */
    @Column(name = "update_user_id")
    private Long updateUserId;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 评价次数
     */
    @Column(name = "assess_number")
    private Byte assessNumber;

    /**
     * 预期描述
     */
    @Column(name = "expect_desc")
    private String expectDesc;

    /**
     * 1:是 0:否
     */
    @Column(name = "expect_status")
    private Integer expectStatus;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取预约维保订单ID
     *
     * @return booking_order_id - 预约维保订单ID
     */
    public String getBookingOrderId() {
        return bookingOrderId;
    }

    /**
     * 设置预约维保订单ID
     *
     * @param bookingOrderId 预约维保订单ID
     */
    public void setBookingOrderId(String bookingOrderId) {
        this.bookingOrderId = bookingOrderId;
    }

    /**
     * 获取评价类型
     *
     * @return assess_type - 评价类型
     */
    public String getAssessType() {
        return assessType;
    }

    /**
     * 设置评价类型
     *
     * @param assessType 评价类型
     */
    public void setAssessType(String assessType) {
        this.assessType = assessType;
    }

    /**
     * 获取评价标签
     *
     * @return assess_label - 评价标签
     */
    public String getAssessLabel() {
        return assessLabel;
    }

    /**
     * 设置评价标签
     *
     * @param assessLabel 评价标签
     */
    public void setAssessLabel(String assessLabel) {
        this.assessLabel = assessLabel;
    }

    /**
     * 获取评价级别
     *
     * @return assess_level - 评价级别
     */
    public Byte getAssessLevel() {
        return assessLevel;
    }

    /**
     * 设置评价级别
     *
     * @param assessLevel 评价级别
     */
    public void setAssessLevel(Byte assessLevel) {
        this.assessLevel = assessLevel;
    }

    /**
     * 获取是否删除 Y-是 N-否
     *
     * @return deleted - 是否删除 Y-是 N-否
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 设置是否删除 Y-是 N-否
     *
     * @param deleted 是否删除 Y-是 N-否
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取创建人
     *
     * @return create_user_id - 创建人
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建人
     *
     * @param createUserId 创建人
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新人
     *
     * @return update_user_id - 更新人
     */
    public Long getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 设置更新人
     *
     * @param updateUserId 更新人
     */
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
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
     * 获取评价次数
     *
     * @return assess_number - 评价次数
     */
    public Byte getAssessNumber() {
        return assessNumber;
    }

    /**
     * 设置评价次数
     *
     * @param assessNumber 评价次数
     */
    public void setAssessNumber(Byte assessNumber) {
        this.assessNumber = assessNumber;
    }

    /**
     * 获取预期描述
     *
     * @return expect_desc - 预期描述
     */
    public String getExpectDesc() {
        return expectDesc;
    }

    /**
     * 设置预期描述
     *
     * @param expectDesc 预期描述
     */
    public void setExpectDesc(String expectDesc) {
        this.expectDesc = expectDesc;
    }

    /**
     * 获取1:是 0:否
     *
     * @return expect_status - 1:是 0:否
     */
    public Integer getExpectStatus() {
        return expectStatus;
    }

    /**
     * 设置1:是 0:否
     *
     * @param expectStatus 1:是 0:否
     */
    public void setExpectStatus(Integer expectStatus) {
        this.expectStatus = expectStatus;
    }
}