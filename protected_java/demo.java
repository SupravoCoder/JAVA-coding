package protected_java;
class StringDemo {
    public static void main(String[] args) 
    {
        String str = "Hello, World!"; // create a string
        System.out.println(str); // display the string
        int length = str.length(); // get the length of the string
        System.out.println("The length of the string is: " + length); // display the length of the string
        int index = str.indexOf("World"); // get the index of the substring
        System.out.println("The index of the substring is: " + index); // display the index of the substring
        String sub = str.substring(7); // get the substring
        System.out.println("The substring is: " + sub); // display the substring
        String replace = str.replace("World", "Java"); // replace the substring
        System.out.println("The replaced string is: " + replace); // display the replaced string
        // Upper case the string
        String upper = str.toUpperCase();
        System.out.println("The upper case string is: " + upper);
        // Lower case the string
        String lower = str.toLowerCase();
        System.out.println("The lower case string is: " + lower);
        // equals() method
        String str1 = "Hello, World!";
        String str2 = "Hello, World!";
        if (str1.equals(str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
        // equalsIgnoreCase() method
        String str3 = "Hello, World!";
        String str4 = "hello, world!";
        if (str3.equalsIgnoreCase(str4)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
        // compareTo() method
        String str5 = "Hello, World!";
        String str6 = "Hello, World!";
        int result = str5.compareTo(str6);
        if (result == 0) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
        // compareToIgnoreCase() method
        String str7 = "Hello, World!";
        String str8 = "hello, world!";
        int result1 = str7.compareToIgnoreCase(str8);
        if (result1 == 0) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
        // startsWith() method
        String str9 = "Hello, World!";
        if (str9.startsWith("Hello")) {
            System.out.println("The string starts with Hello.");
        } else {
            System.out.println("The string does not start with Hello.");
        }
        // endsWith() method
        String str10 = "Hello, World!";
        if (str10.endsWith("World!")) {
            System.out.println("The string ends with World!.");
        } else {
            System.out.println("The string does not end with World!.");
        }
        // contains() method
        String str11 = "Hello, World!";
        if (str11.contains("World")) {
            System.out.println("The string contains World.");
        } else {
            System.out.println("The string does not contain World.");
        }
        // isEmpty() method
        String str12 = "";
        if (str12.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            System.out.println("The string is not empty.");
        }
        // concat() method
        String str13 = "Hello, ";
        String str14 = "World!";
        String str15 = str13.concat(str14);
        System.out.println("The concatenated string is: " + str15);
        // trim() method
        String str16 = "  Hello, World!  ";
        String str17 = str16.trim();
        System.out.println("The trimmed string is: " + str17);
        // valueOf() method
        int num = 10;
        String str18 = String.valueOf(num);
        System.out.println("The string representation of the number is: " + str18);
        // charAt() method
        String str19 = "Hello, World!";
        char ch = str19.charAt(7);
        System.out.println("The character at index 7 is: " + ch);
        // toCharArray() method
        String str20 = "Hello, World!";
        char[] chars = str20.toCharArray();
        System.out.print("The characters in the string are: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
