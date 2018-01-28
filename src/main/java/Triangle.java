import com.sun.istack.internal.NotNull;

public class Triangle {
    private final Point ptA;
    private final Point ptB;
    private final Point ptC;

    public Triangle(final @NotNull Point ptA, final @NotNull Point ptB, final @NotNull Point ptC) {
        this.ptA = ptA;
        this.ptB = ptB;
        this.ptC = ptC;
    }

    boolean isRightTriangle() {
        double a = distBetweenPt(ptA, ptB);
        double c = distBetweenPt(ptA, ptC);
        double b = distBetweenPt(ptB, ptC);

        if (a != 0 && b != 0 && c != 0) {
            if (a > b && a > c) {
                return isPythagorean(a, b, c);
            } else if (b > a && b > c) {
                return isPythagorean(b, a, c);
            } else if (c > a && c > b) {
                return isPythagorean(c, a, b);
            }
        }
        return false;

    }

    private double distBetweenPt(@NotNull final Point point1, @NotNull final Point point2) {
        double x = Math.pow(point1.getX() - point2.getX(), 2);
        double y = Math.pow(point1.getY() - point2.getY(), 2);
        return Math.sqrt(x + y);
    }

    private boolean isPythagorean(final double gip, final double cat1, final double cat2) {
        return Math.pow(gip, 2) / (Math.pow(cat1, 2) + Math.pow(cat2, 2))<1.00001;
    }
}
