
public class RightTriangle extends Triangle
	{
		public RightTriangle(double b, double h)
			{
				base = b;
				height = h;
			}

		public double getHypotenuse()
			{
				return (Math.sqrt(Math.pow(base,2)+Math.pow(height,2)));	
			}
		@Override
		public double findPerimeter()
			{
				return base+height+getHypotenuse();
			}
		

	}
