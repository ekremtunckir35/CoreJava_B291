package d5increment_decrement_if;

public class IncrementDecrement {
    public static void main(String[] args) {


        //--------Incremant  (Artirma)

        int a =5 ;
        a = a + 2 ; //a iki defa yazilmis,tekrardan kurtulabiliriz.
        System.out.println(a);//7

        a += 2 ; // a yi  2 artir demek
        System.out.println(a);


        //---------Decrement ( azaltma)

        int c =10;
        c = c -3 ;//c iki defa yazilmis tekrardan kurtulabiliriz
        System.out.println(c);

        c -= 4; // c =c-4; un aynisidir.
        System.out.println(c);//3

        //---------carpma

        int d = 6;
        d = d * 2;
        System.out.println(d);

        d *= 2;
        System.out.println(d);//24


        //----------bolme

        int e =24;
        e = e/2;
        System.out.println(e);//12

        e /=2;
        System.out.println(e);//6

        //---------------  1 ile Increment (Artirma)

        int f =13;
        f = f+1;
        f += 1;
        f++;
        System.out.println(f);//16

        //-------------- 1 ile Decrement

        int h = 15;
        h = h-1;
        h -=1;
        h --;
        System.out.println(h);//12

        // -------- Post Increment ( ++ 1 ) , Pre  Increment (++i)

        int i =10;
        int k = i++;

        System.out.println(k);//10
        System.out.println(i);//11

         int m = 15;
         int n = ++m;
        System.out.println(n);//16
        System.out.println(m);//16

        int p =15;
        int r = p--;
        System.out.println(p);//14
        System.out.println(r);//15


        int s = 20;
        int t = --s;

        System.out.println(t);//19
        System.out.println(s);//19


    }
}
