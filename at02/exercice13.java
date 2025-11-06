package muanzajo.at02;

import java.util.Scanner;

public class exercice13 {
  public static void main(String[] args) {
        double temperature = 0;
        String conversion;

        Scanner lectureClavier = new Scanner(System.in);
        System.out.print("Entrer une température : ");
        temperature = lectureClavier.nextDouble();
        lectureClavier.nextLine(); 
        do{
            System.out.print("Vers (C/c)elsius ou vers (F/f)ahrenheit : ");
            conversion = lectureClavier.nextLine();
        } while(conversion.toLowerCase().equals("f") == false && conversion.toLowerCase().equals("c") == false);

        System.out.println("Température : " +
            (
                conversion.toLowerCase().equals("f") ?
                temperature * 9 / 5 + 32 :
                (temperature - 32) * 5 / 9
                
            )
            + "°" + conversion.toUpperCase()
        );

        lectureClavier.close();
}
}
