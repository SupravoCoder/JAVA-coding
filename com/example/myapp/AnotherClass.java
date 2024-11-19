package com.example.myapp;

public class AnotherClass {
    public void show() {
        MyClass myClass = new MyClass();
        myClass.display();
    }

    public static void main(String[] args) {
        AnotherClass anotherClass = new AnotherClass();
        anotherClass.show();
    }
}