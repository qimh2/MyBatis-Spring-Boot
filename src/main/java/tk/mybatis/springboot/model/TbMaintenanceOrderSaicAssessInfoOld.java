package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_maintenance_order_saic_assess_info_old")
public class TbMaintenanceOrderSaicAssessInfoOld {
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
     * 评价来源类型 1:图片 2:视频 3:评价描述
     */
    private Boolean type;

    /**
     * 路径
     */
    private String info;

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
     * 获取评价来源类型 1:图片 2:视频 3:评价描述
     *
     * @return type - 评价来源类型 1:图片 2:视频 3:评价描述
     */
    public Boolean getType() {
        return type;
    }

    /**
     * 设置评价来源类型 1:图片 2:视频 3:评价描述
     *
     * @param type 评价来源类型 1:图片 2:视频 3:评价描述
     */
    public void setType(Boolean type) {
        this.type = type;
    }

    /**
     * 获取路径
     *
     * @return info - 路径
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置路径
     *
     * @param info 路径
     */
    public void setInfo(String info) {
        this.info = info;
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
}