// Last updated: 4/22/2026, 3:47:49 PM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String t : tokens) {
            if(isOperator(t)) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                int result = 0;

                if(t.equals("+")) {
                    result = num2 + num1;
                } else if (t.equals("-")) {
                    result = num2 - num1;
                } else if (t.equals("*")) {
                    result = num2 * num1;
                } else {
                    result = num2 / num1;
                }
                stack.push(result);
            } else {
                stack.push(convertToInteger(t));
            }
        }

        return stack.peek();
    }

    private static boolean isOperator(String o) {
        return o.equals("+") || o.equals("-") || o.equals("*") || o.equals("/");
    }

    private static int convertToInteger(String t) {
        int num = 0;
        boolean sign = true;
        for(char c : t.toCharArray()) {
            if (c == '-') {
                sign = false;
            } else {
                num = (num * 10) + (c - '0');
            }
        }
        return (sign == false) ? -1 * num : num;
    }
}