/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.imic.trinhnv;

import java.util.Scanner;

/**
 *
 * @author trinhcover
 */
public class exercises5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        float a = sc.nextFloat();
        System.out.print("Enter b: ");
        float b = sc.nextFloat();
        System.out.print("Choice: 0(+) 1(-) 2(*) 3(/): ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 0:
                System.out.println("a + b = " + (a + b));
                break;
            case 1:
                System.out.println("a - b = " + (a - b));
                break;
            case 2:
                System.out.println("a * b = " + (a * b));
                break;
            case 3:
                System.out.println("a / b = " + (a / b));
                break;
            default:
                System.err.println("Invalid option selected");
        }
    }
}
