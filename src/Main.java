import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    private static String[] months = {
            "Январь",
            "Февраль",
            "Март",
            "Апрель",
            "Май",
            "Июнь",
            "Июль",
            "Август",
            "Сентябрь",
            "Октябрь",
            "Ноябрь",
            "Декабрь"
    };
    public static void main(String[] args) {
       System.out.print("Insert your ISSIKUKOOD: ");
       Scanner scanner = new Scanner(System.in);
       String code = scanner.nextLine();
       System.out.print("Insert your firstname: ");
       String fname = scanner.nextLine();
       System.out.print("Insert your lastname: ");
       String lname = scanner.nextLine();

       String bDay = String.valueOf(code.charAt(5)) + String.valueOf(code.charAt(6));
       int bMont = parseInt(String.valueOf(code.charAt(3)) + String.valueOf(code.charAt(4)));
       String bMonth = months[bMont-1];
       int bYear = 0;
       int sY = parseInt(String.valueOf(code.charAt(0)));
       if(sY >= 5 && sY <=6)
           bYear = 2000;
       else if(sY >= 3 && sY <=4)
           bYear = 1900;
       else if(sY >= 1 && sY <=2)
           bYear = 1800;

        bYear += parseInt(String.valueOf(code.charAt(1)) + String.valueOf(code.charAt(2)));


        System.out.println(fname + " " + lname + "рождён " + bDay + " "+ bMonth + " " + bYear);
    }
}