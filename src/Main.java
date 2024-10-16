public class Main {
    public static void main(String[] args) {

        Coche coche1 = new Coche("Coche1");
        Coche coche2 = new Coche("Coche2");
        Coche coche3 = new Coche("Coche3");

        Carrera carrera = new Carrera(coche1, coche2, coche3, 5);

        carrera.nuevaVuelta();
        carrera.nuevaVuelta();
        carrera.nuevaVuelta();
        carrera.nuevaVuelta();
        carrera.nuevaVuelta();
    }
}