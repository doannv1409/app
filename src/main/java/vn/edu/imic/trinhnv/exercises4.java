/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.imic.trinhnv;

/**
 *
 * @author trinhcover
 */
public class exercises4 {
    public static void main(String[] args) {
        //a
        int a = 10;
        if (a > 0) {
            System.out.println("Gia tri cua a > 0");
        }else{
            System.out.println("Gia tri cua a < 0");
        }
        
        //b
        int b = 2;
        int i = 1;
         while (i < b) {            
             System.out.println("gia tri cua i = " + i);
             i ++;
        }
        //c
        int c = 10;
        do {            
            System.out.println("gia tri cua i = " + i);
            i ++;
        } while (i < c);
        
        //d
        int d = 10;
        for (int j = 0; j < d; j++) {
            System.out.println("gia tri cua j = " + j);
        }
    }
}
