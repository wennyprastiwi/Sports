package com.company;

import com.company.model.Baseball;

public class Main {

    public static void main(String[] args) {
        //inisialisasi object baseball baru
        Baseball baseball = new Baseball("FOX");

        //menampilkan entitas brandname menggunakan method get()
        System.out.println(baseball.getBrandName());
    }
}
