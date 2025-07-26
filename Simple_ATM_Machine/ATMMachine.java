package simple_ATM_Machine;
import java .util.*;

import java.util.Scanner;

class Atm{
    int PIN = 2234;
    float Balance = 5000;

    public void checkPin(){
        System.out.println("Enter your PIN:");
        Scanner sc = new Scanner(System.in);
        int enteredPIN = sc.nextInt();

        if(enteredPIN == PIN){
            menu();
        }else{
            System.out.println("Invalid PIN");
        }
    }

    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposite Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt ==1){
            checkBalance();
        } else if (opt ==2) {
            Withdraw();
        }else if (opt ==3) {
            Deposite();
        }else if (opt ==4) {
            return;
        }else {
            System.out.println("Invalid Choice");
        }

    }

    public void checkBalance(){
        System.out.println("Balance: "+ Balance);
        menu();
    }
    public void Withdraw(){
        System.out.println("Enter Withdraw amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }else {
            Balance = Balance - amount;
            System.out.println("Withdraw Successful");
        }
        menu();
    }

    public void Deposite(){
        System.out.println("Enter your Deposite amount:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;

        System.out.println("Money Deposited Successfully");
        menu();
    }
}


public class ATMMachine {
    public static void main(String[] args) {
    Atm obj = new Atm();
    obj.checkPin();
    }

}
