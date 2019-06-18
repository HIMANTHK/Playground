#include <stdio.h>
int main() { int number,product=1;
            scanf("%d",&number);
            for(int i=number;i>=1;i--)
            { product=product*i;
            }
            printf("%d",product);
	//Type your code
	return 0;
}