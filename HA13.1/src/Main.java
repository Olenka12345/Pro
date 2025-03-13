public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Triangle(3, 4),
                new Square(2)
        };
printTotalArea(shapes);
    }

    public static void printTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        System.out.println("Сумарна площа всіх фігур: " + totalArea);
    }
}
