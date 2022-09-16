import java.util.Scanner;

public class Main{
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> e06815bb4cc95000e35613e81ddd8e79704d6011
    public static void main(String[] args){
        Main m = new Main();
        m.display();

        Animal a = new Animal("Sofi",4);
        Cat c = new Cat("Mingkoy",4,12);
        Goat g = new Goat("Fredie",4,2);
        Parrot p = new Parrot("Pipay", 2, 2);
       
    }

    public double add(double a, double b){
        return a + b;

    }


    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b){
        return a * b;
        
        }

    
public void display(){
    Scanner s = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Choose operator: ");
    System.out.println("A : Addition ");
    System.out.println("B : Subtraction ");
    System.out.println("C : Division ");
    System.out.println("D : Multiplication ");



    String operator = s.nextLine();  // Read user input
    System.out.println("Enter first number: ");
    String firstNum = s.nextLine();  // Read user input
    System.out.println("Enter second number: ");
    String secondNum = s.nextLine();  // Read user input
    

    if (operator.equals("a") || operator.equals("A")){
        
        System.out.println("Sum is: " + add(Double.parseDouble(firstNum), Double.parseDouble(secondNum)) );
    }
    else if (operator.equals("b") || operator.equals("B")) {
        System.out.println("Difference is: " + subtract(Double.parseDouble(firstNum), Double.parseDouble(secondNum)) );
       
    }else if (operator.equals("c") || operator.equals("C")) {
        System.out.println("Quotient is: " + divide(Double.parseDouble(firstNum), Double.parseDouble(secondNum)) );
       
    }else if (operator.equals("d") || operator.equals("D")) {
        System.out.println("Product is: " + multiply(Double.parseDouble(firstNum), Double.parseDouble(secondNum)) );
    }
}

<<<<<<< HEAD
=======
    public static double divide(double a, double b) {
        return a / b;
    }
=======
   
>>>>>>> e06815bb4cc95000e35613e81ddd8e79704d6011
}






<<<<<<< HEAD
>>>>>>> feature/division
=======

       


      


>>>>>>> e06815bb4cc95000e35613e81ddd8e79704d6011
