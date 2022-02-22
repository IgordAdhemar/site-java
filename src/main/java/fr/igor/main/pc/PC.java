package fr.igor.main.pc;

import fr.igor.main.composant.*;

public class PC {
    private Motherboard motherboard;
    private GPU gpu;
    private Processor processor;
    private RAM ram;
    private Housing housing;
    private Watercooling watercooling;
    private Fan fan;

    public PC(Motherboard motherboard, GPU gpu, Processor processor, RAM ram, Housing housing, Watercooling watercooling, Fan fan) {
        this.motherboard = motherboard;
        this.gpu = gpu;
        this.processor = processor;
        this.ram = ram;
        this.housing = housing;
        this.watercooling = watercooling;
        this.fan = fan;
        if (motherboard == null) {
            System.out.println("You need a motherboard to build a PC!");
            throw new NoMotherboardException();
        }
        else if (gpu == null) {
            System.out.println("You need a GPU to build a PC!");
            throw new NoGPUException();
        }
        else if (processor == null) {
            System.out.println("You need a processor to build a PC!");
            throw new NoProcessorException();
        }
        else if (ram == null) {
            System.out.println("You need RAM to build a PC!");
            throw new NoRAMException();
        }
        else if (housing == null) {
            System.out.println("You need a housing to build a PC!");
            throw new NoHousingException();
        }
        else {System.out.println("The PC has been created successfully!");}
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public GPU getGpu() {
        return gpu;
    }

    public Processor getProcessor() {
        return processor;
    }

    public RAM getRam() {
        return ram;
    }

    public Housing getHousing() {
        return housing;
    }

    public Watercooling getWatercooling() {
        return watercooling;
    }

    public Fan getFan() {
        return fan;
    }
}
