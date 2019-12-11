package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.io.IOException;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

public class TwoDimensionalArraysWriter implements ObjectWriter<int[][]>{

    @Override
    public void write(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();

        }
    }

    @Override
    public void close() {
    }
    
    
}
