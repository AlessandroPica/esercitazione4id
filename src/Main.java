package concessionario;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int scelta;
        do{
            System.out.println("CONCESSIONARIO AUTO");
            System.out.println("Aggiungi auto - 1");
            System.out.println("Visualizza le auto - 2");
            System.out.println("Ricerca di un'auto - 3");
            System.out.println("Cancella auto - 4");
            System.out.println("Modifica dati auto - 5");
            System.out.println("Visualizza auto in ordine crescente (di prezzo) - 6");
            System.out.println("Visualizza le auto che utilizzano il diesel - 7");
            System.out.println("Chiudi il menù - 8");
            scelta = in.nextInt();
            switch (scelta){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }
        }while (scelta != 8);
    }
}