package com.jk.util;

import java.io.Serializable;
import java.util.List;

/**
 * 查询Solr返回的对象，对象类型为Ｔ的集合，还包含Solr中符合条件记录总数
 * @param <T>
 */
public class ResultInfo<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<T> list = null;
    private Long total = null;

    public List<T> getList() {
        return list;
    }
    public void setList(List<T> list) {
        this.list = list;
    }
    public Long getTotal() {
        return total;
    }
    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ResultInfo{" +
                "list=" + list +
                ", total=" + total +
                '}';
    }
}
