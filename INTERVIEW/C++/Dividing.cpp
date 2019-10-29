#include <__bit_reference>

using namespace std;

#define maxN 100

int a[maxN];

int main(){
    int q, n;
    cin >>q;
    while(q--){
        cin >> n;
        memset(c, 0 , sizeof(c));
        for(int i = 0; i <n ; i++){
            cin>>a[i];
            c[a[i]]++;
        }

        sort(a, a+n);

        int ans = 1;
        for(int i = 0; i <n -1  ; i++){
                if ((a[i+1] == a [i] +1) ans=2))
        }
        cout << ans << endl;
    }
    return 0;
}


