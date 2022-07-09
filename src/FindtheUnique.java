
public class FindtheUnique {
	public static double finduniqe(double arr[]) {
		
		double number1,number2;
		number1=arr[0];
		number2=arr[1];
		
		
		for(int i=2; i<arr.length;i++) {
			if(number1==number2) {
				if(arr[i]!=number1) {
					return arr[i];
				}
			}
			else {
				if(arr[i]==number1) {
					return number2;
				}
				else {
					return number1;
				}
			}
		}
		
		return 0;
		
	}
	
	

	public static void main(String[] args) {
		System.out.println(FindtheUnique.finduniqe(new double[]{1,1,1,2,1,1}));
		System.out.println(FindtheUnique.finduniqe(new double[] {0,0,0.5,0,0}));
		System.out.println(FindtheUnique.finduniqe(new double[] {0,1,0,0,0}));
		System.out.println(FindtheUnique.finduniqe(new double[] {1,0,0,0,0}));
		System.out.println(FindtheUnique.finduniqe(new double[] {1,1,0,0,0}));
		System.out.println(FindtheUnique.finduniqe(new double[] {1,1,0,2,0}));
		
		

	}

}
