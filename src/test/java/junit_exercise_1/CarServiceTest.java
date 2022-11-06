package junit_exercise_1;

import org.junit.jupiter.api.Test;
import test_without_junit.Product;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

    CarService labaiGerasServisas = new CarService();

    @Test
    void shouldChangeCarColor_WhenNewColorIsGiven() {
        //given
        Car volvo = new Car("Volvo", "White", false);
        //when
        labaiGerasServisas.paintCar(volvo, "Black");
        //then
        assertEquals("Black", volvo.color);
    }

    @Test
    void shouldNotChangeCarColor_WhenGivenColorIsTheSame() {
        //given
        Car volvo = new Car("Volvo", "White", false);
        //when
        labaiGerasServisas.paintCar(volvo, "White");
        //then
        assertEquals("White", volvo.color);
    }

    @Test
    void randomTestForAssert() {
        assertEquals(5, 5);
        boolean isOld = true;
        assertTrue(isOld);

        Product product = null;
        assertNull(product);

        assertEquals(64, 2 * 32);
        assertEquals(2, 2, "Reiksmes turetu buti lygios");
        assertTrue(true);
        assertFalse(false);

        int[] skaiciai1 = {1,2,3};
        int[] skaiciai2 = {1,2,3};
        assertArrayEquals(skaiciai1, skaiciai2);

        Product bread = new Product("Bread", null);
        Product bread2 = new Product("Bread", null);
        assertNotSame(bread, bread2);
    }
}
