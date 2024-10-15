package d23oop_collections;

public class AudiRunner {
    public static void main(String[] args) {

        //Engine e = new Engine() ;//HATA ,Interface lerden obje uretilmez

        AudiA4 a4 =new AudiA4();
        a4.turbo();//Audi A4 turbo motor kullanir
        a4.esp();//Audi A4 esp fren sistemi kullanir
        a4.digital();//Audi A4 dijital klima kullanir
        a4.run();

        //Engine.price =5000;//yeni deger atayamayiz bu da Final ispati

        //6.madde
        System.out.println(Engine.fiyat);//300
        System.out.println(AC.fiyat);//200
        System.out.println(Brake.fiyat);//100

        Engine.speed();
        a4.power();//200 Hp  //extra genisleme icin esk kodlara zarar vermesin diye kullanilir.

    }
}
