package com.jayachandran;

public class Alien {
    private int age;
    private  Local local;

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Alien(){
        System.out.println("Alien Object created");
    }
    public void code(){
        System.out.println("Coding...");
        local.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
