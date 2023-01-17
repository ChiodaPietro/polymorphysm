

public class Square extends Shape implements Apperance{
    private String color;
    public Square(int[] sides, String color){
        super(sides);
        this.color=color;
    }
    public String WhatAmI(){
        return "Square";
    }

    @Override
    public String getColor() {
        return color;
    }
}
