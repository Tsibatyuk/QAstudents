package ilia.Tasks;

public class Task1 {
    class A {
        public Object test() { return new Object();}
    }
    class B extends A {
        @Override
        public Object test(){
            return ""; }
    }
}
