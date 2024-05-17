

#include<iostream>

using namespace std;

// an random function just to change the value
void randomFunction(int* num1, int* num2){
    *num1 = 1;
    *num2 = 2;
}

int main(){

    int num1 = 100;
    int num2 = 200;
    
    // before passing as reference
    cout<<"num1 : "<<num1<<"  num2 : "<<num2<<endl; // 100 200

    randomFunction(&num1,&num2);

    // After passing as reference
    cout<<"num1 : "<<num1<<"  num2 : "<<num2<<endl; // 1  2 



}
