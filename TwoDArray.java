class TwoDArray {
public static void main(String args[]) {
int arr[][] = new int[4][3];
int i, j, k = 0;
for (i = 0; i < 4; i++) {
for (j = 0; j < 3; j++) {
arr[i][j] = k;
k++;
}}
for (i = 0; i < 4; i++) {
for (j = 0; j < 3; j++) {
System.out.print(arr[i][j] + " "); 
}
System.out.println();
}}}
