public class Carrera {

    private Coche coche1;
    private Coche coche2;
    private Coche coche3;
    private int vueltasTotales;
    private int vueltaActual;

    public Carrera(Coche coche1, Coche coche2, Coche coche3, int vueltasTotales) {
        this.coche1 = coche1;
        this.coche2 = coche2;
        this.coche3 = coche3;
        this.vueltasTotales = vueltasTotales;
        this.vueltaActual = 0;
    }

    public void nuevaVuelta() {
        coche1.actualizarEstado();
        coche2.actualizarEstado();
        coche3.actualizarEstado();

        double distancia1 = coche1.getDistanciaTotal();
        double distancia2 = coche2.getDistanciaTotal();
        double distancia3 = coche3.getDistanciaTotal();

        if (distancia1 >= distancia2 && distancia1 >= distancia3) {
            coche1.actualizarPosicion(1);
            if (distancia2 >= distancia3) {
                coche2.actualizarPosicion(2);
                coche3.actualizarPosicion(3);
            } else {
                coche2.actualizarPosicion(3);
                coche3.actualizarPosicion(2);
            }
        } else if (distancia2 >= distancia1 && distancia2 >= distancia3) {
            coche2.actualizarPosicion(1);
            if (distancia1 >= distancia3) {
                coche1.actualizarPosicion(2);
                coche3.actualizarPosicion(3);
            } else {
                coche1.actualizarPosicion(3);
                coche3.actualizarPosicion(2);
            }
        } else {
            coche3.actualizarPosicion(1);
            if (distancia1 >= distancia2) {
                coche1.actualizarPosicion(2);
                coche2.actualizarPosicion(3);
            } else {
                coche1.actualizarPosicion(3);
                coche2.actualizarPosicion(2);
            }
        }

        this.vueltaActual++;

        estadoCarrera();
    }

    public void estadoCarrera() {

        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);

        System.out.println("Fin de la vuelta "+this.vueltaActual+" de "+this.vueltasTotales);
        System.out.println();

        if(this.vueltaActual == this.vueltasTotales){

            Coche cochePrimero;
            Coche cocheSegundo;
            Coche cocheTercero;

            double distancia1 = coche1.getDistanciaTotal();
            double distancia2 = coche2.getDistanciaTotal();
            double distancia3 = coche3.getDistanciaTotal();

            if (distancia1 >= distancia2 && distancia1 >= distancia3) {
                cochePrimero = coche1;
                if (distancia2 >= distancia3) {
                    cocheSegundo = coche2;
                    cocheTercero = coche3;
                } else {
                    cocheSegundo = coche3;
                    cocheTercero = coche2;
                }
            } else if (distancia2 >= distancia1 && distancia2 >= distancia3) {
                cochePrimero = coche2;
                if (distancia1 >= distancia3) {
                    cocheSegundo = coche1;
                    cocheTercero = coche3;
                } else {
                    cocheSegundo = coche3;
                    cocheTercero = coche1;
                }
            } else {
                cochePrimero = coche3;
                if (distancia1 >= distancia2) {
                    cocheSegundo = coche1;
                    cocheTercero = coche2;
                } else {
                    cocheSegundo = coche2;
                    cocheTercero = coche1;
                }
            }

            System.out.println("El podio final ha quedado de la siguiente manera:");
            System.out.println("En primer lugar... ¡"+cochePrimero.getNombre()+"!");
            System.out.println("En segundo lugar tenemos a... ¡"+cocheSegundo.getNombre()+"!");
            System.out.println("Y en tercer lugar pero no menos importante... ¡"+cocheTercero.getNombre()+"!");
        }

    }

}
