package types;

import general.TaxType;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal taxAmount;
        BigDecimal progressiveLow = new BigDecimal("0.1");
        BigDecimal progressiveHight = new BigDecimal("0.15");
        BigDecimal thresholdNumber = new BigDecimal("100000");
        if (thresholdNumber.compareTo(amount) <= 0) {
            taxAmount = amount.multiply(progressiveHight);
        } else {
            taxAmount = amount.multiply(progressiveLow);
        }
        return taxAmount;
    }
}