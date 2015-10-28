
public abstract class Shape
	{
		protected double perimeter;
		protected double area;
		public abstract double findPerimeter();
		public abstract double findArea();
		
		public String toString()
			{
				return "Shape[Area: "+findArea()+", Perimeter:"+findPerimeter()+"]";
			
			}
	}
