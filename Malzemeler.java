public interface Malzemeler {
   void yap();
}
public class igne implements Malzemeler {

   @Override
   public void yap() {
      System.out.println("igne::yap() metodu.");
   }
}
public class kumas implements Malzemeler {

   @Override
   public void yap() {
      System.out.println("kumas::yap() metodu.");
   }
}
public class iplik implements Malzemeler {

   @Override
   public void yap() {
      System.out.println("iplik::yap() metodu.");
   }
}
