public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Jhon";
        person.age = 45;
        Person person2 = new Person();
        person2.name = "Genry";
        person2.age = 27;
        person.speak();
        person2.speak();
    }
}

class Person {
    String name;
    int age;

    public void speak() {
        System.out.println("Hello, my name is " + this.name+" my age is "+this.age);
    }
}


