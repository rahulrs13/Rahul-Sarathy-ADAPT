package OOPS;
abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    public String persist() {
		return "FilePersistence";
    }
}
class DatabasePersistence extends Persistence{
    public String persist() {
		return "DatabasePersistence";   	
    }
}
class Persistenceprovider{
	public static Persistence getPersistence() {
		return new FilePersistence();
	}
}
public class Assignment2Q6 {
	public static void main(String[] args) {
		Persistence f = Persistenceprovider.getPersistence();
		System.out.println(f.persist());
	}
}

