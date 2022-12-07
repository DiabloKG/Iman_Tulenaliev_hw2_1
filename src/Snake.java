public final class Snake extends Reptile{
    public Snake(Integer age, Size size) {
        super(age, size);
    }
    private Toxic toxic;

    public Toxic getToxic() {
        return toxic;
    }

    public Snake(Integer age, Size size, Color color, Toxic toxic) {
        super(age, size, color);
        this.toxic = toxic;
    }
    @Override
    public String getInfo(){
        return super.getInfo() +
                "\n Toxic: " + getToxic();

    }
}
