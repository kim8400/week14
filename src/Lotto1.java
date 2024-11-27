import java.util.ArrayList;
import java.util.Collections;

public class Lotto1 {
    public static void main(String[] args) {
        ArrayList<Integer> lottoNumbers = new ArrayList<>();
        for (int i = 0; i <= 45; i++) {
            lottoNumbers.add(i);
        }
        System.out.println(lottoNumbers);
        Collections.shuffle(lottoNumbers);
        System.out.println(lottoNumbers);
        System.out.println("이번주 로또 번호는");

        for (int i = 0; i < 5; i++) {
            System.out.print(lottoNumbers.get(i) + ",");
        }
        System.out.println("보너스 번호 " + lottoNumbers.get(5) + "입니다.");

    }
}
