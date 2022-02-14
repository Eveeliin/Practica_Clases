package Ferroviaria.personal;

public class Maquinista {
    private String nombre;
    private String DNI;
    private double sueldo;
    private int rango;

    public Maquinista(String nombre, String DNI, double sueldo, int rango) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldo = sueldo;
        this.rango = rango;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "maquinista{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", sueldo=" + sueldo +
                ", rango='" + rango + '\'' +
                '}';
    }
    public void mostrarDatos(){
        System.out.println(toString());
    }
}
