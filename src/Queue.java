import java.util.NoSuchElementException;

public class Queue {
    private int[] queue;
    private int size;
    private int front;
    private int rear;
    private int capacity;
    public Queue(int capacity)
    {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException("queue is full");
        }
        if (front == -1) {
            front = 0;
        }
        rear = rear + 1;
        queue[rear] = item;
        size++;
    }

    public int dequeue() {
        if(isEmpty()){
            throw new NoSuchElementException("stack is empty");
        }
        int result = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = front + 1;
            size--;
        }
        return result;
    }
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

}
