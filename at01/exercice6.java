package muanzajo.at01;

import java.util.Scanner;

public class exercice6 {
public static void main(String[] args) {
Scanner lectureClavier = new Scanner(System.in);

System.out.print("Entrez votre nom :");
String client = lectureClavier.nextLine();

System.out.print("Entrez votre choix parmi les choix suivant 1- Chêne, 2- Érable, 3-Pin :");
int nombreChoisi = lectureClavier.nextInt();

if (nombreChoisi==1) 
{
    System.out.print("Entrez votre longueur en mètre:");
    double longueur = lectureClavier.nextDouble();
    System.out.print("Entrez votre largeur du plancher :");
    double largeur = lectureClavier.nextDouble();
    double Airplanche = longueur * largeur;

    double prix = 5 * Airplanche;
    System.out.println(client + "La surface est de " + Airplanche + "le prix est de " + prix);
}

else if (nombreChoisi == 2) 
{
    System.out.print("Entrez votre longueur en mètre:");
    double longueur = lectureClavier.nextDouble();
    System.out.print("Entrez votre largeur du plancher :");
    double largeur = lectureClavier.nextDouble();
    double Airplanche = longueur * largeur;

    double prix = 12 * Airplanche;
    System.out.println(client + "La surface est de " + Airplanche + "le prix est de " + prix);
}

else if (nombreChoisi == 3) 
{
    System.out.print("Entrez votre longueur en mètre:");
    double longueur = lectureClavier.nextDouble();
    System.out.print("Entrez votre largeur du plancher :");
    double largeur = lectureClavier.nextDouble();
    double Airplanche = longueur * largeur;

    double prix = 10 * Airplanche;
    System.out.println(client + "La surface est de " + Airplanche + "le prix est de " + prix);
}
else
{
   System.out.print("Vous n'avez pas choisit le bon type de plancher");
}

lectureClavier.close();
}
}