package d31lambda;

import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionInterface {
    public static void main(String[] args) {

     /*Lambda ifadeleri, fonksiyonel arayüzleri (interface) kullanarak daha temiz ve kısa kod yazmanızı sağlar.
Fonksiyonel arayüzler, lambda ifadelerine bir isim ve yapısal bir çerçeve sağlar.

Consumer, Supplier, Function, ve Predicate Java'da fonksiyonel arayüzlerdir (interface).
Java'da bir arayüzün fonksiyonel arayüz olarak kabul edilmesi için yalnızca
bir tane soyut metoda (abstract) sahip olması gerekmektedir.

Fonksiyonel Arayüz Metotları:

Function<T, R>: apply(), girdi ve çıktı arasında bir dönüşüm veya işlem gerektiriyorsa kullanilir.
    Tek bir girdi alır ve tek bir çıktı üretir
Consumer<T>: accept(), Bir girdi alır ve bir işlem gerçekleştirir, ancak herhangi bir çıktı üretmez.
Supplier<T>: get(), Herhangi bir girdi almadan bir çıktı üretir.
Predicate<T>: test(), Bir girdiyi alır ve bir koşul testi yapar, sonuç olarak true veya false döndürür.*/

//Ornek : Bir Lambda fonksiyonu tanimlayarak verilen sayinin karesini aliniz.
//Example : Square the given number by defining a Lambda function.

        Function<Integer,Integer>squaring =x->{
            int result =x * x;
            return result;
        };
        System.out.println(squaring.apply(5));
    }
}
