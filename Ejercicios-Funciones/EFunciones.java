
package efunciones;
import java.util.Scanner;


public class EFunciones {
    
    //Ejercicio 1
    public static void repetirMensaje(int n) {
        for (int i = 0; i < n; i++) {
        System.out.println("Módulo ejecutándose");
        }
    }
    
    //Ejercicio 2
    public static int sumarImpares(int n) {
        int suma = 0;
        int numero = 1;
        
        for (int i = 0; i < n; i++) {
            suma = suma + numero;
            numero = numero + 2;
        }
        return suma;
    }
    
    //Ejercicio 3
    
    public static int maximo(int a, int b){
        if (a>b) {
            return a;
        }else{
            return b;
        }
    }
    
    //Ejercicio 4
    public static void numerosEntre(int a, int b){
        int mayor;
        int menor;
        
        if (a > b) {
            mayor = a;
            menor = b;
        } else {
            mayor = b;
            menor = a;
        } 
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }  
    
    //Ejercicio 5
    public static void dobleNumero(int num) {
        System.out.println ("Dime un numero");
        Scanner teclado = new Scanner(System.in);
        num=teclado.nextInt();
    System.out.println("El doble es: " + (num * 2));
    }
    
    //Ejercicio 6
    public static void errores(int error) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println ("Menú");
        System.out.println ("------------");
        System.out.println ("1");
        System.out.println ("2");
        System.out.println ("3");
        System.out.println ("4");
        System.out.println ("Dime el error:");
        error= teclado.nextInt();
        switch (error) {
            case 1:
                System.out.println("Error en memoria");
                break;
            case 2: 
                System.out.println("Papel atascado en impresora");
                break;
            case 3:
                System.out.println("Disco defectuoso");
                break;
            default:
                System.out.println("Error indefinido");
                break;
        }
    }
    
    //Ejercicio 7
    public class Potencia {

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Dime un número:");
            int x = input.nextInt(); 
            System.out.println("Dime otro número:");
            int n = input.nextInt();
            
            if (x >= 0 && x < 50 && n >= 0 && n < 10){
                long calcular = calcular(x, n);
                System.out.println(x + " elevado a " + n + " es: " + calcular);
            }else{
                System.out.println("Error: El primer número debe ser menor a 50 y el segundo menor a 10");
            }
            input.close();
        }
    }
        public static long calcular(int x, int n) {
            long resultado = 1;
            
            for (int i=0; i<n; i++) {
                resultado = resultado * x;
            }
            return resultado;
        }
        
        //Ejercicio 8
        public static void cili(char tipo, double radio, double altura){
            if (tipo == 'a') {
                double area = 2 * Math.PI * radio * (radio + altura);
                System.out.println("El área del cilindro es: " + area);  
            }else if (tipo == 'v') {
                double volumen = Math.PI * radio * radio * altura;
                System.out.println("El volumen del cilindro es: " + volumen);
            } else {
                System.out.println("Opción incorrecta");
            }
        }
}





