public class CodeWars_158 {
    private final double draft;
    private final int crew;
    public CodeWars_158(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    public boolean isWorthIt(){
        return (draft - (double)crew*1.5)>20;
    }

    public static void main(String[] args) {
        CodeWars_158 ship = new CodeWars_158(40 , 5);
        System.out.println(ship.isWorthIt());
    }
}
