package arrayInJava;

/*2 4 5

3 4 7

1 2 9*/
//Maximum number from the array
public class FindMaxNumberInArrayColumn {

	public static void main(String[] args) {
		int a[][] = {{2,4,5}, {3,2,10}, {1,2,19}};
		int min=a[0][0];
		int mincoloumn = 0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++) {
					if(a[i][j]<min){//2
						min=a[i][j];
						mincoloumn=j;
					}
				}
		}
		
		System.out.println(min);
		
		int max=a[0][mincoloumn];
		int k = 0;
		while(k<3)
		{
		if(a[k][mincoloumn]>max)
		{
		max=a[k][mincoloumn];
		}
		k++;
		}

		System.out.println(max);
		
	}
}	