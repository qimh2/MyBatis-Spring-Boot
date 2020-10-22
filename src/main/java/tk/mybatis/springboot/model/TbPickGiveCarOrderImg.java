package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_pick_give_car_order_img")
public class TbPickGiveCarOrderImg {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 取送车订单号
     */
    @Column(name = "business_order_id")
    private String businessOrderId;

    /**
     * 图片地址
     */
    @Column(name = "img_url")
    private String imgUrl;

    /**
     * 图片排序标识
     */
    private Integer sort;

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
     * 获取图片地址
     *
     * @return img_url - 图片地址
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 设置图片地址
     *
     * @param imgUrl 图片地址
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * 获取图片排序标识
     *
     * @return sort - 图片排序标识
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置图片排序标识
     *
     * @param sort 图片排序标识
     */
    public void setSort(Integer sort) {
        this.sort = sort;
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