package facadepattern;

// Simulates hard drive operations.
public class HardDrive {
    // Read data from a specific sector.
    public String read(String sector) {
        System.out.println("HardDrive: Reading from " + sector + "...");
        return "Boot data from " + sector;
    }
}
