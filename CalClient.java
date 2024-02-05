import java.rmi.Naming;

class CalClient{
	public static void main(String[]args){
		try{ 
			//Create an object using interface
			CalIn cal=(CalIn)Naming.lookup("num1");

			cal.add(n1,n2);
			cal.sub(n1,n2);
			cal.mul(n1,n2);
			cal.div(n1,n2);

			System.out.println("Asnwer= "+cal.add(n1,n2));

			cal.sub(10,20);
			System.out.println("Asnwer= "+cal.add(n1,n2));

			cal.mul(10,20);
			System.out.println("Asnwer= "+cal.add(n1,n2));

			cal.div(10,20);
			System.out.println("Asnwer= "+cal.add(n1,n2));




			

			

		}catch(Exception e){
			System.out.println("Error : "+e);
		}


	}
}