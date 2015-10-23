
public class RectangleQuadrilateral extends Quadrilateral 
	{
		protected double length;
		protected double width;
		public RectangleQuadrilateral(double l, double w)
		{
			length = l;
			width = w;
		}
		
		public double findPerimeter()
			{
				return (length*2)+(width*2);
			}

		@Override
		public double findArea()
			{
				return length*width;
			}

	}
