package day49_Abstraction.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle = new Circle(23);
        Rectangle rectangle = new Rectangle(10,20);
        Cube cube = new Cube(15);
        Cylinder cylinder = new Cylinder(2,5);
        Square square = new Square(50);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(cube);
        System.out.println(cylinder);
        System.out.println(square);

        System.out.println(circle.getR());

        System.out.println(rectangle.getW());

        System.out.println("----------------------------------------------");
       // Shape shape1 = circle;
       // Shape shape2 = rectangle;
       // Shape shape3 = cylinder;
       // Shape shape4 = cube;
       // Shape shape5 = square;

        Shape[] shapes = {circle, rectangle, cube, cylinder, square, new Circle(5), new Square(3),
            new Circle(10), new Circle(15)};

        for(Shape eachShape   : shapes) {
            if(eachShape.name.equals("Circle")){
                System.out.println(eachShape);
            }
        }


        System.out.println("---------------------------------------------------------------------");






    }
}
