package com.jayachandran;

public class Local implements Local1, Localsuper {
    public Local(){
        System.out.println("Local Object created :");
    }
    @Override
    public void compile(){
        System.out.println("Compiling....");
    }

}
