public class Q4 {
    public static void main(String[] args) {
        int num = 153; // Example number
        String result = armstrong(num);
        System.out.println(num + " is " + result);
        int num1 = 153;
        String res=arm(num1);
        System.out.println(res);
    }

    public static String armstrong(int num) {
        String numStr = Integer.toString(num);
        int length = numStr.length();
        int sum = 0;

        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += digit * digit * digit;
        }

        if (sum == num) {
            return "an armstrong number";
        } else {
            return "not an armstrong number";
        }
    }
    public static String arm(int n) {
    	int temp=n;
    	int sum=0;
    	while(temp>0) {
    		int digit=temp%10;
    		sum+=Math.pow(digit, 3);
    		temp/=10;
    	}
    	if(sum==n) {
    		return "arm";
    	}else {
    		return "not arm";
    	}
    }
}
