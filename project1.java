import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//college entrollment form
        System.out.println("College enrollment form");
  // name
        System.out.print("Enter your full Name:");
        String Name  = scan.nextLine();
   //date of birth
        System.out.print("Enter your date of birth:");
        String brith = scan.nextLine();
   // address
        System.out.print("Enter your Address :");
        String Address = scan.nextLine();
        //phone number
        System.out.print("Enter your Phone number:");
        String number = scan.nextLine();
        //10thh percentage
        System.out.print("Enter your 10th percentage:");
        double percentage = scan.nextDouble();
        //12th grade
        System.out.print("Enter your 12th grade:");
        double grade = scan.nextDouble();

        if(percentage>=85.0 && grade>=85.0){
            System.out.printf("welcome %s you are eligible for enrolling in our pristigious college in mumbai for further process are team will contact you on your registered number %d",Name,number);
        }else{
            System.out.printf("Sorry %s you are not eligible better luck next time",Name);
        }










    }
}
