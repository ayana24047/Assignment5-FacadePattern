package facadepattern;

// Simulates the computer processor.
public class CPU {
    // Prepare CPU for boot.
    public void freeze() {
        System.out.println("CPU: Freezing processor...");
    }

    // Run system instructions.
    public void execute() {
        System.out.println("CPU: Executing instructions...");
    }
}
