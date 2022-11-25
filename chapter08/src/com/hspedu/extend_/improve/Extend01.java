package com.hspedu.extend_.improve;

import com.hspedu.extend_.improve.Graduate;
import com.hspedu.extend_.improve.Pupil;

public class Extend01 {
    public static void main(String[] args) {
        com.hspedu.extend_.improve.Pupil pupil = new Pupil();
        pupil.age = 11;
        pupil.name = "小明";
        pupil.  testing();
        pupil.setScore(64);
        pupil.showInfo();
        System.out.println("================");
        com.hspedu.extend_.improve.Graduate graduate = new Graduate();
        graduate.age = 22;
        graduate.name = "大明";
        graduate.testing();
        graduate.setScore(80);
        graduate.showInfo();
    }
}
