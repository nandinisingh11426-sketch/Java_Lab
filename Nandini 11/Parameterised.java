class Parameterised {
    int id;
    String name;

    Parameterised(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Parameterised p1 = new Parameterised(1, "Aman");
        Parameterised p2 = new Parameterised(2, "Riya");

        p1.display();
        p2.display();
    }
}