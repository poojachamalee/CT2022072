package Q3;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea(){
        return Math.PI * this.radius * this.radius;
    }

    public double computeCircumference(){
        return 2 * Math.PI * this.radius;
    }
}
