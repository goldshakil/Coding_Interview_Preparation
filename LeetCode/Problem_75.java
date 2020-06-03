class Solution {
	public void sortColors(int[] a) {

		// the key to this problem is swapping not direct replacing!!!
        //why?: because we don't wanna loose any unscanned values
        // move zeros to left and twos to the right
        
        int start=0; //next position for zero
        int end=a.length-1; //next postition for one
        int scanned=0;
        
        while(scanned<=end&&start<end)
        {
            if(a[scanned]==0)
            {
                a[scanned]=a[start]; //this is 100% -> 1
                a[start]=0;
                start++;
                scanned++;
            }
            else if(a[scanned]==2)
            {
                a[scanned]=a[end]; //the value at the start can be anything so we have to recheck the same index (don't incremened scanned)
                a[end]=2;
                end--;
            }
            else
            {
                scanned++;
            }
        }
	}
}

/*
//counting sort
class Solution {
	public void sortColors(int[] a) {

		// you can use any sorting function

		int lastZero = 0;
		int nextOne = 0;
		int lastTwo = a.length - 1;
		int ending = 0;

		for (int i = 0; i < a.length - ending; i++) {

			if (a[i] == 0) {

				a[i] = -1;// used

				if (a[lastZero] != 1) {
					a[lastZero] = 0;
					lastZero++;
					nextOne++;
				}

				else if (a[lastZero] == 1) {
					a[nextOne] = 1; // don't lost the replaced one
					nextOne++;
					a[lastZero] = 0;
					lastZero++;
				}

			}

			else if (a[i] == 2) {

				// a[i] = -1;// used

				if (a[lastTwo] == 0) {
					a[lastZero] = 0; // don't lost the zero
					lastZero++;
					nextOne++;

					a[lastTwo] = 2;
					lastTwo--;
					ending++;

				} else if (a[lastTwo] == 1) {
					a[nextOne] = 1; // don't lose the replaced one
					nextOne++;

					a[lastTwo] = 2;
					lastTwo--;
					ending++;
				}
				// there is already a two there
				else if (a[lastTwo] == 2) {
					lastTwo--;
				}
				// empty
				else {

					a[lastTwo] = 2;
					lastTwo--;
					ending++;

				}
			}

			else if (a[i] == 1) {

				a[i] = -1;
				a[nextOne] = 1;
				nextOne++;

			}

		}
	}
}

*/
