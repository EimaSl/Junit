package test_without_junit;

public class PhysicsMain {

    public static void main(String[] args) {
        PhysicsTeacher mokytojas = new PhysicsTeacher();
        Double paskaiciuotasNuotolis = mokytojas.calculateDistance(10.0, 50.0);
        System.out.println(paskaiciuotasNuotolis);

        System.out.println("Paskaiciuotas nuotolis yra lygus 500, kai laikas yra 10 ir greitis yra 50 - " + (paskaiciuotasNuotolis == 500));
    }
}
