import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RangeBuilder2 {


    public static List<Range> split(List<Integer> list) {

        List<List<Integer>> result = new LinkedList<>();
        result.add(new LinkedList<>());

        list.stream().map(p -> {
            int i = list.indexOf(p);
            return new Pair<>(p, i + 1 < list.size() ? list.get(i + 1) : 999999999);
        }).forEach(p -> {
            result.get(result.size() - 1).add(p.getLeft());
            if (p.getRight() - p.getLeft() > 1) {
                result.add(new LinkedList<>());
            }
        });

        return result.stream().filter(g -> !g.isEmpty()).map(Range::new).collect(Collectors.toList());
    }


}
