public class Goat extends Animal{

    int numOfHorn;

    public Goat (String name, int numOfFeet, int numOfHorn){
        super(name, numOfFeet);
        this.numOfHorn = numOfHorn;
    }

    public void walk(){
        System.out.println("Walking with their hooves.");
}

}