package org.example;

import org.example.task0.BankAccount;
import org.example.task1.Book;
import org.example.task2.Student;
import org.example.task3.Point;
import org.example.task4.Clock;
import org.example.task5.Car;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setBalance(100000);
        account1.print();

        Book book1 = new Book ();
        book1.setTitle ("Мартин Иден");
        book1.setAuthor ("Джек Лондон");
        book1.setYear (1909);
        book1.display();

        Student student1 = new Student ();
        student1.setName ("Дмитрий");
        student1.setNumber ("010203");
        student1.setScore (9.4);
        student1.print ();

        Point point1 = new Point ();
        point1.setX (7);
        point1.setY (3);
        point1.display();
        point1.moveUp ();
        point1.moveDown ();
        point1.moveLeft ();
        point1.moveRight ();

        Clock clock1 = new Clock ();
        clock1.setTime (13,33,56);
        clock1.readTime();

        Car car1 = new Car();
        car1.setBrand("Hyundai");
        car1.setModel("i30");
        car1.setYear(2022);
        car1.display();
        car1.start();
        car1.drive();
        car1.stop();




    }
}