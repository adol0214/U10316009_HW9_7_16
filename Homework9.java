public class Homework9{
	public static void main(String args[]){
		int m[][] = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		int i;
		int j;
		sort(m);
		for(j = 0 ; j < 6 ; j ++){
			for(i = 0 ; i < 2 ; i ++)
				System.out.print(m[j][i] + " ");
			System.out.println();
		}	
	}
	
	public static void sort(int m[][]){
		int i;
		int j = 0;;
		int flag;
		int min = 1000;
		int temp0;
		int temp1;
		j = 0;
		
		//bubble sort做排序, 第二排
		do{
			flag = 0;
			for(i = 0 ; i < 5 ; i ++){
				if(m[i][1] > m[i+1][1]){
					flag = 1;
					temp1 = m[i][1];
					m[i][1] = m[i+1][1];
					m[i+1][1] =temp1;
					temp0 = m[i][0];
					m[i][0] = m[i+1][0];
					m[i+1][0] =temp0;
				}
			}
		}while(flag != 0);
		
		//bubble sort做排序, 第一排
		do{
			flag = 0;
			for(i = 0 ; i < 5 ; i ++){
				if(m[i][0] > m[i+1][0]){
					flag = 1;
					temp1 = m[i][0];
					m[i][0] = m[i+1][0];
					m[i+1][0] =temp1;
					temp0 = m[i][1];
					m[i][1] = m[i+1][1];
					m[i+1][1] =temp0;
				}
			}
		}while(flag != 0);
	}
}
