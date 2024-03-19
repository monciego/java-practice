
public class BasicSyntax {
    public static void main(String[] args) throws Exception {
        System.out.println("Primitive Data Types");
        int a = 5;
        char b = 'i';
        long c = 400;
        double d = 3.2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        String name = "Superman";
        System.out.println(name.toUpperCase());

        String exlaimed = addExlamationPoint(name);
        System.out.println(exlaimed);

        int num = 5;

        for(int i = 0; i < num; i++) {
            System.out.println(i);
        }

        System.out.println(Animal.iAmDog());
        System.out.println(Animal.bark());
        System.out.println(Animal.guardDog());
        Animal.fiftyDogs();
        Animal.animals();
        Animal.atleastITried();
   }

    public static String addExlamationPoint(String s) {
        return  s + "!";
    }
}
