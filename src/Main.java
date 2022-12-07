public class Main {
    public static void main(String[] args) {
        Reptile objectA = new Reptile(2, Size.small, Color.WHITE);
        System.out.println(objectA.getInfo());
        objectA.makeVoice();
        Snake objectB = new Snake(1, Size.medium, Color.BLACK, Toxic.POISONOUS);
        System.out.println(objectB.getInfo());
        objectB.makeVoice("шшш");
        Snake objectC = new Snake(3,Size.big,Color.RED,Toxic.NOT_POISONOUS);
        System.out.println(objectC.getInfo());
        objectC.makeVoice("ссссс" , 5);
    }
}