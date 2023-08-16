package ilia.Static;
public class main {
    public static void main(String[] args)
    {
        int x = Static.mult(12,23);//
        System.out.println(x);//

        Static a = new Static();
        System.out.println(a.x);
        Static.x = 24;
        System.out.println(Static.x);
        Static b = new Static();
        System.out.println(Static.x);
    }

}
