package com.kanma.model;

import java.sql.Date;

/**
 * @ Desc   ：对应MySql数据库中的items表
 * @ Author ：MaKang
 * @ Date   ：Created in 2018/7/2 22:15
 */
public class ItemsDomain {
    private Integer id;
    private String name;
    private Float price;
    private String detail;
    private String pic;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

}
