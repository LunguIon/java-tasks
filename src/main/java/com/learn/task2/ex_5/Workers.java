package com.learn.task2.ex_5;

public class Workers {
    private final Object worker;
    private final String position;

    public Workers(Object type, String position) {
        this.position = position;
        this.worker = type;
    }

    public Object getWorker() {
        return this.worker;
    }


    public String getPosition() {
        return this.position;
    }

}
