import java.awt.*;

/**
 * Somut fabrika siniflarinin turune gore Shape nesneleri uretilmesini saglar
 */
public class ShapeFactory {
    public static Shape getShape(ShapeAbstractFactory factory){
        return factory.createShape();
    }
}
