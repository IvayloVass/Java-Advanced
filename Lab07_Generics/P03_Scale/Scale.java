package Lab07_Generics.P03_Scale;

public class Scale<T extends Comparable<T>> {

    public T left;
    public T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier() {
        int result = left.compareTo(right);
        if (result > 0) {
            return left;
        } else if (result < 0) {
            return right;
        }
        return null;
    }
}
