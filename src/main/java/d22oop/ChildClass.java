package d22oop;

public class ChildClass  extends  ParentClass{

    @Override
    public Integer multiply(Integer a, Integer b) {
        //Parent class in multiply methodunu cagirdik
        Integer sonuc = super.multiply(a, b);

        //Ek islevsellik katalim
        return  sonuc + 10;
        //Parent method degismez
    }
}
