package adelina;

import java.util.Random;

public class Pet {
    private int age;
    private Color color;
    private Shelter shelter;

    public Pet() {

    }

    private void generateDefaultAge(int age){
        this.setAge(age);
    }
    public String getInfo() {
        return "Питомец {" +
                "возраст=" + age +
                ", приют=" + shelter.getName() + " " + shelter.getAdress() +
                ", цвет=" + color +
                "}";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }
    private int generatDefaultAge(){
        return new Random().nextInt(100);
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;

    }

}
