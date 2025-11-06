package muanzajm.at02;

import java.util.Scanner;

public class exercice1 {
public static void main(String[] args) { 

Scanner lectureClavier = new Scanner(System.in);

System.out.print("Ecrivez un mot ou une phrase : ");
String sTexte = lectureClavier.nextLine();
String sUpperCaseText = sTexte.toUpperCase();

System.out.print(sUpperCaseText);

lectureClavier.close();
}
}
