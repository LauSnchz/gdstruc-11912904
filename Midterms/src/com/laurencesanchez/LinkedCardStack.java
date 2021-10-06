package com.laurencesanchez;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedCardStack {
    private LinkedList<Cards> stack;

    public LinkedCardStack()
    {
        stack = new LinkedList<Cards>(); // no need for capacity since linked list is resizable, o(1)
    }

    public void push(Cards card)
    {
        stack.push(card);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Cards pop()
    {
        return stack.pop();
    }

    public Cards peek()
    {
        return stack.peek();
    }

    public void printStack()
    {
        ListIterator<Cards> iterator = stack.listIterator();

        System.out.println("\nCurrent Hand: ");
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    public int getStackSize()
    {
        return stack.size();
    }
}
