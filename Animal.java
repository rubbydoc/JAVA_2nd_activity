public class Animal{

//properties
    String name;
    int numOfFeet;


//constructor
    public Animal(String name, int numOfFeet){
        this.name = name;
        this.numOfFeet = numOfFeet;
    }

//getter
    public String getName(){
        return name;
    }

    public int numOfFeet(){
        return numOfFeet;
    }

//setter
    public String setName(String name){
    this.name = name;
    }

    public int setNumOfFeet(int numOfFeet){
    this.numOfFeet = numOfFeet;
    }

//function

    public void walk(){
    System.out.println("Walking...");
    }


}