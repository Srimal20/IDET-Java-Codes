public class Human {
    String name;
    String Cname;
    void read(){
        System.out.println("I can read!");
    }
}

class Jana extends Human{
    void show(){
        System.out.printf("My name is:" + name);
    }
}

class Kavee extends Human{
    void cook(){
        System.out.println("I can cook "+ Cname);
    }
}

class Test1{
    public static void main(String[] args) {
        Jana j = new Jana();
        j.name = "Janani prasadini ";
        j.show();
        Kavee k = new Kavee();
        k.Cname = "chicken";
        k.cook();
        j.read();
        k.read();
    }
}
