package d19stringbuilder_buffer_accessmodifier_static;

public class Student2Runner {
    public static void main(String[] args) {

        System.out.println("Student2.stdName =" + Student2.stdName);//Student2.stdName =Ali Can

        Student2 ali = new Student2();
        System.out.println("ali.age = " + ali.age);//ali.age =18

        Student2.staticMethod();//ben static vir methodum

        ali.nonStaticMethod();//ben non-static bir methodum

        String s = "Java kolaydir";
        s.substring(0,3);

    }


}
