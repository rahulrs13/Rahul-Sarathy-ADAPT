package BasicDataStructures;
class ResultDeclaration {
public String declareResults( int subject1Marks, int subject2Marks, int subject3Marks){
	if((subject1Marks+subject2Marks+subject3Marks)>60)
	{
		System.out.println("Passed");
	}
	if(((subject1Marks+subject2Marks)|(subject2Marks+subject3Marks)|(subject3Marks+subject1Marks))>60)
	{
		System.out.println("Promoted");
	}
	else
	{
		System.out.print("Failed");
	}
	return null;
	}
}
public class Assignment1Q4 {
	public static void main(String[] args) {
		ResultDeclaration obj = new ResultDeclaration();
		obj.declareResults(10, 20, 40);
	}
}
