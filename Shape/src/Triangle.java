
public abstract class Triangle extends Shape
	{
		protected double base;
		protected double height;
		
		public double findArea()
			{
				return (base*height)/2;
			}
		public abstract double findPerimeter();
		
	}
