package com.jovinx.generics;

public class Main {

    public static void main(String[] args) {

        Orange orange = new Orange();
        Mango mango = new Mango();

        Box<Orange> boxOfOrange = new Box<>();
        Box<Mango> boxOfMango = new Box<>();

        debugAdd(orange, boxOfOrange);
        debugAdd(mango, boxOfMango);

        boxOfMango.remove().eat();
        boxOfOrange.remove().drink();
    }

    private static <T> void debugAdd( T item, Box<T> box) {
        System.out.println("Type : "+ item.getClass().getSimpleName());
        box.add(item);
    }
}
