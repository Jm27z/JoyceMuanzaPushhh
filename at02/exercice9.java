package muanzajm.at02;

import java.util.Scanner;

public class exercice9 {
public static void main(String[] args) { 
Scanner lectureClavier = new Scanner(System.in);

System.out.print("Entrez le rayon du cerle : ");
double dRayon = lectureClavier.nextDouble();

double dCirconference = 2 * Math.PI * dRayon;
System.out.print("La circonference du cercle est :  " + dCirconference);

lectureClavier.close();
}
}
