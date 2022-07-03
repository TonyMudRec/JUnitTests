import org.junit.jupiter.api.Assertions;
import types.IncomeTaxType;
import types.ProgressiveTaxType;
import types.VATaxType;

import java.math.BigDecimal;

public class CalculateTaxTest {
    IncomeTaxType itt = new IncomeTaxType();
    ProgressiveTaxType ptt = new ProgressiveTaxType();
    VATaxType vatt = new VATaxType();

    @org.junit.jupiter.api.Test
    public void testIncomeTaxType() {
        // given:
        BigDecimal amount = BigDecimal.valueOf(100);
        int expected = 13;
        // when:
        int result = itt.calculateTaxFor(amount).toBigInteger().intValueExact();
        // then:
        Assertions.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    public void testProgressiveTaxType() {
        // given:
        BigDecimal amount = BigDecimal.valueOf(110000);
        int expected = 16500;
        // when:
        int result = ptt.calculateTaxFor(amount).toBigInteger().intValueExact();
        // then:
        Assertions.assertEquals(expected, result);
    }


    @org.junit.jupiter.api.Test
    public void testVATaxType() {
        // given:
        BigDecimal amount = BigDecimal.valueOf(1000);
        int expected = 180;
        // when:
        int result = vatt.calculateTaxFor(amount).toBigInteger().intValueExact();
        // then:
        Assertions.assertEquals(expected, result);
    }
}