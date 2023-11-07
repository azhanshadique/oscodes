#include<stdio.h>
void main()
{
    float fah;
    printf("enter temp " );
    scanf("%f",&fah);

    float c = 5*(fah-32)/9;
    printf("temp is %f",c);
    

}