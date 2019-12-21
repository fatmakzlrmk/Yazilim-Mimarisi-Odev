## YAZILIM MİMARİSİ ÖDEVİ
### Composite Tasarım Deseni
Bu tasarım deseninin hangi probleme çözüm olarak geliştirildiğinin üzerinde durmamız gerekiyor. Problem iç içe geçebilen yani hiyerarşik bir koleksiyonu, bellekte saklamak ve üzerinde bir takım işlemler yapmaktır. Bunun için en ideal yöntem nedir?
Bu tanımda anlaşılması gereken en önemli nokta, koleksiyonun “iç içe geçebilen – hiyerarşik” bir yapıda olduğudur. Yani koleksiyonunuz, ağaç yapısı (tree-structured) biçiminde yapılandırılmış olmalı. Nedir bu ağaç yapısı? Bir ağacın gövdesi, yukarı doğru çıktıkça dallara ayrılır. Bu dallar da başka dalların gövdelerini oluştururlar. Yani bu “başka dallardan” da başka dallar türeyebilir. Fakat bir noktada “dal” bitebilir. Yani sonlu olabilir.
Bu kavramı, yazılım dışı dünyadan bir örnekle anlatmaya çalışırsak şu an, bilgisayarımızda kullanmakta olduğumuz işletim sistemine bağlı dosya sistemini düşünelim. Masaüstüne bir klasör oluşturduktan sonra iç içe istediğimiz adar klasör ekleyebiliriz. Aynı şekilde bu klasörlerin içinde çeşitli dosyalar da olabilir. Ama dosyalar, bu hiyerarşide en alt sırada olacak. Yani, onların altına başka bir eleman ekleyemeyiz.

![Image of Class](https://github.com/fatmakzlrmk/Yazilim-Mimarisi-Odev/blob/master/composite.png)


Çalışan nesnelerinin listesini içeren işci sınıfı oluştururuz.
```java
import java.util.ArrayList;
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

```
isci sınıfımıza işçi ekleyip çıkaarbileceğimizi unutmayalım. Bu yüzden kesinlikle bir ekle ve çıkar metodumuzun bulunması gerekiyor.

```java
public void ekle(isci Ali) {
      ast.ekle(Ali);
   }

   public void cıkar(isci Ali) {
      ast.cıkar(Ali);
   }
```
Böyle çözümler geliştirirken ne kadar açık bir sistem geliştirirsek o kadar rahat ederiz. Yani bu örnekteki gibi işçi nesenesine özel olmasındansa, daha geniş ölçekte nesneler ile çalışabilen bir bileşen yaratmak çok daha sağlıklı olacaktır. Bu bileşeni yaratmak için ihtiyacımız olacak adımlar var. Bunlar;

1-Bileşen tip-spesifik olmalı. Sadece belirli tipler bileşene eklenebilmeli.

2-Bir bileşen, alt bileşenlerden oluşabilmeli.
3-Eklenen her nesne, bileşen olarak kullanılabilmeli.
