public class CodeWars_62 {
    public static char getGrade(int s1, int s2, int s3) {
        int av = (s1+s2+s3)/3;
        return av>=90&&av<=100?'A':
                av>=80&&av<90?'B':
                        av>=70&&av<80?'C':
                                av>=60&&av<70?'D':'F';
    }
}
