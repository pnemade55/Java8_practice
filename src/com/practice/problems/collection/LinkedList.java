package com.practice.problems.collection;

public class LinkedList {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }
    Node head;

    public static LinkedList insert(LinkedList list, int data){
        Node newNode= new Node(data);
        newNode.next=null;

        if (list.head == null) {
            list.head = newNode;
        }else{
            Node last= list.head;

            while (last.next!=null){
                last= last.next;
            }
            last.next=newNode;
        }
        return list;
    }

    public static LinkedList deleteByKey(LinkedList list,
                                         int key){
        Node prev=null;
        Node current= list.head;

        if(current.data==key){
            list.head= current.next;
            return list;
        }
        prev=current;
        current=current.next;
        while (current!=null){
            if(current.data==key){
                prev.next=current.next;
               break;
            }
            else{
                prev=current;
                current=current.next;
            }
        }
        return list;
    }

    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        printList(list);

        deleteByKey(list, 5);

        printList(list);

    }
}
