public class Dog extends Animal{
    private String breed;
    public Dog (String name,int age,AnimalType type, String breed){
        super(name, age, type);
        this.breed=breed;
    }

    public String getBreed() {
        return breed;
    }
}
