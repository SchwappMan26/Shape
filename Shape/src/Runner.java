import java.util.ArrayList;
public class Runner
	{

		public static void main(String[] args)
			{
				Shape rt=new RightTriangle(3,9);
				System.out.println("Right Triangle:");
				System.out.println("    Area: "+rt.findArea());
				System.out.println("    Perimeter: "+ rt.findPerimeter());
				
				Shape et=new EquilateralTriangle(5);
				System.out.println("Equilateral Triangle:");
				System.out.println("    Area: "+et.findArea());
				System.out.println("    Perimeter: "+et.findPerimeter());
				
				Shape rq=new RectangleQuadrilateral(4,5);
				System.out.println("Rectangle:");
				System.out.println("    Area: "+rq.findArea());
				System.out.println("    Perimeter:"+rq.findPerimeter());
				
				Shape tq=new TrapezoidQuadrilateral(4,6,3);
				System.out.println("Trapezoid:");
				System.out.println("    Area: "+tq.findArea());
				System.out.println("    Perimeter: "+tq.findPerimeter());
				System.out.println();
				
				ArrayList <Shape> Shapes= new ArrayList<Shape>();
				Shapes.add(rt);
				Shapes.add(et);
				Shapes.add(rq);
				Shapes.add(tq);
				
				for(Shape fred: Shapes)
					{
						System.out.println(fred);
					}

			}

	}
