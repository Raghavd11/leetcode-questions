class Solution {
    public int[] closestPrimes(int left, int right) {
        int diff=right-left+1,count=0,arr[]=new int[2],a=-1,b=-1;
        arr[0]=arr[1]=0;
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                arr[count]=i;
                count++;
            }
            if(count==2 && isPrime(i)){
                if(arr[1]-arr[0]<diff){
                    a=arr[0];
                    b=arr[1];
                    diff=b-a;
                }
                arr[0]=arr[1];
                count=1;
            } 
        }
        arr[0]=a;
        arr[1]=b;
        return arr;
    }

    boolean isPrime(int n){
        if(n==1){
            return false;
        }
        else{
            for(int i=2;i*i<=n;i++){
            if(n%i==0){
               return false;
            }
        }
        return true;
        }
    }
}
