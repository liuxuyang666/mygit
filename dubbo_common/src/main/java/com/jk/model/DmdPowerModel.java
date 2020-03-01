package com.jk.model;

import java.io.Serializable;
import java.util.List;

public class DmdPowerModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String text;
    private String url;
    private Integer pid;

    private List<DmdPowerModel> nodes;
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

    public List<DmdPowerModel> getNodes() {
        return nodes;
    }

    public void setNodes(List<DmdPowerModel> nodes) {
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

    @Override
    public String toString() {
        return "DmdPowerModel{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", url='" + url + '\'' +
                ", pid=" + pid +
                ", nodes=" + nodes +
                ", selectable=" + selectable +
                ", checked=" + checked +
                '}';
    }
}
