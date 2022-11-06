package test_without_junit;

/**
 * Klase skirta fizikiniams skaiciavimams atlikti
 */
public class PhysicsTeacher {

    /**
     * Apsk. nuvaziuota distancija pagal laika ir greiti.
     *
     * @param time  duotasis laiko tarpas.
     * @param speed duotasis greitis, kuriuo vaziuoja auto.
     * @return paskaiciuoja nuotoli.
     */
    public Double calculateDistance(Double time, Double speed) {
        if (time > 0) {
            return time * speed;
        } else {
            return 0.0;
        }
    }
}
