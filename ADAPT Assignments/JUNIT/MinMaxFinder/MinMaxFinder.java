package junitassignment;
public class MinMaxFinder {
	public int[] findMinMax(int a[]) {
		int [] minmax = new int[2];
		minmax[0] = a[0];
		minmax[1] = a[0];
		for (int i=0;i<a.length;i++) {
			if (a[i]<minmax[0]) {
				minmax[0] = a[i];
			}
			else if(a[i]>minmax[1]) {
				minmax[1] = a[i];
			}
		}
		return minmax;
	}
public int Minfinder(int b[]){
	int min = b[0];
	for (int i=0;i<b.length;i++) {
	if (b[i]<min) {
		min = b[i];
	}
	}
	return min;
}
public int Maxfinder(int b[]){
	int max = b[0];
	for (int i=0;i<b.length;i++) {
	if (b[i]>max) {
		max = b[i];
	}
	}
	return max;
}
    }