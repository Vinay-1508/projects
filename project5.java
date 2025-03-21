import java.util.Scanner;

public class project5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isrunning = true;

       do {

           System.out.println("Enter the first Number :");
           double a = sc.nextDouble();
           System.out.println("Enter the second Number :");
           double b = sc.nextDouble();
           System.out.println("enter the operator : +,-,*,/,^ (enter 0 to exit)");
           String opt = sc.next();

           switch (opt) {

               case "+" -> System.out.printf("your value is %.0f ", a + b);
               case "-" -> {
                   double c = (a > b) ? (a - b) : (b - a);
                   System.out.printf("your value is %.0f", c);
                   break;
               }
               case "*" -> System.out.printf("your value is %.0f", a * b);
               case "/" -> System.out.printf("your value is %.2f", a / b);
               case "^" -> System.out.printf("your value is %.0f", Math.pow(a, b));
               case "0" -> {
                   System.out.printf("existing program");
                   isrunning = false;
               }
               default -> System.out.println("invalid input");

           }
       }while(isrunning);;
       sc.close();





    }
}

