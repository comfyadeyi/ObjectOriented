public class Main {
    public static void main(String[] args) {

        Car honda = new Car("Honda","Accord",180,1);
        Car Toyota = new Car("Toyota","Corolla",230,0);
        cat kiki = new cat();



        Convertible benz = new Convertible("Mercedez benz","4Matic",290,0);
        benz.OpenHead();
        animal all = new animal("talk", "food",  "see" ,"sleep" ,"breath", "die");
        System.out.println("The speed is "+honda.Speed);
        honda.Accelerate();
        honda.Accelerate();
        honda.Select();
        honda.Honk();

        flyinganimal bird = new flyinganimal("talk", "food", "see" ,"sleep", "breath", "die") ;
        bird.flying();
        kiki.walk();
        kiki.sound();
        kiki.eating();


    }
}