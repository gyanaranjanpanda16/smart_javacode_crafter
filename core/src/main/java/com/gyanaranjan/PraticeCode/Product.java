package com.gyanaranjan.PraticeCode;

public class Product {
    private  int id ;
    private  String name;
    private  int Price ;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        Price = price;
    }

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

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Price=" + Price +
                '}';
    }
}
