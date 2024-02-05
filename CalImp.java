import java.rmi.*;
import java.rmi.server.*;

class CalImp extends UnicastRemoteObject implements CalIn {
	
	public CalImp() throws RemoteException{
		super();
	}

	public int add(int n1,int n2) throws RemoteException{
		return n1+n2;
	}
	public int sub(int n1,int n2) throws RemoteException{
		return n1-n2;
	}
	public int mul(int n1,int n2) throws RemoteException{
		return n1*n2;
	}
	public int div(int n1,int n2) throws RemoteException{
		return n1/n2;
	}


	

	

	
}
