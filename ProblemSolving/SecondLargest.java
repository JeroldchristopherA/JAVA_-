class SecondLargest {

    public static void main(String[] args){

        int[] arr = {10, 5, 20, 8};

        if(arr.length < 2){

            System.out.println("Second largest not possible");
            return;

        }

        int first, second;

        // Step 1: initialize using first two elements
        if(arr[0] > arr[1]){

            first = arr[0];
            second = arr[1];

        } else {

            first = arr[1];
            second = arr[0];

        }

        // Step 2: loop remaining elements
        for(int i = 2; i < arr.length; i++){

            if(arr[i] > first){

                second = first;
                first = arr[i];

            }
            else if(arr[i] > second && arr[i] != first){

                second = arr[i];

            }

        }

        System.out.println("Second largest = " + second);

    }

}