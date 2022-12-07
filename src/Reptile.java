public class Reptile extends Animal {
    public Reptile(Integer age, Size size) {
        super(age, size);
    }

    private Color color;

    public Reptile(Integer age, Size size, Color color) {
        super(age, size);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getInfo() {
        return "Age: " + getAge() +
                "\n Size: " + getSize() +
                "\n Color: " + getColor();
    }

    public void makeVoice() {
        System.out.println("Шорох");
    }

    public final void makeVoice(String voice, Integer count) {
        for (int i = 0; i < count; i++) {
            System.out.println(voice);
        }
    }
    public void makeVoice(String voice) {
        for (int i = 0; i < voice.length(); i++) {
            System.out.println(voice);
        }
    }
}
