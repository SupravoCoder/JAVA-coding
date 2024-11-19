package com.example.external;

import com.example.myapp.MyClass;

public class ExternalClass {
    public void demonstrate() {
        MyClass myClass = new MyClass();
        myClass.display();
    }

    public static void main(String[] args) {
        ExternalClass externalClass = new ExternalClass();
        externalClass.demonstrate();
    }
}
