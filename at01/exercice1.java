package muanzajm.at01;

import java.util.Scanner;

public class exercice1 {
public static void main(String[] args) { 

Scanner lectureClavier = new Scanner(System.in); 

 

System.out.print("Entrez le premier nombre :"); 

double a = lectureClavier.nextDouble(); 

 

System.out.print("Entrez le deuxième nombre :"); 

double b = lectureClavier.nextDouble(); 

 

if (a>b)  

{ 

    System.out.println("Le plus grand nombre est : " + a); 

} 

else if (b>a)  

{ 

   System.out.println("Le plus grand nombre est : " + b); 

}else 

{ 

  System.out.println("Les deux nombres sont égaux."); 

} 

 

lectureClavier.close(); 

 

 
}
}
