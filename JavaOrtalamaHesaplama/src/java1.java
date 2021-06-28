import java.util.Scanner ;

   public class java1 {
       public static void main(String[] args) {
           //Değişkenleri oluştur
           int mat, fizik, kimya, turkce, tarih, muzik ;

           //Scanner sınıfımız tanımladık
           Scanner inp = new Scanner(System.in);

           //Kullanıcıdan değerleri al

           System.out.print("Matematik notunuz : ");
           mat = inp.nextInt() ;

           System.out.print("Fizik notunuz : ");
           fizik = inp.nextInt() ;

           System.out.print("Kimya notunuz : ");
           kimya = inp.nextInt() ;

           System.out.print("Turkce notunuz : ");
           turkce = inp.nextInt() ;

           System.out.print("Tarih notunuz : ");
           tarih = inp.nextInt() ;

           System.out.print("Muzik notunuz : ");
           muzik = inp.nextInt() ;

           int toplam = (mat + fizik + kimya + turkce + tarih + muzik) ;
           double sonuc = toplam/ 6 ;

           System.out.println("Ortalamanız :"  + sonuc);

           boolean sınıfıGecti  = (sonuc>60);
           boolean sınıftaKaldı = (sonuc<60) ;

           System.out.println("Sinifi Gecti mi ? :"+sınıfıGecti);
           System.out.println("Sinifi Kaldı mi ? :"+sınıftaKaldı);

       }

   }
