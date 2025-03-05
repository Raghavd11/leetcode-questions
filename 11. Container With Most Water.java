 int maxArea(int* height, int heightSize) {
        int max = 0,left,right=heightSize-1,minHeight,area;
        while (left < right) {
            minHeight = *(height+left)<*(height+right)?*(height+left):*(height+right);
            area = minHeight * (right - left);
            max = (max>area)?max:area;
            if (*(height+left) < *(height+right)) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
