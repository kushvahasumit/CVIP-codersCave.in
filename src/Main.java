import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to PBFC ATM !!");

        Operation op = new ImplimentOpr();

        int atmnumber = 12345;
        int atmPin = 123;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ATM Number: ");
        int atmNumber = sc.nextInt();
        System.out.println("Please Enter your Pin: ");
        int pin = sc.nextInt();
        if ((atmnumber==atmNumber)&&(atmPin==pin) ){
            System.out.println("Authorized Account Holder !!");
            while (true){
                System.out.println(" 1.View Available Balance \n 2.Withdraw Amount \n 3.Deposit Amount \n 4.View mini Statement \n 5.Exit ATM");
                System.out.println("Enter your Process: ");
                int choice = sc.nextInt();
                if (choice==1){
                   op.viewBalance();
                } else if (choice==2) {
                    System.out.println("Enter amount to withdraw :");
                    double withdrawAmount = sc.nextDouble();
                   op.withdrawAmount(withdrawAmount);
                } else if (choice==3) {
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount = sc.nextDouble();
                    op.depositAmount(depositAmount);
                } else if (choice==4) {
                op.viewStatement();
                }else if (choice==5){
                    System.out.println("Collect your ATM Card \n Thank you for using ATM service");
                    System.exit(0);
                }else{
                    System.out.println("Something went Wrong");
                    System.exit(0);
                }
            }
        }else {
            System.out.println("Please Provide Valid ATM Number and Pin");
            System.exit(0);
        }

    }
}