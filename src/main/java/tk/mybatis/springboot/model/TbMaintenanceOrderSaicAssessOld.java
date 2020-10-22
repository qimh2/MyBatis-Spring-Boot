package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "tb_maintenance_order_saic_assess_old")
public class TbMaintenanceOrderSaicAssessOld {
    /**
     * 主键
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单号
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
     * 获取订单号
     *
     * @return booking_order_id - 订单号
     */
    public String getBookingOrderId() {
        return bookingOrderId;
    }

    /**
     * 设置订单号
     *
     * @param bookingOrderId 订单号
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
}