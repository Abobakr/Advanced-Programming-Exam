// inside App.java file
public class App {
      public static final double EXCH_RATE = 130; // 1 dollar = 130 SYP

      public static void main(String[] args) {
            Bill bill_1 = new Bill(10, 13, 792, "2026-02-28", 130, true);
            Bill bill_2 = new Bill(11, 14, 793, "2026-03-01", 260, false);

            bill_1.convertToDollar(EXCH_RATE);
            bill_2.convertToDollar(0); // Invalid exchange rate, conversion should fail

            System.out.println(bill_1.total);
            System.out.println(bill_2.total);

            E_Bill e_bill_1 = new E_Bill(12, 15, 794, "2026-03-02", 20000, true, "REF123", 500);
            SmartBill smart_bill_1 = new SmartBill(13, 16, 795, "2026-03-03", 30000, true, "REF456", 700,
                        "abc123sha256", 0.1);
            System.out.println(e_bill_1.getTotal());
            System.out.println(smart_bill_1.getTotal());

            System.out.println("Bill 1 is valid: " + bill_1.isValid());
            System.out.println("Bill 2 is valid: " + bill_2.isValid());
      }
}