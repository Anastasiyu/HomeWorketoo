public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        byte box = 2;
        short apple = 230;
        int home = 35000;
        long big =1235649853;
        float jou = 2.5F;
        double x = 5.5;
        char y = 0;
        boolean z = true;

        double oneBoxer = 78.2;
        double tooBoxer = 82.7;
        double totalweghf = oneBoxer + tooBoxer;
        System.out.print("общий вес боксеров" + totalweghf + "кг");

        byte banana = 80;
        short milk = 105;
        short iceCream = 100;
        byte yaytso = 70;
        var vesZavtraka = banana * 5 + milk * 2 + iceCream * 2 + yaytso * 4;
        System.out.print("Вес завтрака" + vesZavtraka +"грамм");

        float vesZavtrakaKg = vesZavtraka / 1000;
        System.out.print("Вес завтрака" + vesZavtrakaKg+ "кг" );

    }
}