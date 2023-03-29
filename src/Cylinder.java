public class Cylinder extends Circle{
    private final double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double volume(){
        return height * area();
    }

    @Override
    public String toString() {
        return "Cylinder: \n" +
                " Height: " + height + "\n"
                + " Color: "
                + getColor() + "\n"
                + " Volume is: "
                + volume();
    }
}
class TestCylinder{
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3,"Blue",4);
        System.out.println(cylinder);
    }
}
