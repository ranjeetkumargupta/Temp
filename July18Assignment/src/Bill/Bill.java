package Bill;
public class Bill {
    public int findPrice(int itemId) {
        switch (itemId) {
            case 1001:
                return 10;
            case 1002:
                return 20;
            case 1003:
                return 30;
            case 1004:
                return 40;
            default:
                return 0;
        }
    }

    public int findPrice(String brandName, String itemType, int size) {
        if (brandName.equals("BrandA") && itemType.equals("Type1")) {
            if (size == 1) {
                return 100;
            } else if (size == 2) {
                return 200;
            }
        } else if (brandName.equals("BrandB") && itemType.equals("Type2")) {
            if (size == 1) {
                return 150;
            } else if (size == 2) {
                return 250;
            }
        }
        return 0;
    }
}
