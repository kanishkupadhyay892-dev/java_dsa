package Basic;
import java.util.Scanner;
public class NestedSwitch {
  public  static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int EmpID=sc.nextInt();
      String department=sc.next();
      switch(EmpID){
          case 1:
              System.out.println("Karan Kumar Sharma");
              break;
          case 2:
              System.out.println("Nikhil Pal");
              break;
          case 3:
              System.out.println("ID NUMBER 3");
             switch(department){
                 case "IT":
                     System.out.println("IT DEPARTMENT");
                     break;
                 case "MANAGEMENT":
                     System.out.println("MANAGEMENT DEPARTMENT");
                     break;
                 default:
                     System.out.println("INPUT VALID DEPARTMENT");
                     break;
          }
          break;
          default:
              System.out.println("ENTER VALID ID");
      }

    }
}
