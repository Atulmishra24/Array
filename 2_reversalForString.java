public class reversalForString {
    public static void main(String[] args) {
        String string = "ATULMISHRA";
        String Temp ="";
        for (int i = 0; i < string.length(); i++) {
            Temp += string.charAt(string.length()-i-1);
        }
        System.out.println(Temp);
    }
}
