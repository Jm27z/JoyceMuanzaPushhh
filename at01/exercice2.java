package muanzajm.at01;

import java.util.Scanner;

public class exercice2 {
public static void main(String[] args) { 

Scanner lectureClavier = new Scanner(System.in); 

 

System.out.print("Entrez votre salaire horaire :"); 

double salaireHoraire = lectureClavier.nextDouble(); 

 

System.out.print("Entrez le nombre d'heures travaillées par semaine :"); 

double heuresSemaine = lectureClavier.nextDouble(); 

 

  double salaireQuinzaine = salaireHoraire * heuresSemaine * 2; 

 

   System.out.println("Le salaire pour la quinzaine est : " + salaireQuinzaine + " $"); 

  

lectureClavier.close(); 
}
}
