public class Car {
  
  int  topSpeed;
  int  totalSeats;
  int  fuelCapacity;
  
}

class Car { //share by all

  // static fields
  static int speed;
  static int capacity;

}

class Car { //instance everyone has their own 
  
  // Non-Static Fields
  int speed;
  int capacity;
  
}
Car obj1 = new Car();

System.out.println(obj1.speed);
System.out.println(obj1.capacity);

class Car {
  // Final field of capacity = 4
  // Now Capacity can nerver be changed from 4
  // to some other value throught the program
  final int capacity = 4;

}
