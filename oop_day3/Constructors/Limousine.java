public class Limousine{
    public int year;
    public String color;

    //ham khoi tao
    public Limousine(int Y, String C) {
        this.year = Y;
        this.color = C;
    }

    public void output(){
        System.out.println("Nam sx: "+this.year);
        System.out.println("Mau xe: "+this.color);
    }
    
}