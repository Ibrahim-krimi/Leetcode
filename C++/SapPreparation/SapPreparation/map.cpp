#include<iostream>
#include<map>
#include<string>

using namespace std;

int main() {
	map<string,int> names;

	names["Lola"] = 25;
	names["Lila"] = 26;
	names["Lele"] = 27;
	names["Lklk"] = 28;

	for (const auto& name : names)
	{
		cout << name.first << " " << name.second << endl;

	}

	return 0;
}