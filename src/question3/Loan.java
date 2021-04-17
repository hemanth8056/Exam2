/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author SHemanth Venkata Reddy Telluri
 */
public class Loan {
   private double loanAmount;
   private double annualInterestRate;
  private int numberOfYears;

    public Loan(double loanAmount, double annualInterestRate, int numberOfYears) {
        this.loanAmount = loanAmount;
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
    }

    @Override
    public String toString() {
        return "loanAmount: " + loanAmount + ", annualInterestRate: " + annualInterestRate + ", numberOfYears: " + numberOfYears;
    }
}
