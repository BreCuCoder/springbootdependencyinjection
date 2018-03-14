package com.switchfully.springdi;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AmericanTaxCalculationTest {
    @Test
            public void calculateTax_givenIncome10KshouldReturn2750() {
    TaxCalculation americanTaxCalculation = new AmericanTaxCalculation();
    double yearlyIncome = 10000.00;
    double expectedResult = 2750.00;
    double actualResult = americanTaxCalculation.calculateTax(yearlyIncome);
    Assert.assertEquals(actualResult,expectedResult,0);
    }

}