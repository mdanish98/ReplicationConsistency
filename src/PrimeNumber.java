
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int process = 10;
		int max_number = 100;
		int step = max_number/process;
		for(int i = 1; i <= max_number; i += step) {
			final int k = i;
			new Thread("" + i){
		        public void run(){
		          calculatePrime(k, (k + step) - 1);
		        }
		      }.start();
		}
	}
	
	public static void calculatePrime(int start, int end) {
		//System.out.println("Start : " + start + " End : " + end);
		for(int i = start; i <= end; i++) {
			//System.out.println("Inside Main For Loop : " + i);
			if(i <= 1) {
				continue;
			}
			else if(i == 2) {
				System.out.println("Prime Number : " + i);
				continue;
			}
			
			else if(i % 2 == 0) {
				continue;
			}
			int flag = 0;
			for(int k = 3; k <= Math.sqrt(i); k += 2) {
				if(i % k == 0) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println("Prime Number : " + i);
			}
		}
	}


}
