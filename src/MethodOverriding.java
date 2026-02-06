class Employee {
   void display(){
      System.out.println("Name of class is Employee");
   }
}

class Engineer extends Employee {
    void display(){
      System.out.println("Name of class is Employee");
      super.display;
   }
   
}

public class MethodOverriding {
   Engineer obj = new Engineer();
   obj.display;
        // TODO: Create an Engineer object
        // TODO: Call the display() method
    
}
