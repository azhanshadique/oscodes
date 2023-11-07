#include<stdio.h>
void main()
{
    int a[100];
    int i,n,b,p;
    printf("size ");
    scanf("%d", &n);
    printf("enter values ");
    for(i=0; i<n; i++)
    {
        scanf("%d", &a[i]);
    }
     for(i=0; i<n; i++)
    {
        printf("%d, ", a[i]);
    }
    printf("enter the insert value ");
    scanf("%d", &b);
    printf("enter the position ");
    scanf("%d", &p);
    for(i=n; i>=p; i--)
    {
        a[i]=a[i-1];
    }
    a[p-1]=b;
     for(i=0; i<n+1; i++)
    {
        printf("%d, ", a[i]);
    }
    
}