import java.util.ArrayList;
public class Runner
	{

		public static void main(String[] args)
			{
				Shape rt=new RightTriangle(3,9);
				System.out.println("Right Triangle:");
				System.out.println("    Area: "+rt.area);
				
				ArrayList <Shape> Shapes= new ArrayList<Shape>();
				Shapes.add(new RightTriangle(3,9));
				Shapes.add(new EquilateralTriangle(5));
				Shapes.add(new RectangleQuadrilateral(4,5));
				Shapes.add(new TrapezoidQuadrilateral(4,6,3));

			}

	}
