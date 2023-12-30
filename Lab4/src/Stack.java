public class Stack {
    private int mSize;
    private int[] stackArray;
    private int top;

    public Stack(int m){
        this.mSize = m;
        stackArray = new int[mSize];
        top = -1;
    }

    public void addElement(int elem){
        stackArray[++top] = elem;
    }

    public int deleteElement() throws CustomEmptyStackException {
        if (isEmpty()){
            throw new CustomEmptyStackException("Стек пустой!");
        }
        return stackArray[top--];
    }

    public int readTop() throws CustomEmptyStackException {
        if (isEmpty()){
            throw new CustomEmptyStackException("Стек пустой!");
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top==-1;
    }
}
