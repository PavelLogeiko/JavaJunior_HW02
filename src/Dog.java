class Dog extends Animal {
    public Dog(String name, int age, String breed) {
        super(name, age, breed);
    }
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public String getBreed() {
        return breed;
    }
}