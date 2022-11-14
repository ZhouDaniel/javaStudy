package com.hspedu.extend_;
public class Extend01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.age = 10;
        pupil.name = "小明";
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();
        System.out.println("================");
        Graduate graduate = new Graduate();
        graduate.age = 22;
        graduate.name = "大明";
        graduate.testing();
        graduate.setScore(90);
        graduate.showInfo();

    }
}
