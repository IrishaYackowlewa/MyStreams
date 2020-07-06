
import java.util.*;

public class Streams<T extends Collection> {
    List<T> that;

    public Streams(){
        this.that = new ArrayList<>();
    }


    public static<T> Streams of(List<? extends T> list) {
        Streams streams = new Streams();

        for (Object o: list){
            streams.that.add(o);
        }

        return streams;
    }

    public Streams filter(Expression func) {
        Streams streams = new Streams();
        for(Object o : that)
        {
            if (func.isEqual(o))
                streams.that.add(o);
        }
        return streams;
    }

    public Streams transform(List list) {
        this.that = list;
        return this;
    }

    public Map toMap(Expression funcKey, Expression funcValue) {
        Map map = new HashMap();
        for(Object o : this.that)
        {
            map.put(funcKey.isEqual(o),funcValue.isEqual(o));//бред
        }
        return map;
    }
}

interface Expression{
    boolean isEqual(Object n);
}

