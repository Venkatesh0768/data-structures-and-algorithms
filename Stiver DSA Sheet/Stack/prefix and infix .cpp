#include <iostream>
#include <string>
using namespace std;

string trim(string &s) {
    size_t first = s.find_first_not_of(" \t\n\r\f\v");
    if (first == string::npos) return "";
    size_t last = s.find_last_not_of(" \t\n\r\f\v");
    return s.substr(first, (last - first + 1));
}

int main() {
    string s = "rapoluvenky7@gmail.com";
    string s1;
    cin >> ws; 
    getline(cin, s1); 
    if (s.compare(trim(s1)) == 0) {
        cout << "Yes";
    } else {
        cout << "NO";
    }
    return 0;
}
