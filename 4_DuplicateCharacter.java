public class DuplicateCharacter {
    public static void main(String[] args) {
        String string = "Atuult";
        int flag =0;
        int length = string.length();
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if(string.charAt(i)==string.charAt(j)){
                   System.out.println("The Duplicate Character is :" + string.charAt(i));
                    flag++;
                }
            }
           
        }
        if(flag!=0){
            System.out.println("Number of duplicate are "+ flag);
        }
        else{
            System.out.println("There is no duplicate");
        }
    }
}
