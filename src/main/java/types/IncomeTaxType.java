package types;

import general.TaxType;

import java.math.BigDecimal;

public class IncomeTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal income = new BigDecimal("0.13");
        return amount.multiply(income);
    }
}