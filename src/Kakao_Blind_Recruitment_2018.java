
public class Kakao_Blind_Recruitment_2018 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] example = new String[n];
        String[] example2 = new String[n];

        for(int i = 0 ; i < n ; i++) {
            example[i] = Integer.toBinaryString(arr1[i] | arr2[i]);

            for (int j = 0; j < n; j++) {
                if(example[i].length() < n) {
                    example[i] = "0" + example[i];
                }
            }

        }
        for(int i = 0 ; i < n ; i++) {
        	example2[i] = example[i].replace('1', '#');
            answer[i] = example2[i].replace('0', ' ');
            System.out.println(answer[i]);

        }
        return answer;
    }
	public static void main(String[] args) {
        new Kakao_Blind_Recruitment_2018().solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
    }
}
