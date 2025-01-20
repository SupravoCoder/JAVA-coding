package protected_java;

public class string_buffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello, World!"); // create a string buffer
        System.out.println(str); // display the string buffer
        int length = str.length(); // get the length of the string buffer
        System.out.println("The length of the string buffer is: " + length); // display the length of the string buffer
        int capacity = str.capacity(); // get the capacity of the string buffer
        System.out.println("The capacity of the string buffer is: " + capacity); // display the capacity of the string buffer
        str.ensureCapacity(50); // increase the capacity of the string buffer
        int newCapacity = str.capacity(); // get the new capacity of the string buffer
        System.out.println("The new capacity of the string buffer is: " + newCapacity); // display the new capacity of the string buffer
        str.setLength(5); // set the length of the string buffer
        System.out.println("The new length of the string buffer is: " + str.length()); // display the new length of the string buffer
        str.append(" Java"); // append a string to the string buffer
        System.out.println("The appended string buffer is: " + str); // display the appended string buffer
        str.insert(5, " Java"); // insert a string into the string buffer
        System.out.println("The inserted string buffer is: " + str); // display the inserted string buffer
        str.delete(5, 10); // delete a substring from the string buffer
        System.out.println("The deleted string buffer is: " + str); // display the deleted string buffer
        str.reverse(); // reverse the string buffer
        System.out.println("The reversed string buffer is: " + str); // display the reversed string buffer
    }
    
}
