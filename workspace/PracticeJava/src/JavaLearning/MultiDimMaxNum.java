package JavaLearning;

public class MultiDimMaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		/* 2 3 7
		 * 4 1 9
		 * 12 0 11
		 */

		int abc[][]= {{2,3,7},{4,1,9},{12,0,11}};
		int max=abc[0][0];
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if (abc[i][j]>max)
				{
					max=abc[i][j];
				}
			}
		}
		System.out.println(max);
	}

}
