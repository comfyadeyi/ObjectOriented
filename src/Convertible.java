public class Convertible extends Car{
    public Convertible(String Brand, String Model, int Speed, int Gear) {
        super(Brand, Model, Speed, Gear);
    }

    void OpenHead(){
        System.out.println("Head Opened");
    }
}
