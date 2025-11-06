package muanzajm.at02;

import java.util.Scanner;

public class exercice3 {
public static void main(String[] args) { 
Scanner lectureClavier = new Scanner(System.in);

System.out.print("Ecrivez une phrase : ");
String sTexte = lectureClavier.nextLine();
String sUpperCaseTexte = sTexte.toUpperCase();
char targetLetter = 'A';

int count = 0;
for(int i = 0; i < sUpperCaseTexte.length(); i++){
if(sUpperCaseTexte.charAt(i) == targetLetter)
{
    count++;
            }

        }

 char oldChar = 'A';
 char newChar = '$';

String sPhrase = sUpperCaseTexte.replace(oldChar, newChar);

System.out.println(sPhrase + " il ya " + count + " A dans cette phrase");

lectureClavier.close();
}
}

