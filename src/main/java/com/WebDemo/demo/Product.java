package com.WebDemo.demo;

import lombok.Data;

@Data
public class Product {
  public int getPid() {
    return pid;
  }

  public Product(int pid,String pname,int price) {
    super();
    this.pid = pid;
    this.pname=pname;
    this.price=price;
  }

  public void setPid(int pid) {
    this.pid = pid;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  private  int pid;

  @Override
  public String toString() {
    return "Product{" +
            "pid=" + pid +
            ", pname='" + pname + '\'' +
            ", price=" + price +
            '}';
  }

  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }

  private String pname;
  private int price;

}
