
public class ArrayDemo2 {
	public static void main(String[] args) {
		//working with arrays

		/*String [] friends = new String[3];
		friends[0] = "Jagriti";
		friends[1] = "Anshuman";
		*/

		String [] friends = {"Jagriti", "Ansuman", "Tarak"};

		for(String friend : friends){
			System.out.println(friend.toUpperCase() + "\t" + friend.toLowerCase());
		}
		
		int [][] marksOfAllStudents = new int [30][3];


		/*for(int i = 0 ; i<marksOfAllStudents.length; i++){
			for(int j = 0; j<marksOfAllStudents[i].length; j++){
				System.out.print(marksOfAllStudents[i][j] + " "); 
			}
			System.out.println();
		}*/
		
	System.out.println("Using Jagged Array --------------");	
		
		int [][] jaggedArray = new int [3][];
		
		jaggedArray[0] = new int [4];
		jaggedArray[1] = new int [5];
		jaggedArray[2] = new int [3];
		
		
		for(int i = 0 ; i<jaggedArray.length; i++){
			for(int j = 0; j<jaggedArray[i].length; j++){
				System.out.print(jaggedArray[i][j] + " "); 
			}
			System.out.println();
		}	
		//assignment use enhanced for loop for printing above jagged array or any 2-d array

	}
}
