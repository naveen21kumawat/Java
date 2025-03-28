class Base {
    int x;
    int y;

    void setData(int a, int b) {
        x = a;
        y = b;

    }
}

class Derived extends Base {
    void getdata() {
        System.out.println(x + " " + y);
    }
}

public class J1_inheritance {
    public static void main(String[] args) {
        Derived ob = new Derived();
        ob.setData(10, 20);
        ob.getdata();
    }
}
