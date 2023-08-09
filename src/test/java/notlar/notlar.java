package notlar;

public class notlar {

  //   calistirca***raporlama reports dosyalari icin mevon strorimize plugin ekledik
  //      <include>**/runners/*TestRunner*.java</include> mavende den aldim buraya koydum bunlariz
    // ve buyuzden runner classinin ismini testRunner olarak degistirdik
    //terminale yaz
    //mvn clean verify

    /*
    yukardaki satirlar cucumberda raporlamaya raporlamaya aittir.
    raporlari almak icin terminalden calistirmak gerekir

     */
    /*                   Paralel TEST
*paralel testing ayni anda birden fazla browser'in es zamanli calistirilmasidir
* cucumber'ile paralele testi calistirmak testNG ye gore daha zordur
* senaryolara @ isareti ile tag acip ,runner a gidip yazdigimiz tagi runner'a yazip calistircaz bu sirali test olmus oluyor
*
* BIR TANE TESTRUNNER'imiz varken paralel calistirabilirmiyim?
 nekadar browser calistirmak istiyorsak o kadar test runner class'i olusturmamiz lazim
       yada
 POM.xml 'e koyacagimiz plugin dosyalariyla bu isi cozeriz
 1- failsafe (fail'i safe haline getirir,yani  fail olsada devam et der)
 2- surefire
  ve ardindan terminale gidip   =====>>> mvn clean verify <<======= (enter )
  *
  * Hoca 2. kez test runner class'i olusturdu paralel testinglere tekrar bakilmali









     */







}
