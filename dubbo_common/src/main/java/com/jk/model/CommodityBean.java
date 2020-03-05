package com.jk.model;

import java.io.Serializable;

public class CommodityBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer spid;
    private String spname;
    private String haosheng;
    private String baozhuang;
    private String jine;
    private String kucunshuliang;
    private String yujingzhi;
    private String sunhuaishuliang;
    private String zaishoushuliang;

    public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public String getSpname() {
        return spname;
    }

    public void setSpname(String spname) {
        this.spname = spname;
    }

    public String getHaosheng() {
        return haosheng;
    }

    public void setHaosheng(String haosheng) {
        this.haosheng = haosheng;
    }

    public String getBaozhuang() {
        return baozhuang;
    }

    public void setBaozhuang(String baozhuang) {
        this.baozhuang = baozhuang;
    }

    public String getJine() {
        return jine;
    }

    public void setJine(String jine) {
        this.jine = jine;
    }

    public String getKucunshuliang() {
        return kucunshuliang;
    }

    public void setKucunshuliang(String kucunshuliang) {
        this.kucunshuliang = kucunshuliang;
    }

    public String getYujingzhi() {
        return yujingzhi;
    }

    public void setYujingzhi(String yujingzhi) {
        this.yujingzhi = yujingzhi;
    }

    public String getSunhuaishuliang() {
        return sunhuaishuliang;
    }

    public void setSunhuaishuliang(String sunhuaishuliang) {
        this.sunhuaishuliang = sunhuaishuliang;
    }

    public String getZaishoushuliang() {
        return zaishoushuliang;
    }

    public void setZaishoushuliang(String zaishoushuliang) {
        this.zaishoushuliang = zaishoushuliang;
    }

    @Override
    public String toString() {
        return "CommodityBean{" +
                "spid=" + spid +
                ", spname='" + spname + '\'' +
                ", haosheng='" + haosheng + '\'' +
                ", baozhuang='" + baozhuang + '\'' +
                ", jine='" + jine + '\'' +
                ", kucunshuliang='" + kucunshuliang + '\'' +
                ", yujingzhi='" + yujingzhi + '\'' +
                ", sunhuaishuliang='" + sunhuaishuliang + '\'' +
                ", zaishoushuliang='" + zaishoushuliang + '\'' +
                '}';
    }
}
