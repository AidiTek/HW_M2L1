public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Тигр", 5, AnimalType.MAMMAL);
        Dog dog = new Dog("Барон", 3, AnimalType.MAMMAL, "Лабрадор");
        Puppy puppy = new Puppy("Щенок", 1, "Хаски");


        System.out.println("Информация о животных:");
        System.out.println("Животное: " + animal.getName() + ", Возраст: " + animal.getAge() + ", Тип: " + animal.getType());
        System.out.println("Собака: " + dog.getName() + ", Возраст: " + dog.getAge() + ", Порода: " + dog.getBreed() + ", Тип: " + dog.getType());
        System.out.println("Щенок: " + puppy.getName() + ", Возраст: " + puppy.getAge() + ", Порода: " + puppy.getBreed() + ", Тип: " + puppy.getType());
    }
}

