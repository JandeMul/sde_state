package com.hz;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
    private int secretCounter;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        this.secretCounter = 1;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
        if (secretCounter == 2) {
            gumballMachine.setState(gumballMachine.getHasQuarterState());
        }
        secretCounter ++;
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }

    public void refill() { }

    public String toString() {
        return "waiting for quarter";
    }
}
