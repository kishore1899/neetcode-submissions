class Solution {
    public boolean isValidSudoku(char[][] board) {

        Map<Integer, HashSet<Character>> columnMap = new HashMap<>();
        Map<Integer, HashSet<Character>> squreMap = new HashMap<>();

        for (int row = 0; row < 9; row++) {
            HashSet<Character> rowSet = new HashSet<>();
            for (int column = 0; column < 9; column++) {
                int sqMapIndex = (row / 3) * 3;
                HashSet<Character> columnSet;
                char currentValue = board[row][column];
                //Skip '.'
                if (currentValue == '.') {
                    continue;
                }
                //Check if the num is repeated in the row.
                if (rowSet.contains(currentValue)) {
                    return false;
                }
                rowSet.add(currentValue);

                columnSet = columnMap.get(column);
                if (columnSet != null) {
                    //Check if the num is repeated in the column.
                    if (columnSet.contains(currentValue)) {
                        return false;
                    }
                    columnSet.add(currentValue);
                } else {
                    columnSet = new HashSet<>();
                    columnSet.add(currentValue);
                }
                columnMap.put(column, columnSet);

                sqMapIndex += (column / 3);
                HashSet<Character> sqSet;
                sqSet = squreMap.get(sqMapIndex);

                //Check if the num is repeated in the squares.
                if (sqSet != null) {
                    if (sqSet.contains(currentValue)) {
                        return false;
                    }
                    sqSet.add(currentValue);
                } else {
                    sqSet = new HashSet<>();
                    sqSet.add(currentValue);
                }
                squreMap.put(sqMapIndex, sqSet);
            }
        }
        return true;
    }
}
