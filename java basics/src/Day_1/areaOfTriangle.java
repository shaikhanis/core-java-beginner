package Day_1;
// Write a program to calculate area of an equilateral triangle.

// Area of Equilateral Triangle = (sqrt(3)/4) * a * a
public class areaOfTriangle {
    public static void main(String[] args) {
        double side = 12;

        double AT = (Math.sqrt(3)/4) *(side*side);

        System.out.println(AT);
    }
}
