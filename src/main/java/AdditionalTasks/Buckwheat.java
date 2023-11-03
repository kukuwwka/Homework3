package AdditionalTasks;

public class Buckwheat {
    public static void main(String[] args) {

        int months = 18; // в течение какого срока Василий хочет питаться гречкой
        int buckwheatPerMonth = 6;
        int totalBuckwheat = months * buckwheatPerMonth; // нужно гречки Василию
        int storageFeePerKg = 100; // плата за хранение одного кг
        int storageFee = storageFeePerKg * totalBuckwheat;
        int sum = 0;

        for (int totalVolumeOfBuckwheat = totalBuckwheat; totalVolumeOfBuckwheat >= 0; totalVolumeOfBuckwheat = totalVolumeOfBuckwheat - buckwheatPerMonth)
            sum += totalVolumeOfBuckwheat;
        {
            System.out.println("Василию нужно оплатить " + sum * storageFeePerKg + " рублей");
        }
    }
}