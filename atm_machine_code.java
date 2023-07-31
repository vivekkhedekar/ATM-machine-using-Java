import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class atm_machine_code {
    public static void main(String[] args) {
        int balance=50000;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for balance check 2 for deposit 3 for withdraw");
        int a= sc.nextInt();
        int pin;
        switch (a){
            case 1:
                System.out.println("enter your pin");
                pin=sc.nextInt();
                if (pin==1234){
                    System.out.println("your balance is :"+balance);
                }
                else {
                    System.out.println("invalid pin entered");
                }
                break;
            case 2:
                System.out.println("enter your pin");
                pin= sc.nextInt();
                if (pin ==1234){
                    System.out.println("enter amount your want to deposit");
                    int deposit=sc.nextInt();
                    balance=balance+deposit;
                    System.out.println("your balance after deposit is:"+deposit);
                }
                else {
                    System.out.println("invalid pin entered");
                }
                break;
            case 3:
                System.out.println("enter your pin");
                pin= sc.nextInt();
                if (pin ==1234) {
                    System.out.println("enter amount you want to withdraw");
                    int withdraw = sc.nextInt();
                    if (withdraw > balance) {
                        System.out.println("not sufficient fund");
                    } else {
                        balance = balance - withdraw;
                        System.out.println("your balance after withdral :" + balance);
                    }
                }
                else{
                        System.out.println("invalid pin entered");
                    }
                break;
            default:
                System.out.println("invalid input");



        }
    }
}
