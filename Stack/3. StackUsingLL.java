// Stack using Linked List  (https://www.geeksforgeeks.org/problems/implement-stack-using-linked-list/1)
// Input: q = 7, queries[][] = [[1, 5], [1, 3], [1, 4], [3], [2], [5], [4]]
// Output: [4, 2, false]

// Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class myStack {
    Node top;
    int size;

    public myStack() {
        // Initialize your data members
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return top == null;
    }

    public void push(int x) {
        // Push element onto the stack
        Node temp = new Node(x);
        temp.next = top; 
        top = temp;      
        size++;
    }

    public void pop() {
        // Removes the top element of the stack
        if (isEmpty()) return;
        top = top.next;
        size--;
    }

    public int peek() {
        // Returns the top element of the stack.
        // If stack is empty, return -1.
        if (isEmpty()) return -1;
        return top.data;
    }

    public int size() {
        // Returns the current size of the stack.
        return size;
    }
}
