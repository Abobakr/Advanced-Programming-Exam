// inside Bill.java file
public class Bill {
      int id;
      int store_id;
      int cust_id;
      String date;
      double total;
      boolean in_usd; // default value is false refers to Syrian pound

      public double getTotal() {
            return total;
      }

      public void setTotal(double total) {
            if (total < 0) {
                  System.out.println("Total cannot be negative. Value not set.");
                  return;
            }
            this.total = total;
      }

      public Bill(int id, int store_id, int cust_id, String date, double total, boolean in_usd) {
            this.id = id;
            this.store_id = store_id;
            this.cust_id = cust_id;
            this.date = date;
            this.total = total;
            this.in_usd = in_usd;
      }

      public void convertToDollar(double rate) {
            if (!in_usd) {
                  if (rate <= 0) {
                        System.out.println("Invalid exchange rate. Conversion failed.");
                        return;
                  }
                  total = total / rate;
            }
            in_usd = true;
      }

       public void convertToSyrianPound(double rate) {
            if (in_usd) {
                  if (rate <= 0) {
                        System.out.println("Invalid exchange rate. Conversion failed.");
                        return;
                  }
                  total = total * rate;
            }
            in_usd = false;
      }

      private int getIdFromServer(int store_id, int cust_id) {
            // Simulate fetching ID from server
            return 11; // Example ID
      }

      private int getIdFromLocalDB(int store_id, int cust_id) {
            // Simulate fetching ID from local database
            return 11; // Example ID
      }

      public boolean isValid() {
            int serverId = getIdFromServer(store_id, cust_id);
            int localId = getIdFromLocalDB(store_id, cust_id);
            if (serverId != localId || serverId != id) {
                  return false;
            }
            return true;
      }

}
