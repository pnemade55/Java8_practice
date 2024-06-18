package com.practice.problems.collection;

import static java.lang.System.exit;

public class StackUsingKLinkedList {

    private class Node{
        int data;
        Node next;
    }

    Node top;

    StackUsingKLinkedList(){
        this.top=null;
    }

   public void push(int newData){
        Node temp= new Node();

        if(temp==null){
            System.out.print("\nHeap Overflow");
            return;
        }

        temp.data=newData;
        temp.next=top;

        top=temp;
   }
    public boolean isEmpty() { return top == null; }

    public void pop()
    {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }

        top = (top).next;
    }

    public void display()
    {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {

                // print node data
                System.out.print(temp.data);

                // assign temp link to temp
                temp = temp.next;
                if(temp != null)
                    System.out.print(" -> ");
            }
        }
    }
}

class Demo{

    public static void main(String[]args){

        StackUsingKLinkedList obj
                = new StackUsingKLinkedList();
        // insert Stack value
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);

        obj.pop();
        // print Stack elements
        obj.display();

    }
}
