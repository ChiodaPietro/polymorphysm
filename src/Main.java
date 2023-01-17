public class Main {


    //Polymorphism is capable to create functions which can receive data of a type we don't expect
    //we give the square inside the parameters instead of a shape, but since the two objects have the same attributes and
    //they are extended, so square inheritance all the methods as well
    //WHEN WE IMPLEMENT OF EXTEND, WE ADD A THING TO THE CLASS,
    //WE CAN USE THAT THING INSIDE THE BIG ONE, shape into SQUARE
    public static void CalculatePerimeter(Shape s){
        int p=0;
        for(int side:s.getSides()){
            p=p+side;
        }
        System.out.println("perimeter "+p);
    }
    public static void main(String[] args) {
        Square square= new Square(new int[]{2,2,2,2}, "red");
        CalculatePerimeter(square);
        /* polymorphism: */
        Shape s=new Square(new int[]{1,1,1,1}, "yellow");

        //WE CAN USE ANY TYPE OF OBJECT
        //Object is the default extended class, it contains the toString method
        Object O= new Square(new int[]{1,1,1,1}, "orange");
    }
}
