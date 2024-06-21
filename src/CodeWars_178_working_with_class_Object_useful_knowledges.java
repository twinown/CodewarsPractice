public class CodeWars_178_working_with_class_Object_useful_knowledges {
    public static Boolean fromYou(Object o) {
    //    Class<?> componentType = o.getClass().getComponentType();
       // int[] newIntArray = (int[]) o;
      //  o.getClass().isArray()
        //componentType==int.class


      return true ;
    }

    public static void main(String[] args) {
        System.out.println(fromYou(new int[]{1,2,3}));
    }


}
