public class CodeWars_257 {
    public static String[] removeRotten(String[] fruitBasket) {
        if (fruitBasket != null) {
            for (int i = 0; i < fruitBasket.length; i++) {
                fruitBasket[i] = fruitBasket[i].replace("rotten", "").toLowerCase();
            }
        }
            return fruitBasket == null || fruitBasket.length == 0 ? new String[]{} : fruitBasket;
        }
    }

