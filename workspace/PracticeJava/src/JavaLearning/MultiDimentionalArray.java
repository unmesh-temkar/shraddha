package JavaLearning;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//a[row][column]

		int a [][]= new int [2][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=6;
		a[1][0]=8;
		a[1][1]=10;
		a[1][2]=12;

		//System.out.println(a[1][0]);

		int b[][]= {{9,18,27},{36,45,54}};
		//System.out.println(b[1][1]);

		for (int i=0;i<2;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println("");
		}
	}

	/*2 4 6
	 8 10 12*/   //a

	/*9 18 27
	  36 45 54*/   //b

}

