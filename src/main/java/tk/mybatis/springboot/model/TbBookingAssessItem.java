package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_booking_assess_item")
public class TbBookingAssessItem {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 预约单id
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

    @Column(name = "is_valid")
    private Boolean isValid;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private Long createBy;

    /**
     * 创建日期
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 更新人
     */
    @Column(name = "last_update_by")
    private Long lastUpdateBy;

    /**
     * 更新日期
     */
    @Column(name = "last_update_date")
    private Date lastUpdateDate;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取预约单id
     *
     * @return booking_order_id - 预约单id
     */
    public String getBookingOrderId() {
        return bookingOrderId;
    }

    /**
     * 设置预约单id
     *
     * @param bookingOrderId 预约单id
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

    /**
     * @return is_valid
     */
    public Boolean getIsValid() {
        return isValid;
    }

    /**
     * @param isValid
     */
    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    /**
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建日期
     *
     * @return create_date - 创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建日期
     *
     * @param createDate 创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取更新人
     *
     * @return last_update_by - 更新人
     */
    public Long getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * 设置更新人
     *
     * @param lastUpdateBy 更新人
     */
    public void setLastUpdateBy(Long lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    /**
     * 获取更新日期
     *
     * @return last_update_date - 更新日期
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * 设置更新日期
     *
     * @param lastUpdateDate 更新日期
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}