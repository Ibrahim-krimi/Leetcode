#include <iostream>
#include <stack>
#include <string>
using namespace std; 


int pile() {

	stack<string> tasks; 

	tasks.push("tache 1");
	tasks.push("tache 2");
	tasks.push("tache 3");
	tasks.push("tache 4");

	while (!tasks.empty()) {
		cout << tasks.top() << endl;
		tasks.pop();
	}

	return 0;
	
}