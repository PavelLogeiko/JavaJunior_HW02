class Cat extends Animal {
    public Cat(String name, int age, String breed) {
        super(name, age, breed);

    }
    public void meow() {

        System.out.println("Meow! Meow!");
    }

    public String isStray() {
        return breed;
    }
}