class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int i = 0;
        int[] score = new int[3];
        int idx = 0;

        while(i < dartResult.length()){
            int num = -1;

            if(dartResult.charAt(i) == '1' && dartResult.charAt(i+1) == '0'){
                num = 10;
                i += 2;
            } else{
                num = Character.getNumericValue(dartResult.charAt(i));
                i++;
            }

            char bonus = dartResult.charAt(i);
            if(bonus == 'D') num *= num;
            else if(bonus == 'T') num *= num * num;
            score[idx] = num;
            i++;

            if(i < dartResult.length() &&
               (dartResult.charAt(i) == '*' || dartResult.charAt(i) == '#')){
                char option = dartResult.charAt(i);

                if(option == '*'){        
                    score[idx] *= 2;
                    if(idx != 0) score[idx - 1] *= 2;
                } else if(option == '#'){
                    score[idx] *= -1;
                }

                i++;        
            }

            idx++;
        }

        for(int s : score) answer += s;

        return answer;
    }
}
