package Ferroviaria.personal;

public class JefeDeEstación {
    //desde esa misma clase todos los atributos ----> private
    //todos tienen getter y setters
    //distintas catgorias enum ... añadir enum que sea especialidad

    private String nombre;
    private String DNI;
    private String fechaNombram;

    public JefeDeEstación(String nombre, String DNI, String fechaNombram) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNombram = fechaNombram;
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

    public String getFechaNombram() {
        return fechaNombram;
    }

    public void setFechaNombram(String fechaNombram) {
        this.fechaNombram = fechaNombram;
    }

    @Override
    public String toString() {
        return "JefeDeEstación{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", fechaNombram=" + fechaNombram +
                '}';
    }
    public void mostrarDatos(){
        System.out.println(toString());
    }
}
