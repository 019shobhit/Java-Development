package com.job.temp;

import java.util.Optional;

public class xyz {
    public static void main(String[] args) {
        Optional<String> name = getName();
        String naam = name.orElse("name is not availabe");
        System.out.println(naam.toUpperCase());
//        if(name.isPresent()){
//            System.out.println(name.get().toUpperCase());
//        }
//        else{
//            System.out.println("name is not present");
//        }
    }
    public static Optional<String> getName(){
        String name ;
        return Optional.ofNullable(null);
    }
}
