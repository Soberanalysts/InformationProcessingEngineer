#include <stdio.h>
 
int main(){
    char*p = "It is 8";
    char result[100];
    int i;
 
    for(i=0; p[i]!=' '; i++){
        if(isupper(p[i]))
            result[i] = (p[i]-'A'+5)% 26 + 'A';//N
        else if(islower(p[i]))
            result[i] = (p[i]-'a'+10)% 26 + 'a';//d sc
        else if(isdigit(p[i]))
            result[i] = (p[i]-'0'+3)% 10 + '0';//1
        else if(!(isupper(p[i]) || islower(p[i]) || isdigit(p[i])))    
            result[i] = p[i];
    }
 
    result[i] = ' ';
    printf("%s\n",result);
 
    return 0;
}