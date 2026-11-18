class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] result = new int[targets.length];

        for(int i = 0; i < targets.length; i++){
            String target = targets[i];
            int cnt = 0;

            for(int j = 0; j < target.length(); j++){
                char t = target.charAt(j);
                int min = Integer.MAX_VALUE;

                for(String key : keymap){
                    int idx = key.indexOf(t);
                    if(idx != -1 && idx < min) min = idx;    
                }

                if(min == Integer.MAX_VALUE){
                    cnt = -1;
                    break;
                }
                else{
                    cnt += min + 1;
                }
            }

            result[i] = cnt; 
        }

        return result;
    }
}
