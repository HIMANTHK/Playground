#include <stdio.h>
int main() { int Number,temp_num=0,number_sum=0;
            scanf("%d",&Number);
            while(Number!=0)
            { temp_num=Number%10;
              number_sum=number_sum+temp_num;
              Number=Number/10;
            }
            printf("%d",number_sum);
	//Type your code
	return 0;
}