void reverse(int arr[], int size) {
    int temp;
    for (int i = 0; i < size / 2; i++) {
        temp = arr[i];
        arr[i] = arr[size - 1 - i];
        arr[size - 1 - i] = temp;
    }
}

void rotate(int** matrix, int matrixSize, int* matrixColSize) {
    int temp,num;
    for(int i=0;i<matrixSize;i++){
        for(int j=i+1;j<*matrixColSize;j++){
            temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
        reverse(matrix[i],*matrixColSize);
    }
}
