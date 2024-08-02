package practice.codingtest15days.programmers;

// 조건에 맞게 수열 변환하기 1 - Level 0
public class CodingTest_1day {
    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                arr[i] = arr[i] * 2;
            }
        }
        int[] answer = arr;

        return answer;
    }
}
