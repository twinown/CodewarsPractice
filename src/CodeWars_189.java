public class CodeWars_189 {

    //simplesol
    // return Integer.toString(num)
    // .replaceAll("([13579])","-$1-")
    // .replaceAll("--","-")
    // .replaceAll("^-","")
    // .replaceAll("-$","");


    public static String dashatize(int num) {
        long l = Math.abs((long) num);
        String s = String.valueOf(l);
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if (Integer.parseInt(s.substring(i, i + 1)) % 2 != 0) {
                newS += "-" + s.charAt(i) + "-";
            } else newS += s.charAt(i);
            newS = newS.replaceAll("-\\-", "-");
        }
        return newS.charAt(0) == '-' && newS.charAt(newS.length() - 1) == '-' ?
                newS.substring(1, newS.length() - 1) : newS.charAt(0) == '-' ?
                newS.substring(1) : newS.charAt(newS.length() - 1) == '-' ?
                newS.substring(0, newS.length() - 1) : newS;
    }

    public static void main(String[] args) {
        System.out.println(dashatize(5311));
    }
}
