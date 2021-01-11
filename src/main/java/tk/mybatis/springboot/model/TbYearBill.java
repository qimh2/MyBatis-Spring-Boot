package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_year_bill")
public class TbYearBill {
    /**
     * uuid
     */
    @Id
    private Long uid;

    /**
     * 首次登录时间
     */
    @Column(name = "first_login")
    private Date firstLogin;

    /**
     * 注册天数
     */
    @Column(name = "login_diff")
    private Integer loginDiff;

    /**
     * 注册天数排名
     */
    @Column(name = "login_diff_rn")
    private Integer loginDiffRn;

    /**
     * 签名次数
     */
    @Column(name = "sign_diff")
    private Integer signDiff;

    /**
     * 签名次数排名
     */
    @Column(name = "sign_diff_rn")
    private Integer signDiffRn;

    /**
     * 发言次数
     */
    @Column(name = "report_diff")
    private Integer reportDiff;

    /**
     * 发言排名
     */
    @Column(name = "report_diff_rn")
    private Integer reportDiffRn;

    /**
     * 获赞次数
     */
    @Column(name = "praise_diff")
    private Integer praiseDiff;

    /**
     * 获赞排名
     */
    @Column(name = "praise_diff_rn")
    private Integer praiseDiffRn;

    /**
     * 获得积分总数
     */
    @Column(name = "getpoint_diff")
    private Integer getpointDiff;

    /**
     * 获得积分总数排名
     */
    @Column(name = "getpoint_diff_rn")
    private Integer getpointDiffRn;

    /**
     * 最多一次获得积分数
     */
    @Column(name = "maxpoint_diff")
    private Integer maxpointDiff;

    /**
     * 消费的积分数
     */
    @Column(name = "usepoint_diff")
    private Integer usepointDiff;

    /**
     * 车系名
     */
    @Column(name = "series_name")
    private String seriesName;

    private String pt;

    /**
     * 品牌code
     */
    @Column(name = "brand_code")
    private Integer brandCode;

    /**
     * 获取uuid
     *
     * @return uid - uuid
     */
    public Long getUid() {
        return uid;
    }

    /**
     * 设置uuid
     *
     * @param uid uuid
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * 获取首次登录时间
     *
     * @return first_login - 首次登录时间
     */
    public Date getFirstLogin() {
        return firstLogin;
    }

    /**
     * 设置首次登录时间
     *
     * @param firstLogin 首次登录时间
     */
    public void setFirstLogin(Date firstLogin) {
        this.firstLogin = firstLogin;
    }

    /**
     * 获取注册天数
     *
     * @return login_diff - 注册天数
     */
    public Integer getLoginDiff() {
        return loginDiff;
    }

    /**
     * 设置注册天数
     *
     * @param loginDiff 注册天数
     */
    public void setLoginDiff(Integer loginDiff) {
        this.loginDiff = loginDiff;
    }

    /**
     * 获取注册天数排名
     *
     * @return login_diff_rn - 注册天数排名
     */
    public Integer getLoginDiffRn() {
        return loginDiffRn;
    }

    /**
     * 设置注册天数排名
     *
     * @param loginDiffRn 注册天数排名
     */
    public void setLoginDiffRn(Integer loginDiffRn) {
        this.loginDiffRn = loginDiffRn;
    }

    /**
     * 获取签名次数
     *
     * @return sign_diff - 签名次数
     */
    public Integer getSignDiff() {
        return signDiff;
    }

    /**
     * 设置签名次数
     *
     * @param signDiff 签名次数
     */
    public void setSignDiff(Integer signDiff) {
        this.signDiff = signDiff;
    }

    /**
     * 获取签名次数排名
     *
     * @return sign_diff_rn - 签名次数排名
     */
    public Integer getSignDiffRn() {
        return signDiffRn;
    }

    /**
     * 设置签名次数排名
     *
     * @param signDiffRn 签名次数排名
     */
    public void setSignDiffRn(Integer signDiffRn) {
        this.signDiffRn = signDiffRn;
    }

