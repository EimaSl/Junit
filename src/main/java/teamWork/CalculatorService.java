package teamWork;

public class CalculatorService {

    /**
     * Simple calculator to calculate multiplication, division, sub ...
     * @param a - .......
     * @param b - .......
     * @return
     */

    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mult(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        if(b!=0) {
            return a / b;
        } else {
            System.out.println("Can not be divided by 0");
            return 0;
        }
    }

    public int calculateAreaOfSquare(int r) {
        return (int) (Math.PI*(Math.pow(r, 2)));
    }
}
