public class Vehicle {
    public int year; //Tinh dong goi
    public String color;

    public void input_year(int Y){
        this.year = Y;
    }
    public void output_year(){
        System.out.println("Year of manufacture: "+this.year);
    }

    public void input_color(String C){
        this.color = C;
    }
    public void output_color(){
        System.out.println("Vehicle color: "+this.color);
    }

    public void run(){
        System.out.println("Vehicle is running!");
    }


    
}
