interface Mango {
    void taste();
}

class Winter implements Mango {
    public void taste() {
        System.out.println("Mango is less available in winter");
    }
}

class Summer implements Mango {
    public void taste() {
        System.out.println("Mango tastes sweet in summer");
    }
}

public class TestMango {
    public static void main(String[] args) {
        Winter w = new Winter();
        Summer s = new Summer();

        w.taste();
        s.taste();
    }
}