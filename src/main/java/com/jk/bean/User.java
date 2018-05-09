/**
 * Copyright (C), 2015-2018, 龙盾技术科技有限公司
 * FileName: User
 * Author:   ASUS
 * Date:     2018/5/7 9:29
 * Description:
 * History:
 * <author>          <e_mail>
 * 孙国锦          getElements@outlook.com
 */
package com.jk.bean;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author ASUS
 * @create 2018/5/7
 * @since 1.0.0
 */
public class User implements Serializable {


    private static final long serialVersionUID = -3676666646628460961L;
    private Integer uid;
    private String uname;
    private String loginname;
    private String pwd;
    private Integer age;


    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", loginname='" + loginname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}