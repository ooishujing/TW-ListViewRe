package com.myapplicationdev.android.tw_listview;

public class Module {
    private String name;
    private boolean programme;

    public Module(String name, boolean programme) {
        this.name = name;
        this.programme = programme;
    }
    public String getName() {
        return name;
    }
    public boolean isProgramme() {
        return programme;
    }
}
