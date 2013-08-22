#include <iostream>
#include <conio.h>
using namespace std;
int n;
int main ()
{
    cout<<"Ingrese el tamaño n del triangulo"<<endl;
    cin>>n;
    for(int i = 0; i < n; i++)
    {
        for(int j = n-1; j >= 0; j--)
        {
            if (i < j)
                cout << " ";
            else
                cout << "x";
        }
        for(int j = 1; j < n; j++)
        {
            if (j > i)
                cout << " ";
            else
                cout << "x";
        }
        
        cout << endl;
    }
    getch ();
}
