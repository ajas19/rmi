import java.rmi.Naming;

class CalServer{
	public static void main(String[]args){
		try{ 
			CalImp c= new CalImp();
			Naming.rebind("hello",c);
			System.out.println("Server is initialized");

		}catch(Exception e){
			System.out.println("Error : "+e);
		}


	}
}