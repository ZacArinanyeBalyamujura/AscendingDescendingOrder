/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ascendingdescendingorder;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class AscendingOrder {
    public static void AscOrder(int num1, int num2, int num3){
            // num1 is the smallest
            if(num1 <= num2 && num1 <= num3){
                if(num2 <= num3){
                    JOptionPane.showMessageDialog(null, "Numbers in ascending order are: " + num1 + ", " + num2 + ", " + num3);
                } else {
                    JOptionPane.showMessageDialog(null, "Numbers in ascending order are: " + num1 + ", " + num3 + ", " + num2);
                }
            }
            // num2 is the smallest
            else if (num2<=num1 && num2<=num3){
                if(num1 <= num3){
                    JOptionPane.showMessageDialog(null, "Numbers in ascending order are: " + num2 + ", " + num1 + ", " + num3);
                } else {
                    JOptionPane.showMessageDialog(null, "Numbers in ascending order are: " + num2 + ", " + num3 + ", " + num1);
                }
            }
            // num3 is the smallest
            else {
                if (num2 <= num1){
                    JOptionPane.showMessageDialog(null, "Numbers in ascending order are: " + num3 + ", " + num2 + ", " + num1);
                } else {
                    JOptionPane.showMessageDialog(null, "Numbers in ascending order are: " + num3 + ", " + num1 + ", " + num2);
                }
            }
        }
}
