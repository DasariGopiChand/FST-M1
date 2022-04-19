import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4,5,3,2,1};

		System.out.println("Arrays before sorting : "+Arrays.toString(a));

		int[] c= sortingArrays(a);

		System.out.println("Arrays after sorting : "+Arrays.toString(c));
	}

	private static int[] sortingArrays(int[] d) {
		// TODO Auto-generated method stub

		for (int i=0 ;i<d.length-1;i++) {

			for (int j=i+1; j<d.length;j++) {

				if(d[i]>d[j]) {

					int temp = d[i];
					d[i]=d[j];
					d[j]=temp;

				}
			}
		}
		return d;
	}



}
