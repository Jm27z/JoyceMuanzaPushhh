package muanzajm.at02;

import java.util.ArrayList;
import java.util.Scanner;

public class exercice6 {
public static void main(String[] args) { 
Scanner lectureClavier = new Scanner(System.in);

ArrayList<Integer> nombres = new ArrayList<Integer>();
        int iNombre;
        

    do{
        System.out.print("Entrez un nombre (0 pour activer le calcule):");
        iNombre = lectureClavier.nextInt();
        nombres.add(iNombre);

    }while(nombres.getLast() !=0);

    nombres.removeLast();
    nombres.sort(null);
    System.out.println("Plus gros nombre : " + (int)nombres.getLast());
    System.out.println("Plus petit nombre : " + (int)nombres.getFirst());

    float moyenne = 0;

    for(int i = 0; i < nombres.size(); i++) moyenne += nombres.get(i);
    moyenne = moyenne / nombres.size();
    System.out.println("Moyenne : " +moyenne);

    lectureClavier.close();

}
}
