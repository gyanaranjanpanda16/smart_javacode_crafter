package com.gyanaranjan.JavaFundaMental;

import java.util.Objects;

class Test02 {
    int i ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test02 test02 = (Test02) o;
        return i == test02.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }

    public static void main(String[] args) {

     }
}
