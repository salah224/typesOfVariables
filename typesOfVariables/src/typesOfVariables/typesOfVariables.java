package typesOfVariables;

public class typesOfVariables {
	public static int staticVariable;
	
	int instancevariable;
	
	public void printValue(){
		int localVariable = 0;
		
		System.out.println("the value of staticVariable \t" + staticVariable);
		System.out.println("the value of  instanceVariable \t" + instancevariable );
		System.out.println("the value if localVariable\t " + localVariable);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		typesOfVariables boject = new typesOfVariables();
		boject.printValue();

	}

}
