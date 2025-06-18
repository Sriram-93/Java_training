import java.util.*;

class Human {
    public void eat(String food) {
        System.out.println("Human eats " + food);
    }

    public void sleep() {
        System.out.println("Human sleeps");
    }
}

class Student extends Human {
    @Override
    public void eat(String food) {
        System.out.println("Student eats " + food);
    }

    public void study(String subject) {
        System.out.println("Student studies " + subject);
    }
}

class Main {
    public static void main(String[] args) {
    
        Human obj = new Student(); 
        obj.eat("Breakfast");      
        obj.sleep();               

        
        if (obj instanceof Student) {
            ((Student) obj).study("Java");
        }
    }
}
