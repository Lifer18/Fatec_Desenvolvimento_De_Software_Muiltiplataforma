#include <iostream>
#include <conio.h>
#include <stdio.h>
using namespace std;
 
int main()
{
	setlocale (LC_ALL, "PORTUGUESE");

    int i=1, num,aux,res=0;
    int resto[100];
    
    cout<<"Insira o numero(decimal):";
    cin>>num;
	
    do{
    	aux=num;
    	resto[i]=aux%2;
    	num=num/2;
    	i++;
    
	}while(num!=0);
	
	i--;
	cout<<"Resultado em binário: ";
    do{
		cout<<resto[i];
		i--;
	}while(i>=1);
    
    return 0;
}
