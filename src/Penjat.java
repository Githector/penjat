import java.util.Scanner;

public class Penjat {
    public static void main(String[] args) {

        String paraulaSecreta;

        final int numErrorsPossibles = 5;
        int errors = 0;
        boolean paraulaTrobada = false;
        int intents = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Escriu la paraula secreta: ");
        paraulaSecreta = sc.nextLine();

        char[] lletresParaula = new char[paraulaSecreta.length()];
        char[] lletresAmagades = new char[paraulaSecreta.length()];
        boolean[] control = new boolean[paraulaSecreta.length()];

        for (int i = 0; i < lletresAmagades.length; i++) {
            lletresAmagades[i] = '_';
        }

        for (int i = 0; i < paraulaSecreta.length(); i++) {
            lletresParaula[i] = paraulaSecreta.charAt(i);
        }


        do {
            System.out.println("####################");
            System.out.println("       PANELL       ");
            System.out.println("####################");
            for(int i=0; i<control.length; i++){
                if(control[i]==true){
                    System.out.print(lletresParaula[i]+" ");
                }else{
                    System.out.print(lletresAmagades[i]+" ");
                }
            }
            System.out.println();


            char lletra;
            System.out.print("Introdueix una lletra: ");
            lletra = sc.nextLine().charAt(0);
            boolean lletraOk = false;
            for (int i = 0; i < lletresParaula.length; i++) {
                if (lletresParaula[i] == lletra) {
                    control[i] = true;
                    lletraOk = true;

                }
            }
            intents++;
            if (lletraOk == false) {
                errors++;
            }else{
                int comptadorTrues = 0;
                for(int i=0; i<control.length; i++){
                    if(control[i]==true){
                        comptadorTrues++;

                    }
                }
                System.out.println("Lletres encertades: "+comptadorTrues);
                if(comptadorTrues==control.length){

                    paraulaTrobada=true;
                }
            }

        } while (errors < numErrorsPossibles && !paraulaTrobada);


        if (paraulaTrobada) {
            System.out.println("Felicitats!!!! Has guanyat!!!!!");

            System.out.println("Has necessitat "+intents+" intents.");
        } else {
            System.out.println("Ets molt dolent! Has perdut");
        }

        System.out.println("La paraula secreta era: "+paraulaSecreta);
/*


        for (int i = 0; i < lletresParaula.length; i++) {
            System.out.print(lletresParaula[i] + " - ");
        }

        System.out.println();


        for (int i = 0; i < lletresAmagades.length; i++) {
            System.out.print(lletresAmagades[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < control.length; i++) {
            System.out.print(control[i] + " - ");
        }
*/


    }
}
