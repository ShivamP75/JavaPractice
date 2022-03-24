package com.company.SearchingNewtonSchool;

import java.util.Stack;

public class StsckWithMinElement {
    public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    push(s, 3);
    push(s, 5);
    getMin(s);
    top(s);
    pop(s);
    top(s);

    }

    //Function to insert element to stack
    public static void push (Stack < Integer > s, int x)
    {
//Enter your code here
        s.push(x);
    }

    // Function to pop element from stack
    public static void pop (Stack < Integer > s)
    {
//Enter your code here
        if(s.isEmpty()) return;
        else s.pop();
    }

    // Function to print the top of stack
    public static void top(Stack < Integer > s)
    {
        //Enter your code here
        if(!s.isEmpty()) System.out.println(s.peek());
        else System.out.println("0");
    }

    //Function to print the minimum element from stack
    public static void getMin(Stack<Integer> s)
    {
//Enter your code here
        if(s.isEmpty()) System.out.println("-1");
        else{
            Stack<Integer> newS = s;
            int min = Integer.MAX_VALUE;
            while(!newS.isEmpty()){
                min = Math.min(min, newS.pop());
            }
            System.out.println(min);
        }
    }
}

