public class EvenNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=0; i<=100; i++){
            if(i%2==0){
                System.out.printf("%d ",i);
                sum+=i;
            }
        }
        System.out.printf("\nSuma wszystkich liczb parzystych z przedziału 0 do 100 wynosi " + sum);

    }
}
