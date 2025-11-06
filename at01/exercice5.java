package muanzajm.at01;

import java.util.Scanner;

public class exercice5 {
public static void main(String[] args) { 

Scanner lectureClavier = new Scanner(System.in); 

 

System.out.print("Entrez le montant:"); 

double montant = lectureClavier.nextDouble(); 

 

 

double rabais = montant * 0.25; 

double montantFinal = montant - rabais; 

 

System.out.println("Le prix final avec le rabais est : "+ montantFinal); 

 

lectureClavier.close(); 
}
}
