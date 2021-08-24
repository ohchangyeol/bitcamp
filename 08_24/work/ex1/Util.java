public class Util{
	//Field 
	int n;
	int[] tempArray;
	int primeCount;
	
	//consturctor
	public Util(){}
	
	//Method
	public int findPrimeCount(int limit){
		for (int i = 2;i <= limit ;i++ ){
			boolean isPrime = false;		
			for (int j = 2 ; j < i; j++){
				if (i % j == 0){
					isPrime = true;
				}		
				continue;
			}
			if (isPrime == false){
				primeCount++;
			}
		}
		tempArray = new int[primeCount];
		return primeCount;
	}
	public int[] findPrimeReturnArray(int limit){
		primeCount = 0 ;
		for (int i = 2;i <= limit ;i++ ){
			boolean isPrime = false;		
			for (int j = 2 ; j < i; j++){
				if (i % j == 0){
					isPrime = true;
				}		
				continue;
			}
			if (isPrime == false){
				tempArray[primeCount] = i;
				primeCount++;
			}
		}
		return tempArray;
	}
}