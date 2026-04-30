class Overloading {
    int id;
    String name;

    Overloading() {
        id = 0;
        name = "Default";
    }

    Overloading(int i) {
        id = i;
        name = "Unknown";
    }

    Overloading(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Overloading o1 = new Overloading();
        Overloading o2 = new Overloading(10);
        Overloading o3 = new Overloading(20, "Aman");

        o1.display();
        o2.display();
        o3.display();
    }
}