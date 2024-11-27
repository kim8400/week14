import java.util.ArrayList;
import java.util.Collections;

public class Lotto {
    public static void main(String[] args) {
        // 1부터 45까지 숫자를 ArrayList에 추가
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            numbers.add(i);
        }

        // 리스트를 섞어 랜덤 순서로 변경
        Collections.shuffle(numbers);

        // 섞인 리스트에서 첫 6개 숫자를 선택
        ArrayList<Integer> lottoNumbers = new ArrayList<>(numbers.subList(0, 6));

        // 오름차순으로 정렬
        Collections.sort(lottoNumbers);

        // 결과 출력
        System.out.println("로또 번호 :" + lottoNumbers);
    }
}