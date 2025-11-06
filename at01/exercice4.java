package muanzajm.at01;

import java.util.Scanner;

public class exercice4 {
public static void main(String[] args) { 

Scanner lectureClavier = new Scanner(System.in); 

 

System.out.print("Entrez la note en mathematique:"); 

double note = lectureClavier.nextDouble(); 

 

if (note>60)  

{ 

    System.out.print("L'élève a passé son cours de math "); 

} 

else if (note<60)  

{ 

    System.out.print("L'élève a pas passé son cours de math "); 

} 

else 

{ 

  System.out.print("L'élève a passé son cours de math "); 

} 

 

lectureClavier.close(); 

 
}
}
