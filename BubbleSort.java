/**
BubbleSort：优化后的冒泡排序法
@author:Cage Yang
*/
class BubbleSort {
	//主函数：定义一个数组，进行冒泡排序，并展示排序前后的变化。
	public static void main (String[] args) {
		int[] arr = new int[]{45,717,578,15,7,12,76,57,61,76,87,68,716};
		showArray(arr);
		bubbleSort(arr);
		showArray(arr);
	}

	/**
	【冒泡排序】
	函数功能：对一个数组进行从小到大的冒泡排序。
	获取参数：数组名(int[])
	返回值：void
	思路：1.双层循环：内循环比较arr[j]与arr[j+1]，若前者较大则换位；
		  2.内循环初始值为0，控制条件为j<i；
		  3.定义一个int location，每次内循环开始之前赋值0；进行换位操作时赋值j，记录角标；
		  4.外循环初始值为arr.length-1，控制条件为i>0，完成一次循环后操作为i = location。
		  附：i = location的解释：若i-1>location，说明location后面的部分已经排序完成，下次遍历不用涉及；
								  若i-1==location，则这个操作等效于i--；
								  若location==0，说明整个数组已经完成排序，i = 0后结束不满足循环条件，结束循环。
	*/
	public static void bubbleSort(int[] arr) {
		int location;
		for (int i = arr.length-1; i>0; i = location) {
			location = 0;
			for (int j= 0; j<i; j++) {
				if (arr[j]>arr[j+1]) {
					location = j;
					swap(arr,j,j+1);
				}
			}
		}
	}

	/**
	【展示数组】
	函数功能：对数组进行标准格式展示。
	获取参数：数组名(int[])
	返回值：void
	思路：对数组进行遍历，用if语句判断是否为末位，来决定打印内容。
	*/
	public static void showArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i<arr.length; i++) {
			if (i!=arr.length-1) {
				System.out.print(arr[i]+", ");
			} else {
				System.out.println(arr[i]+"]");
			}
		}
	}

	/**
	【换位】
	函数功能：对数组中给定的两个元素换位。
	获取参数：数组名(int[])，元素角标(int)
	返回值：void
	*/
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
