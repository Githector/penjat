/*

1 - Crea un programa que et vagi demanant números fins que l'usuari introdueixi un 0.
En aquest moment el programa dirà la quantitat de números majors a 10, iguals a 10 i
menors a 10. El zero no l'ha de tenir en compte.

*/

import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numPositius=0;
        int numNegatius=0;
        int numEntrat;

        do{
            System.out.print("Introdueix un número (0 per finalitzar): ");
            numEntrat = sc.nextInt();
            if(numEntrat>0){
                numPositius++;
            }else if (numEntrat < 0) {
                numNegatius++;
            }

        }while(numEntrat!=0);

        System.out.println("Numeros positius: "+numPositius);
        System.out.println("Numeros negatius: "+numNegatius);

    }

}
