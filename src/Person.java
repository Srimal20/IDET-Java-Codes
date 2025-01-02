class Person {
    int id;
    String name;
    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
}
class Engineer extends Person{
    float salary;
    Engineer(int id, String name, float salary){
        super(id,name);
        this.salary = salary;
    }
    void display(){
        System.out.println(id + " " + name + " " + salary);
    }
}
class Test3{
    public static void main(String[] args) {
        Engineer e = new Engineer( 8120641, "Kamal", 250000);
        e.display();
    }
}
