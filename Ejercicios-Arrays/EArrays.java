
package ejemplo;
import java.util.Scanner;

public class EArrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        
        int cantidad=50;
        
        String equipos[]=new String[cantidad];
        String tipo[]= new String[cantidad];
        
    
        int contador=0;
        int opcion;
        Scanner teclado = new Scanner(System.in);

        do{
        System.out.println ("Menú");
        System.out.println ("------------");
        System.out.println ("0 Salir");
        System.out.println ("1 Alta de un equipo");
        System.out.println ("2 Listar todos");
        System.out.println ("3 Buscar por nombre");
        System.out.println ("Escoge una opción:");
        opcion = input.nextInt();
        
            switch (opcion){
                case 1:
                    System.out.println ("Escriba el nombre del equipo:");
                    equipos[contador]=input2.nextLine();
                    System.out.println("Escriba el tipo del equipo:");
                    tipo[contador]=input2.nextLine();
                    contador++;
                    break;
                
                case 2:
                    for(int i=0; i<contador; i++){
                    System.out.println ("Los equipos son: " + equipos[i] + " " + "y el tipo es " + tipo[i]);
                    }
                    break;
                
                case 3:
                    input.nextLine();
                    System.out.println("Busca el nombre del equipo:");
                    String buscar=input.nextLine();
                    for (int i=0; i<contador; i++){
                        if(equipos[i].equals(buscar)){
                            System.out.println("Se encontró: " + equipos[i] + tipo[i]);
                        }
                    }
                    
                    break;
                
                case 0:
                    System.out.println("Adios");
                    break;
                default: System.out.println ("ERROR: Escoga un número dentro del rango del 0 al 3");
            }
        }while(opcion!=0);
    }
    
}
