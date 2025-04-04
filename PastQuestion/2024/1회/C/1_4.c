#include <stdio.h>

void reverse(char* str) {
    int len = strlen(str);
    char temp;
    char *p1 = str;
    char *p2 = str + len - 1; // +9  I
    while(p1 < p2) {
        temp = *p1;
        *p1=*p2;
        *p2=temp;
        p1++;
        p2--;
    }
}

int main() {
    char str[100] = "ABCDEFGH";

    reverse(str);
//IHGFEDCBA
    int len = strlen(str);

    for(int i=0; i < len; i+=2) {
        printf("%c",str[i]);
    }
//GECA
    printf("\n");

    return 0;
}