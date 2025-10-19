package facadepattern;

// Simulates computer memory (RAM).
public class Memory {
    // Load data into memory.
    public void load(String address, String data) {
        System.out.println("Memory: Loading '" + data + "' into " + address + ".");
    }
}
