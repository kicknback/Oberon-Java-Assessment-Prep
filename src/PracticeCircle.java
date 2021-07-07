public class PracticeCircle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circumference(int radius) {
        return 2 * Math.PI * radius;
    }
    public double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

}
