package com.gyanaranjan.StringImportantsPrograms;

public class ImmutableClass {
    private  int i;

    public ImmutableClass(int i) {
        this.i = i;
    }
    public ImmutableClass modify(int i){
        if(this.i ==i){
            return this;
        }
        return ( new ImmutableClass(i));
    }

    public static void main(String[] args) {

    }
}
