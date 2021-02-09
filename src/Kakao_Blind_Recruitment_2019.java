
public class Kakao_Blind_Recruitment_2019 {

	 public int[] solution(int N, int[] stages) {

	        double nfail[] = new double[N];
	        int count = 0;      // 스테이지에 도달했으나 클리어하지 못한 플레이어 수
	        int pcount = stages.length;     // 스테이지에 도달한 플레이어 수

	        for (int i = 1; i <= N; i++) {
	            for (int j = 0; j < stages.length; j++) {
	                if(stages[j] == i) {     // 도달은 했지만 못깬사람
	                    count += 1;
	                }
	            }
	            nfail[i-1] = (double)count / (double)pcount;    // 각 스테이지의 실패율
	            pcount -= count;

	            if(count == 0) {
	                nfail[i-1] = 0;
	            }

	            System.out.println("p : " + pcount);
	            System.out.println("c : " + count);
	            System.out.println(nfail[i-1]);
	            System.out.println("-------------");
	            count = 0;
	        }

	        int[] answer = new int[N];

	        for(int k = 0; k < nfail.length; k++) {
	            double max = -1;
	            int index = 0;

	            for(int s = 0; s < nfail.length; s++) {
	                if(max < nfail[s]) {
	                    max = nfail[s];
	                    index = s;
	                }
	            }
	            nfail[index] = -1;
	            answer[k] = index + 1;

	            System.out.println(answer[k]);
	        }

        return answer;
    }
    public static void main(String[] args) {
        new Kakao_Blind_Recruitment_2019().solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
    }

}
