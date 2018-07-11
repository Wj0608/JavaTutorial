import test.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println(juice);

        Dog dog = new Dog();
        dog.age = 18;
        dog.breed = "abc";
        dog.color = "lightblue";
        System.out.println(dog);

        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");

        // 调用这两个对象的成员方法
        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("菜鸟程序员");
        empTwo.empSalary(500);
        empTwo.printEmployee();

        Counter c = new Counter();
        c.click();
        c.click();
        Counter d = new Counter();
        d.click();
        d.click();

    }
}

class Counter {
    private static int count = 0;
    void click(){
        count ++;
        System.out.println(count);
    }
}

class FreshJuice {
    enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }
    FreshJuiceSize size;
}


class Dog{
    String breed;
    int age;
    String color;
    void barking(){
    }

    void hungry(){
    }

    void sleeping(){
    }
}

