import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Vehicle {

    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year= year;
    }
    
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    


    public String toString() {
        return "Vehicle [make=" + make + ", model=" + model + ", year=" + year + "]";
    }

    public static void main(String[] args){
        ArrayList<Vehicle> cars = new ArrayList<>();
        cars.add(new Vehicle("Toyota", "prius", 2003));
        cars.add(new Vehicle("Tesla", "roadStar", 2030));
        cars.add( new Vehicle("Toyota", "priusC", 2001));
        System.out.println(cars);
        Collections.sort(cars, new Comparator<Vehicle>(){
            public int compare(Vehicle firstCar, Vehicle secondCar) {
                return Integer.compare(firstCar.getYear(), secondCar.getYear());
            }
       });

        System.err.println(cars); 
    }
}
