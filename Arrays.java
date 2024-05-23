public class Arrays{

    class 1d{
        //O(n)
        public int tranverse(arr){
            for(int i = 0; i < arr.length; i++){
                System.out.println(array[i])
            }
        }
        //O(1)
        public int get(arr, index){
            return arr[index];
        }
        //O(1)
        public int insert(arr, index, val){
            return arr[index] = val;
        }
        //O(1)
        public int delete(arr, index){
            return arr[index] = 0;
        }

        //O(n)
        public int linear_search(){

        }
        //O(1)
        public void binary_search(){

        }
    }

    class 2d{
        public int tranverse(arr){
            for (int i = 0; i < arr.length; i++){
                System.out.println(ar[i][i])
            }
        }
    }
    public static void main(Strings [] arg){
        // 1D Array
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        1D a1 = new 1D();
        a1.tranverse(array);
        a1.get(arr,3);
        a1.insert(array,3,6);
        a1.delete(array, 4);

    }


}