/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

/**
 *
 * @author DELL
 */
public class Rom {
    public static void printROM(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 50; j++) {
                if (i==0 || i==5) {
                    System.out.print("*");
                } else if(i==2){
                    switch (j) {
                        case 3:
                            System.out.println("Develop By Rejaul Karim");
                            break;
                        case 4:
                            System.out.println("Roll: 41");
                            break;
                        case 5:
                            System.out.println("Semester: 6th");
                            break;
                        case 6:
                            System.out.print("Batch: E-62");
                            break;
                        default:
                            break;
                    }
                    
                
                }            
              
            }
            System.out.println("");
        }
    }
    
}
