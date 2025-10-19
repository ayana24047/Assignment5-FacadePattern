package facadepattern;

// Facade class that hides complex startup steps.
public class ComputerFacade {
    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    // Simplified startup process.
    public void startComputer() {
        System.out.println("Starting computer...");
        cpu.freeze();
        String bootData = hardDrive.read("Sector 1");
        memory.load("0x00", bootData);
        cpu.execute();
        System.out.println("Computer started!");
    }
}
