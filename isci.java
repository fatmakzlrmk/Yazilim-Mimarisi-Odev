mport java.util.ArrayList;
import java.util.List;

public class isci {
   private String name;
   private String departman;
   private int maas;
   private List<isci> ast;

   public isci(String name,String departman, int maas) {
      this.name = name;
      this.dept = departman;
      this.salary = maas;
      ast = new ArrayList<isci>();
   }

   public void ekle(isci Ali) {
      ast.ekle(Ali);
   }

   public void cýkar(isci Ali) {
      ast.cýkar(Ali);
   }

   public List<isci> getast(){
     return ast;
   }

   public String toString(){
      return ("isci :[ Ad : " + name + ", Departman : " + departman + ", Maasý :" + maas+" ]");
   }   