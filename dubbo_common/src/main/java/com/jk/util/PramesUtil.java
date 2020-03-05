package com.jk.util;

import java.io.Serializable;

public class PramesUtil implements Serializable {
    private static final long serialVersionUID = 1L;
     private Integer pageNumber;
    private Integer pageSize;
    private String sortName;
    private String sortOrder;
    private String carname;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    @Override
    public String toString() {
        return "PramesUtil{" +
                "pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", sortName='" + sortName + '\'' +
                ", sortOrder='" + sortOrder + '\'' +
                ", carname='" + carname + '\'' +
                '}';
    }
}
