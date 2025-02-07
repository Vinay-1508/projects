import java.util.Scanner;

public class project2 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        //A = p(1+R/100)^t

        System.out.println("Enter principle amount:");
        double principle = sc.nextDouble();
        System.out.println("Enter intrest rate:");
        double rate = sc.nextDouble();
        System.out.println("Enter time period:");
        double time = sc.nextDouble();
        double amount1= principle*Math.pow(1+rate/100,time);
        System.out.printf("final compound intrest is %.2f", amount1);



    }
}
