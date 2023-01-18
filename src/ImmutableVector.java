public class ImmutableVector<X extends Comparable<X>, Y extends Comparable<Y>, Z extends Comparable<Z>> implements Comparable<ImmutableVector<X, Y, Z>> {
    public final X x;
    public final Y y;
    public final Z z;

    public ImmutableVector(X x, Y y, Z z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int compareTo(ImmutableVector<X, Y, Z> o) {
        if (z.compareTo(o.z) > 0) {
            return 3;
        } else if (z.compareTo(o.z) < 0) {
            return -3;
        } else if (y.compareTo(o.y) > 0) {
            return 2;
        } else if (y.compareTo(o.y) < 0) {
            return -2;
        } else if (x.compareTo(o.x) > 0) {
            return 1;
        } else if (x.compareTo(o.x) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
