//Bankers Algorithms

#include<stdio.h> 
//#include<conio.h> 
#include<stdlib.h> 
int allocation[20][20],max[20][20],available[20],need[20][20],safe[10],s=0; int 
finish[10],work[10],cnt=0,flag=0,temp=0; 
int p,r,i,j,ch,index,req[10]; 
void check() 
{ 
temp=0; 
s=0; 
for(i=0;i<p;i++) //Calculate need=max-allocation 
for(j=0;j<r;j++) 
need[i][j]=max[i][j]-allocation[i][j]; 
printf("\nAllocation Table is:\n"); 
for(i=0;i<p;i++) 
{ 
for(j=0;j<r;j++) 
printf("%d\t",allocation[i][j]); 
printf("\n"); 
} 
printf("\nNeed Table is:\n"); 
for(i=0;i<p;i++) 
{ 
for(j=0;j<r;j++) 
printf("%d\t",need[i][j]); 
printf("\n"); 
} 
for(i=0;i<p;i++) 
finish[i]=0; 
for(i=0;i<r;i++) 
work[i]=available[i]; 
while(temp<2) 
{ 
for(i=0;i<p;i++) 
{ 
for(j=0;j<r;j++) 
{ 
if(finish[i]==0 && need[i][j]<=work[j]) 
flag=1; 
else 
{ 
flag=0; 
break; 
} 
} 
if(flag==1) 
{ 
for(j=0;j<r;j++) 
work[j]=work[j]+allocation[i][j]; 
finish[i]=1; 
safe[s++]=i; 
} 
} 
temp++; 
} 
flag=0; 
for(i=0;i<p;i++) 
{ 
if(finish[i]==0) 
{ 
flag=1; 
break; 
} 
} 
if(flag==1) 
{ 
printf("\nSystem is in Deadlock state"); 
} 
else 
{ 
printf("\nSystem is in Safe state"); 
printf("\nSafe Sequence is:"); for(i=0;i<p;i++) 
printf("P%d\t",safe[i]); 
} 
}
main() 
{ 
// clrscr(); 
printf("\n~~~~~~~~~~~~~~~~~~~~~~~BANKER'S 
ALGORITHM~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
printf("\n\nEnter the no of resources and processes: "); 
scanf("%d%d",&r,&p); 
printf("\nEnter the Allocation Table:\n"); 
for(i=0;i<p;i++) //Accept the allocation table 
for(j=0;j<r;j++) 
scanf("%d",&allocation[i][j]); 
printf("\nEnter the Max Table:\n"); 
for(i=0;i<p;i++) //Accept the max table 
for(j=0;j<r;j++) 
scanf("%d",&max[i][j]); 
printf("\nEnter the vector Available :"); 
for(i=0;i<r;i++) 
scanf("%d",&available[i]); check(); 
printf("\nDo U want to add new request:(0/1)"); 
scanf("%d",&ch); 
if(ch==0) 
exit(1); 
printf("\nEnter the process no:"); 
scanf("%d",&index); 
printf("\nEnter the request:"); 
for(i=0;i<r;i++) 
scanf("%d",&req[i]); 
flag=0; 
for(i=0;i<r;i++) 
if(req[i]<=need[index][i]) 
flag=1; 
else 
flag=0; 
if(flag==0) 
{ 
printf("\nRequest can not be satisfied..."); 
//getch(); 
exit(1); 
} 
for(i=0;i<r;i++) 
if(req[i]<=available[i]) 
flag=1; 
else 
flag=0; 
if(flag==0) 
{ 
printf("\nRequest can not be satisfied..."); 
//getch(); 
exit(1); 
} 
for(i=0;i<r;i++) 
{ 
allocation[index][i]=allocation[index][i]+req[i]; 
available[i]=available[i]-req[i]; 
} 
check(); 
// getch(); 
}
/