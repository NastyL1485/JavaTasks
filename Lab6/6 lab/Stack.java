import java.util.Arrays;

public class Stack<T> {
    private T[] array;
    private int size;

    public Stack(int capacity) {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public void push(T element) {
        array[size++] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T element = peek();
        size--;
        return element;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public static void main(String[] args) {

        Stack<Integer> intStack = new Stack<>(10);
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        
        System.out.println("Top element: " + intStack.peek());
        int poppedElement = intStack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Top element after pop: " + intStack.peek());
    }
}