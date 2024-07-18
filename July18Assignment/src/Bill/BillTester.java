package Bill;
public class BillTester {
    public static void main(String[] args) {
        Bill bill = new Bill();
        
        int priceById = bill.findPrice(1002);
        System.out.println("Price by ID: " + priceById);
        
        int priceByDetails = bill.findPrice("BrandA", "Type1", 2);
        System.out.println("Price by Details: " + priceByDetails);
    }
}
