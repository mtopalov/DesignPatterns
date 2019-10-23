package com.scalefocus.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Class that caches objects of type {@link Shape} into a {@link HashMap} and returns clones of these objects.
 *
 * @author Mariyan Topalov
 */
public class ShapeCache {

    private static final Map<Integer, Shape> shapeMap = new HashMap<>();

    /**
     * Return a clone of the actual {@link Shape} object.
     *
     * @param id {@link int} - parameter used to determine which {@link Shape} to be returned.
     * @return {@link Shape} - clone of the actual {@link Shape} object.
     * @see Object#clone()
     */
    public static Shape getShape(int id) {
        Shape cachedShape = shapeMap.get(id);
        return (Shape) cachedShape.clone();
    }

    /**
     * Saves objects of type {@link Shape} into a {@link HashMap}
     */
    public static void loadCache() {
        Circle circle = new Circle(1);
        shapeMap.put(circle.getId(), circle);

        Square square = new Square(2);
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle(3);
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
