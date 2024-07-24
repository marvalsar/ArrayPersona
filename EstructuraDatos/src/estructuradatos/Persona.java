
package estructuradatos;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private double estatura;
    private double peso;

    //Constructor
    public Persona(String nombre, String apellido,int edad, String genero, double estatura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.estatura = estatura;
        this.peso = peso;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + "\napellido: " + apellido + "\nedad: " + edad + "\ngenero: " + genero + "\nestatura: " + estatura + "\npeso: " + peso ;
    }
}
