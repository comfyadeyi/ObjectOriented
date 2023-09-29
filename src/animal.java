public class animal {
    String talk;

    String food;
    String see;

    String sleep;
    String breath;
    String die;

    public animal(String talk,String food, String see, String sleep, String breath, String die){
        this.talk = talk;
        this.food =food;
        this.see = see;
        this.sleep = sleep;
        this.breath = breath;
        this.die = die;
    }
    void eating (){
        food = "herbs";
        System.out.println("the animal is eating " + food);
    }
    void talking(){
        talk= "sounds";
        System.out.println(" the animal is making sound");
    }
    void seeing(){
        see = "images";
        System.out.println("the animal is seeing images");
    }
    void sleeping(){
        sleep = "on the ground";
        System.out.println("the animal is sleeping on the ground");
    }
    void  breathing(){
        breath= "air";
        System.out.println("the animal is breathing in air");
    }
    void death (){
        die ="die";
        System.out.println("the  animal all die ");
    }

}
