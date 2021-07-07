package carShop;

public class DealershipApp {
    public static void main(String[] args) {

        Car Rivian = new Car("R1S", "Rivian", "Black", 2021);
        Customer Josh = new Customer("Josh", "Borreli");
        System.out.println(Josh.describe(String.format("%s, %s, %s, %s", Rivian.getColor(), Rivian.getYear(), Rivian.getMake(), Rivian.getModel())));

    }
}
