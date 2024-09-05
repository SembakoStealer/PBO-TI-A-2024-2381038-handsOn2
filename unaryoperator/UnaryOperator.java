package unaryoperator;

public class UnaryOperator {

    public static void main(String[] args) {
        int x= 10;
        boolean benar = true;

        System.out.println("Post-Increment : Cetak Dulu Baru di Tambahin");
        System.out.println("x awal : " + x);
        System.out.println("++x : " + ++x);
        System.out.println("setelah x : " + x);

        System.out.println("Pre-Increment : Tambah Dulu Baru di Cetak");
        System.out.println("x awal : " + x);
        System.out.println("x++ :  " + x++);
        System.out.println("Setelah x : " + x);

        //Boolean
        System.out.println("Value Variable !benar : "+ !benar);

    }
}
