public class Cat extends Animal{
    
    int numOfWhisker;

    public Cat (String name, int numOfFeet, int numOfWhisker){
        super(name, numOfFeet);
        this.numOfWhisker = numOfWhisker;
    }

    public void walk(){
        System.out.println("Walking on toes and on the ball of the foot.");
}


}