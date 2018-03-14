package com.switchfully.springdi;

public class FrenchTaxCalculation implements TaxCalculation {
    private static final double TAX_RATE = 0.48;

    public double calculateTax(double yearlyIncome){
        return yearlyIncome * TAX_RATE;
    }
}
