
#include<iostream>
using namespace std;

class stack{
    public:
        int top;
        int *arr;
        int size;
    
    stack(int size)
    {
        this->size=size;
        top=-1;
        arr=new int[size];
    }
    void push(int element)
    {
        if(size-top>1)
        {
            top++;
            arr[top]=element;
        
        }
        else
        {
            cout<<"stack overflow yaar"<<endl;
        }
    }
    void pop()
    {
        if(top==-1)
        {
            cout<<"stack underflow yaar"<<endl;
        }
        else
        {
            top--;
        }
    }
    int topp()
    {
        if(top>=0)
        {
            return arr[top];
        }
        else
        {
            return -1;
        }
    }
    bool isempty()
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
};

int main()
{
    stack st(5);
    st.push(88);
    st.push(99);
    st.push(77);
    st.push(123);
    st.push(8);

    //pop
    st.pop();
    st.pop();
    st.pop();
    st.pop();


    //top of stack
    cout<<st.topp();

    //isempty'
    st.isempty();
}