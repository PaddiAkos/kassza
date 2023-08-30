public class Main {
    public static void main(String[] args){
    int number = 343247;

    int TwentyThousand = (number / 20000) % 10;
    int TenThousand = (number / 10000) % 10;
    int thousands = (number / 1000) % 10;
    int hundreds = (number / 100) % 10;
    int tens = (number / 10) % 10;
    int ones = (number % 10);


        if (ones == 5) {
        ones = 5;
    }
        if (ones <= 2 ){
        ones = 0;
    }
        if (ones >= 3 && ones != 6 && ones !=7 && ones !=8 && ones !=9 ){
        ones = 5;
    }
        if (ones >= 6){
        ones=0;
        tens += 1;
    }
        System.out.println(number + " Ezt az összeget ilyen bakjegyekkel tudod kifizetni: ");
        System.out.println("húszezresből: " + TwentyThousand);
        System.out.println("tízezresből: " + TenThousand);
        System.out.println("ezresből: " + thousands);
        System.out.println("százasól: " + hundreds);
        System.out.println("tizesből: " + tens);
        System.out.println("ötforintosból: " + ones);

        
}
    }
