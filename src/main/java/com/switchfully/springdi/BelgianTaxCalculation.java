package com.switchfully.springdi;

public class BelgianTaxCalculation implements TaxCalculation {
    private static final double TAX_RATE = 0.45;

    public double calculateTax(double yearlyIncome){
            return yearlyIncome * TAX_RATE;
    }
}
