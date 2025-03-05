int romanToInt(char* s) {
    char ch[7]={'I','V','X','L','C','D','M'};
    int value[7]={1,5,10,50,100,500,1000};
    int result=0;
    for(int i=0;i<strlen(s);i++){
        if(s[i]=='I' && s[i+1]=='V'){
            result+=4;
            i++;
        }
        else if(s[i]=='I' && s[i+1]=='X'){
            result+=9;
            i++;
        }
        else if(s[i]=='X' && s[i+1]=='L'){
            result+=40;
            i++;
        }
        else if(s[i]=='X' && s[i+1]=='C'){
            result+=90;
            i++;
        }
         else if(s[i]=='C' && s[i+1]=='D'){
            result+=400;
            i++;
        }
        else if(s[i]=='C' && s[i+1]=='M'){
            result+=900;
            i++;
        }
        else{
            for(int j=0;j<7;j++){
            if(s[i]==ch[j]){
                result+=value[j];
              }
            }
        }
    }
    return result;
}
