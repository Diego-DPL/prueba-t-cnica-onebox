package com.pruebatecnicaonebox.cart.controller;

import com.pruebatecnicaonebox.cart.service.CartService; // Add this import statement
import com.pruebatecnicaonebox.cart.model.Cart; // Add this import statement
import com.pruebatecnicaonebox.cart.model.Product; // Add this import statement

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Controlador de carritos
@RestController
@RequestMapping("/carts")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping
    public Cart createCart() {
        return cartService.createCart();
    }

    @GetMapping("/{id}")
    public Cart getCart(@PathVariable String id) {
        return cartService.getCart(id);
    }

    @PostMapping("/{id}/products")
    public void addProductToCart(@PathVariable String id, @RequestBody Product product) {
        cartService.addProductToCart(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteCart(@PathVariable String id) {
        cartService.deleteCart(id);
    }
}

