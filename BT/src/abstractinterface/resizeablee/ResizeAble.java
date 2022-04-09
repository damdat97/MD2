package abstractinterface.resizeablee;

import abstractinterface.resizeablee.shape.Shape;

public interface ResizeAble<C extends Shape> {
    public abstract void resize(double percent);
}

