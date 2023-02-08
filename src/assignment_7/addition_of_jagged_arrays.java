package assignment_7;

public class addition_of_jagged_arrays {
    public static void main(String [] args){
        int [][] arr1 = {{1,2,3},{2,3},{1}};
        int [][] arr2 = {{5,6,7},{1,2},{9}};
        int result=0;
        for(int i = 0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                result = arr1[i][j] + arr2[i][j];
                System.out.println("Addition of Array[" + i + "][" + j + "] is :: " + result);
            }
        }
    }
}
/*
Addition of Array[0][0] is :: 6
Addition of Array[0][1] is :: 8
Addition of Array[0][2] is :: 10
Addition of Array[1][0] is :: 3
Addition of Array[1][1] is :: 5
Addition of Array[2][0] is :: 10

 */
