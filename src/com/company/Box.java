package com.company;

public class Box<T,S> {
    private T s;
    private S a;

    public Box() {
    }

    public Box(T s, S a) {
        this.s = s;
        this.a = a;
    }

    public T getS() {
        return s;
    }

    public void setS(T s) {
        this.s = s;
    }

    public S getA() {
        return a;
    }
    @Override
    public String toString() {
        return "Box{" +
                "s=" + s +
                ", a=" + a +
                '}';
    } public void setA(S a) {
        this.a = a;
    }public static <T,S> Box<Integer, String> getBoxmethod(){
        Box<Integer,String>box=new Box<>(1,"a");
        return box;
    }
}
