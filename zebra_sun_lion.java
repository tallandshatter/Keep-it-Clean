import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        // declare variables
        int number1, number2, number3, sum;
 
        // create a scanner object
        Scanner input = new Scanner(System.in);
 
        //Read input from user
        System.out.println("Enter number 1:");
        number1 = input.nextInt();
 
        System.out.println("Enter number 2:");
        number2 = input.nextInt();
 
        System.out.println("Enter number 3:");
        number3 = input.nextInt();
 
        // Compute the sum
        sum = number1 + number2 + number3;
 
        // Display the output
        System.out.println("The sum of the numbers is: " + sum);
 
        // closing the scanner object
        input.close();
    }
}

public class Student {
 
    int id;
    String name;
 
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
 
    public void display(){
        System.out.println(id+" "+name);
    }
}

public class TestStudent {
 
    public static void main(String[] args) {
        // Creating objects
        Student s1 = new Student(111, "Bob");
        Student s2 = new Student(222, "Sushil");
 
        // Invoking methods
        s1.display();
        s2.display();
    }
}

public class TestArray {
 
    public static void main(String[] args) {
        // Declaring array
        double[] myList = {1.9, 2.9, 3.4, 3.5};
 
        // Print all the array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
 
        // Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is " + total);
 
        // Finding the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);
    }
}

public class AddTwoNumbers {
 
    public static void main(String[] args) {
 
        double first = 14.6;
        double second = 4.8;
 
        double sum = first + second;
 
        System.out.println("The sum of two numbers is: " + sum);
    }
}

public class AreaOfCircle {
 
    public static void main(String[] args) {
        double radius = 7.5;
        double pi = 3.14159;
 
        double area = radius * radius * pi;
 
        System.out.println("The area of circle is: " + area);
    }
}

public class Flight {
 
    int flightNumber;
    String origin;
    String destination;
 
    public Flight(int flightNumber, String origin, String destination) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
    }
 
    // Method
    public void display(){
        System.out.println("Flight number: " + flightNumber);
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);
    }
}

public class TestFlight {
 
    public static void main(String[] args) {
        // Create Flight objects
        Flight flight1 = new Flight(87, "New York", "London");
        Flight flight2 = new Flight(23, "Paris", "New York");
 
        // Invoke the methods
        flight1.display();
        flight2.display();
    }
}

public class Employee {
 
    int id;
    String name;
    int age;
    double salary;
 
    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
 
    // Method
    public void display(){
        System.out.println(id+" "+name+" "+age+" "+salary);
    }
}

public class TestEmployee {
 
    public static void main(String[] args) {
        // Creating objects
        Employee e1 = new Employee(101, "Bob", 23, 50000.0);
        Employee e2 = new Employee(102, "Rina", 24, 60000.0);
 
        // Invoking methods
        e1.display();
        e2.display();
    }
}

public class Rectangle {
 
        // member variables
        double length;
        double width;
 
        //constructor
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
 
        // Method
        public double area(){
            return length * width;
        }
    }

public class TestRectangle {
 
    public static void main(String[] args) {
        // Create objects
        Rectangle rect1 = new Rectangle(5.5, 4.8);
        Rectangle rect2 = new Rectangle(7.5, 3.2);
 
        // Invoke methods
        System.out.println("Area of Rectangle 1: " + rect1.area());
        System.out.println("Area of Rectangle 2: " + rect2.area());
    }
}

