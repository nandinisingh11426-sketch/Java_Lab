public class Outer {
    int x = 10;
    class Inner{
        void display(){
            System.out.println("value of x from outer class:" + x);
        }
    }
        public static void main(String[] args) {
            Outer obj = new Outer();
            Outer.Inner innerobj = obj.new Inner();
            innerobj.display();

        }
    
}
