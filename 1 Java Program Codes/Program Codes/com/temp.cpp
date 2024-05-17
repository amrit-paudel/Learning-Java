



#include<iostream>
#include<string>

using namespace std;

string makeSigned( string num ){
    string num1 = "0";
    for( int i=0;i<=num.length()-1;i++ ){
        num1 += num[i];
    }
    return num1;
}

int main(){
    string num = "11010";
    string num1 = makeSigned(num);
    cout<<num1;

}


