package com.example.android_challenge_fetch;

public class Item {
    private int id;
    private int listId;
    private String name;

    public Item(int id, int listId, String name) {
        this.id = id;
        this.listId = listId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getListId() {
        return listId;
    }

    public String getName() {
        return name;
    }

}
