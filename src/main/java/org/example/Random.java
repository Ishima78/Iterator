package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Random implements Iterable<Integer> {

    protected Random random;
    protected int x;
    protected int min;
    protected int max;

    protected ArrayList<Integer> d = new ArrayList<>();


    public Random(int min, int max) {
        this.min = min;
        this.max = max;
        while (true) {
            x = (int) (Math.random() * ((max - min) + 1) + min);
            d.add(x);
            if ((x == max)) {
                break;
            }
        }
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator() {

            int item = 0;

            @Override
            public boolean hasNext() {
                return item <= d.size();
            }

            @Override
            public Integer next() {
                int s = d.get(item);
                item++;
                return s;

            }
        };
    }
}

