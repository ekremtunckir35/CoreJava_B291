package d20staticblock_instanceblock_oop;

public class InstanceBlock2 {
    public  int year;
    //instance blok
    {
        System.out.println("Herkese selam");
        System.out.println("Herkese selam");
    }

    public InstanceBlock2() {
       //buradaki sout u sildik,instance block icine aldik
    }

    public InstanceBlock2(int year) {
        //buradaki sout u sildik,instance block icine aldik
        this.year = year;
    }
}
