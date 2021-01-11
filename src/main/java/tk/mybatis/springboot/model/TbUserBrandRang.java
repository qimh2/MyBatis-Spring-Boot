package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user_brand_rang")
public class TbUserBrandRang {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户userId，账号uuserId是同一套
     */
    @Id
    @Column(name = "user_id")
    private Long userId;

    /**
     * 车辆品牌，1：荣威 2 名爵 3 大通
     */
    @Column(name = "brand_code")
    private Byte brandCode;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户名小写
     */
    @Column(name = "lower_name")
    private String lowerName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 用户旺旺账号
     */
    private String wangwang;

    /**
     * 用户来往账号
     */
    private String laiwang;

    /**
     * 用户qq号
     */
    private String qq;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 图片url
     */
    @Column(name = "photo_url")
    private String photoUrl;

    /**
     * 图片id
     */
    @Column(name = "photo_id")
    private Long photoId;

    private String description;

    private Long status;

    @Column(name = "create_by")
    private Long createBy;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "last_update_by")
    private Long lastUpdateBy;

    @Column(name = "last_update_date")
    private Date lastUpdateDate;

    @Column(name = "row_version")
    private Long rowVersion;

    @Column(name = "is_valid")
    private Boolean isValid;

    /**
     * 注册来源
     */
    @Column(name = "register_source")
    private Long registerSource;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户userId，账号uuserId是同一套
     *
     * @return user_id - 用户userId，账号uuserId是同一套
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户userId，账号uuserId是同一套
     *
     * @param userId 用户userId，账号uuserId是同一套
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取车辆品牌，1：荣威 2 名爵 3 大通
     *
     * @return brand_code - 车辆品牌，1：荣威 2 名爵 3 大通
     */
    public Byte getBrandCode() {
        return brandCode;
    }

    /**
     * 设置车辆品牌，1：荣威 2 名爵 3 大通
     *
     * @param brandCode 车辆品牌，1：荣威 2 名爵 3 大通
     */
    public void setBrandCode(Byte brandCode) {
        this.brandCode = brandCode;
    }

    /**
     * 获取用户名
     *
     * @return name - 用户名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户名
     *
     * @param name 用户名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取用户名小写
     *
     * @return lower_name - 用户名小写
     */
    public String getLowerName() {
        return lowerName;
    }

    /**
     * 设置用户名小写
     *
     * @param lowerName 用户名小写
     */
    public void setLowerName(String lowerName) {
        this.lowerName = lowerName;
    }

    /**
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户昵称
     *
     * @return nick_name - 用户昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置用户昵称
     *
     * @param nickName 用户昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取用户旺旺账号
     *
     * @return wangwang - 用户旺旺账号
     */
    public String getWangwang() {
        return wangwang;
    }

    /**
     * 设置用户旺旺账号
     *
     * @param wangwang 用户旺旺账号
     */
    public void setWangwang(String wangwang) {
        this.wangwang = wangwang;
    }

    /**
     * 获取用户来往账号
     *
     * @return laiwang - 用户来往账号
     */
    public String getLaiwang() {
        return laiwang;
    }

    /**
     * 设置用户来往账号
     *
     * @param laiwang 用户来往账号
     */
    public void setLaiwang(String laiwang) {
        this.laiwang = laiwang;
    }

    /**
     * 获取用户qq号
     *
     * @return qq - 用户qq号
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置用户qq号
     *
     * @param qq 用户qq号
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * 获取用户邮箱
     *
     * @return email - 用户邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置用户邮箱
     *
     * @param email 用户邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取图片url
     *
     * @return photo_url - 图片url
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * 设置图片url
     *
     * @param photoUrl 图片url
     */
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    /**
     * 获取图片id
     *
     * @return photo_id - 图片id
     */
    public Long getPhotoId() {
        return photoId;
    }

    /**
     * 设置图片id
     *
     * @param photoId 图片id
     */
    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * @return create_by
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return last_update_by
     */
    public Long getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * @param lastUpdateBy
     */
    public void setLastUpdateBy(Long lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    /**
     * @return last_update_date
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * @param lastUpdateDate
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * @return row_version
     */
    public Long getRowVersion() {
        return rowVersion;
    }

    /**
     * @param rowVersion
     */
    public void setRowVersion(Long rowVersion) {
        this.rowVersion = rowVersion;
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
     * 获取注册来源
     *
     * @return register_source - 注册来源
     */
    public Long getRegisterSource() {
        return registerSource;
    }

    /**
     * 设置注册来源
     *
     * @param registerSource 注册来源
     */
    public void setRegisterSource(Long registerSource) {
        this.registerSource = registerSource;
    }
}