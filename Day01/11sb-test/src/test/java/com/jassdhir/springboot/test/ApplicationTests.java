package com.jassdhir.springboot.test;

import com.jassdhir.springboot.test.app.ShoppingCart;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;

@SpringBootTest
class ApplicationTests {

    @Autowired // field injection
    private ShoppingCart shoppingCart;
    @Test
    public void testCheckout() {
        shoppingCart.addItem("Item1", 3);
        shoppingCart.addItem("item2", 5);
        String result = shoppingCart.checkout();
        Assertions.assertEquals("2 orders placed", result);
    }
}
