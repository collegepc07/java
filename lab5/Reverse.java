package lab5;
// WAP to print a string in reverse without using built-in reverse methods
public class Reverse {
    public static void main(String[] args) {
        String str = "TAURUS";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
