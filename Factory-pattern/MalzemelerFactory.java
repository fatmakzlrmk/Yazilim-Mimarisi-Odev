public class MalzemelerFactory {
    public Malzemler getMalzemeler(String MalzemelerType){
      if(MalzemelerType == null){
         return null;
      }		
      if(MalzemelerType.equalsIgnoreCase("igne")){
         return new igne();
         
      } else if(MalzemelerType.equalsIgnoreCase("kumas")){
         return new kumas();
         
      } else if(MalzemelerType.equalsIgnoreCase("iplik")){
         return new iplik();
      }
      
      return null;
   }
}