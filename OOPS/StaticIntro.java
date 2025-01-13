import java.lang.*;
import java.util.*;
import java.util.Scanner;
class Test
{
    static int x =10;
    int y = 20;
    void show()
    {
        System.out.println(x+" "+y);
    }
    static void Display()
    {
        System.out.println(x);
    }
}
class StaticIntro
{
    public static void main(String args[])
    {
       // System.out.println(Test.Display());
       Test t1 = new Test();
       
       t1.x = 5;
       t1.y = 10;
       t1.show();
       //t1.Display();
       Test t2 = new Test();
       t2.show();

        
    }
}