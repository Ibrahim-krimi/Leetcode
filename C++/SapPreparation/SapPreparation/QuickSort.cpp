#include <iostream>
#include <vector>
#include <list>

using namespace std;



int partition(vector<int>& tab, int l, int& r) {
	
	int pivot = tab.at(r);
	int index = l - 1;

	for (int i = l; i < r; i++)
	{
		if (tab[i] < pivot)
		{
			index++;
			int temp = tab[i];
			tab[i] = tab[index];
			tab[index] = temp;
		}

	}
	int temp = tab[index+1];
	tab[index+1] = tab[r];
	tab[r] = temp;
	return index + 1;

}


vector<int> quicksort(vector<int>& tab, int l, int r) {
	if (l < r) {
		int iPivot = partition(tab, l, r);
		quicksort(tab, l, iPivot - 1);    // Trier la partie gauche du pivot
		quicksort(tab, iPivot + 1, r);    // Trier la partie droite du pivot
	}
	return tab; // Retourner le tableau trié
}

int ex7() {
		
	vector<int> tab = {3,2,25,3423,1,6,32,34};

	for (auto i : tab)
	{
		cout << i << " ";
	}
	int l = 0;
	int r = tab.size() ;
	tab = quicksort(tab, l, r);

	cout << endl;

	for (auto i : tab)
	{
		cout << i << " ";
	}

	return 0;
}