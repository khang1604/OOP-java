public class Main{
    public static void main(String[] args){
       Car BMW = new Car();
       BMW.input_year(1995);
       BMW.input_color("White");
       BMW.Model_input("X6");
       BMW.Model_output();
       BMW.Type_input("SUV");
       BMW.Type_output();
       BMW.output_year();
       BMW.output_color();
       BMW.run();
       BMW.run("stopped"); 
    }
}
