class cube
{
	int width;
	int height;
	int depth;
	
	// constructor which needs all parameter
	public cube(int width, int height, int depth) 
	
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	

	// constructor which needs only 2 parameter
	
    public cube(int width, int height) 
	
	{
		this.width = width;
		this.height = height;
		this.depth = 10;         //it has default value
	}
    
    //constructor which all has to be taken a same value
    
     public cube(int value) 
	
	{
		this.width = value;
		this.height = value;
		this.depth = value;
	}
	
	//constructor all has constant values
     
     public cube()
 	
 	{
 		this.width = 2;
 		this.height = 3;
 		this.depth = 2;
 	}
     
     int volume()
     {
    	 return width*height*depth;
     }
}

public class Cuboid 

{

	public static void main(String[] args) 
	
	{
		int volume;
		cube all=new cube(2,5,3);
		volume=all.volume();
		System.out.println("The value is "+volume);
		
		
		cube only2=new cube(2,3);
		volume=only2.volume();
		System.out.println("The value is "+volume);
		
		cube same=new cube(2);
		volume=same.volume();
		System.out.println("The value is "+volume);
		
		cube def=new cube();
		volume=def.volume();
		System.out.println("The value is "+volume);
	}

}
