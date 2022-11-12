package zuoye.item3;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 叶嘉卫
 * @date 2022/11/11/21:34
 * @Description: 腐烂的橘子
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] ints = new int[][] {{2,1,1},{1,1,0},{0,1,1}};
        int [][] ints1=new int[][]{{0,2}};
        System.out.println(solution.orangesRotting(ints));
    }
    public int orangesRotting(int [][] grid) {
        int time = 0;
        int count=0;
        Queue queue = new LinkedList<>();
        int[][] ints = new int[][]{};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                }
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        while (!queue.isEmpty()&&count>0) {
            time++;
            for (int i = 0; i < queue.size(); i++) {
                int[] o = (int[]) queue.remove();
                int r = o[0];
                int c = o[1];
                int M = grid.length;
                int N = grid[0].length;
                if (r + 1 < M && grid[r + 1][c] == 1) {//下
                    grid[r + 1][c] = 2;
                    count--;
                    queue.add(new int[]{r + 1, c});
                }
                if (r - 1 > M && grid[r - 1][c] == 1) {//上
                    grid[r - 1][c] = 2;
                    count--;
                    queue.add(new int[]{r - 1, c});
                }

                if (c - 1 >= 0 && grid[r][c - 1] == 1) {//左
                    grid[r][c - 1] = 2;
                    count--;
                    queue.add(new int[]{r, c - 1});
                }
                if (c + 1 < N && grid[r][c + 1] == 1) {//右
                    grid[r][c + 1] = 2;
                    count--;
                    queue.add(new int[]{r, c + 1});
                }
            }
        }
       if(count>0){
           return -1;
       }
        return time;
    }


}
