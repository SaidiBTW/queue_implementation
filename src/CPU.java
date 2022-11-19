import java.util.ArrayList;

public class CPU implements Queue{
    ArrayList<Process> data;
    private int sz = 0;//current number of elements in the array
    private int f = 0;//the index acting as the front of the array

    private static final int CAPACITY = 1000;


    public CPU(){
        this(CAPACITY);
    }
    public CPU(int capacity){
        data = new ArrayList<>(capacity);
    }

    public int size() {
        return data.size();
    }

    @Override
    public void enqueue(Object p) {
        data.add((Process)p);
    }


    @Override
    public Process dequeue() {
        if (data.isEmpty()) return null;
        Process answer = data.remove(0);

        return answer;
    }

    @Override
    public Process first() {
        if (isEmpty()) return null;
        return data.get(0);
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }
}
