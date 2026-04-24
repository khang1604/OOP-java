public class Car extends Vehicle{ //tinh ke thua

    public String Model;
    public String Type;

    public void Model_input(String M){
        this.Model = M;
    }
    public void Model_output(){
        System.out.println("BMW "+this.Model);
    }
    public void Type_input(String T){
        this.Type = T;
    }
    public void Type_output(){
        System.out.println("Body type: "+this.Type);
    }

    public void run(){//overriding
        System.out.println("Car is running!");
    }
    
    public void run(String stop){//overloadding
        System.out.println("Car is " +stop+"!");
    }
}
