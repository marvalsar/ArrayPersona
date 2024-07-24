
package estructuradatos;

public class Arreglo {
    //Atributos
    private Persona[] personas;
    private int contador;
    
    //Constructor
    public Arreglo(int capacidad){
        this.personas = new Persona[capacidad];
        this.contador = 0;
    }
    //Metodo para agregar persona
    public void agregarPersona(Persona persona){
        if(contador < personas.length){
            personas[contador] = persona;
            contador++;
        }else{
            System.out.println("No se pueden agrear mas personas, capacidad máxima alcazada");
        }
    }
    //Método para obtener atributos
    public String[] getNombres(){
        String[] nombres = new String[contador];
        for(int i=0;i<contador;i++){
            nombres[i] = personas[i].getNombre();
        }
        return nombres;
    }
    
    public String[] getApellidos(){
        String[] apellidos = new String[contador];
        for(int i=0; i<contador; i++){
            apellidos[i] = personas[i].getApellido();
        }
        return apellidos;
    }
    
    public int[] getEdades(){
        int[] edades = new int[contador];
        for(int i=0; i<contador; i++){
            edades[i] = personas[i].getEdad();
        }
        return edades;
    }   
    
    public String[] getGeneros(){
        String[] generos = new String[contador];
        for(int i=0; i<contador; i++){
            generos[i] = personas[i].getGenero();
        }
        return generos;
    }   
   
    public double[] getEstaturas(){
        double[] estaturas = new double[contador];
        for(int i=0; i<contador; i++){
            estaturas[i] = personas[i].getEstatura();
        }
        return estaturas;
    }
    
    public double[] getPesos(){
        double[] pesos = new double[contador];
        for(int i=0; i<contador; i++){
            pesos[i] = personas[i].getPeso();
        }
        return pesos;
    }
    //Método para obtener todas las personas
    public Persona[] getPersonas(){
        Persona[] personasCapturadas = new Persona[contador];
        System.arraycopy(personas, 0, personasCapturadas, 0, contador);
        return personasCapturadas;
    }
    //Método para obtener la persona con mayor peso
    public Persona getPersonaConMayorPeso(){
        if(contador==0)return null;
        Persona personaMayorPeso = personas[0];
        for(int i=1; i<contador; i++){
            if(personas[i].getPeso()> personaMayorPeso.getPeso()){
                personaMayorPeso = personas[i];
            }
        }
        return personaMayorPeso;
    }
   //Método par obtener la persona con menor estatura
    public Persona getPersonaMenorEstatura(){
        if(contador==0)return null; 
        Persona personaMenorEstatura = personas[0];
        for(int i=1; i<contador; i++){
            if(personas[i].getEstatura()< personaMenorEstatura.getEstatura()){
                personaMenorEstatura = personas[i];
            }
        }
        return personaMenorEstatura;
    }
    //Método para obtener el promedio de edad
    public double getPromedioEdad(){
        int sumaEdades = 0;
        for(int i=0;i<contador;i++){
            sumaEdades += personas[i].getEdad();
        }
        return (double)sumaEdades/contador;
    }
   //Método para obtener la cantidad de personas por género
    public int getCantidadPorGenero(String genero){
        int contadorGenero = 0;
        for(int i =0;i<contador;i++){
            if(personas[i].getGenero().equalsIgnoreCase(genero)){
                contadorGenero++;
            }
        }
        return contadorGenero;
    }
}
    

    


