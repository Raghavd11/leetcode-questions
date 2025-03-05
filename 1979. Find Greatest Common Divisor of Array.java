int findGCD(int* nums, int numsSize) {
    int smallest=*(nums),largest=*(nums),gcd=1;
    for(int i=1;i<numsSize;i++){
        int current=*(nums+i);
        if(current<smallest){
            smallest=current;
        } 
        if(current>largest){
            largest=current;  
        }
    }
    for(int i=2;i<=largest;i++){
        if(largest%i==0 && smallest%i==0){
            gcd=i;
        }
    }
    return gcd;
}
