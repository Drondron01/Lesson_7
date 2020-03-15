public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;
    public Cat(String name, int appetite, boolean hungry) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = hungry;
    }
    public boolean eat(Plate p) {
        hungry = p.decreaseFood(appetite);
        if (hungry) {
            appetite = 0;
        }
        return hungry;
    }
    public void info() {
        System.out.println(name + "  appetite: " + appetite +  "  " + hungry);
    }
}