
public class Circle implements Shape {

        private double radius;

        public Circle(double r){
            this.radius = r;
        }


        @Override
        public double getArea(){
            // Вычисляем площадь
            return Math.PI*this.radius*this.radius;
        }

        public double getRadius(){
            return this.radius;
        }
    }

