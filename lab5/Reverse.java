package lab5;
//	WAM THAT TAKES A STRING AND PRINTS IT IN REVERSE ORDER WITHOUT USING BUILD IN REVERSE METHODS
public class Reverse {
    public static void reverse() {
        String str = "TAURUS";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
        reverse();
    }
}