package Q1;
public class Q1 {
    public static void main(String[] args) {
        // a.The square root of B2 + 4AC (A and C are distinct variables)
        double A = 5;
        double B = 10;
        double C = 2;
        double X = 8;
        double Y = 4;
        double radius = 7;
        double ansA = Math.sqrt(Math.pow(B, 2) + (4 * A * C));

        // b.The square root of X + 4Y^3
        double ansB = Math.sqrt(X + (4 * (Math.pow(Y, 3))));

        // c.The cube root of the product of X and Y
        double ansC = Math.cbrt(X * Y);

        // d. The area of a circle
        double area = Math.PI * Math.pow(radius,2);

        System.out.printf("Answer A: %.2f%n" , ansA);
        System.out.printf("Answer B: %.2f%n" , ansB);
        System.out.printf("Answer C: %.2f%n" , ansC);
        System.out.printf("Circle Area: %.2f%n"  , area);

    }
}

