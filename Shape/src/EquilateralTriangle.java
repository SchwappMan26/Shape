
public class EquilateralTriangle extends Triangle
	{
		public EquilateralTriangle(double b)
			{
				base= b;
			}
		@Override
		public double findPerimeter()
			{
				return base*3;
			}

		@Override
		public double findArea()
			{
				return ((Math.sqrt(3)/4)*Math.pow(base, 2));
			}
		
	}
