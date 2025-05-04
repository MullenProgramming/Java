class Solution {
    public int countBattleships(char[][] board) {
        int numShips = 0;
        // int numRows = board.length;
        // int numColumns = board[0].length;

        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[0].length; col++){
                if(board[row][col] == '.') continue; // skip empty spaces.
                if(row > 0 && board[row-1][col] == 'X') continue; // vertical ship
                if(col > 0 && board[row][col-1] == 'X') continue; // horizontal ship
                numShips++; // found the start of a new ship.
            }
        }

        // boolean isShip = false;

        // // Take care of edge cases
        // if(numRows < 2){
        //     if(numColumns < 2){
        //         if(board[0][0] == '.'){
        //             return 0;
        //         } else {
        //             return 1;
        //         }
        //     } else {
        //         for(int i = 1; i <= numColumns; i++){
        //             if(board[0][i-1] == '.'){
        //                 if(isShip){
        //                     numShips++;
        //                     isShip = false;
        //                 }
        //             } else {
        //                 isShip = true;
        //             }
        //         }
        //         // If row ends with an x, ensures the last ship is counted.
        //         if(isShip) numShips++;
        //     }
        // } else {
        //     if(numColumns < 2){
        //         for(int j = 1; j <= numRows; j++){
        //             if(board[j-1][0] == '.'){
        //                 if(isShip){
        //                     numShips++;
        //                     isShip = false;
        //                 }
        //             } else {
        //                 isShip = true;
        //             }
        //         }
        //         // If column ends with an x, ensures the last ship is counted.
        //         if(isShip) numShips++;
        //     } else {
        //         for(int row = 0; row < numRows; row++){
        //             for(int col = 0; col < numColumns; col++){
        //                 if(board[row][col] == '.') continue; // skip empty spaces.
        //                 if(row > 0 && board[row-1][col] == 'X') continue; // vertical ship
        //                 if(col > 0 && board[row][col-1] == 'X') continue; // horizontal ship
        //                 numShips++; // found the start of a new ship.
        //             }
        //         }
        //     }
        // }
        return numShips;
    }
}
