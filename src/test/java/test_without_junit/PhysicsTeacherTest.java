package test_without_junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhysicsTeacherTest {

    @Test
    void shouldCalculateDistance_WhenTimeAndSpeedArePositive() {
        //1. given - kas yra duota? kokie yra testiniai duomenys?
        PhysicsTeacher physicsTeacher = new PhysicsTeacher();
        Double speed = 10.0;
        Double time = 5.0;

        //2. when - kai kas ivyksta? koki metoda iskvieciam?
        Double actualDistance = physicsTeacher.calculateDistance(time, speed);

        //3. then - kokio rezultato as tada tikiuosi?
        //expected - rezultatas KURIO TIKIUOSI, actual - rezultatas, kuri grazina funkcija
        assertEquals(50.0, actualDistance);
    }

    @Test
    void shouldNotCalculateDistance_WhenTimeIsZero() {
        PhysicsTeacher physicsTeacher = new PhysicsTeacher();
        Double actualDistance = physicsTeacher.calculateDistance(0.0,10.0);
        assertEquals(0.0, actualDistance);
    }
}