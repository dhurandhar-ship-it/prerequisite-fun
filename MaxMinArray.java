public class MaxMinArray{
public static void main(String[] args){
int[] arr = {46, 23, 85, 69, 72, 13, 86, 90, 101, 239, 9, 35, 74, 11, 27, 38, 35, 94};
int max = arr[0];
int min = arr[0];
for(int i = 1; i < arr.length; i++){
if (arr[i] > max){
  max = arr[i];
}
if (arr[i] < min){
  min = arr[i];
}
}
  System.out.println(max+ " is the maximum value in the array.");
  System.out.println(min+ " is the minimum value in the array.");
}
}
