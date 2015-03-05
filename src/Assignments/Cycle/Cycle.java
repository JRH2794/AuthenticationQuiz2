package Assignments.Cycle;

public class Cycle {
    private int numberOfWheels, weight;

public Cycle() { // Default using 'this'.
    this(100, 1000); }

public Cycle(int nNumberOW, int nWeight) { // Contructor with arguments.
    numberOfWheels = nNumberOW;
    weight = nWeight; }

public String toString() {
    return "Weight: " + weight + "\n" +
            "Number of Wheels: " + numberOfWheels; } }
