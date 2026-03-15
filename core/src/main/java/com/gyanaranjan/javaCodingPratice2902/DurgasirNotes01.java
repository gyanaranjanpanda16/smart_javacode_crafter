package com.gyanaranjan.javaCodingPratice2902;

import javax.script.ScriptException;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;

public class DurgasirNotes01 {
    public static void main(String[] args) throws ScriptException {
        int[] number = {5, 3, 8, 1, 2, 7};
        Arrays.parallelSort(number);
        System.out.println(Arrays.toString(number));
//        for(int a : number){
//            System.out.println(a);
//        }
        //CompatibleFuture :->
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 42);
        future.thenAccept(result -> System.out.println("Result:  " + result));
        //Nashorn Engine :-
//        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
//        engine.eval("print('Hello,Nashorn!')");
        // Base 64 Encoding and Decoding :-
        String original = "Hello World";
        System.out.println("+++++++++++++++++++");
        String encode = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encode);
        String decode = new String(Base64.getDecoder().decode(encode));
        System.out.println(decode);

    }
}
