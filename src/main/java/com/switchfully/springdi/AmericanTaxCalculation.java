package com.switchfully.springdi;

public class AmericanTaxCalculation implements TaxCalculation {
    private static final double TAX_RATE = 0.18;
    private static final double LUMP_SUM = 950;

    @Override
    public double calculateTax(double yearlyIncome) {
        return yearlyIncome * TAX_RATE + LUMP_SUM;
    }
}
