public class StackBody implements ICharS {

    private int maxSize;
    private char[] stackArray;
    int top;

    public StackBody(int size){
        maxSize = size;
        stackArray = new char[maxSize];
        top = 0;
    }

    @Override
    public void push(char j) {
    stackArray[++top] = j;
    }

    @Override
    public char pop() {
        return stackArray[top--];
    }

    @Override
    public char peek() {
       return stackArray[top];
    }

    @Override
    public boolean isFull() {
       return (top == maxSize - 1);
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }
}