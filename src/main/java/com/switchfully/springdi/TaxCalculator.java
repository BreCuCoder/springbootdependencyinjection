package com.switchfully.springdi;

public class TaxCalculator {

    private TaxCalculation taxCalculation;

    public TaxCalculator(TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }

    public double calculateTaxesOnYearlyIncome(double yearlyIncome) {
        return this.taxCalculation.calculateTax(yearlyIncome);
    }


}
