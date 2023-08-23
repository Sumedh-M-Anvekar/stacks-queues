#include<iostream>
using namespace std;

class stack
{

    public:int size;
           int top;
           int *arr;
    stack(int size)
    {
        this->size=size;
        int top=-1;
        arr=new int[size];
    }
    void push(int elem)
    {
        if(size-top>1)
        {
            top++;
            arr[top]=elem;
        }
        else
        {
            cout<<"stack overflow"<<endl;
        }
    }
    int pop()
    {
        if(top==-1)
        {
            return -1;
        }
        else
        {
            top--;
            return arr[top];
        }
    }
};

int main()
{
    int n;
   stack st(n);
cout<<"enter number of values to be inserted"<<endl;
cin>>n;
int in;
for(int i=0;i<n;i++)
{
    cin>>in;
    st.push(in);
}

int out;
cout<<"enter no of elems to pop"<<endl;
cin>>out;
for(int i=0;i<out;i++)
{
    int a=st.pop();
    if(a!=-1)
    {
        cout<<a<<endl;
    }
    else{
        cout<<"underflow"<<endl;
    }
}


}