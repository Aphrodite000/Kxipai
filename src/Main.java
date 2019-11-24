import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //多少组数据进来洗牌
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            //洗牌时每个手拿的牌的个数，也就是总牌数的一半
            int n=sc.nextInt();
            int k=sc.nextInt();//洗牌次数
            int[] arr=new int[2*n];
            for(int j=0;j<2*n;j++){
                //把所有的牌放进数组
                arr[j]=sc.nextInt();
            }
            for(int times=0;times<k;times++){
                Shuff(arr,arr.length);
            }
            for(int a=0;a<n*2-1;a++){
                System.out.print(arr[a]+" ");
            }
            System.out.println(arr[n*2-1]);
        }
    }
    //洗牌

    /**
     *
     * @param arr 洗牌的数组
     * @param m   牌的数量m=2*n=arr.length    m/2=n
     */
    public static void Shuff(int[] arr,int m){
        ArrayList<Integer> list=new ArrayList<>(m);
        //0到n-1，先放左手的牌，再放右手的牌
        for(int i=0;i<m/2;i++){
            //创建一个数组来放手中的牌
            list.add(arr[i]);
            list.add(arr[i+m/2]);
        }
        /*
         1 2 3 4 5 6
         左 1 2 3  右 4 5 6
         1 4 2 5 3 6
         */
        //把list中的值有放回数组
        for(int i=0;i<m;i++){
            arr[i]=list.get(i);
        }
    }
}
