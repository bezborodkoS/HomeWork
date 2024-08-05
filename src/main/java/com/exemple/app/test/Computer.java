package com.exemple.app.test;

public class Computer {
    private String CPU;
    private String Memory;

    public Computer(String CPU, String memory) {
        this.CPU = CPU;
        Memory = memory;
    }


    public void startComputer(){
        System.out.println("Computer{" +
                "CPU='" + CPU + '\'' +
                ", Memory='" + Memory + '\'' +
                '}');
        System.out.println("computer start");
    }
    public void getCPU() {
        startComputer();

    }

    public void getMemory() {
        startComputer();
    }


}
