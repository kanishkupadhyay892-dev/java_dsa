package Basic;
import java.util.Scanner;
public class SwitchStatements {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter any fruit name");
//        String fruit=sc.next();
//        switch statements
//        switch (fruit) {
//            case "Mango" -> System.out.println("it is the king of all fruits");
//
//            case "Apple" -> System.out.println("it is healthy for health ");
//
//            case "Orange" -> System.out.println("it is a round fruit");
//
//            case "Grapes" -> System.out.println("A small fruit");
//        }
//        System.out.println("Please enter valid fruits like Mango, Apple, Orange, Grapes ");
        System.out.println("Enter any number from 1 to 7");
        int numOfDays=sc.nextInt();

        switch(numOfDays){
            case 1 -> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");
        }
    }
}
