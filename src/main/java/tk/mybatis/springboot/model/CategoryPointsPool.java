package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "category_points_pool")
public class CategoryPointsPool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 品牌积分池主键
     */
    @Column(name = "brands_points_pool_id")
    private Integer brandsPointsPoolId;

    /**
     * 类目
     */
    @Column(name = "class_type")
    private String classType;

    /**
     * 模块
     */
    @Column(name = "model_name")
    private String modelName;

    /**
     * 申请积分
     */
    @Column(name = "apply_points")
    private Integer applyPoints;

    /**
     * 消耗积分
     */
    @Column(name = "used_points")
    private Integer usedPoints;

    /**
     * 剩余积分
     */
    @Column(name = "available_points")
    private Integer availablePoints;

    /**
     * 说明
     */
    private String remark;

    /**
     * 审核状态
     */
    private String status;

    /**
     * 是否删除
     */
    @Column(name = "is_del")
    private Integer isDel;



    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取品牌积分池主键
     *
     * @return brands_points_pool_id - 品牌积分池主键
     */
    public Integer getBrandsPointsPoolId() {
        return brandsPointsPoolId;
    }

    /**
     * 设置品牌积分池主键
     *
     * @param brandsPointsPoolId 品牌积分池主键
     */
    public void setBrandsPointsPoolId(Integer brandsPointsPoolId) {
        this.brandsPointsPoolId = brandsPointsPoolId;
    }

    /**
     * 获取类目
     *
     * @return class_type - 类目
     */
    public String getClassType() {
        return classType;
    }

    /**
     * 设置类目
     *
     * @param classType 类目
     */
    public void setClassType(String classType) {
        this.classType = classType;
    }

    /**
     * 获取模块
     *
     * @return model_name - 模块
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * 设置模块
     *
     * @param modelName 模块
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * 获取申请积分
     *
     * @return apply_points - 申请积分
     */
    public Integer getApplyPoints() {
        return applyPoints;
    }

    /**
     * 设置申请积分
     *
     * @param applyPoints 申请积分
     */
    public void setApplyPoints(Integer applyPoints) {
        this.applyPoints = applyPoints;
    }

    /**
     * 获取消耗积分
     *
     * @return used_points - 消耗积分
     */
    public Integer getUsedPoints() {
        return usedPoints;
    }

    /**
     * 设置消耗积分
     *
     * @param usedPoints 消耗积分
     */
    public void setUsedPoints(Integer usedPoints) {
        this.usedPoints = usedPoints;
    }

    /**
     * 获取剩余积分
     *
     * @return available_points - 剩余积分
     */
    public Integer getAvailablePoints() {
        return availablePoints;
    }

    /**
     * 设置剩余积分
     *
     * @param availablePoints 剩余积分
     */
    public void setAvailablePoints(Integer availablePoints) {
        this.availablePoints = availablePoints;
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
     * 获取审核状态
     *
     * @return status - 审核状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置审核状态
     *
     * @param status 审核状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取是否删除
     *
     * @return is_del - 是否删除
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * 设置是否删除
     *
     * @param isDel 是否删除
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }


}