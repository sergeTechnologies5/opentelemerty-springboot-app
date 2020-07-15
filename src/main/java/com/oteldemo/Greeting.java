package com.oteldemo;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "{" + "\"id\" :\"" + id + "\"," + "\"content\" :\"" + content + "\"}";
    }
}