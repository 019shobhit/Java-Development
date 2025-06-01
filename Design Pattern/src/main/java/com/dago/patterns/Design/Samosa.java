package com.dago.patterns.Design;

public class Samosa {

    static Samosa samosa;

    private Samosa() {
        if(samosa != null){
            throw  new RuntimeException("Cannot create more than one instance of Samosa");
        }
    }

    public  static Samosa getSamosa() {
        if (samosa == null) {
            synchronized (Samosa.class) {
                samosa = new Samosa();
            }
        }
        return samosa;
    }
}
