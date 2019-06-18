#include <stdio.h>
#include <math.h>
int main() { int number,count,check,sum=0,n=0;
           scanf("%d",&check);
            number=check;
            while(number!=0)
            { number=number/10;
              n++;}
            number=check;
            while(number!=0)
            { count=number%10;
               sum+=pow(count,n);
                number=number/10;
            }
            if(check==sum)
              printf("Armstrong Number");
            else
              printf("Not an Armstrong Number");
	//Type your code
	return 0;
}