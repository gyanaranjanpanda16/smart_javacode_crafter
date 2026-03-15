package com.gyanaranjan.TestingJavaPrgram;

    public class Test02 {
        static class Builder {
            private Test02 testInstance;

            Builder() {
                testInstance = new Test02();

            }

            Builder m1() {
                System.out.println("m1() static ---> ");
                return this;
            }

            Builder m2() {
                System.out.println("Non static m2() ---> ");
                return this;
            }

            Builder m3() {
                System.out.println("Non static m3() ---> ");
                return this;
            }

            Test02 build() {
                return testInstance;
            }
        }

        public static void main(String[] args) {
            System.out.println("main method --->");
            new Builder().m1().m2().m3().build();
        }
    }


