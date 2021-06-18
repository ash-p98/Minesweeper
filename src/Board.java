public class Board {

    public static int rows = 8;
    public static int col = 8;
    public static int bombs = 10;


    public static void boardCreation(){
        String[][] board = new String[rows][col];
        for (int h = 0; h < board.length; h++){
            for (int w = 0; w < board.length; w++){
                board[h][w] = "- ";
                System.out.print(board[h][w]);
            }
            System.out.println();
        }
    }


}
