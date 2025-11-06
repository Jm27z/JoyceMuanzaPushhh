package muanzajm.at01;

import java.util.Scanner;

public class exercice3 {
public static void main(String[] args) { 

Scanner lectureClavier = new Scanner(System.in); 

 

System.out.print("Entrez l'age de la première personne:"); 

int age1 = lectureClavier.nextInt(); 

 

System.out.print("Entrez l'age de la deuxième personne:"); 

int age2 = lectureClavier.nextInt(); 

 

 double moyenne = (age1 + age2) / 2.0; 

 

System.out.println("La moyenne des âges est : " + moyenne); 

 

 

if (age1>age2)  

{ 

    System.out.print("La personne la plus vieille a " + age1 + " ans."); 

} 

else if (age1<age2)  

{ 

    System.out.print("La personne la plus vieille a " + age2 + " ans."); 

} 

else 

{ 

   System.out.println("Les deux personnes ont le même âge : " + age1 + " ans."); 

} 

 

lectureClavier.close(); 

}
}
