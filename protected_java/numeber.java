// use inheritance to use the protected access specifier in the following code snippet using a proper example
package protected_java; // package name
 class number extends ProtectedExample // class number extends ProtectedExample class from the same package
{
    public static void main(String[] args)
    {
        number obj = new number();
        System.out.println("Multiplication: " + obj.mul(4, 6)); //// accessing protected method from the parent class
        // output: Multiplication: 30
    }
}
