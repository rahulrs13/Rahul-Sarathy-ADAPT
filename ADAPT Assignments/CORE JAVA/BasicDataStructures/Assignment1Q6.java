package BasicDataStructures;
class Login{
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {    
	int attempts = 3;
	if (attempts!=0)
	{
		if (userId == "Ajay" && password == "password")
		{
			System.out.print("Welcome Ajay");
		}
		else
		{
	   System.out.print("You have entered wrong credentials ,please enter the right credentials.");
		}	
	}
	else
	{
		System.out.print("Contact Admin");
	}
	return pass;
    }
}
public class Assignment1Q6 {
	public static void main(String[] args) {
		Login obj = new Login();
		obj.loginUser("Ajay", "password");
		}
}
