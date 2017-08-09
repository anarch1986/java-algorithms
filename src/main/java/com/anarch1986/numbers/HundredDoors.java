package com.anarch1986.numbers;

public class HundredDoors {

    public static boolean[] hundredDoors(int numOfDoors) {
        boolean[] doors = new boolean[numOfDoors+1];
        int counter = 1;
        while (counter!=doors.length) {
            for (int i = 1; i < doors.length; i++) {
                if (i % counter == 0) {
                    doors[i] = toggle(doors[i]);
                }
            }
            counter++;
        }

        return doors;
    }

    public static boolean toggle(boolean door) {
        if (door==false) {
            door = true;
        }
        else if (door==true) {
            door = false;
        }
        return door;
    }
}
