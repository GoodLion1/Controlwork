public interface Shape {

    double getArea();

    public abstract class ShapeAbs implements Shape {

        @Override
        public double getArea() {
            return 0;
        }

    }
}
