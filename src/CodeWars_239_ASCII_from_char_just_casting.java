public class CodeWars_239_ASCII_from_char_just_casting {
    public static String rot13(String str) {
        String s = "";
        for(int i = 0;i<str.length();i++){
            if (Character.isLowerCase(str.charAt(i))){
                if((int)str.charAt(i)>=97&&((int)str.charAt(i)<=109
                )){
                    s+= Character.toChars((int)str.charAt(i)+13)[0];
                } else s+=  Character.toChars((int)str.charAt(i)-13)[0];
            } else if (Character.isUpperCase(str.charAt(i))) {
                if ((int)str.charAt(i)>=65&&(int)str.charAt(i)<=77){
                    s+= Character.toChars((int)str.charAt(i)+13)[0];
                } else s+=  Character.toChars((int)str.charAt(i)-13)[0];
            } else if (!Character.isAlphabetic(str.charAt(i))) {
                s+=str.charAt(i);
            }
            }
        return s;
        }



    public static void main(String[] args) {
        System.out.println(rot13("AXdN^a3vEUR_MEQ9CTo"));
    }
}
