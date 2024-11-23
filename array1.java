import java.util.*;

class Array1 {
    private int[] array;

    // Parameterized constructor to initialize the array
    public Array1(int n) 
    {
        array = new int[n];
        System.out.println("Array memory location: " + System.identityHashCode(array));
    }

    // Method to fill the array with user input
    public void createArray() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + array.length + " elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("First element memory location: " + System.identityHashCode(array[0]));
        System.out.println("Last element memory location: " + System.identityHashCode(array[array.length - 1]));
    }

    // Method to print the array
    public void printArray() {
        System.out.println("Array elements are:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Create an instance of Array1 with the specified size
        Array1 array1 = new Array1(n);

        // Fill the array with user input
        array1.createArray();

        // Print the array
        array1.printArray();
    }
}





