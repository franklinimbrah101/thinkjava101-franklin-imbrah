public class ReceiptTotalFixed 
{
    public static void main(String[] args) {
        int quantity = 4;
        int unitPriceCents = 275;

        double totalDollars = (quantity * unitPriceCents) / 100.0;

        System.out.println("Total cost (dollars): " + totalDollars);


        double y1 = 1 / 3;

       
        double y2 = 1.0 / 3.0;

        System.out.println("y1 (int division then converted): " + y1);
        System.out.println("y2 (floating-point division): " + y2);
    }
}