package com.dago.patterns.Design;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception{
//        Samosa samosa = Samosa.getSamosa();
//        Samosa samosa1 = Samosa.getSamosa();
//        System.out.println(samosa.hashCode() == samosa1.hashCode());
//
//        Jelabi jelabi = Jelabi.getJelabi();
//        Jelabi jelabi1 = Jelabi.getJelabi();
//        System.out.println(jelabi.hashCode() == jelabi1.hashCode());

        Samosa samosa = Samosa.getSamosa();
        System.out.println(samosa.hashCode());

        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Samosa s2 = constructor.newInstance();
        System.out.println(s2.hashCode());
    }

}
