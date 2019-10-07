package com.company.model;

//class ball mengimplementasi interface Tossable
abstract class Ball implements Tossable {
    private String brandName;

    Ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void Bounce(){

    }

    @Override
    public void toss() {

    }
}
