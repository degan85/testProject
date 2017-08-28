package testNumber;

public class testArray {
	public static void main(String[] args) {
		int[] A = {9,3,9,3,9,7,9};
		
		int count = 0;
		int result = 0;
		ex:for(int i=0;i<A.length;i++){
			for(int j=0;j<A.length;j++){
				if(A[i] == A[j]){
					count += 1;
				}
			}
			if(count%2==1){
				result = A[i];
				break ex;
			}else{
				count=0;
			}
		}
		System.out.println(result);
	}
}
