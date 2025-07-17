package JavaLearning;

public class MultiDimRowMinColumnMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 2 4 5
		 * 3 0 7
		 * 1 2 -1
		 */
		//Find maximum number from column whose

		int abc[][]= {{2,4,5},{3,0,7},{1,2,-1}};
		int minrow=abc[0][0];
		int lowcol=0;


		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if (abc[i][j]<minrow)
				{
					minrow=abc[i][j];
					lowcol=j;
				}
			}
		}

		int maxcol=abc[0][lowcol];
		int k=0;
		while (k<3)
		{
			if (abc[k][lowcol]>maxcol)
			{
				maxcol=abc[k][lowcol];

			}
			k++;
		}
		System.out.println(maxcol);
	}

}
