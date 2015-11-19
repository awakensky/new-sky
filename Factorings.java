/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorings;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Factorings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number =1;
        while(number !=0){
            System.out.println("Enter Number 0 Program Exit");
            System.out.print("Enter Number :");
            number = sc.nextInt();
            number f = new  number();
            f.Factorization(number);
           
        }
    }
    
}
