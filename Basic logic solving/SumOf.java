public class SumOf{
    public static void main(String[] args) throws Exception{
        int sum1 = 10;
        int sum2 =20;

        int add = sum1 + sum2;
        System.out.println("Here is the output:"+ add);

        int sub = sum1 - sum2;
        System.out.println("Subraction :"+sub);

        int multi = sum1 * sum2;
        System.out.println("Multiplication :"+ multi);

        float divison = sum1 / sum2;
        System.out.println("Division :"+divison);

        double modulo = sum1 % sum2;
        System.out.println("Moduluo :"+modulo);

        String n1 = "12";
        String n2 = "12";
        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        System.out.println("Stings conversion output:"+(a+b));    

    }
}