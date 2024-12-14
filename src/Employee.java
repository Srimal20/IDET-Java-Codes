class Employee {

    double salary = 40000;
}

class Cleark extends Employee{

    int bonus = 25000;

    public static void main(String []args){

        Cleark c = new Cleark();
        System.out.println("Cleark's salary is : " + c.salary);
        System.out.println("Cleark's bonus is : " + c.bonus);
        System.out.println("Cleark's gross salry is : " + (c.salary + c.bonus));
    }
}