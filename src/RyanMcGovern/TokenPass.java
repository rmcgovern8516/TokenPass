package RyanMcGovern;

public class TokenPass {
    private int[] board;
    private int currentPlayer;


    public TokenPass(int playerCount)
    {
        board = new int[playerCount];
        this.currentPlayer = (int)(Math.random()*playerCount);
        for (int i=0; i<playerCount; i++){
            board[i] = (int)(Math.random()*10)+1;
        }
    }

    public int[] getBoard(){
        return board;
    }

    public int getCurrentPlayer() {
        return currentPlayer+1;
    }

    public void distributeCurrentPlayerTokens()
    {
        int currentTokens = board[currentPlayer];
        board[currentPlayer] = 0;
        while (currentTokens>0){
            for (int i=0; i<board.length; i++)
            {
                if (currentTokens>0)
                {
                    board[i]++;
                    currentTokens--;
                }
                else
                {
                    i = board.length;
                }
            }

        }
    }
}