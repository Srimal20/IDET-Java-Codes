public class SolarSystem {
}
class Earth extends SolarSystem{
}
class mars extends SolarSystem{
}
class Moon extends Earth{
    public static void main(String[] args) {
        SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        mars m = new mars();
        System.out.println(s instanceof SolarSystem);
        System.out.println(e instanceof Earth);
        System.out.println(m instanceof SolarSystem);

    }
}
