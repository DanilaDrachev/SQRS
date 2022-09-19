import ru.netology.javaqa.javaqamvn.services.SQRServise;

public class Main {

    public static void main(String[] args) {
        SQRServise servise;
        servise = new SQRServise();

        int min = 200;
        int max = 300;
        int index = SQRServise.calculate (min, max); {

            System.out.println(index);

        }
    }
}

