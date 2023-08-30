public class Example4 {
    public static void main(String[] args) {
   
        String exampleString = "Hello, World!";
        char charAtIndex = exampleString.charAt(7);
        char[] charArray = new char[7];
        exampleString.getChars(7, 12, charArray, 0);
        char[] toArray = exampleString.toCharArray();

        System.out.println("Character at index 7: " + charAtIndex);
        System.out.println("Extracted characters (getChars): " + new String(charArray));
        System.out.println("Converted to character array: " + new String(toArray));

    
        String str1 = "banana";
        String str2 = "Banana";
        String str3 = "apple";

        boolean equalsResult = str1.equals(str2);
        boolean equalsIgnoreCaseResult = str1.equalsIgnoreCase(str2);
        int compareToResult = str1.compareTo(str3);

        System.out.println("Equals: " + equalsResult);
        System.out.println("EqualsIgnoreCase: " + equalsIgnoreCaseResult);
        System.out.println("CompareTo (str1 vs str3): " + compareToResult);

   
        String original = "Java Programming";
        String subString = original.substring(7);
        String concatenated = original.concat(" is fun!");
        String replaced = original.replace('b', 'B');

        System.out.println("Substring from index 7: " + subString);
        System.out.println("Concatenated string: " + concatenated);
        System.out.println("Replaced 'b' with 'B': " + replaced);
    }
}
