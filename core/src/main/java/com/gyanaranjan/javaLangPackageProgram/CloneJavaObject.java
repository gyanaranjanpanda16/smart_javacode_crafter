package com.gyanaranjan.javaLangPackageProgram;

public class CloneJavaObject implements  Cloneable {

    void add (){
        System.out.println("hoo");
    }
    public void finalize(){
        System.out.println("finalize Method Called :-->");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneJavaObject object = new CloneJavaObject();

        CloneJavaObject object2 = (CloneJavaObject) object.clone();
        object2 = null;
//        object = null;
        System.gc();
//        object.add();

    }
}
