public class E_Bill extends Bill {

      String reference_code;
      double e_service_fee;

      public E_Bill(int id, int store_id, int cust_id, String date, double total, boolean in_usd, String reference_code,
                  double e_service_fee) {
            super(id, store_id, cust_id, date, total, in_usd);
            this.reference_code = reference_code;
            this.e_service_fee = e_service_fee;
      }

      @Override
      public double getTotal() {
            return total + e_service_fee;
      }
}