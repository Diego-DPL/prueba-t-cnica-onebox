package com.pruebatecnicaonebox.cart.service;

import com.pruebatecnicaonebox.cart.model.Cart; // Import the Cart class
import com.pruebatecnicaonebox.cart.model.Product; // Import the Product class

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// Servicio de carritos
@Service
public class CartService {
    private Map<String, Cart> carts = new HashMap<>();

    public Cart createCart() {
        Cart cart = new Cart();
        cart.setId(UUID.randomUUID().toString());
        cart.setLastUpdated(LocalDateTime.now());
        carts.put(cart.getId(), cart);
        return cart;
    }

    public Cart getCart(String id) {
        return carts.get(id);
    }

    public void addProductToCart(String cartId, Product product) {
        Cart cart = carts.get(cartId);
        if (cart != null) {
            cart.getProducts().add(product);
            cart.setLastUpdated(LocalDateTime.now());
        }
    }

    public void deleteCart(String id) {
        carts.remove(id);
    }

    public void deleteInactiveCarts() {
        LocalDateTime now = LocalDateTime.now();
        carts.entrySet().removeIf(entry -> entry.getValue().getLastUpdated().plusMinutes(10).isBefore(now));
    }
}


