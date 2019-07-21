package adelina;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Lola" , "Amstaf" , Color.BLACK , new Shelter("Gross" , "alamedin"));
        Dog dog3 = new Dog("Sheila" , "Bulldog" , Color.BROWN  , new Shelter("WinRar" , "Green Street"));

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.makeVoice(12);
        dog2.makeVoice("Bark");
        dog3.makeVoice("Gav" , 12);
    }
}
