import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
       
        List<Integer> Myarray = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));

        
        Collections.shuffle(Myarray);

        
        System.out.println("Shuffled Array: " + Myarray);
    }
}
//out put is Shuffled Array: [7, 3, 5, 6, 1, 2, 4]