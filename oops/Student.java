package oops;

class Info {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Info(){
        System.out.println("constructor called");
    }
}

public class Student {
    public static void main(String[] args) {
        Info s1 = new Info();
        s1.name = "saurabh";
        s1.age = 22;

        s1.printInfo();
    }
}