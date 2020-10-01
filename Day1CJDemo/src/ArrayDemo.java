
public class ArrayDemo {
	public static void main(String[] args) {
		System.out.println("WElcome to Java World");
		
		//working with arrays
		
		int marks1 = 90, marks2 = 88,marks3 = 95;
		int total = 0;
		//int marks[] = new int[3];
		int [] marks = new int[3];
		
		marks[0] = 88;
		marks[1] = 86;
		marks[2] = 90;
		
		//System.out.println(marks[0]);
		//System.out.println(marks[1]);
		System.out.println(marks[3]);
				
		for(int i = 0; i<marks.length; i++) {
			total = total + marks[i];
			System.out.println(marks[i]);
		}
		
		System.out.println("Total marks: " +total);
		
		//enhanced for loop 
		System.out.println("Using enhanced for loop-------");
		int sum = 0;
		for(int m  : marks ) {
			System.out.println(m);
			sum = sum + m;
		}
		
		System.out.println("Sum is  "  + sum);
		
		
	}
}
