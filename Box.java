public class Box {

    double  length , width , depth;
    public Box()
    {  
        length = width = depth = 0;
        
    }
    public Box(double length , double width , double depth)
    {
        this.length = length;
        this.width = width ; 
        this.depth = depth;
    }
    //Cube
    public Box(double len)
    {
      length = width = depth = len ;
    }
    public double volume()
    {
        double vol ; 
        vol  = length*width*depth;
        return vol;
    }
    public static void main(String[] args) {
      
        Box  b1 = new Box();
        Box b2  = new Box(2.1 , 3.2 , 6.4);      
        Box b3  = new Box(4.0); //Cube
        System.out.println("Volume of box(default contructor ): "+ b1.volume());
        System.out.printf("Volume of box(paramterized constructor): %.2f" , b2.volume());
        System.out.println("\nVolume of box(paramterized contructor with one argument): "+ b3.volume());       
    }
}
