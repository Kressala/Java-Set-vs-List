import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayList {

    public static void main(String[] args) {

     // Creamos un ArrayList que va a contener Strings   
    
        ArrayList<String> codersArrayList = new ArrayList<>(Arrays.asList("Sofia", "Elisa", "Giulia", "Lina", "Sofia"));

        System.out.println(codersArrayList);
        System.out.println(codersArrayList.get(3));
    }
}