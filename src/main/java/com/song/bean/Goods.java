package com.song.bean;

import java.util.Date;

/**
 * Created by lenovo on 2017/10/19.
 */
public class Goods {

    private int id ;
    private String goodName="";   //商品名称
    private String goodIntroduce = ""; //商品简介
    private String goodDesc = "";  //商品描述
    private double goodPrice ;    //商品价格
    private float good_discount;  //商品折扣
    private String good_img_path="";  //商品图片路径
    private String good_ercode_path ="";  //商品二维码路径
    private Date good_update ;   //商品上传时间

    public Date getGood_update() {
        return good_update;
    }

    public void setGood_update(Date good_update) {
        this.good_update = good_update;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodIntroduce() {
        return goodIntroduce;
    }

    public void setGoodIntroduce(String goodIntroduce) {
        this.goodIntroduce = goodIntroduce;
    }

    public String getGoodDesc() {
        return goodDesc;
    }

    public void setGoodDesc(String goodDesc) {
        this.goodDesc = goodDesc;
    }

    public double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public float getGood_discount() {
        return good_discount;
    }

    public void setGood_discount(float good_discount) {
        this.good_discount = good_discount;
    }

    public String getGood_img_path() {
        return good_img_path;
    }

    public void setGood_img_path(String good_img_path) {
        this.good_img_path = good_img_path;
    }

    public String getGood_ercode_path() {
        return good_ercode_path;
    }

    public void setGood_ercode_path(String good_ercode_path) {
        this.good_ercode_path = good_ercode_path;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodName='" + goodName + '\'' +
                ", goodIntroduce='" + goodIntroduce + '\'' +
                ", goodDesc='" + goodDesc + '\'' +
                ", goodPrice=" + goodPrice +
                ", good_discount=" + good_discount +
                ", good_img_path='" + good_img_path + '\'' +
                ", good_ercode_path='" + good_ercode_path + '\'' +
                ", good_update=" + good_update +
                '}';
    }
}
