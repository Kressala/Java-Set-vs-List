import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

 public class HashSetDemo {
    public static void main(String[] args) {

    List<String> finalCodersList = new ArrayList<>();
      finalCodersList.add("Sofia");
      finalCodersList.add("Claudio");
      finalCodersList.add("Mario");
      finalCodersList.add("Bea");
      finalCodersList.add("Mario");
      System.out.println(finalCodersList);

      Set<String> codersSet = new HashSet<>(finalCodersList);
      System.out.println(codersSet);
    }
 }