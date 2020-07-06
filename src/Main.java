import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Integer> someCollection = new ArrayList<>(Arrays.asList(2, 5,30, 200, 100, 2, 90, 15, 10000, 194, 22, 1995));

        Map m = Streams.of(someCollection)
                .filter(n -> n > 20)
                .transform( )
                .toMap(p -> );

    }
}
