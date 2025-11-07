void main() {
    String expression = "7+3*3/4-2";
    Stack<Integer> ops = new Stack<>();
    int num = 0;
    char sign = '+';
    for (int i = 0; i < expression.length(); i++) {
        char c = expression.charAt(i);
        if (Character.isDigit(c)) {
            num = num * 10 + (c - '0');
        }
        if ((!Character.isDigit(c) && c != ' ') || i == expression.length() - 1) {
            if (sign == '+') {
                ops.push(num);
            } else if (sign == '-') {
                ops.push(-num);
            } else if (sign == '*') {
                ops.push(ops.pop() * num);
            } else if (sign == '/') {
                int top = ops.pop();
                ops.push(top / num);
            }
            sign = c;
            num = 0;
        }
    }
    int res = 0;
    for (int n : ops) {
        res += n;
    }
    IO.println(res);

}
