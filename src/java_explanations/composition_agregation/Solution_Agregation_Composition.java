package java_explanations.composition_agregation;

class Solution_Agregation_Composition {
    public static void main(String[] args) {

        //эта штука для агрегации и типо для гибрида (?), потому что ф инициализируется отдельно
        //то есть жизненный цикл зависимого объекта не зависит от владельца
        A a = new A();
        a.show(); // будет "A show called"
        //но то же будет при ----> АГРЕГАЦИЯ
        //конструктор B не содержит объект А,лишь ссылку на него, потому вызываем шоу
        B b = new B(a);
        b.show();// будет "A show called"

        //реализация композиции
        //то есть жизненный цикл зависимого объекта полностью зависит от владельца
        //конструктор С содержит объект А, потому вызываем шоу
        C c = new C();
        c.show(); // будет "A show called"

        //андроид тема
        D d = new D();
       // d.show();//будет ошибка -> NPE ! сначала надо зааттачиться
        d.attach(a);
      //  d.show();//надо тут

        d.detach(a);
    //    d.show();//снова будет ошибка !..ты ж понимаешь

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
