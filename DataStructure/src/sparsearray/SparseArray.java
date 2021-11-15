package sparsearray;



/**
 * @auther hyq
 * @create 2021/11/10
 * @description  稀疏数组（sparse array）常用于对数据进行压缩
 *              下面是一个棋盘案例，棋盘大小为11*11， 黑色棋子为1， 白色棋子为2， 无棋子为0
 *              可以想象如果我们要保存这样的一个棋盘，除了个别有用元素外，其余都为无用元素0，造成了资源浪费
 *              稀疏数组的作用正是应用与保存这样的稀疏数据，实现数据压缩。
 *
 *              定义稀疏数组：sparseArray[row][column]
 *              row = 有效元素个数+1
 *              column = 3
 *              第一行保存原数组维度信息（行数、列数）以及有效元素总数，后面每行的三个元素分别保存每个有效元素的行、列、值
 */
public class SparseArray {
    public static void main(String[] args) {
        // 创建一个初始棋盘
        int[][] arr = new int[11][11];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
//                System.out.println(arr[i][j]);
            }
        }
        // 放入两个棋子
        arr[4][5] = 1;
        arr[5][6] = 2;

        //生成稀疏数组
        int sum = 0;
        int[] row = new int[arr.length];
        int[] colum = new int[arr.length];
        int[] value = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] != 0){
                    row[sum] = i;
                    colum[sum] = j;
                    value[sum] = arr[i][j];
                    sum ++;
                }
            }
        }
        int[][] sparseArr = new int[sum + 1][3];
        sparseArr[0][0] = arr.length;
        sparseArr[0][1] = arr.length;
        sparseArr[0][2] = sum;
        System.out.println(sparseArr[0][2]);
        for (int i = 0; i < sum; i++) {
            sparseArr[i+1][0] = row[i];
            sparseArr[i+1][1] = colum[i];
            sparseArr[i+1][2] = value[i];
        }

        System.out.println("稀疏数组：");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
            System.out.println();
        }


        //由稀疏数组生成棋盘
        int[][] chess = new int[sparseArr[0][0]][sparseArr[0][1]];
        for (int i = 0; i < sparseArr.length-1; i++) {
            chess[sparseArr[i+1][0]][sparseArr[i+1][1]] = sparseArr[i+1][2];
        }

        //输出稀疏数组
        System.out.println("由稀疏数组生成的数组：");
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                System.out.print(chess[i][j] + "  ");
            }
            System.out.println();
        }


    }
}
