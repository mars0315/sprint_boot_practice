package com.example.mars.demo;

public class TestMonkeys2 {
    public static void main(String[] args)
    {
        int num = 6;		//分五份多一个，至少6个
        while( true)
        {
            if(func(num))
            {
                break;		//找到答案，跳出循环
            }
            num++;
        }
        System.out.println("符合要求的最小数是：" + num);
    }

    //判断这个数是否能被分5次
    static boolean func(long n)
    {
        int i = 0;			//被分次数0-4共5次
        while(i < 5 && n > 0)
        {
            if((n - 1) % 5 == 0)
            {
                long temp = (n - 1) / 5 + 1;
                n -= temp;				//减去被一只猴子拿走和丢掉的
                i ++;
            }
            else{
                return false;
            }
        }
        return true;
    }

}
