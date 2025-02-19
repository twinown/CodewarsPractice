public class CodeWars_264 {
    public String slope(int[] points){
        return points[2]-points[0]==0?"undefined":
                        (points[3]-points[1])/(points[2]-points[0])>=0?
                                String.valueOf((points[3]-points[1])/(points[2]-points[0])):
                                "undefined";
    }

   
}
