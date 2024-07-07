package codeio;

public class BooleanMatrix {
    public static void main(String[] args) {
        int matrix[][]={{1,0},
                        {0,0}};
        booleanMatrix(matrix);
    }

    private static void booleanMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int rows[]=new int[r];
        int cols[]=new int[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==1){
                    rows[i]=1;
                    cols[j]=1;
                }
            }
        }
       for(int i=0;i<r;i++){
            if(rows[i]==1){
            for(int j=0;j<c;j++){
                matrix[i][j]=1;
                }
            }
        
        } 
         for(int j=0;j<c;j++){
            if(cols[j]==1){
            for(int i=0;i<r;i++){
                matrix[i][j]=1;
                }
            }
        
        } 
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]);
                }
                System.out.println();
            }

    }
    
}
