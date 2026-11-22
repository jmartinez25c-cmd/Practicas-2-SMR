
package efunciones;
import java.util.Scanner;

public class LlamadasFunciones {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ejercicio 1
        EFunciones.repetirMensaje(3);

        //Ejercicio 2
        System.out.println("Suma de impares: " + EFunciones.sumarImpares(4));

        //Ejercicio 3
        System.out.println("El máximo es: " + EFunciones.maximo(8, 15));

        //Eejercicio 4
        EFunciones.numerosEntre(3, 7);

        //Ejercicio 5
        EFunciones.dobleNumero(8);

        //Ejercicio 6
        EFunciones.errores(2);

        //Ejercicio 7
        System.out.println("Dime x:");
        int x = input.nextInt();

        System.out.println("Dime n:");
        int n = input.nextInt();

        if (x >= 0 && x < 50 && n >= 0 && n < 10) {
            System.out.println("Resultado: " + EFunciones.calcular(x, n));
        }else{
            System.out.println("Valores incorrectos.");
        }

        //Ejercicio 8
        EFunciones.cili('a', 5, 10);

        input.close();
    }
}

