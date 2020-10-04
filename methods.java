class Car {

  // Public method to print speed
  public void printSpeed(int speed) {
    System.out.println("Speed: " + speed);
    }
  
}

class Demo {
  
  public static void main(String args[]) {
    Car car = new Car();
    car.printSpeed(100); // calling public method
  }
  
}
//getter and setter methods

// Car class
class Car {
  
  private int speed; // member field speed

  // Setter method to set the speed of the car
  public void setSpeed(int x) {
    speed = x; 
  }

  // Getter method to get the speed of the car
  public int getSpeed() {
    return speed; 
  }
  
}

class Demo {
  
   public static void main(String args[]) {
     Car car = new Car();
     car.setSpeed(100); // calling the setter method
     System.out.println(car.getSpeed()); // calling the getter method
   } 
  
}

class Calculator {

  public double product(double x, double y) {
    return x * y;
  }

  // Overloading the function to handle three arguments
  public double product(double x, double y, double z) {
    return x * y * z;
  }

  // Overloading the function to handle int
  public int product(int x, int y){
    return x * y;
  }

}

class Demo {
  
  public static void  main(String args[]) {
    Calculator cal = new Calculator();
    
    double x = 10;
    double y = 20;
    double z = 5;
    
    int a = 12;
    int b = 4;
    
    System.out.println(cal.product(x, y));
    System.out.println(cal.product(x, y, z));
    System.out.println(cal.product(a, b));
  }
  
}
