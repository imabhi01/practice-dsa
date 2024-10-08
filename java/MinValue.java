public class MinValue {
    public static void main(String[] args){
        int[] array = new int[]{4,2,1,5};
        int MinValue = array[0];
        System.out.println(MinValue);
        for(int i = 0; i < array.length; i++){
            if(array[i] < MinValue){
                MinValue = array[i];
            }
        }
        System.out.println(MinValue);
    }
}
