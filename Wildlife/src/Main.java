public class Main {

    public static void main (String[] args) {

        //Hawk class implementation
      Hawk hawk = new Hawk();
        hawk.hunt();

        //Fish class implementation
      Fish fish = new Fish();
      fish.flee();


        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        rabbit.hunt();
    }
}
