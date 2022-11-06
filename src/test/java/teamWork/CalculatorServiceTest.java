package teamWork;

import junit_exercise_1.CarService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();

    @Test
    void twoPlusTwoEqualsFour() {
        //given line->9
        //when
        int add = calculatorService.add(2,2);
        assertEquals(4, add);
    }

    @Test
    void subTwoMinusEqualsTwo() {
        //given line->9
        //when
        int sub = calculatorService.sub(4,2);
        assertEquals(2, sub);
    }

    @Test
    void multFourByTwoEqualsEight() {
        //given line->9
        //when
        int mult = calculatorService.mult(4,2);
        assertEquals(8, mult);
    }

    @Test
    void divEightByTwoEqualsFour() {
        //given line->9
        //when
        int div = calculatorService.div(8,2);
        assertEquals(4, div);
    }

    @Test
    void divByZeroNotPossible() {
        //given line->9
        //when
        int div = calculatorService.div(8, 0);
        assertEquals(0, div);
    }
    @Test
    void areaOfSquareCalculation() {
        //given line->9
        //when
        double calculateAreaOfSquare  = calculatorService.calculateAreaOfSquare(3);
        assertEquals(28, calculateAreaOfSquare);
    }
}