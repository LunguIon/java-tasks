package com.learn.task2.ex_5;

import java.util.*;

public class CustomList implements Iterable<Workers> {
    private static final int SIZE = 10;
    private List<Workers> workers=new ArrayList<>();

    public CustomList() {}

    public CustomList(Workers[] staff) {
        if (staff.length <= SIZE) {
        this.workers = Arrays.asList(staff);
        }else {
            throw new IndexOutOfBoundsException();

        }
    }

    public void add(Workers worker) {
        if (workers.size() < SIZE) {
            workers.add(worker);
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    public String get(int index) {
        return workers.get(workers.size()-index-1).getPosition();

    }


    @Override
    public Iterator<Workers> iterator() {
        return new Iterator<>() {
            int index = workers.size();

            @Override
            public boolean hasNext() {
                return index > 0;
            }

            @Override
            public Workers next() {
                if (!hasNext()) throw new NoSuchElementException();
                return workers.get(--index);
            }

        };
    }


}
