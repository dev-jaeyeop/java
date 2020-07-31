package InnerClasses;

public class Main {

    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        Gearbox.Gear first = mcLaren.new Gear(1, 1.23);
//        Gearbox.Gear second = new Gearbox.Gear(2, 15.4);
//        Gearbox.Gear third = new maLaren.Gear(3, 17.8);
        System.out.println(first.driveSpeed(1000));

    }
}
