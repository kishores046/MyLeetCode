import java.util.Iterator;
import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {

                k = k * 10 + (ch - '0');
            } else if (ch == '[') {

                countStack.push(k);
                stringStack.push(current);

                current = new StringBuilder();
                k = 0;
            } else if (ch == ']') {

                StringBuilder decoded = stringStack.pop();
                int repeatTimes = countStack.pop();

                decoded.append(current.toString().repeat(repeatTimes));
                current = decoded;
            } else {

                current.append(ch);
            }
        }

        return current.toString();
    }
}