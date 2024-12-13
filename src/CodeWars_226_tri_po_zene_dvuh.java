public class CodeWars_226_tri_po_zene_dvuh {
    public static int mango(int quantity, int price){
        return (quantity-(quantity/3))*price;
    }

    public static void main(String[] args) {
        System.out.println(mango(2,3));
    }
}
