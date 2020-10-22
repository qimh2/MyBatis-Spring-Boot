package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_booking_assess")
public class TbBookingAssess {
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
     * 评价次数
     */
    @Column(name = "assess_number")
    private Byte assessNumber;

    /**
     * 综合评价级别 1:好评 2：差评
     */
    @Column(name = "assess_level")
    private Byte assessLevel;

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
     * 获取综合评价级别 1:好评 2：差评
     *
     * @return assess_level - 综合评价级别 1:好评 2：差评
     */
    public Byte getAssessLevel() {
        return assessLevel;
    }

    /**
     * 设置综合评价级别 1:好评 2：差评
     *
     * @param assessLevel 综合评价级别 1:好评 2：差评
     */
    public void setAssessLevel(Byte assessLevel) {
        this.assessLevel = assessLevel;
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