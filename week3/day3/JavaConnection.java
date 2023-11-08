package week3.day3;

public class JavaConnection implements DataBaseConnection {
	
	public void connect() {
		System.out.println("This is connect");
		
	}

	public void disconnect() {
System.out.println("This is Disconnect");		
	}

	public void executeUpdate() {
System.out.println("This is executeupdate");		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection obj = new JavaConnection();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();

	}



}
