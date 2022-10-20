#include <iostream>
#include <conio.h>
#include <stdio.h>
using namespace std;
 
int main()
{
	setlocale (LC_ALL, "PORTUGUESE");
    char c[100];
    int i=0,j=0,aux[100],res=0,num[100];
    cout<<"Insira o numero binário: ";
    cin>>c;
    while(c[i] != '\0'){
        if(c[i]!=' ')
        {
            j++;
		}
	
         i++;
    }
    //cout<<"\n"<<j;
    for (i=0;i<j;i++){
    	if(c[i]=='0'){
    		num[i]=0;
    		//cout<<"\nA:"<<num[i];
    		
		}
		else if (c[i]=='1'){
			num[i]=1;
			//cout<<"\nB:"<<num[i];
		}
		else{
			cout<<"\nErro, número digitado não é binário, saindo do programa...";
			return 0;
		}
	}
    i=0;
    //cout<<"\nTeste:"<<num[1];
    cout<<"\n";
    do{
    	aux[i]=num[i]*2^j;
    	res=res+aux[i];
    	i++;
	}while(i<j);

	cout<<"O número decimal é: "<<res;

    return 0;
}
