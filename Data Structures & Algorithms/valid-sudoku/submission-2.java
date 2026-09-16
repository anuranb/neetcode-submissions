class Solution {
    HashMap<Integer, HashSet<Integer>> rowMap = new HashMap<>();
    HashMap<Integer, HashSet<Integer>> columnMap = new HashMap<>();
    HashMap<Integer, HashSet<Integer>> squareMap = new HashMap<>();
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                int val = board[i][j] - 48;
                if(val < 0) continue;
                boolean insertSuccesful = CompareAndInsert(rowMap, val, i);
                if(!insertSuccesful) return insertSuccesful;
                insertSuccesful = CompareAndInsert(columnMap, val, j);
                if(!insertSuccesful) return insertSuccesful;
                insertSuccesful = CompareAndInsert(squareMap, val, (i/3)*3+j/3);
                if(!insertSuccesful) return insertSuccesful;
                // 0,0 2,2 - 0 
                // 0,3 2,5 - 1
                // 0,6 2,8 - 2
                // 3,0 5,2 - 3
                // 3,3 5,5 - 4
                // 3,6 5,8 - 5
            }
        }
        return true;
        
    }

    public boolean CompareAndInsert(HashMap<Integer, HashSet<Integer>> map, int val, int index) {
            if(map.containsKey(index)) {
                if(map.get(index).contains(val)) return false;
                else map.get(index).add(val);
            } else {
                map.put(index, new HashSet<>());
                map.get(index).add(val);
            }
            // System.out.println(rowMap);
            // System.out.println(columnMap);
            // System.out.println(squareMap);
            return true;
        }
}
