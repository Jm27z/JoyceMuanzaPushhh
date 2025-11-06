package muanzajm.at02;

import java.util.Scanner;

public class exercice7 {

public static void main(String[] args) { 
Scanner lectureClavier = new Scanner(System.in);
String phrase = lectureClavier.nextLine().toLowerCase();

int voyelles = 0;
int consonnes = 0;

        for(int i = 0; i < phrase.length(); i++){
        char c = phrase.charAt(i);

        if (Character.isLetter(c)) { 
            if ("aeiouy".indexOf(c) != -1) {
                voyelles++;
                } else {
                    consonnes++;
                }
            }
        }
        System.out.println("Consonnes : " + consonnes);
        System.out.println("Voyelles : " + voyelles);

        lectureClavier.close();
}
}

