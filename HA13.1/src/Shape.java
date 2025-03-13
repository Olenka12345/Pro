// 1. Базовий інтерфейс
interface Shape {
    double getArea();
    }

    // 2. Реалізація для кола
    class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    // 3. Реалізація для трикутника
    class Triangle implements Shape {
        private double base, height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double getArea() {
            return 0.5 * base * height;
        }
    }

    // 4. Реалізація для квадрата
    class Square implements Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double getArea() {
            return side * side;
        }
    }

    // 5. Головний клас
    class main {
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
