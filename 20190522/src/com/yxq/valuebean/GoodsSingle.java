package com.yxq.valuebean;

public class GoodsSingle {
    private int id;                             //保存商品id
    private String name;                        //保存商品名称
    private float price;                        //保存商品价格
    private int num;                            //保存商品购买数量

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
