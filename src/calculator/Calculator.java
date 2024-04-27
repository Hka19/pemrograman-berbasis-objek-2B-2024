/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

// Kelas abstrak Calculator
public abstract class Calculator {
    protected double operand1;
    protected double operand2;
    
    // Konstruktor
    public Calculator(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    
    // Metode abstrak untuk operasi matematika
    public abstract double calculate();
}
