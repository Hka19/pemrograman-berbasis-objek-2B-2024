/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

public class Pembagian extends Calculator {
    public Pembagian(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public double calculate() {
        if (operand2 != 0) {
            return operand1 / operand2;
        } else {
            System.out.println("Error: Pembagian oleh nol!");
            return Double.NaN;
        }
    }
}
