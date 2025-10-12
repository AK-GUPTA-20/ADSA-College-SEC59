/*
Queue Using Array
Input: n = 3, q = 7, queries[][] = [[1, 5], [1, 3], [1, 4], [3], [2], [5], [4]]
Output: [5, false, 4]
*/

class myQueue {
    int front;
    int rear;
    int[] arr;
    int capacity;

    // Constructor
    public myQueue(int n) {
        arr = new int[n];
        capacity = n;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return rear < front;
    }

    public boolean isFull() {
        // Check if queue is full
        return rear == capacity - 1;
    }

    public void enqueue(int x) {
        // Enqueue
        if (isFull()) return;
        arr[++rear] = x;
    }

    public void dequeue() {
        // Dequeue (remove element from front)
        if (isEmpty()) return;
        for (int i = front + 1; i <= rear; i++) {
            arr[i - 1] = arr[i];
        }
        rear--;
    }

    public int getFront() {
        // Get front element
        if (isEmpty()) return -1;
        return arr[front];
    }

    public int getRear() {
        // Get last element
        if (isEmpty()) return -1;
        return arr[rear];
    }
}
