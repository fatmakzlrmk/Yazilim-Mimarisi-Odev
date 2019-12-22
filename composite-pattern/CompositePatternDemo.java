public class CompositePatternDemo {
   public static void main(String[] args) {
   
      isci CEO = new isci("Yekta","CEO", 30000);

      isci satisDanisman = new isci("Nuray","Satýþ Danýþmaný", 20000);

      isci pazarlama = new isci("Berfin","Pazarlama", 9000);
      isci muhasebe = new isci("Betül","Muhasebeci", 5000);
      isci websatis = new isci("Murat","Web Satýþ Danýþmaný", 5000);
      isci insankay1 = new isci("Ramazan","Ýnsan Kaynaklarý", 3000);
      isci insankay2= new isci("Beytullah","Ýnsan Kaynakalrý", 3000);

      CEO.ekle(satisDanisman);
      CEO.ekle(pazarlama);

      pazarlama.ekle(insankay1);
      pazarlama.ekle(insankay2);
      
      pazarlama.ekle(muhasebe);
      pazarlama.ekle(websatis);

      System.out.println(CEO); 
      
      for (isci headisci : CEO.getast()) {
         System.out.println(headisci);
         
         for (isci isci : headisci.getast()) {
            System.out.println(isci);
         }
      }		
   }
}