public class CodeWars_173 {
    public static Human[] create(){
        return new Human []{new Man(),new Woman()};
    }
}
 class Human{}
 class Woman extends Human{}
 class Man extends Human{}