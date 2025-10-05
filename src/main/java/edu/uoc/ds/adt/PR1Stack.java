package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

import static edu.uoc.ds.adt.util.PeriodicFn.LEN;

public class PR1Stack {
    public final int CAPACITY = LEN;

    private Stack<Integer> stack;

    public PR1Stack() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<Integer>(CAPACITY);
    }

    public Stack<Integer> getStack() {
        return this.stack;
    }

    public void push(Integer n) {
        this.stack.push(n);
    }

    public Integer pop() {
        return this.stack.pop();
    }
}
