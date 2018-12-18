package RyanMcGovern;

public class TokenPass {
    private int[] board;
    private int currentPlayer;


    public void TokenPass(int playerCount){
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
        return currentPlayer;
    }

    public void distributeCurrentPlayerTokens(){
        
    }
}