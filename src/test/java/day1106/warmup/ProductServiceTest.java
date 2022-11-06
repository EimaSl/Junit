package day1106.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @Test
    void shouldCalculateTotalProductPrice() {
        //given
        Product product1 = new Product("Bread",1.00, 3);
        Product product2 = new Product("Milk",2.00, 1);
        Product product3 = new Product("Butter",3.00, 5);
        Product[] products = {product1,product2,product3};
        ProductService productService = new ProductService();

        //when
        double actualProductTotal = productService.calculateTotalProductPrice(products);


        //then
        assertEquals(20.0,actualProductTotal);
    }
    @Test
    void shouldCalculateTotalProductPrice_WhenPriceOrQuantityNegative() {
        //given
        Product product1 = new Product("Bread", -1.00, 3);
        Product product2 = new Product("Milk", 2.00, -1);
        Product product3 = new Product("Butter", 3.00, 5);
        Product[] products = {product1, product2, product3};
        ProductService productService = new ProductService();

        double actualProductTotal = productService.calculateTotalProductPrice(products);

        assertEquals(15.0, actualProductTotal);
    }
}

