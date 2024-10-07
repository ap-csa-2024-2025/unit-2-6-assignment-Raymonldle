import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // problem 1
    
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter the radius of the circle: ");
    double radius = userInput.nextDouble();
    Circle circle = new Circle(radius);
    System.out.println("A circle with a radius of " + circle.getRadius() + " has a circumference of " + circle.getCircumference() + " and an area of " + circle.getArea());

    //problem 2
    System.out.println("Enter number of sides: ");
    int numSides = userInput.nextInt();

    System.out.println("Enter the side length: ");
    double sideLength = userInput.nextDouble();

    RegularPolygon myPolygon = new RegularPolygon(numSides, sideLength);
    System.out.println("Area with " + myPolygon.getNumSides() + " sides: " + myPolygon.getArea());
    System.out.println("Incrementing the number of sides by two");
    myPolygon.setNumSides(numSides + 2);
    System.out.println("Area with " + myPolygon.getNumSides() + " sides: " + myPolygon.getArea());
  }
}
