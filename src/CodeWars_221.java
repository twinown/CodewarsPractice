public class CodeWars_221 {
    public static String incrementString(String str) {
            String oldString = str;
            for(int i = str.length()-1;i>=1;i--) {
                while (Character.isDigit(str.charAt(i))){
                    i--;
            }
                if (Character.isDigit(str.charAt(str.length()-1))){
                    String buffer = str.substring(i+1);
                    long longBuffer;
                    if (buffer.charAt(0) == '0'){
                        //todo попробуй если оч большое число, брать его часть последнюю, цифр 15
                        //лонг макс ленхс
                        if (buffer.length()>)
                        longBuffer = Long.parseLong(buffer)+1;
                        buffer = buffer
                                .substring(0,buffer.lastIndexOf('0')+1)+longBuffer;
                        str = str.substring(0,i+1)+buffer;
                        if (str.length()>oldString.length()){
                            str = str.replaceFirst("0","");
                        }
                        break;
                    } else {
                        longBuffer = Long.parseLong(buffer)+1;
                        buffer = String.valueOf(longBuffer);
                        str = str.substring(0,i+1)+buffer;
                        break;
                    }
                }
            }
        return str.isEmpty()||!Character.isDigit(str.charAt(str.length()-1))?str+"1":str;
    }

    public static void main(String[] args) {
        System.out.println(incrementString("w221378209659582463624230911419240671"));
    }
}
