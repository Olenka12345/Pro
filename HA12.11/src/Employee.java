// Клас "Співробітник" із закритими полями та інкапсуляцією
class Employee {
    public String fullName;
    private String position;
    private String email;
    private String phone;
    private int age;

    // Конструктор класу
    public Employee(String fullName, String position, String email, String phone, int age) {
      this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    //  для отримання даних
    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }
}

// Клас Car із прихованими методами для запуску систем
class Car {
    // Публічний метод старту автомобіля
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Автомобіль успішно завівся");
    }

    // Приватні методи, приховані від використання поза класом
    private void startElectricity() {
        System.out.println("подача електроенергії");
    }

    private void startCommand() {
        System.out.println("Ініціалізовано систему управління");
    }

    private void startFuelSystem() {
        System.out.println("Активація паливної системи");
    }
}

// Головний клас для перевірки роботи
class Main1 {
    public static void main(String[] args) {
        // Створення об'єкта Employee
        Employee employee = new Employee(" Mark", "IT", " Mark@web.de ", "+38012345", 153);
        System.out.println("Employee: " + employee.getFullName() + ", " + employee.getPosition());

        // Створення об'єкта Car і запуск
        Car car = new Car();
        car.start();
    }
}


