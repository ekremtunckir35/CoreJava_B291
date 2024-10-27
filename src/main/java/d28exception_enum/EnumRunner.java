package d28exception_enum;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {
        //Cities c = new Cities(); //HATA-enum'dan object uretemezsiniz

        //Enum da bir sabite nasil ulasilir?

        Cities il = Cities.AKSARAY;
        System.out.println(il);

        //Bursa sabitinin ismine ulasalim
         String ilIsmi = Cities.BURSA.getCityName();
        System.out.println(ilIsmi);

        //3- Ankara’nin posta koduna ulasalim
        String postalCode  = Cities.ANKARA.getPostalCode();
        System.out.println(postalCode);

        //4- Antalya’nin plaka koduna ulasalim
        System.out.println(Cities.ANTALYA.getPlateCode());//7

        //5- Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin
        //values() methodu enum icindeki tum datalari bir Array icinde bize verir
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen plaka kodu giriniz");
        int plaka = input.nextInt();

        Cities[] sehirler = Cities.values();
        //System.out.println(Arrays.toString(sehirler)); //[ADANA, ADIYAMAN, AFYONKARAHİSAR, AĞRI, AMASYA, ...

        if (plaka < 1 || plaka > 81) {
            System.out.println("Lutfen 1 ile 81 arasi bir plaka kodu giriniz");
        } else {
           for(Cities w : sehirler){
               if(plaka == w.getPlateCode()){
                   System.out.println("Girmis oldugunuz plaka " + w.getCityName() + " iline aittir");
                   break;
               }

           }


        }
    }
}