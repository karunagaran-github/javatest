package task10;

public class Circle {
    private double radius;

    // No-argument constructor
    public Circle() {
        // Initialize with a default radius (e.g., 1.0)
        this.radius = 1.0;
    }

    // Two-argument constructor
    public Circle(double radius) {
        // Initialize with the provided radius
        this.radius = radius;
    }

    // Method to calculate the circumference (perimeter)
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Create Circle objects with different constructors
        Circle circle1 = new Circle();          // No-argument constructor
        Circle circle2 = new Circle(5.0);      // Two-argument constructor

        // Calculate and print the circumferences
        System.out.println("Circumference of circle1: " + circle1.calculateCircumference());
        System.out.println("Circumference of circle2: " + circle2.calculateCircumference());


	

	}

}
