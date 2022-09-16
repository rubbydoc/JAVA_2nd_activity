public class Parrot extends Animal{

    int numOfWings;

    public Parrot (String name, int numOfFeet, int numOfWings){
        super(name, numOfFeet);
        this.numOfWings = numOfWings;
    }

    public void walk(){
        System.out.println("Walking while alternating the legs rather than pushing.");
}


}