package com.gyanaranjan.javaLangPackageProgram;

import java.util.Objects;

class ObjectClass01 {
    String name;
    int a;

    public ObjectClass01(String name, int a) {
        this.name = name;
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjectClass01 that)) return false;
        return a == that.a && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, a);
    }

    @Override
    public String toString() {
        return "ObjectClass01{" +
                "name='" + name + '\'' +
                ", a=" + a +
                '}';
    }
}
class main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("gyana");
        StringBuilder builder1 = new StringBuilder("gyana");
        String str = "1";
        String str1 = "1";

        ObjectClass01 objectClass01 = new ObjectClass01("gyana",4);
        ObjectClass01 objectClass02 = new ObjectClass01("gyana",4);
        System.out.println(str.hashCode());
        System.out.println(objectClass01);
        System.out.println(objectClass02.hashCode());
        System.out.println(str1);

        if(objectClass01.equals(objectClass02)){
            System.out.println("Both Are Equal :-->");
        }else {
            System.out.println("Both Are UnEqual :-- ");
        }if(builder.equals(builder1)){
            System.out.println("Both Are Equal :-->");
        }else {
            System.out.println("Both Are UnEqual :-- ");
        }if(str.equals(str1)){
            System.out.println("Both Are Equal :-->");
        }else {
            System.out.println("Both Are UnEqual :-- ");
        }

    }
}