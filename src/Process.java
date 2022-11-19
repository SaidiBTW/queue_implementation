public class Process {
    private String processName;
    private int executionTime;

    public Process(String processName, int executionTime) {
        this.processName = processName;
        this.executionTime = executionTime;
    }

    public String getProcessName() {
        return processName;
    }

    public int getExecutionTime() {
        return executionTime;
    }
}
