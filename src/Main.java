import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Please input rows of glod triangle:");
        n=input.nextInt();

        if(n==1){
            System.out.print(1);
        }else if(n==2){
            System.out.print(1+"\n"+1+" "+2+" "+1);
        }else if(n>2){
            int [][]data=new int[n][n+1];
            //初始化数组前两行
            data[0][0]=1;
            data[1][0]=1;
            data[1][1]=2;
            data[1][2]=1;
            System.out.print(1+"\n"+1+"  "+2+"  "+1+"\n");
            //初始化内部数据
            for (int i=2;i<n;i++){
                //初始化所有为1的数组元素
                System.out.print(1+"  ");
                data[i][0]=1;
                data[i][i+1]=1;
                //填充内部数据
                for(int j=1;j<=i;j++){
                    data[i][j]=data[i-1][j]+data[i-1][j-1];
                    System.out.print(data[i][j]+"  ");
                }
                System.out.print(1+"  "+"\n");
            }
            //输出
        }else if (n<1){
            System.out.print("请输入正整数！");
        }
    }

    public int input(){
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Please input rows of glod triangle:");
        n=input.nextInt();
        return n;
    }

}
