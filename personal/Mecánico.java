package Ferroviaria.personal;

public class Mecánico {
    // atributos constructor getter y setters, toString

    private String nombre;
    private int teléfono;
    Especialidad Especialidad;

    public Mecánico(String nombre, int teléfono, Ferroviaria.personal.Especialidad especialidad) {
        this.nombre = nombre;
        this.teléfono = teléfono;
        Especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }

    public Ferroviaria.personal.Especialidad getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(Ferroviaria.personal.Especialidad especialidad) {
        Especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "mecánico{" +
                "nombre='" + nombre + '\'' +
                ", teléfono='" + teléfono + '\''+
                ", especialidad="+ Especialidad +
        '}';
    }
    public void mostrarDatos(){
        System.out.println(toString());
    }

}



