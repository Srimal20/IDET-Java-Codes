import javax.sound.midi.Soundbank;

public class car {
    String carName;
    void drive(){
        System.out.println("Driving");
    }
    void breaks(){
        System.out.println("Broke");
    }
}
class volkswagon extends car{}
class BMW extends volkswagon{}
class Audi extends volkswagon{}
class Bugatti extends BMW{}
class Mercedez extends car{}
class Benzc200 extends Mercedez{}
class Toyota extends car{}
class prius extends Toyota{}
class suzuki extends car{}
class maruti extends suzuki{}
class alto extends suzuki{}
class swift extends suzuki{}
class Test2{
    public static void main(String[] args) {
        Audi a= new Audi(); Bugatti b = new Bugatti(); Benzc200 bc = new Benzc200();
        prius p = new prius(); maruti m = new maruti(); alto al= new alto(); swift s = new swift();
        a.carName = "Audi A8"; b.carName = "Bugatti premium"; bc.carName = "Benz c200";
        a.breaks(); a.breaks(); a.drive();

    }
}
