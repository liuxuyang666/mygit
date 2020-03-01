package com.jk.model;

import java.io.Serializable;
import java.util.Date;

public class DinModel implements Serializable {
    private static final long serialVersionUID = 1L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private Integer did;

    private String dbianhao;

    private String dstatus;

    private Date dtime;

    private String dzhifu;

    private String duser;

    private String dmoney;

    private String dshebei;

    private String dshuliang;

    private String dphone;

    public String getDphone() {
        return dphone;
    }

    public void setDphone(String dphone) {
        this.dphone = dphone;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDbianhao() {
        return dbianhao;
    }

    public void setDbianhao(String dbianhao) {
        this.dbianhao = dbianhao == null ? null : dbianhao.trim();
    }

    public String getDstatus() {
        return dstatus;
    }

    public void setDstatus(String dstatus) {
        this.dstatus = dstatus == null ? null : dstatus.trim();
    }

    public Date getDtime() {
        return dtime;
    }

    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }

    public String getDzhifu() {
        return dzhifu;
    }

    public void setDzhifu(String dzhifu) {
        this.dzhifu = dzhifu == null ? null : dzhifu.trim();
    }

    public String getDuser() {
        return duser;
    }

    public void setDuser(String duser) {
        this.duser = duser == null ? null : duser.trim();
    }

    public String getDmoney() {
        return dmoney;
    }

    public void setDmoney(String dmoney) {
        this.dmoney = dmoney == null ? null : dmoney.trim();
    }

    public String getDshebei() {
        return dshebei;
    }

    public void setDshebei(String dshebei) {
        this.dshebei = dshebei == null ? null : dshebei.trim();
    }

    public String getDshuliang() {
        return dshuliang;
    }

    public void setDshuliang(String dshuliang) {
        this.dshuliang = dshuliang == null ? null : dshuliang.trim();
    }
}