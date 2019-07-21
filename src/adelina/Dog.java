package adelina;

public final class  Dog {
    private String name;
    private String breed;
    private String commands;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public Dog() {

    }

    public Dog(String name, String breed, Color color, Shelter shelter) {

    }

    public Dog(String name, String breed, Color color, Shelter shelter, String commands) {

    }

    public void makeVoice() {
        System.out.println("Гав-гав");
    }

    public void makeVoice(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("Гав-гав ");
        }
        System.out.println();
    }

    public void makeVoice(String voice) {
        System.out.println(voice);
    }

    public void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(voice + " ");
        }
        System.out.println();
    }

    public final String getInfo(int age, String color, Shelter shelter) {
        return (age + color + shelter.getName() + shelter.getAdress());

    }
}
