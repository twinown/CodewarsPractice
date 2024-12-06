public class CodeWars_221 {
    public static String incrementString(String str) {
        int countZeros = 0;
        for(int i = 0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                String buffer = str.substring(i);
                int intBuffer;
                if (buffer.charAt(0)=='0'){
                    for (int j = 0; j < buffer.length(); j++) {
                        if (buffer.charAt(j)=='0'){
                         countZeros++;
                        }
                    }
                    //todo попробюуй не считая нули, а сравнивая количество до и после
                    intBuffer = Integer.parseInt(buffer)+1;
                    buffer = buffer
                            .substring(0,buffer.lastIndexOf('0')+1)+intBuffer;
                    str = str.substring(0,i)+buffer;
                    break;
                } else {
                    intBuffer = Integer.parseInt(buffer)+1;
                    buffer = String.valueOf(intBuffer);
                    str = str.substring(0,i)+buffer;
                    break;
                }
            }
        }
      return str.charAt(str.length()-1)=='0'?str.replaceFirst("0",""):str;
    }

    public static void main(String[] args) {
        System.out.println(incrementString("poto09"));
    }
}