    /**
     * 获取发言次数
     *
     * @return report_diff - 发言次数
     */
    public Integer getReportDiff() {
        return reportDiff;
    }

    /**
     * 设置发言次数
     *
     * @param reportDiff 发言次数
     */
    public void setReportDiff(Integer reportDiff) {
        this.reportDiff = reportDiff;
    }

    /**
     * 获取发言排名
     *
     * @return report_diff_rn - 发言排名
     */
    public Integer getReportDiffRn() {
        return reportDiffRn;
    }

    /**
     * 设置发言排名
     *
     * @param reportDiffRn 发言排名
     */
    public void setReportDiffRn(Integer reportDiffRn) {
        this.reportDiffRn = reportDiffRn;
    }

    /**
     * 获取获赞次数
     *
     * @return praise_diff - 获赞次数
     */
    public Integer getPraiseDiff() {
        return praiseDiff;
    }

    /**
     * 设置获赞次数
     *
     * @param praiseDiff 获赞次数
     */
    public void setPraiseDiff(Integer praiseDiff) {
        this.praiseDiff = praiseDiff;
    }

    /**
     * 获取获赞排名
     *
     * @return praise_diff_rn - 获赞排名
     */
    public Integer getPraiseDiffRn() {
        return praiseDiffRn;
    }

    /**
     * 设置获赞排名
     *
     * @param praiseDiffRn 获赞排名
     */
    public void setPraiseDiffRn(Integer praiseDiffRn) {
        this.praiseDiffRn = praiseDiffRn;
    }

    /**
     * 获取获得积分总数
     *
     * @return getpoint_diff - 获得积分总数
     */
    public Integer getGetpointDiff() {
        return getpointDiff;
    }

    /**
     * 设置获得积分总数
     *
     * @param getpointDiff 获得积分总数
     */
    public void setGetpointDiff(Integer getpointDiff) {
        this.getpointDiff = getpointDiff;
    }

    /**
     * 获取获得积分总数排名
     *
     * @return getpoint_diff_rn - 获得积分总数排名
     */
    public Integer getGetpointDiffRn() {
        return getpointDiffRn;
    }

    /**
     * 设置获得积分总数排名
     *
     * @param getpointDiffRn 获得积分总数排名
     */
    public void setGetpointDiffRn(Integer getpointDiffRn) {
        this.getpointDiffRn = getpointDiffRn;
    }

    /**
     * 获取最多一次获得积分数
     *
     * @return maxpoint_diff - 最多一次获得积分数
     */
    public Integer getMaxpointDiff() {
        return maxpointDiff;
    }

    /**
     * 设置最多一次获得积分数
     *
     * @param maxpointDiff 最多一次获得积分数
     */
    public void setMaxpointDiff(Integer maxpointDiff) {
        this.maxpointDiff = maxpointDiff;
    }

    /**
     * 获取消费的积分数
     *
     * @return usepoint_diff - 消费的积分数
     */
    public Integer getUsepointDiff() {
        return usepointDiff;
    }

    /**
     * 设置消费的积分数
     *
     * @param usepointDiff 消费的积分数
     */
    public void setUsepointDiff(Integer usepointDiff) {
        this.usepointDiff = usepointDiff;
    }

    /**
     * 获取车系名
     *
     * @return series_name - 车系名
     */
    public String getSeriesName() {
        return seriesName;
    }

    /**
     * 设置车系名
     *
     * @param seriesName 车系名
     */
    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    /**
     * @return pt
     */
    public String getPt() {
        return pt;
    }

    /**
     * @param pt
     */
    public void setPt(String pt) {
        this.pt = pt;
    }

    /**
     * 获取品牌code
     *
     * @return brand_code - 品牌code
     */
    public Integer getBrandCode() {
        return brandCode;
    }

    /**
     * 设置品牌code
     *
     * @param brandCode 品牌code
     */
    public void setBrandCode(Integer brandCode) {
        this.brandCode = brandCode;
    }
}