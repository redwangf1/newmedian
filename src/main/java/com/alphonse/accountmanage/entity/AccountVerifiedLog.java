package com.alphonse.accountmanage.entity;

import java.io.Serializable;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public class AccountVerifiedLog implements Serializable {
    private Integer id;

    private Integer accountid;

    private String verifiedstatus;

    private String verifiedlevel;

    private String verifieduser;

    private String verifiedtime;

    private String ext1;

    private String ext2;

    private String ext3;

    private String ext4;

    private String ext5;

    private String ext6;

    private String ext7;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public String getVerifiedstatus() {
        return verifiedstatus;
    }

    public void setVerifiedstatus(String verifiedstatus) {
        this.verifiedstatus = verifiedstatus;
    }

    public String getVerifiedlevel() {
        return verifiedlevel;
    }

    public void setVerifiedlevel(String verifiedlevel) {
        this.verifiedlevel = verifiedlevel;
    }

    public String getVerifieduser() {
        return verifieduser;
    }

    public void setVerifieduser(String verifieduser) {
        this.verifieduser = verifieduser;
    }

    public String getVerifiedtime() {
        return verifiedtime;
    }

    public void setVerifiedtime(String verifiedtime) {
        this.verifiedtime = verifiedtime;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    public String getExt4() {
        return ext4;
    }

    public void setExt4(String ext4) {
        this.ext4 = ext4;
    }

    public String getExt5() {
        return ext5;
    }

    public void setExt5(String ext5) {
        this.ext5 = ext5;
    }

    public String getExt6() {
        return ext6;
    }

    public void setExt6(String ext6) {
        this.ext6 = ext6;
    }

    public String getExt7() {
        return ext7;
    }

    public void setExt7(String ext7) {
        this.ext7 = ext7;
    }
}