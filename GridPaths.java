public class GridPaths {

    //Input: The dimensions (m,n) of a grid where m,n are integers >= 0. 
    //Output: The number of shortest paths from the bottom left point (0,0) to the top right point (n,m)
    public static int numberOfPaths(int m, int n) {

        if (m < 0 || n < 0) {

            return -1;

        }

        int[][] paths = new int[m+1][n+1];

        for (int i=0; i<m+1; i++) {

            for (int j=0; j<n+1; j++) {

                if (i == 0 || j == 0) {

                    paths[i][j] = 1;

                }

                else {

                    int left = paths[i][j-1];
                    int down = paths[i-1][j];
                    
                    paths[i][j] = left+down;

                }

            }

        } 

        return paths[m][n];

    }

  
    public static void main(String[] args) {

        int m = 4;
        int n = 3;
        
        int paths = numberOfPaths(m,n);

        if (paths == -1) {
            System.out.println("Invalid Input");
        }

        else {
            System.out.println(paths);            
        }
  
    }
    
}