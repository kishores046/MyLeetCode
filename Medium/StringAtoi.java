public class StringAtoi {
    public int myAtoi(String s) {
        // Initialize variables
        int i = 0, n = s.length();
        int sign = 1;
        int result = 0;

        // Step 1: Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Check for the sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert the digits to an integer
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Step 4: Handle overflow/underflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            // Update result
            result = result * 10 + digit;
            i++;
        }

        // Step 5: Return the final result with the sign
        return result * sign;
    }
    
    public static void main(String args[]){
        StringAtoi obj=new StringAtoi();
        String s="42";
        System.out.println(obj.myAtoi(s));
    }
}