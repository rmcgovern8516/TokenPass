package RyanMcGovern;

public class TokenPassRunner {

    public static void main(String[] args) {
	// write your code here
        TokenPass testGame = new TokenPass();
        int[] testBoard = testGame.getBoard();
        System.out.println("Constructed a testBoard: ");
        for (int i=0; i<testBoard.length; i++){
            System.out.println(testBoard[i]+" ");
        }
        System.out.println();

        testGame.distributeCurrentPlayerTokens();
        System.out.println("After distributing tokens from player "+testGame.getCurrentPlayer()+": ");
        for (int i=0; i<testBoard.length; i++){
            System.out.println(testBoard[i]+" ");
        }
    }
}
