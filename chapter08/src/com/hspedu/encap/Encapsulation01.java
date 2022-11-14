package com.hspedu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack11");
        person.setAge(30);
        person.setSalary(30000);
        System.out.println(person.info());
        System.out.println(person.getSalary());
        Person smith = new Person("smith", 2000, 5000);
        System.out.println(smith.info());

    }
}
class Person {
    public String name;
    private int age;
    private double salary;
    // 构造器
    public Person() {
    }

    public Person(String name, int age, double salary) {
        // this.name = name;
        // this.age = age;
        // this.salary = salary;
        // 我们可以将 set 方法写在构造器中，这样仍然可以验证
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 加入对数据的检测
        if(name.length() >=2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对，需要（2-6）个字符，给个默认名字");
            this.name = "无名";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >=1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄需要在1-120，你设置的年龄不对, 给默认年龄18");
            this.age = 18;

        }
    }

    public double getSalary() {
        // 可以在这里增加对当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "信息为 姓名=" + name + "年龄=" + age + "工资=" + salary;
    }
}
//那么在java中如何实现这种类似的控制呢？
//不能随便查看人的年龄，工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则给默认
//请大家看一个小程序(com。hspedu。encap：Encapsulation01。java)，
//年龄，必须在 1-120，年龄，工资不能直接查看， name的长度在 2-6字符之间