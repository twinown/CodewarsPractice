public class CodeWars_221_dermo {
    public static String incrementString(String str) {
            String oldString = str;
            for(int i = str.length()-1;i>=1;i--) {
                while (Character.isDigit(str.charAt(i))){
                    i--;
                    if (i==0){
                        break;
                    }
            }
                if (Character.isDigit(str.charAt(str.length()-1))){
                    String buffer = str.substring(i+1);
                    if (buffer.length()>Long.toString(Long.MAX_VALUE).length()){
                        String secondPart = buffer.substring(buffer.length()-4);
                        String firstPart = buffer.substring(0,buffer.length()-4);
                        long anotherLongBuffer = Long.parseLong(secondPart)+1;
                        buffer = firstPart+anotherLongBuffer;
                        str = str.substring(0,i+1)+buffer;
                        break;
                    }
                    long longBuffer;
                    if (buffer.charAt(0) == '0'){
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
        System.out.println(incrementString("vNM|IX?bCaDuHhaCrW{c!K`@*N73747152088917169657172191109187"));
    }
}
