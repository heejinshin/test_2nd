
public class test1 {
    public static void main(String[] args) {
        public int solution ( int n){
            int answer = 0;
            for (int i = 1; i < n; i++) {
                for (int k = 0; k < i; k++) {
                    //i보다 작은 자연수 배열 선언
                    int arr[];
                    arr = new int[n];  //길이는 n까지
                    arr[k] = i;
                    //--------------
                    int div = i / arr[k];
                    int arr2[];
                    arr2 = new int[n];
                    arr2[i] = div;
                    while (k < i) {
                        if (div == 0) {
                            continue;
                        } else {
                            arr2[k] = div;
                        }
                    }
                    answer = arr2.length;
                }
            }
            return answer;
        }
    }
    }

