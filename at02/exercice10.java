package muanzajo.at02;

import java.util.Scanner;

public class exercice10 {
  public static void main(String[] args) { 
  Scanner lectureClavier = new Scanner(System.in);
 int iNombre1 = lectureClavier.nextInt();

        System.out.print("Entrez un premier nombre entier : ");
        iNombre1 = lectureClavier.nextInt();

        System.out.print("Entrez un deuxieme nombre entier : ");
        int iNombre2 = lectureClavier.nextInt();

        int iResultat = plusGrand(iNombre1,iNombre2);

        System.out.print
        
        ("Le plus grand nombre est : " + iResultat);

        lectureClavier.close();




}

public static int plusGrand(int a,int b){
        if(a > b){
            return a; 
        }else{
            return b;
        }
    }
}

