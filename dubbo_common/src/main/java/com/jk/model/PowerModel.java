package com.jk.model;

import java.io.Serializable;
import java.util.List;

public class PowerModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String text;
    private String url;
    private Integer pid;

    private List<PowerModel> nodes;
    private Boolean selectable;
    private Boolean checked;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public List<PowerModel> getNodes() {
        return nodes;
    }

    public void setNodes(List<PowerModel> nodes) {
        this.nodes = nodes;
    }

    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }
}
