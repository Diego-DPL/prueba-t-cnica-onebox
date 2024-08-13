package com.pruebatecnicaonebox.cart.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// Clase Cart
public class Cart {

    private String id;
    private List<Product> products = new ArrayList<>();
    private LocalDateTime lastUpdated;

    public Cart() {
    }

    public Cart(String id, List<Product> products, LocalDateTime lastUpdated) {
        this.id = id;
        this.products = products;
        this.lastUpdated = lastUpdated;
    }

    public String getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void clear() {
        products.clear();
    }

    public double getTotalAmount() {
        return products.stream().mapToDouble(Product::getAmount).sum();
    }

    public int getNumberOfProducts() {
        return products.size();
    }

    public boolean isEmpty() {
        return products.isEmpty();
    }

    public boolean containsProduct(Product product) {
        return products.contains(product);
    }

    public void updateProduct(Product product) {
        products.remove(product);
        products.add(product);
    }

    public void updateProductAmount(Product product, double amount) {
        products.stream().filter(p -> p.equals(product)).forEach(p -> p.setAmount(amount));
    }



    
}
