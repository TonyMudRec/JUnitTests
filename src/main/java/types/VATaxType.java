package types;

import general.TaxType;

import java.math.BigDecimal;

public class VATaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal va = new BigDecimal("0.18");
        return amount.multiply(va);
    }
}