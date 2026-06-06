import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;

 public class HashSetDemo {
    public static void main(String[] args) {

    ArrayList<String> finalCodersArrayList = new ArrayList<>(Arrays.asList("Sofia", "Elisa", "Giulia", "Lina", "Sofia"));

      Set<String> codersSet = new HashSet<>(finalCodersArrayList);
      System.out.println(codersSet);
    }
 }