import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       
    }

    public double add(double a, double b){
        return a + b;

    }


    public double subtract(double a, double b) {
        return a - b;
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
        
        System.out.println("Sum is: " + add.add(Double.parseDouble(firstNum), Double.parseDouble(secondNum)) );
    }
    else if (operator.equals("b") || operator.equals("B")) {
        System.out.println("Difference is: " + minus.subtract(Double.parseDouble(firstNum), Double.parseDouble(secondNum)) );
       
    }else if (operator.equals("c") || operator.equals("C")) {
        System.out.println("Quotient is: " + divide.divide(Double.parseDouble(firstNum), Double.parseDouble(secondNum)) );
       
    }else if (operator.equals("d") || operator.equals("D")) {
        System.out.println("Product is: " + multiply.multiply(Double.parseDouble(firstNum), Double.parseDouble(secondNum)) );
    }
}

   
}







       


      
