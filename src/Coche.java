public class Coche {

    private String nombre;
    private int velocidadActual;
    private int posicion;
    private double distanciaTotal;

    public Coche(String nombreCoche) {
        this.nombre = nombreCoche;
        this.velocidadActual = 0;
        this.posicion = 0;
        this.distanciaTotal = 0;
    }

    public void actualizarEstado() {
        this.velocidadActual = 100 + (int) (Math.random()*101);
        // como cada vuelta es 1 hora y la velocidad es km/h, es hacer una suma
        this.distanciaTotal = this.distanciaTotal + this.velocidadActual;
    }

    public void actualizarPosicion(int nuevaPosicion) {
        this.posicion = nuevaPosicion;
    }

    public String toString(){
        return this.nombre + " va a "+this.velocidadActual+"km/h en la posicion "+this.posicion+" con una distancia recorrida de "+this.distanciaTotal;
    }

    // parece ser que este metodo no nos hacia falta :)
    public int consultarPosicion() {
        return this.posicion;
    }

    public double getDistanciaTotal() {
        return distanciaTotal;
    }

    public String getNombre() {
        return nombre;
    }
}
