public class ReverseNumber {
    int number , rev = 0;
    ReverseNumber(int n){
        number = n;
        while(number != 0){
            int digit= number % 10;
            rev = rev*10+digit;
            number = number/10;
        }}
        void display(){
            System.out.println("reversed nuber="+ rev);
        }
        public static void main(String[]args){
            ReverseNumber obj = new ReverseNumber(987654321);
            obj.display();
        }
        }



