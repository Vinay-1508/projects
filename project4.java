import java.util.Scanner;

public class project4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // c=(f-32)*5/9
        double fe, C;
        int ans;


        System.out.println("hello  welcome to temparture conversion program");

        System.out.println("please select and option below");
        System.out.println("press option1: convert fe to C");
        System.out.println("press option2: convert C to fe");
        ans = sc.nextInt();
        if (ans < 1 || ans > 2) {
            System.out.println("invalid input!");
        } else {
            if (ans == 1) {
                System.out.println("enter temparature in fe");
                fe = sc.nextDouble();
                C = (fe - 32) * 5 / 9;
                System.out.printf("your temparture is %.2f C", C);
            } else {
                System.out.println("enter temprature in C");
                C = sc.nextDouble();
                fe = C + 32 * 9 / 5;
                System.out.printf("your temparture  is %.2f fe", fe);

            }
        }
    }
}
