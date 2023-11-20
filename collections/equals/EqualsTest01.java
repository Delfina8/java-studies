package academy.devdojo.maratonajava.collections.equals;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC","marca 1");
        Smartphone s2 = new Smartphone("1ABC","marca 2");

        System.out.println(s1.equals(s2));
    }
}
