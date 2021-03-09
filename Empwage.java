public class Empwage{ 
	public static void main(String args[]){
	int IS_FULLTIME=1;
		double empchk=Math.floor(Math.random() *10 %2);
		if(empchk == IS_FULLTIME)
			System.out.println("Employee is present");
		else
		System.out.println("Employee is absent");
}
}
