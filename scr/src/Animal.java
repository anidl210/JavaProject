public class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello");
    }
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Meow!");
    }
}
