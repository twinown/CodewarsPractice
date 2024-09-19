import java.util.List;

public class CodeWars_192 {
    /*int number = 0;
        for (int bit : binary)
    number = number << 1 | bit;
        return number;*/

    /*Данный метод преобразует параметр s в int. В параметре radix указывается, в какой системе
    счисления изначально записано число в s, которое необходимо преобразовать в int.*/
    /*String str = Arrays.toString(binary.toArray()).replaceAll("\\D", "");
      return Integer.parseInt(str, 2);*/
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int total = 0;

        for (int i = binary.size() - 1; i >= 0; i--) {
            if (binary.get(i) == 1 && i == binary.size() - 1) {
                total += 1;
            } else if (binary.get(i) == 1 && i == binary.size() - 2) {
                total += 2;
            } else if (binary.get(i) == 1 && i == binary.size() - 3) {
                total += 4;
            } else if (binary.get(i) == 1 && i == binary.size() - 4) {
                total += 8;
            } else if (binary.get(i) == 1 && i == binary.size() - 5) {
                total += 16;
            } else if (binary.get(i) == 1 && i == binary.size() - 6) {
                total += 32;
            }
        }
        return total;
    }
}
