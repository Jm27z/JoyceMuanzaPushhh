package muanzajm.at02;

import java.util.Scanner;

public class exercice2 {
public static void main(String[] args) { 

Scanner lectureClavier = new Scanner(System.in);

System.out.print("ecrivez un mot ou une phrase : ");
String sTexte = lectureClavier.nextLine();
int iCharactherCount = sTexte.length();

System.out.print(iCharactherCount);

lectureClavier.close();


}
}
