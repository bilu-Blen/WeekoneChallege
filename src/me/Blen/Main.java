package me.Blen;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome, please enter a number to evaluate prime numbers");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.nextLine();
        int primeNumber;


        for (int i = 2; i < number; i++) {

            primeNumber = 0;
            for(int j=2; j <i; j++){

                if(i%j==0){
                    primeNumber=1;
                }
            }
            if(primeNumber==0){
                System.out.println(i + " is a prime number");
            }else{
                System.out.println(i + " is not a prime number");
            }


        }
    }

}

