public class Car {

    String Brand;
    String Model;
    int Speed;
    int Gear;

    public Car(String Brand,String Model,int Speed,int Gear){
        this.Brand = Brand;
        this.Model = Model;
        this.Speed = Speed;
        this.Gear = Gear;
    }
    void Accelerate(){
        Speed = Speed + 20;
        System.out.println("Accelerating, Speed is "+Speed);
    }
    void Honk(){
        System.out.println("pim pim");
    }

    void Select(){
        Gear = Gear + 1;
        System.out.println("the number of gear is "+Gear);
    }

}
