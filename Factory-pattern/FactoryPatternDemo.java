public class FactoryPatternDemo {

   public static void main(String[] args) {
      MalzemlerFactory MalzemelerFactory = new MalzemelerFactory();

       Malzemeler Malzemeler1 = MalzemelerFactory.getMalzemeler("igne");

        Malzemeler1.yap();
      Malzemeler Malzemeler2 = MalzemelerFactory.getMalzemeler("kumas");

            Malzemeler2.yap();
Malzemeler Malzemeler3 = MalzemelerFactory.getMalzemeler("iplik");
Malzemeler3.yap();
   }
}