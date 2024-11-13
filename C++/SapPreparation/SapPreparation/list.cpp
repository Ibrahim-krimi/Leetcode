#include<iostream>
#include<list>
#include<string>

using namespace std;

int ex3() {
	list<string> names;

	names.push_back("MOMO");
	names.push_back("MIMI");
	names.push_back("MEME");
	names.push_back("MjMj");
	names.push_back("MnMn");
	
	for (auto name : names)
	{
		cout << name << endl;

	}

	return 0;
}