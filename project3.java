import java.util.Scanner;

public class project3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // c=(f-32)*5/9
        double kg, lbs;
        int ans;
        // 1 kg = 2.205lbs

        System.out.println("hello  welcome to weight conversion program");

        System.out.println("please select and option below");
        System.out.println("press option1: convert kg to lbs");
        System.out.println("press option2: convert lbs to kg");
        ans = sc.nextInt();
        if (ans < 1 || ans > 2) {
            System.out.println("invalid input!");
        } else {
            if (ans == 1) {
                System.out.println("enter weight in kg");
                kg = sc.nextDouble();
                lbs = kg * 2.205;
                System.out.printf("your weight in lbs is %.2f", lbs);
            } else {
                System.out.println("enter weight in lbs");
                lbs = sc.nextDouble();
                kg = lbs / 2.205;
                System.out.printf("your weight in kg is %.2f", kg);
            }

        }
    }
}

