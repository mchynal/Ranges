import com.sun.xml.internal.ws.util.StreamUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class RangeBuilder {

    private static List<Range> result = new LinkedList<>();

    public static List<Range> split(List<Integer> list) {
        result.add(new Range());

        list.stream().forEachOrdered(p -> {
            Range curr = result.get(result.size() - 1);

            if (curr.getBegin() == null) {
                curr.setBegin(p);
                curr.getNumbers().add(p);
                return;
            }

            if (curr.getBegin() != null && curr.getEnd() == null && curr.getBegin() == p - 1) {
                curr.setEnd(p);
                return;
            }

            if (curr.getBegin() != null && curr.getEnd() != null && curr.getEnd() == p - 1) {
                curr.setEnd(p);
                return;
            }

            if (curr.getBegin() != null && curr.getEnd() != null && curr.getEnd() < p - 1) {
                result.add(new Range(p));
                return;
            }

            if (curr.getBegin() != null && curr.getEnd() == null && curr.getBegin() < p - 1) {
                result.add(new Range(p));
                return;
            }
        });

        result.stream().filter(p -> p.getEnd()==null).forEach(p -> p.setEnd(p.getBegin()));

        return result;
    }


}
