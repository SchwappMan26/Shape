
public class TrapezoidQuadrilateral extends Quadrilateral
	{
		protected double base1;
		protected double base2;
		protected double side;
		protected double height;
		
		public TrapezoidQuadrilateral(double b1, double b2, double h)
			{
				base1 = b1;
				base2 = b2;
				height = h;
			}
		@Override
		public double findPerimeter()
			{
				return base1+base2+(2*(Math.sqrt(Math.pow((Math.abs(base1 - base2) / 2), 2) + Math.pow(height, 2))));
			}

		@Override
		public double findArea()
			{
				return ((base1+base2)/2)*height;
			}
		
	}
