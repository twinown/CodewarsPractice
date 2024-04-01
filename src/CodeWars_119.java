public class CodeWars_119 {
    public static String alphabetWar(String fight){
        fight = fight.toLowerCase();
        int right = 0;
        int left = 0;
        for(int i =0;i<fight.length();i++){
            switch (fight.charAt(i)) {
                case  'w': left+=4;  break;
                case  'p': left+=3;  break;
                case  'b': left+=2;  break;
                case  's': left+=1;  break;
                case  'm': right+=4; break;
                case  'q': right+=3; break;
                case  'd': right+=2; break;
                case  'z': right+=1; break;
            }
        }
        return right>left?"Right side wins!": right<left?"Left side wins!":
                "Let's fight again!";
    }

    public static void main(String[] args) {
        System.out.println(alphabetWar("wwwwwwz"));
    }
}
