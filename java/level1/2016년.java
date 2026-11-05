class Solution {
    public String solution(int a, int b) {
        int[] month = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] dayOfWeek = new String[]{"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"}; 
        // 1월 1일이 금요일이므로, 금요일인 날은 1월 8(1 + 7)일, 15(1 + 7 * 2)일 ..
        // 366일로 봤을 때 (1 + 7 * n)일이 금요일. (ex. 8일, 29일, 36, 42일, .. , 365일) 
        // 7로 나눴을 때 나머지가 1인 날을 금요일로 확정하기 위해서 금요일을 인덱스 1번에 위치시킴

        int day = b;
        for(int i = 0; i < a - 1; i++) day += month[i];

        return dayOfWeek[day % 7];
    }
}
