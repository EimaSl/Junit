package junit_exercise_1;

public class CarService {

    /**
     *
     * @param car
     * @param colorToPaint
     */

    public void paintCar(Car car, String colorToPaint) {
        System.out.println("Current car color is " + car.color);

        if (colorToPaint.equalsIgnoreCase(car.color)) {
            System.out.println("Will not paint the car.");
        } else {
            System.out.println("Painting car...");
            car.color = colorToPaint;
            System.out.println("Car color is now " + car.color);
        }
    }
}
