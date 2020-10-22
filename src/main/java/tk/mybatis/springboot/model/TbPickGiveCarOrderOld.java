package tk.mybatis.springboot.model;

import com.alibaba.fastjson.JSON;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_pick_give_car_order_old")
public class TbPickGiveCarOrderOld {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 预约单号
     */
    @Column(name = "booking_order_id")
    private String bookingOrderId;

    /**
     * 取送车订单号
     */
    @Column(name = "business_order_id")
    private String businessOrderId;

    /**
     * 订单类型(1.取车订单 2.送车订单)
     */
    @Column(name = "order_type")
    private Integer orderType;

    /**
     * 验证码
     */
    private String code;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户电话
     */
    @Column(name = "user_tel")
    private String userTel;

    /**
     * 用户取送车地址
     */
    @Column(name = "user_address")
    private String userAddress;

    /**
     * 用户取送车时间，格式yyyy-MM-dd HH:mm:ss
     */
    @Column(name = "business_time")
    private String businessTime;

    /**
     * 服务站编号
     */
    @Column(name = "station_code")
    private String stationCode;

    /**
     * 服务站名称
     */
    @Column(name = "station_name")
    private String stationName;

    /**
     * 服务顾问id
     */
    @Column(name = "saler_id")
    private String salerId;

    /**
     * 服务顾问姓名
     */
    @Column(name = "saler_name")
    private String salerName;

    /**
     * 服务顾问电话
     */
    @Column(name = "saler_phone")
    private String salerPhone;

    /**
     * 服务顾问取送车地址
     */
    @Column(name = "saler_address")
    private String salerAddress;

    /**
     * 服务顾问取送车时间，格式yyyy-MM-dd HH:mm:ss
     */
    @Column(name = "saler_time")
    private String salerTime;

    /**
     * 订单状态(0新建 1待支付 2已支付 3司机分配成功 4司机抵达取车点 5取车成功 6司机抵达目的地 7待评价 8已完成 9退款中 10已关闭 10已支付待未创建E代驾订单)
     */
    @Column(name = "order_status")
    private String orderStatus;

    /**
     * 订单金额
     */
    @Column(name = "order_amount")
    private String orderAmount;

    /**
     * 优惠金额
     */
    @Column(name = "discount_amount")
    private String discountAmount;

    /**
     * 支付金额
     */
    @Column(name = "pay_amount")
    private String payAmount;

    /**
     * 支付方式1,在线支付，2，到店支付
     */
    @Column(name = "pay_method")
    private String payMethod;

    /**
     * 司机工号
     */
    @Column(name = "driver_code")
    private String driverCode;

    /**
     * 司机姓名
     */
    @Column(name = "driver_name")
    private String driverName;

    /**
     * 司机手机
     */
    @Column(name = "driver_phone")
    private String driverPhone;

    /**
     * 是否删除 Y-是 N-否
     */
    private String deleted;

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
     * 获取预约单号
     *
     * @return booking_order_id - 预约单号
     */
    public String getBookingOrderId() {
        return bookingOrderId;
    }

    /**
     * 设置预约单号
     *
     * @param bookingOrderId 预约单号
     */
    public void setBookingOrderId(String bookingOrderId) {
        this.bookingOrderId = bookingOrderId;
    }

    /**
     * 获取取送车订单号
     *
     * @return business_order_id - 取送车订单号
     */
    public String getBusinessOrderId() {
        return businessOrderId;
    }

    /**
     * 设置取送车订单号
     *
     * @param businessOrderId 取送车订单号
     */
    public void setBusinessOrderId(String businessOrderId) {
        this.businessOrderId = businessOrderId;
    }

    /**
     * 获取订单类型(1.取车订单 2.送车订单)
     *
     * @return order_type - 订单类型(1.取车订单 2.送车订单)
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * 设置订单类型(1.取车订单 2.送车订单)
     *
     * @param orderType 订单类型(1.取车订单 2.送车订单)
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取验证码
     *
     * @return code - 验证码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置验证码
     *
     * @param code 验证码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户姓名
     *
     * @return user_name - 用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户姓名
     *
     * @param userName 用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户电话
     *
     * @return user_tel - 用户电话
     */
    public String getUserTel() {
        return userTel;
    }

    /**
     * 设置用户电话
     *
     * @param userTel 用户电话
     */
    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    /**
     * 获取用户取送车地址
     *
     * @return user_address - 用户取送车地址
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * 设置用户取送车地址
     *
     * @param userAddress 用户取送车地址
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    /**
     * 获取用户取送车时间，格式yyyy-MM-dd HH:mm:ss
     *
     * @return business_time - 用户取送车时间，格式yyyy-MM-dd HH:mm:ss
     */
    public String getBusinessTime() {
        return businessTime;
    }

    /**
     * 设置用户取送车时间，格式yyyy-MM-dd HH:mm:ss
     *
     * @param businessTime 用户取送车时间，格式yyyy-MM-dd HH:mm:ss
     */
    public void setBusinessTime(String businessTime) {
        this.businessTime = businessTime;
    }

