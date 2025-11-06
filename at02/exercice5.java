package muanzajm.at02;

import java.util.Scanner;

public class exercice5 {
Scanner lectureClavier = new Scanner(System.in);


for(int lettre = 0; lettre < 52; lettre++){
if(lettre == 26) System.out.println();
System.out.print((char)((lettre - (lettre % 26) == 0 ? lettre : (25 - (lettre % 26)))+65));
        }

scanner.close();
}
