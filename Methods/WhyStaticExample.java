package Methods;

public class WhyStaticExample {

   static int volume = 300;



   public static int total(int a, int b){

       //this is made static because it is not interfering with any instance variables present
       return a+b;
   }


   public int getVolume(int a, int b){

       volume = volume+a+b;

       System.out.println(volume);

       return volume;
   }

    public static void main(String[] args) {

       WhyStaticExample obj = new WhyStaticExample();
        WhyStaticExample obj2 = new WhyStaticExample();







    }


}
