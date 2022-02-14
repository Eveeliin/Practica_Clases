package Ferroviaria.maquinaria;

public class Locomotora {


    //atributos tipos primitivos---> atributo de tipo mecanico --mecanico
    protected int matricula;
    protected int potencia;
    protected int antigúedad;

    public Locomotora(int matricula, int potencia, int antigúedad) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.antigúedad = antigúedad;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAntigúedad() {
        return antigúedad;
    }

    public void setAntigúedad(int antigúedad) {
        this.antigúedad = antigúedad;
    }

    @Override
    public String toString() {
        return "Locomotora{" +
                "matricula=" + matricula +
                ", potencia=" + potencia +
                ", antigúedad='" + antigúedad + '\'' +
                '}';
    }
}
