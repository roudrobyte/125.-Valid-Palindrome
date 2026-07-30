#include <iostream>
#include <vector>
#include <algorithm>
 
using namespace std;
 
void solve() {
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    
    int max_dishes = *max_element(a.begin(), a.end());
    
 
    int winner_count = count(a.begin(), a.end(), max_dishes);
    
    cout << winner_count << "
";
}
 
int main() {
  
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int t;
    cin >> t;
    while (t--) {
        solve();
    }
    
    return 0;
}