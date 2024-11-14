#include <iostream>
#include <windows.h>

using namespace std; 

void simulation(int n,int t_on,int t_off,int dureTotal) {
	int T_cycle = t_on + t_off;  // Durée totale d'un cycle


	for (auto i = 0; i < dureTotal; i++)
	{
		cout << "Seconde :  " << i  << endl;


		for (auto j = 0; j < n; j++) {
			// On introduit un décalage en ajoutant j secondes
			int position = (i - j) % T_cycle;
			if (position < 0) position += T_cycle;
 
			//bool condition = (i + j) % (t_on + t_off) < t_on;

			cout << "Lumiere :  " << j << " : ";

			if (position < t_on) {

				cout << "Allumee" <<endl;
			}
			else
			{
				cout << "Eteint" <<endl;

			}
		}

		Sleep(1000);
	}

}

int ex8() {
	simulation(10, 5, 5, 13);

	return 0;
}