public class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;
 
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
 
    // Method
    public void deposit(double amount){
        balance = balance + amount;
    }
 
    public void withdrawal(double amount){
        balance = balance - amount;
    }
 
    public void display(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class TestBankAccount {
 
    public static void main(String[] args) {
        // Create objects
        BankAccount acc1 = new BankAccount(12345, "Bob", 1000.0);
        BankAccount acc2 = new BankAccount(67890, "Rina", 2000.0);
 
        // Invoke methods
        acc1.deposit(500);
        acc2.withdrawal(500);
 
        acc1.display();
        acc2.display();
    }
}

public class Car {
 
    int modelYear;
    String modelName;
 
    public Car(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }
 
    // Method to display the values
    public void display(){
        System.out.println(modelYear + " " + modelName);
    }
}

public class TestCar {
 
    public static void main(String[] args) {
        // Create objects
        Car car1 = new Car(2009, "Honda Civic");
        Car car2 = new Car(2015, "Toyota Corolla");
 
        // Invoke methods
        car1.display();
        car2.display();
    }
}

public class Phone {
 
    String color;
    int batteryPercentage;
 
    public Phone(String color, int batteryPercentage) {
        this.color = color;
        this.batteryPercentage = batteryPercentage;
    }
 
    // Method
    public void display(){
        System.out.println("color: " + color);
        System.out.println("battery percentage: " + batteryPercentage + "%");
    }
}

public class TestPhone {
 
    public static void main(String[] args) {
        // Create objects
        Phone phone1 = new Phone("black", 100);
        Phone phone2 = new Phone("white", 75);
 
        // Invoke methods
        phone1.display();
        phone2.display();
    }
}

public class Pen {
 
    String color;
    double price;
 
    public Pen(String color, double price) {
        this.color = color;
        this.price = price;
    }
 
    //Method
    public void display(){
        System.out.println("color: " + color);
        System.out.println("price: " + price);
    }
}

public class TestPen {
 
    public static void main(String[] args) {
        // Create objects
        Pen pen1 = new Pen("red", 1.0);
        Pen pen2 = new Pen("blue", 2.0);
 
        // Invoke methods
        pen1.display();
        pen2.display();
    }
}

public class Laptop {
 
    String brand;
    int ram;
 
    public Laptop(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }
 
    // Method
    public void display(){
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + "GB");
    }
}

public class TestLaptop {
 
    public static void main(String[] args) {
        // Create objects
        Laptop laptop1 = new Laptop("Apple", 16);
        Laptop laptop2 = new Laptop("Dell", 8);
 
        // Invoke methods
        laptop1.display();
        laptop2.display();
    }
}

public class Book {
 
    String title;
    String author;
    double price;
 
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
 
    // Method
    public void display(){
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("price: " + price);
    }
}

public class TestBook {
 
    public static void main(String[] args) {
        // Create objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.0);
        Book book2 = new Book("Lord of the Rings", "J. R. R. Tolkien", 20.0);
 
        // Invoke methods
        book1.display();
        book2.display();
    }
}

public class Television {
 
    String brand;
    int size;
 
    public Television(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }
 
    // Method
    public void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size + " inches");
    }
}

public class TestTelevision {
 
    public static void main(String[] args) {
        // Create objects
        Television tv1 = new Television("Samsung", 32);
        Television tv2 = new Television("Sony", 55);
 
        // Invoke methods
        tv1.display();
        tv2.display();
    }
}

public class Calculator {
 
    double num1, num2;
 
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
 
    // Method
    public double add(){
        return num1 + num2;
    }
    public double subtract(){
        return num1 - num2;
    }
    public double multiply(){
        return num1 * num2;
    }
    public double divide(){
        return num1 / num2;
    }
}

public class TestCalculator {
 
    public static void main(String[] args) {
        // Create objects
        Calculator calc1 = new Calculator(10.5, 5.5);
 
        // Invoke methods
        System.out.println("10.5 + 5.5 = " + calc1.add());
        System.out.println("10.5 - 5.5 = " + calc1.subtract());
        System.out.println("10.5 * 5.5 = " + calc1.multiply());
        System.out.println("10.5 / 5.5 = " + calc1.divide());
    }
}

public class Chair {
 
    int height;
    String material;
 
    public Chair(int height, String material) {
        this.height = height;
        this.material = material;
    }
 
    // Method
    public void display(){
        System.out.println("height: " + height);
        System.out.println("material: " + material);
    }
}

public class TestChair {
 
    public static void main(String[] args) {
        // Create objects
        Chair chair1 = new Chair(30, "wood");
        Chair chair2 = new Chair(35, "plastic");
 
        // Invoke methods
        chair1.display();
        chair2.display();
    }
}

public class Shoe {
 
    int size;
    String color;
 
    public Shoe(int size, String color) {
        this.size = size;
        this.color = color;
    }
 
    // Method
    public void display(){
        System.out.println("size: " + size);
        System.out.println("color: " + color);
    }
}

public class TestShoe {
 
    public static void main(String[] args) {
        // Create objects
        Shoe shoe1 = new Shoe(8, "black