
public class ShapeShifter {
	
	public static void main(String[] args) {
		introduceLine("HorizontalLine");
		drawHorizontalLine();
		introduceLine("VerticalLine");
		drawVerticalLine();
		introduceLine("UpTriangle");
		drawUpTriangle();
		introduceLine("Rectangle");
		drawRectangle();
		introduceLine("Square");
		drawSquare();
		introduceLine("DownTriangle");		
		drawDownTriangle();
		introduceLine("House");
		drawUpTriangle();
		drawRectangle();
		introduceLine("Flag");
		drawUpTriangle();
		drawVerticalLine();
		drawVerticalLine();
		drawVerticalLine();
		introduceLine("Tower");
		drawHorizontalLine();
		drawSquare();
		drawSquare();
		drawSquare();
	}

	public static void introduceLine(String x) {
		System.out.println("\n");
		System.out.println("This is the " + x + ": ");
		System.out.println("\n");
	}
	//This method will display a horizontal line using asterisks
	public static void drawHorizontalLine() {
		System.out.println("*********");		 
	}
	// This method will display a vertical line using asterisks
	public static void drawVerticalLine() {
		System.out.println("*");   
		System.out.println("*");
		System.out.println("*");
	}

	// This method will display a triangle pointed up using asterisks
	public static void drawUpTriangle() {
		System.out.println("*");
		System.out.println("*   *");
		System.out.println("*     *");
		System.out.println("*********");
	}

	// This method will display a rectangle using asterisks
	public static void drawRectangle() {
		System.out.println("*********");
		System.out.println("*       *");
		System.out.println("*       *");
		System.out.println("*********");		 
	}

	// This method will display a square using asterisks
	public static void drawSquare() {
		System.out.println("* *");
		System.out.println("* *");		 
	}
	
	// This method will display a triangle pointed down using asterisks
	public static void drawDownTriangle() {
		System.out.println("*********");
		System.out.println("*     *");
		System.out.println("*   *");
		System.out.println("*");

	}
	
}
