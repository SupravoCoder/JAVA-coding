// implement protected access specifier in the following code snippet that how it can be accessed within the package and outside the package through inheritance
package protected_java;

public class ProtectedExample {

    protected int mul(int a, int b) // protected access specifier can be accessed within the package and outside the package through inheritance
    {
        return a*b;
    }
    
    public static void main(String[] args)
    {
        ProtectedExample obj = new ProtectedExample();
        System.out.println("Multiplication: " + obj.mul(5, 6));
    }
}

