package chapter6.finnalAssigmentOnChapter6;

import org.testng.annotations.Test;

public class BillGenerationTest {

    @Test
    public void generateBillTest() {

        PhoneBill bill;
        bill= new PhoneBill(123456);
        bill.setUsedMinutes(1000);
        bill.printPhoneBillStatement();
    }
}
