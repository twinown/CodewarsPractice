public class CodeWars_216_count_fuel_price_with_discount_per_litre {
    //можно было так, но не оч понятно
    // return litres * (price - Math.min(litres / 2 * 0.05, 0.25));
    public static double fuelPrice(int litres, double pricePerLitre) {
        for(int i = 2;i<=10;i+=2){
            if(litres>=i){
                pricePerLitre-=0.05;
            }
        }
        return litres*pricePerLitre;
    }
}
