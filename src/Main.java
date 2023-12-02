import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Эрик", 3, "Терьер");
        animals[1] = new Cat("Барсик", 5, "Сфинкс");
        animals[2] = new Dog("Клякса", 2, "Такса");

        for (Animal animal : animals) {
            System.out.println("\nКличка: " + animal.name + ", Возраст: "
                    + animal.age + ", Порода:" + animal.breed);
            try {
                Method makeSoundMethod = animal.getClass().getMethod("makeSound");
                System.out.println("Есть метод makeSound() для " + animal.name);
                        makeSoundMethod.invoke(animal);
            } catch (Exception e) {
                System.out.println("Нет метода makeSound() для " + animal.name);
            }
        }
    }
}