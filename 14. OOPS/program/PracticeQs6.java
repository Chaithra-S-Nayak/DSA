class Vehicle{
    public void print(){
        System.out.println("Vehicle class");
    }
}
class Car extends Vehicle{
    public void print(){
        System.out.println("Car class");
    }
    public void printyy(){
        System.out.println("printyy");
    }
}
class PracticeQs6{
    public static void main(String args[]){
        Vehicle v=new Car();
        v.print();// will override
        //v.printyy(); // will throw compile time
    }
}