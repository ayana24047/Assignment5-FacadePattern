# Assignment5-FacadePattern
Facade Pattern — Computer Startup Example

This project demonstrates the Facade Design Pattern using a simple example of starting a computer.
The Facade Pattern hides the complexity of multiple subsystems and provides a single, easy-to-use interface.

Components

CPU — simulates the processor (freezes and executes instructions)

Memory — simulates the RAM (loads data into memory)

HardDrive — simulates data storage (reads boot data)

ComputerFacade — provides one simple method startComputer() to start the whole system

 Key Idea

Instead of calling each subsystem separately, the user interacts only with the facade — making the code cleaner, more readable, and easier to maintain (following Clean Code principles).

 Example Output
Starting computer...
CPU: Freezing processor...
HardDrive: Reading from Sector 1...
Memory: Loading 'Boot data from Sector 1' into 0x00.
CPU: Executing instructions...
Computer started
