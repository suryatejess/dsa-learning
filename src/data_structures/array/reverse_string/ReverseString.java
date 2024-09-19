package data_structures.array.reverse_string;

public class ReverseString {
    public static void main(String[] args) {
        String originalString = "Hello World";
        System.out.println(originalString);

        String reversedString = reverse_string(originalString);
        System.out.println("reversed string is : " + reversedString);

    }

    public static String reverse_string(String original) {
        StringBuilder reversed = new StringBuilder();

        for(int index=original.length()-1; index>=0; index--) {
            char currentChar = original.charAt(index);
            reversed.append(currentChar);
        }

        String reversedString = reversed.toString();
        return reversedString;
    }
}
