#include <iostream>
#include <windows.h>
#include <string>
using namespace std;

bool isPalindrome(string chaine) {
	
	if (chaine.empty())
	{
		return false; 
	}

	
	int left = 0;
	int right = chaine.size() - 1;

	while (left < right) {
		if (chaine[left] != chaine[right]) {
			return false; 
		}
		left++;
		right--;
	}
	return true;

}

int main() {

	string str = "radar";

	if (isPalindrome(str)) {
		cout << "\"" << str << "\" est un palindrome." << endl;
	}
	else {
		cout << "\"" << str << "\" n'est pas un palindrome." << endl;
	}

	return 0;
}