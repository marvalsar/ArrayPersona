
package estructuradatos;

import java.util.Scanner;

public class EstructuraDatos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas que desea registrar: " );
        int cantidadPersonas =scanner.nextInt();
        scanner.nextLine();
        
        Arreglo arreglo = new Arreglo(cantidadPersonas);
        
        for(int i=0;i<cantidadPersonas;i++){
            System.out.println("Ingrese los datos de la persona " +(i+1)+ ": ");
            System.out.println("Nombre: ");
            String nombre =scanner.nextLine();
            System.out.println("Apellido: ");
            String apellido =scanner.nextLine();
            System.out.println("Edad: ");
            int edad =scanner.nextInt();
            scanner.nextLine();
            System.out.println("Género (Masculino/Femenino): ");
            String genero =scanner.nextLine();
            System.out.println("Estatura: ");
            double estatura =scanner.nextDouble();
            System.out.println("Peso: ");
            double peso =scanner.nextDouble();
            scanner.nextLine();
            
            Persona persona = new Persona(nombre, apellido, edad, genero, estatura, peso);
            arreglo.agregarPersona(persona);
        }
        System.out.println("Personas registradas: ");
        Persona[] personas = arreglo.getPersonas();
        for(Persona persona : personas){
            System.out.println(persona);
        }
        
        System.out.println("Persona con mayor peso = " + arreglo.getPersonaConMayorPeso());
        System.out.println("Persona con menor estatura = " + arreglo.getPersonaMenorEstatura());
        System.out.println("Promedio Edad = " + arreglo.getPromedioEdad());
        
        System.out.println("Cantidad de personas por género: ");
        System.out.println("Masculino: " +arreglo.getCantidadPorGenero("Masculino"));
        System.out.println("Femenino: "+arreglo.getCantidadPorGenero("Femenino"));
    }
    
}
