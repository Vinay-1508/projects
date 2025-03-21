import java.util.Scanner;

public class demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean correct = false;
        System.out.println("Welcome to our Vinayak ka bharosa bank!");
        //take customer input for their name,age,phone,email and address also check if their email contains @ symbol
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your phone number: ");
        String phone=sc.nextLine();
        String email;
        do{
            System.out.println("Enter your E-mail address: ");
            email=sc.nextLine();
            if(email.contains("@")){
                correct=true;

            } else if (email.contains(" ")) {
                System.out.println("invalid email");

            } else{
                System.out.println("Invalid E-mail Address!");
                correct=false;
            }
        }while(!correct);
        System.out.println("Enter your address");
        String address=sc.nextLine();
        customer cust=new customer(name,age,phone,email,address);
        System.out.println("Your name is "+cust.getName()+", you are currently "+cust.getAge()+" years old.\n"+cust.getPhone()+" is your phone number and "+cust.getEmail()+" is your e-mail address.\n$"+cust.getBalance()+" is your current balance.");
        boolean run=true;
        do{
            System.out.println("------------------------------");
            System.out.println("----------------------");
            System.out.println("Welcome, "+name);
            System.out.println("Press 1: To show balance");
            System.out.println("Press 2: To Deposit");
            System.out.println("Press 3: To Withdraw");
            System.out.println("Press 0: To exit");
            System.out.println("----------------------");
            System.out.println("-----------------------------");
            int opt= sc.nextInt();
            switch(opt){
                case 1:
                    System.out.println("Your current balance is $"+cust.getBalance());
                    break;
                case 2:
                    System.out.println("Enter the amount you wish to deposit:");
                    cust.deposit(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Enter the amount you wish to withdraw:");
                    cust.withdraw(sc.nextDouble());
                    break;
                case 0:
                    System.out.println("Thank you for banking with us.");
                    run=false;
                    break;
                default:
                    System.out.println("Please enter a valid option!");
            }
        }while(run);
    }

    private static class customer{
        String name;
        int age;
        String phone;
        String email;
        String address;
        double balance;

        public customer(String name, int age, String phone, String email, String address) {
            this.name = name;
            this.age = age;
            this.phone = phone;
            this.email = email;
            this.address = address;
            this.balance = 0.0;
        }

        public int getAge() {
            return age;
        }

        public String getPhone() {
            return phone;
        }

        public String getEmail() {
            return email;
        }

        public String getAddress() {
            return address;
        }

        public double getBalance() {
            return balance;
        }

        public String getName() {
            return this.name;
        }

        public void deposit(double amt){
            if(amt<0){
                System.out.println("Invalid input!");
            }
            this.balance+=amt;
            System.out.println("Your new Balance is: "+this.balance);
        }
        public void withdraw(double amt){
            if(amt<=this.balance){
                this.balance-=amt;
                System.out.println("Your new Balance is: "+this.balance);
            }else {
                System.out.println("Insufficient Balance! " + this.balance);
            }
        }
    }

}
