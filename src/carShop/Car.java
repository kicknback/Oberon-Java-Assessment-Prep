package carShop;

public class Car extends Customer implements Sentence {
    public Car(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public static void main(String[] args) {
        Car c = new Car("dodge", "sxt Charger", "black", 2010, "Jordy", "Muniz");
        System.out.println(c.sayMake());
    }
    private String model;
    private String make;
    private String color;
    private int year;

    public Car(String model, String make, String color, int year, String firstName, String lastName){
        super(firstName, lastName);
        this.model = model;
        this.make = make;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String sayMake() {
        return "Hello there " + super.getFirstName() + " " + super.getLastName() + " here is your " + this.color + " " + this.year + " " + this.make + " " + this.model + "!";
    }
}

