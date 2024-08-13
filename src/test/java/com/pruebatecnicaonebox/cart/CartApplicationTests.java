package com.pruebatecnicaonebox.cart;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pruebatecnicaonebox.cart.model.Cart;
import com.pruebatecnicaonebox.cart.model.Product;
import com.pruebatecnicaonebox.cart.service.CartService;

@SpringBootTest(classes = CartApplication.class)
class CartApplicationTests {

    @Autowired
    private CartService cartService;

    @Test
    public void testCreateCart() {
        Cart cart = cartService.createCart();
        assertNotNull(cart.getId());
    }

    @Test
    public void testAddProductToCart() {
        Cart cart = cartService.createCart();
        Product product = new Product();
        product.setId(1);
        product.setDescription("Test Product");
        product.setAmount(10.0);

        cartService.addProductToCart(cart.getId(), product);
        assertEquals(1, cartService.getCart(cart.getId()).getProducts().size());
    }

    @Test
    public void testDeleteInactiveCarts() {
        Cart cart = cartService.createCart();
        cart.setLastUpdated(LocalDateTime.now().minusMinutes(11));
        cartService.deleteInactiveCarts();
        assertNull(cartService.getCart(cart.getId()));
    }

}
