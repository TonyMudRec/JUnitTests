import general.Bill;
import general.TaxService;
import types.IncomeTaxType;
import types.ProgressiveTaxType;
import types.VATaxType;

import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {

        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                new Bill(BigDecimal.valueOf(100), new IncomeTaxType(), taxService),
                new Bill(BigDecimal.valueOf(110000), new ProgressiveTaxType(), taxService),
                new Bill(BigDecimal.valueOf(90000), new ProgressiveTaxType(), taxService),
                new Bill(BigDecimal.valueOf(1000), new VATaxType(), taxService)
        };
        for (Bill bill : payments) {
            bill.payTaxes();

        }
    }
}