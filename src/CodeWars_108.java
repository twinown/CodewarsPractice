import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeWars_108 {
    public static List<String> number(List<String> lines) {
       /* Array.asList()- это просто обертка над массивом с интерфейсом List.А массивы
        имеют фиксированный размер, поэтому добавление
        и удаление элементов не поддерживается.Если вы хотите заполнить
        List значениями из массива, то делайте так:
        List list = new ArrayList(Arrays.asList(1,2,3));*/
        List<String> newLines = new ArrayList<>();
        for (int i = 0;i<lines.size();i++){
             newLines.add(i + 1 + ": "+ lines.get(i));
        }
        return newLines;
    }

    public static void main(String[] args) {
        System.out.println(number(Arrays.asList("a","b","c")));
    }
}
