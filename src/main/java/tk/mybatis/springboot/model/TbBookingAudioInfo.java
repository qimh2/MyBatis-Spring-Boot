package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_booking_audio_info")
public class TbBookingAudioInfo {
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
     * 评价来源类型 1:图片 2:视频 3:评价描述
     */
    @Column(name = "audio_type")
    private Byte audioType;

    /**
     * 类型：1：代表评价、2：代表预约单故障
     */
    private Byte type;

    /**
     * 路径
     */
    private String info;

    /**
     * 评价次数
     */
    @Column(name = "assess_number")
    private Byte assessNumber;

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
     * 获取评价来源类型 1:图片 2:视频 3:评价描述
     *
     * @return audio_type - 评价来源类型 1:图片 2:视频 3:评价描述
     */
    public Byte getAudioType() {
        return audioType;
    }

    /**
     * 设置评价来源类型 1:图片 2:视频 3:评价描述
     *
     * @param audioType 评价来源类型 1:图片 2:视频 3:评价描述
     */
    public void setAudioType(Byte audioType) {
        this.audioType = audioType;
    }

    /**
     * 获取类型：1：代表评价、2：代表预约单故障
     *
     * @return type - 类型：1：代表评价、2：代表预约单故障
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置类型：1：代表评价、2：代表预约单故障
     *
     * @param type 类型：1：代表评价、2：代表预约单故障
     */
    public void setType(Byte type) {
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