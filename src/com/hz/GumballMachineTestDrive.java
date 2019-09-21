package com.hz;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2);

        gumballMachine.turnCrank();
        gumballMachine.turnCrank();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        System.out.println(gumballMachine);
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        gumballMachine.refill(5);
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        System.out.println(gumballMachine);
    }
}
