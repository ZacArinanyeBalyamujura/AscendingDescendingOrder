/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ascendingdescendingorder;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class Main {

    public static void main(String[] args) {
       int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
       int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));
       int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter third number"));

       AscendingOrder.AscOrder(num1, num2, num3);
       DescendingOrder.DscOrder(num1, num2, num3);
    }
}
