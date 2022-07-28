package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random;
    protected int min;
    protected int max;


    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int s = (int) (Math.random() * ((max - min) + 1) + min);
                return s;

            }
        };
    }
}

