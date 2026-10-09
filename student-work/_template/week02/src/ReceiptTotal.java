public class ReceiptTotal 
{
  public static void main(String[] args) {
        int quantity = 4;
        int unitPriceCents = 275;

        int totalCents = quantity * unitPriceCents;

        System.out.println("Total cost (cents): " + totalCents);

        // Integer division removes the cents because both values are integers.
        int wholeDollars = totalCents / 100;

        System.out.println("Total cost (whole dollars only): " + wholeDollars);
    }

}