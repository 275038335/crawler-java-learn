package com.chinaredstar.jc.crawler.biz.param.department;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;
import java.util.List;


/**
 *
 */
public class DepartmentAddParam implements Serializable {
//    private static final long serialVersionUID = -7727730913806246610L;
//    //调用接口凭证
//    private String access_token;
//
//    //成员名称。长度为1~64个字节
//    @NotEmpty(message = "userId 不能为空")
//    @Length(max = 64,min = 1,message = "name长度为1~64个字节")
//    private String name;
//
//    private String parentid;
//
//    //英文名。长度为1-64个字节。
//    private String english_name;
//
//    //手机号码。企业内必须唯一，mobile/email二者不能同时为空
//    private String mobile;
//
//    //成员所属部门id列表,不超过20个
//    @NotEmpty(message = "userId 不能为空")
// //   @Size(max = 20,min = 1,message = "department长度为1~64个字节")
//    private List<Integer> department;
//
//    //部门内的排序值，默认为0。数量必须和department一致，数值越大排序越前面。有效的值范围是[0, 2^32)
//    private List<Integer> order;
//
//    //职位信息。长度为0~64个字节
//    private String position;
//
//    //性别。1表示男性，2表示女性
//    private String gender;
//
//    //邮箱。长度为0~64个字节。企业内必须唯一，mobile/email二者不能同时为空
//    private String email;
//
//    //上级字段，标识是否为上级。
//    private Integer isleader;
//
//    //启用/禁用成员。1表示启用成员，0表示禁用成员
//    private Integer enable;
//
//    //成员头像的mediaid，通过多媒体接口上传图片获得的mediaid
//    private String avatar_mediaid;
//
//    //座机。长度0-64个字节。
//    private String telephone;
//
//    //自定义字段。自定义字段需要先在WEB管理端“我的企业” — “通讯录管理”添加，否则忽略未知属性的赋值
//    private String extattr;
//
//    public DepartmentAddParam() {
//    }
//
//    public String getAccess_token() {
//        return access_token;
//    }
//
//    public void setAccess_token(String access_token) {
//        this.access_token = access_token;
//    }
//
//    public String getUserid() {
//        return userid;
//    }
//
//    public void setUserid(String userid) {
//        this.userid = userid;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEnglish_name() {
//        return english_name;
//    }
//
//    public void setEnglish_name(String english_name) {
//        this.english_name = english_name;
//    }
//
//    public String getMobile() {
//        return mobile;
//    }
//
//    public void setMobile(String mobile) {
//        this.mobile = mobile;
//    }
//
//
//    public List<Integer> getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(List<Integer> department) {
//        this.department = department;
//    }
//
//    public List<Integer> getOrder() {
//        return order;
//    }
//
//    public void setOrder(List<Integer> order) {
//        this.order = order;
//    }
//
//    public String getPosition() {
//        return position;
//    }
//
//    public void setPosition(String position) {
//        this.position = position;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Integer getIsleader() {
//        return isleader;
//    }
//
//    public void setIsleader(Integer isleader) {
//        this.isleader = isleader;
//    }
//
//    public Integer getEnable() {
//        return enable;
//    }
//
//    public void setEnable(Integer enable) {
//        this.enable = enable;
//    }
//
//    public String getAvatar_mediaid() {
//        return avatar_mediaid;
//    }
//
//    public void setAvatar_mediaid(String avatar_mediaid) {
//        this.avatar_mediaid = avatar_mediaid;
//    }
//
//    public String getTelephone() {
//        return telephone;
//    }
//
//    public void setTelephone(String telephone) {
//        this.telephone = telephone;
//    }
//
//    public String getExtattr() {
//        return extattr;
//    }
//
//    public void setExtattr(String extattr) {
//        this.extattr = extattr;
//    }
}
