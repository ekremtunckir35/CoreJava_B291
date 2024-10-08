package d20staticblock_instanceblock_oop;

public class InstanceBlock3 {
//Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.
//Example 3: In a car factory, each car is black in colour and the fuel type is petrol.
//(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)

    public String color ;
    public String fueltype;

    //-------------------------------------------------------
    //Instance block --bu classtan her object olusturuldugunda calisir/
    {
        color = "siyah";
        fueltype ="Benzin";
    }
    //--------------------------------------
    //constructer -Class in objeleri oldugunda calistirilir.

    public InstanceBlock3(){
        System.out.println("Araba rengi :" + color);
        System.out.println("Araba yakit turu" + fueltype);
    }

    //Default olrak siyah ve benzzinle baslatmak istemezsek parametreli constructor olustururuz.

    public InstanceBlock3(String color,String fueltype){
        this.color =color;
        this.fueltype=fueltype;


    }
}
