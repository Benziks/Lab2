package itschool;


import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args) {


        task26();
        task51();
        task76();
        task101();
        task126();

    }
    private static	void task26(){ //В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному значению К.

        Scanner s = new Scanner(System.in);
        System.out.println("Введите число ");
        int n = s.nextInt();
        Random rand = new Random();

        int mice[] = new int [100];

        for(int i=0;i<100;i++)
        {
            mice[i] = rand.nextInt(100);
        }
        int sum=0;
        System.out.println("Массив " );

        for(int i=0;i<100;i++)
        {
            if(mice[i]%n==0)
                sum=sum+mice[i];
            System.out.println(mice[i]);


        }
        System.out.println("");
        System.out.println(sum);
    }
    private static	void task51(){ //Заполнить массив из N элементов с начальным значением заданным А[0] ≠ 0, по принципу A[i] = A[i div 2] + A[i–1].

        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        int n = s.nextInt();


        Random rand = new Random();

        int arr[] = new int [10];

        for(int i=0;i<10;i++)
        {
            arr[i] = rand.nextInt(10);
        }

        System.out.println("a[0] не должно быть равна нулю ");



        for(int i1=1;i1<n;i1++){
            System.out.println("a[ " + arr[i1] + "]");
            arr[i1]=arr[i1 / 2]+arr[i1-1];
        }
        for(int i2=0;i2<n;i2++){
            System.out.println("a[ " + arr[i2] + "]");
        }
        System.out.println("");
    }


    private static	void task76(){ //Дана последовательность натуральных чисел а1, a2, ..., а20. Определить, есть ли в последовательности хотя бы одно число, оканчивающееся цифрой 7. В случае положительного ответа определить порядковый номер первого из таких чисел.




        Random rand = new Random();

        int arr[] = new int [20];

        for(int i=0;i<20;i++)
        {
            arr[i] = rand.nextInt(100);
        }



        boolean m = false;

        for(int i=0;i<20;i++){
            if(arr[i]>10 && arr[i]%10 ==7){
                m=true;
                System.out.println("Число " + i);
            }


        }
        if(m==false){
            System.out.println("Таких чисел нет ");
        }




    }




    private static	void task101(){ //Удалить элемент одномерного массива вещественных чисел, который меньше среднего арифметического элементов массива. Если таких элементов несколько, удалить последний из найденных.




        Random rand = new Random();

        int arr[] = new int [15];
        int n=15,j,s=0,t;

        for(int i=0;i<15;i++)
        {
            arr[i] = rand.nextInt(100);
        }

        for(int i=0;i<n;i++){
            s=s+arr[i];
        }
        for(int i=0;i<n;i++){
            if(arr[i]<(s/n)){
                j=i;
                System.out.println("Элемент меньше среднего значения= "+ arr[j]+" Его номер= "+ j);
            }
        }






    }








    private static	void task126(){ //Даны вещественные числа а1, а2, ..., an. Найти max (a1 + a2n, a2 + a2n–1, … an + an+1).




        Random rand = new Random();

        int arr[] = new int [10];
        int n = 4;

        for(int i=0;i<10;i++)
        {
            arr[i] = rand.nextInt(100);
        }


        for(int i = 0;i<2*n; i++){


            System.out.println( arr[i]);

        }
        System.out.println("");

        for (int i = 0; i<n;i++)
        {

            System.out.println( arr[i]+""+arr[i + n]);
        }



    }




}


