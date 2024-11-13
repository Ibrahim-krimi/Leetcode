#include <iostream>
#include <queue>
#include <string>
using namespace std;


int file() {

	queue<string> tasks;

	tasks.push("tache 1");
	tasks.push("tache 2");
	tasks.push("tache 3");
	tasks.push("tache 4");

	while (!tasks.empty()) {
		cout << tasks.front() << endl;
		tasks.pop();
	}
	return 0;
}