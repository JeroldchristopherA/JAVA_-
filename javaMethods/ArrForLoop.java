
//how to finds the maximum value in an integer array using a for-each loop
class ArrForLoop {
    public static void main(String [] args){
        int[] mark = {12,23,34,54,57};

        int max = findMax(mark);
        System.out.println(""+max);

    }

    public static int findMax(int[] n ){
        int max = n[0];

        for(int n1:n){
            if(n1>max){
                max =n1;
            }
        }
        return max;
    }

}
