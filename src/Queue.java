public interface Queue<Process> {
    int size();
    void enqueue(Process e);
    Process dequeue();
    Process first();
    boolean isEmpty();
}
