package com.bacazy.problem.newcoder;

import java.util.Stack;

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 Valid operators are+,-,*,/. Each operand may be an integer or another expression.
 Some examples:
 ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for (String token: tokens){
            if (isOperator(token)){
                compute(stack,token);
            }else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private void compute(Stack<Integer> stack, String operator) {
        int b = stack.pop();
        int a = stack.pop();
        if (operator.equals("+")){
            stack.push(a + b);
            return;
        }

        if (operator.equals("-")){
            stack.push(a - b);
            return;
        }
        if (operator.equals("*")){
            stack.push(a * b);
            return;
        }
        if (operator.equals("/")){
            stack.push(a / b);
        }
    }

    private boolean isOperator(String token) {
        if (token.equals("+")){
            return true;
        }

        if (token.equals("-")){
            return true;
        }

        if (token.equals("*")){
            return true;
        }

        if (token.equals("/")){
            return true;
        }

        return false;
    }
}
