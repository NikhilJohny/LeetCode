// 1091. Shortest Path in Binary Matrix 
class Solution {
    public int findShortestPath(int[][] grid){
        LinkedList<int[]> queue = new LinkedList<int[]>();
        int[][] dirs = {{-1, +0},{+0, +1},{+0, -1}, {+1, +1}, {+1, -1}, {-1, +1}, {+1, +0}, {-1, -1},  
    };
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        queue.add(new int[]{0,0,1});
        visited[0][0] = true;
        while(queue.size() != 0){
            int current[] = queue.removeFirst();
            for(int i = 0; i < dirs.length; i++){
                int x = current[0] + dirs[i][0];
                int y = current[1] + dirs[i][1];
                if(x<0 || y<0 || x>=grid.length || y>=grid[0].length || grid[x][y] == 1 || visited[x][y]) continue;
                else{
                    visited[x][y] = true;
                    queue.add(new int[]{x,y,current[2] + 1});
                    if(x == grid.length - 1 && y == grid[0].length - 1) return current[2] + 1;
                }
            }
        }
        return -1;
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        return (grid[0][0] == 1) ? -1 : (grid[0].length == 1) ? 1 : findShortestPath(grid);
    }
}