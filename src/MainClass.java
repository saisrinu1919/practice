class Car {  
    private String color;  
    int maxSpeed;   
    public void carInfo(){  
        System.out.println("Car Color= "+color + " Max Speed= " + maxSpeed);  
    }  
    public void setColor(String color) {  
        this.color = color;  
    }  
    public void setMaxSpeed(int maxSpeed) {  
        this.maxSpeed = maxSpeed;  
    }  
} 
class Maruti extends Car{  
	//long maxSpeed;
	//float x;
    public void MarutiStartDemo(){  
        Engine MarutiEngine = new Engine();  
        MarutiEngine.start();  
        }
    public void setMaxSpeed(int maxSpeed,float x) {  
        this.maxSpeed = maxSpeed+(int)x; 
        //this.x = x;
    }
} 
class Engine {  
    public void start(){  
        System.out.println("Engine Started:");  
    }  
    public void stop(){  
        System.out.println("Engine Stopped:");  
    }  
} 
public class MainClass {  
    public static void main(String[] args) {          
        Maruti myMaruti = new Maruti();  
        myMaruti.setColor("RED");  
        myMaruti.setMaxSpeed(180);
        myMaruti.setMaxSpeed(180,45);
        myMaruti.carInfo();  
        myMaruti.MarutiStartDemo();  
    }  
}