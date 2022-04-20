public class Person {
    String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public Person()
    {
    }
    public void talk(){
        System.out.println(fullName + " говорит");
    }
    public void move(){
        System.out.println(fullName + " двигается");
    }
}
