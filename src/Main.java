import java.lang.reflect.Executable;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        CPU cpu = new CPU();

        Process process1 = new Process("Writing operation...", 2000);
        Process process2 = new Process("Reading operation...", 1000);
        Process process3 = new Process("Flow operation...", 6000);
        Process process4 = new Process("Recurrence operation...", 4000);
        Process process5 = new Process("Drawing operation...", 1000);
        Process process6 = new Process("I/O operation...", 2000);
        Process process7 = new Process("Fork operation...", 1000);
        Process process8 = new Process("Looping operation...", 1500);

        cpu.enqueue(process1);
        cpu.enqueue(process2);
        cpu.enqueue(process3);
        cpu.enqueue(process4);
        cpu.enqueue(process5);
        cpu.enqueue(process6);
        cpu.enqueue(process7);
        cpu.enqueue(process8);

        runCPU(cpu);
    }

    public static void runCPU(CPU cpu) throws InterruptedException {
       /* for (Process process : cpu.data) {
            System.out.println("Executing : " + process.getProcessName());
            Thread.sleep(process.getExecutionTime());
        }*/
        Process currentProcess;

        while ((currentProcess = cpu.dequeue()) != null){
            System.out.println("Executing : " + currentProcess.getProcessName());
            Thread.sleep(currentProcess.getExecutionTime());
        }

    }
}