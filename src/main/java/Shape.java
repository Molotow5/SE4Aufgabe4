public abstract class Shape {

    private String name;

    public Shape(){
        name = "NoName";
    }

    public String getName(){
        return name;
    }

    public abstract void draw();
}
