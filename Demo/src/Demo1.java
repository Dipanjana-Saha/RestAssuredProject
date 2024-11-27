
public class Demo1 {

	public static void main(String[] args) {
		
			boolean gameOver = true;
	        int score = 800;
	        int levelCompleted = 5;
	        int bonus = 100;
	 
	        int finalScore = score;
	 
	        int highScore=calculateScore(gameOver,score,levelCompleted,bonus);//from where these two var get value 
	        System.out.print(highScore);	       
	        int score1 = 10000;
	        int levelCompleted1 = 8;
	        int bonus1 = 200;
	        calculateScore(gameOver,score1,levelCompleted1,bonus1);
	}
	 
	       
	        public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus) {
    	
		
	        int finalScore= score;
		 
		        
		 
		        if (gameOver) {
		            finalScore += (levelCompleted * bonus);
		            finalScore += 1000;
		            System.out.println("Your final score was " + finalScore);

	    }
				return finalScore;}}
