package com.example.BACKEND.Entity;

import java.util.Date;

/**
 * @program: BACKEND
 * @description:
 * @author: wavesen.shen
 * @create: 2019-07-01 16:14
 */
public class PartNo {
    private int partNo;
    private String partName;
    private String memo;
    private String type;
    private String route;
    private boolean isEnable;
    private Date createDate;
    private String creator;
    private Date updateDate;
    private String editor;
    public PartNo(){}
    public PartNo(int partNo,String partName,String memo,String type,String route,boolean isEnable,Date createDate,String creator,Date updateDate,String editor){
        this.partNo=partNo;
        this.partName=partName;
        this.memo=memo;
        this.type=type;
        this.route=route;
        this.isEnable=isEnable;
        this.createDate=createDate;
        this.creator=creator;
        this.updateDate=updateDate;
        this.editor=editor;
    }
    public int getPartNo() {
        return partNo;
    }

    public void setPartNo(int partNo) {
        this.partNo = partNo;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(boolean isEnable) {
        this.isEnable = isEnable;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }
}