    /**
     * 获取服务站编号
     *
     * @return station_code - 服务站编号
     */
    public String getStationCode() {
        return stationCode;
    }

    /**
     * 设置服务站编号
     *
     * @param stationCode 服务站编号
     */
    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    /**
     * 获取服务站名称
     *
     * @return station_name - 服务站名称
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * 设置服务站名称
     *
     * @param stationName 服务站名称
     */
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    /**
     * 获取服务顾问id
     *
     * @return saler_id - 服务顾问id
     */
    public String getSalerId() {
        return salerId;
    }

    /**
     * 设置服务顾问id
     *
     * @param salerId 服务顾问id
     */
    public void setSalerId(String salerId) {
        this.salerId = salerId;
    }

    /**
     * 获取服务顾问姓名
     *
     * @return saler_name - 服务顾问姓名
     */
    public String getSalerName() {
        return salerName;
    }

    /**
     * 设置服务顾问姓名
     *
     * @param salerName 服务顾问姓名
     */
    public void setSalerName(String salerName) {
        this.salerName = salerName;
    }

    /**
     * 获取服务顾问电话
     *
     * @return saler_phone - 服务顾问电话
     */
    public String getSalerPhone() {
        return salerPhone;
    }

    /**
     * 设置服务顾问电话
     *
     * @param salerPhone 服务顾问电话
     */
    public void setSalerPhone(String salerPhone) {
        this.salerPhone = salerPhone;
    }

    /**
     * 获取服务顾问取送车地址
     *
     * @return saler_address - 服务顾问取送车地址
     */
    public String getSalerAddress() {
        return salerAddress;
    }

    /**
     * 设置服务顾问取送车地址
     *
     * @param salerAddress 服务顾问取送车地址
     */
    public void setSalerAddress(String salerAddress) {
        this.salerAddress = salerAddress;
    }

    /**
     * 获取服务顾问取送车时间，格式yyyy-MM-dd HH:mm:ss
     *
     * @return saler_time - 服务顾问取送车时间，格式yyyy-MM-dd HH:mm:ss
     */
    public String getSalerTime() {
        return salerTime;
    }

    /**
     * 设置服务顾问取送车时间，格式yyyy-MM-dd HH:mm:ss
     *
     * @param salerTime 服务顾问取送车时间，格式yyyy-MM-dd HH:mm:ss
     */
    public void setSalerTime(String salerTime) {
        this.salerTime = salerTime;
    }

    /**
     * 获取订单状态(0新建 1待支付 2已支付 3司机分配成功 4司机抵达取车点 5取车成功 6司机抵达目的地 7待评价 8已完成 9退款中 10已关闭 10已支付待未创建E代驾订单)
     *
     * @return order_status - 订单状态(0新建 1待支付 2已支付 3司机分配成功 4司机抵达取车点 5取车成功 6司机抵达目的地 7待评价 8已完成 9退款中 10已关闭 10已支付待未创建E代驾订单)
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态(0新建 1待支付 2已支付 3司机分配成功 4司机抵达取车点 5取车成功 6司机抵达目的地 7待评价 8已完成 9退款中 10已关闭 10已支付待未创建E代驾订单)
     *
     * @param orderStatus 订单状态(0新建 1待支付 2已支付 3司机分配成功 4司机抵达取车点 5取车成功 6司机抵达目的地 7待评价 8已完成 9退款中 10已关闭 10已支付待未创建E代驾订单)
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取订单金额
     *
     * @return order_amount - 订单金额
     */
    public String getOrderAmount() {
        return orderAmount;
    }

    /**
     * 设置订单金额
     *
     * @param orderAmount 订单金额
     */
    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 获取优惠金额
     *
     * @return discount_amount - 优惠金额
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * 设置优惠金额
     *
     * @param discountAmount 优惠金额
     */
    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * 获取支付金额
     *
     * @return pay_amount - 支付金额
     */
    public String getPayAmount() {
        return payAmount;
    }

    /**
     * 设置支付金额
     *
     * @param payAmount 支付金额
     */
    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * 获取支付方式1,在线支付，2，到店支付
     *
     * @return pay_method - 支付方式1,在线支付，2，到店支付
     */
    public String getPayMethod() {
        return payMethod;
    }

    /**
     * 设置支付方式1,在线支付，2，到店支付
     *
     * @param payMethod 支付方式1,在线支付，2，到店支付
     */
    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    /**
     * 获取司机工号
     *
     * @return driver_code - 司机工号
     */
    public String getDriverCode() {
        return driverCode;
    }

    /**
     * 设置司机工号
     *
     * @param driverCode 司机工号
     */
    public void setDriverCode(String driverCode) {
        this.driverCode = driverCode;
    }

    /**
     * 获取司机姓名
     *
     * @return driver_name - 司机姓名
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * 设置司机姓名
     *
     * @param driverName 司机姓名
     */
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    /**
     * 获取司机手机
     *
     * @return driver_phone - 司机手机
     */
    public String getDriverPhone() {
        return driverPhone;
    }

    /**
     * 设置司机手机
     *
     * @param driverPhone 司机手机
     */
    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}