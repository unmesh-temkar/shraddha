package JavaLearning;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array=collection of same datatype
		
		int a[] = new int[5];//Declare an array and allocates memory for the values
		a[0]=2;//Initialized values into array
		a[1]=5;
		a[2]=7;
		a[3]=9;
		a[4]=15;
		int b[]= {1,4,5,6,19};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);//Retrieve values present in this array
		}
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);//Retrieve values present in this array
		}
		
		
	}

}
