import java.awt.*;

/**
 * Circle sinifi icin fabrika sinifi
 */
public class CircleFactory implements ShapeAbstractFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}