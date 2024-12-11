
public class CodeWars_224 {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        while(fighter1.health>0||fighter2.health>0){
            if(fighter1.name.equals(firstAttacker)){
                fighter2.health -=  fighter1.damagePerAttack;
                if (fighter2.health<=0) break;
                fighter1.health -=  fighter2.damagePerAttack;
                if (fighter1.health<=0) break;
            } else {
                fighter1.health -=  fighter2.damagePerAttack;
                if (fighter1.health<=0) break;
                fighter2.health -=  fighter1.damagePerAttack;
                if (fighter2.health<=0) break;
            }
        }
        return fighter1.health<=0?fighter2.name:fighter1.name;
    }


    public static class Fighter {
        public String name;
        public int health, damagePerAttack;
        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }


    public static void main(String[] args) {
        System.out.println(declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
    }



}
