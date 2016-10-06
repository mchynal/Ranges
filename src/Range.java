import java.util.LinkedList;
import java.util.List;

public class Range {

    private Integer begin;
    private Integer end;
    private List<Integer> numbers = new LinkedList<>();

    public Range() {
    }

    public Range(List<Integer> numbers) {
        this.begin = numbers.get(0);
        this.end = numbers.get(numbers.size()-1);
        this.numbers = numbers;
    }

    public Range(Integer begin) {
        this.begin = begin;
        numbers.add(begin);
    }

    public Integer getBegin() {
        return begin;
    }

    public void setBegin(Integer begin) {
        this.begin = begin;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
        if(!numbers.contains(end)) {
            numbers.add(end);
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Range{" +
                "begin=" + begin +
                ", end=" + end +
                ", numbers=" + numbers +
                '}';
    }
}
