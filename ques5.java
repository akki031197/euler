 class ques5 {
	public static void main(String[] args){
		int i = 20;
		while(!checkDivisible(i)) {
			i++;
		}
		System.out.println(i);
	}
	
	public static boolean checkDivisible(int n) {
		for(int i = 1; i < 20; i++) {
			if(n % i != 0) {
				return false;
			}
		}
		return true;
	}
}	