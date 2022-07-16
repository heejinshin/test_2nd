import java.util.ArrayList;
public class test1_2 {
    class Solution {
        public int solution(int n) {
            int answer = 0;

            for(int i = 1; i < n; i++){
                for(int k = 0; k < i; k++){
                    //i보다 작은 자연수 배열 선언
                    int arr[];
                    arr = new int[n];  //길이는 n까지
                    arr[k] = i;
                //--------------
                    ArrayList<Integer> arr2 = new ArrayList<Integer>();
                    while( k < i ){
                        int div = i / arr[k];
                        if( div == 0){
                            continue;
                        }
                        else{

                            arr2.add(div);
                        }
                    }
                    answer = arr2.size();
                }
            }
            return answer;
        }
    }
}
