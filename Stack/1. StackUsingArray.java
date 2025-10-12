// Implement stack using array   (https://www.geeksforgeeks.org/problems/implement-stack-using-array/1)
// Input: n = 3, q = 6, queries[][] = [[1, 5], [1, 3], [3], [2], [4], [5]]
// Output: [3, false, false]



class myStack {
    int[] arr;
    int capacity;
    int top;

    public myStack(int n) {
        arr = new int[n];
        capacity = n;
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == capacity - 1);
    }

    public void push(int x) {
        if (!isFull()) {
            arr[++top] = x;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return arr[top--];
        } else {
            return -1;  
        }
    }

    public int peek() {
        if (!isEmpty())
            return arr[top];
        else
            return -1;  
    }
}
