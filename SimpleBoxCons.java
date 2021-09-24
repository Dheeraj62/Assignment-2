public class SimpleBoxCons
{
    private double length , width , depth;
    public SimpleBoxCons(double length  ,double width , double depth)
    {
        this.length   = length ;
        this.width = width; 
        this.depth = depth;
    }
    public double getLength()
    {
        return length ;
    }
    public double getBreadth()
    {
        return width;
    }
    public double getHeight()
    {
        return depth;
    }
    public double volume()
    {
        double volume ;
        volume = length *width*depth;
        return volume;
    }
 	public static void main(String[] args) {
	    double volume1,volume2;
		SimpleBoxCons box1 = new SimpleBoxCons(2,3,4);
		SimpleBoxCons box2 = new SimpleBoxCons(5,4,6);
		volume1 = box1.volume();
		volume2 = box2.volume();
		System.out.println("Box 1 dimensions : ");
		System.out.println("Length : " + box1.getLength() + "\nBreadth : " + box1.getBreadth()+ "\nHeight : "
		+ box1.getHeight());
        System.out.println("\nVolume 1 : "+volume1);
		System.out.println("\nBox 2 dimensions : ");
		System.out.println("Length : " + box2.getLength() + "\nBreadth : " + box2.getBreadth()+ "\nHeight : "
		+ box2.getHeight());
	    System.out.println("\nVolume 2 : "+volume2);
	 
	}
}
