package com.pruebatecnicaonebox.cart.model;

// Clase Product
public class Product {
    private long id;
    private String description;
    private double amount;

    // public Product() {
    // }

    // public Product(long id, String name, String description, double amount) {
    //     this.id = id;
    //     this.name = name;
    //     this.description = description;
    //     this.amount = amount;
    // }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
