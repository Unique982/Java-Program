public class Example1 {
    public static void main(String[] args) {
        try {
        
            int result = 50 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        try {
            
            int[] arr = new int[6];
            arr[10] = 42; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            
            String numStr = "unique";
            int num = Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}
