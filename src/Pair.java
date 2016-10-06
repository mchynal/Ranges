/**
 * Created by Marcin.Chynal on 2016-10-04.
 */
public class Pair<T, U> {
    private T left;
    private U right;

    public Pair() {
    }

    public Pair(T left, U right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public void setLeft(T left) {
        this.left = left;
    }

    public U getRight() {
        return right;
    }

    public void setRight(U right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return String.format("(%s,%s)", left, right);
    }
}
