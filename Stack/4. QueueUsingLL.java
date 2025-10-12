/*
Queue using Linked List
Input: q = 7, queries[][] = [[1, 5], [1, 3], [1, 4], [3], [2], [5], [4]]
Output: [5, 2, false]
*/


// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
    Node front, rear;
    int size;

    public myQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int x) {
        Node temp = new Node(x);
        if (isEmpty()) {
            front = rear = temp;  
        } else {
            rear.next = temp;    
            rear = temp;          
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) return;
        front = front.next;
        if (front == null) rear = null;
        size--;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return front.data;
    }

    public int size() {
        return size;
    }
}
