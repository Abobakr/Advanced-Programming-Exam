public class SmartBill extends E_Bill {
      String sha_256;
      double commission;

      public SmartBill(int id, int store_id, int cust_id, String date, double total, boolean in_usd,
                  String reference_code, double e_service_fee, String sha_256, double commission) {
            super(id, store_id, cust_id, date, total, in_usd, reference_code, e_service_fee);
            this.sha_256 = sha_256;
            this.commission = commission;
      }

      @Override
      public double getTotal() {
            return (total + e_service_fee) * (1 + commission);
      }

}