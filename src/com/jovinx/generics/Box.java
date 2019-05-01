package com.jovinx.generics;

class Box<T> {
    private T content;

    void add(T object) {
        if (content == null) {
            this.content = object;
        } else {
            System.out.println("Box is full");
        }
    }

    T remove(){
        if (content == null) {
            System.out.println("Box is empty");
            return null;
        } else {
            T thing = content;
            this.content = null;
            return thing;
        }
    }
}
