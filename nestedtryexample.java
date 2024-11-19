public class nestedtryexample {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("Division by zero: " + 5/0);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: " + e);
            }
            try {
                int[] arr = new int[5];
                arr[6] = 9;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: " + e);
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
