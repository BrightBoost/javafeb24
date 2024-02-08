public class Dog {
    // zonder best practices voor public en private
    public String name;
    public int age;
    public double weight;

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void bark() {
        System.out.println("Woof says " + this.name);
    }


}
