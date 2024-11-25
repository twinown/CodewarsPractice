package java_explanations.composition_agregation;

class Solution_Agregation_Composition {
    public static void main(String[] args) {

        A a = new A();
        a.show(); // будет "A show called"
     //но то же будет при ----> АГРЕГАЦИЯ
        B b = new B(a);
        b.show();// будет "A show called"

        C c = new C(a);
        c.show();

        D d = new D();
       // d.show();//будет ошибка -> NPE ! сначала надо зааттачиться
        d.attach(a);
        d.show();//надо тут

        d.detach(a);
        d.show();//снова будет ошибка !..ты ж понимаешь

        //обычный способ создания объекта
     /*   A one  = new A();
        one.show();*/
        //рефлексия//узнать всю инфу о классе
     //   one.getClass().getName();
        //через рефлексию...этот способ исп андроид, потому что виидит в манифесте твой мэйн активити
       /* try {
            A a = (A) Class.forName("A").newInstance();
            a.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
    }
}

class A {
    void show() {
        System.out.println("A show called");
    }
}
