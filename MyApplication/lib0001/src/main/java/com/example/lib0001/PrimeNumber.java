package com.example.lib0001;

class PrimeNumberChecker{
    public static int isPrime(int num){
        int iPrime=1;
        int temp = 0;
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                iPrime=0;
                break;
            }
        }
        return iPrime;
    }

}

