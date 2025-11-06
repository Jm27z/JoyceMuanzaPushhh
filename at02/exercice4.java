package muanzajm.at02;

import java.util.Scanner;

public class exercice4 {
    public static void main(String[] args) {
    Scanner lectureClavier = new Scanner(System.in);
    int iNombre;


     do{
        System.out.print("entrez un nombre entre 0-100 : ");
        iNombre = lectureClavier.nextInt();

        }
    while (iNombre < 1 || iNombre > 100);

    lectureClavier.close();

}
}
