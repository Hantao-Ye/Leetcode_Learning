import java.util.*;

class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>((int) ((float) arr.length / 0.75F + 1.0F));
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(2 * arr[i]) && map.get(2 * arr[i]) != i) {
                return true;
            }
        }
        return false;
    }

    public int minSteps(String s, String t) {
        if (s.equals(t))
            return 0;
        int output = 0;
        int length = s.length();

        Map<Character, Integer> map_s = new HashMap<>((char) ((float) length / 0.75F + 1.0F));
        Map<Character, Integer> map_t = new HashMap<>((char) ((float) length / 0.75F + 1.0F));

        for (int i = 0; i < length; i++) {
            if (map_s.containsKey(s.charAt(i))) {
                int val = map_s.get(s.charAt(i));
                val++;
                map_s.remove(s.charAt(i));
                map_s.put(s.charAt(i), val);
            } else
                map_s.put(s.charAt(i), 1);
            if (map_t.containsKey(t.charAt(i))) {
                int val = map_t.get(t.charAt(i));
                val++;
                map_t.remove(t.charAt(i));
                map_t.put(t.charAt(i), val);
            } else
                map_t.put(t.charAt(i), 1);

        }

        char digit = 'a';
        while (digit <= 'z') {
            if (map_s.containsKey(digit) && map_t.containsKey(digit))
                output += Math.abs(map_s.get(digit) - map_t.get(digit));
            else if (map_t.containsKey(digit) && !map_s.containsKey(digit))
                output += map_t.get(digit);
            else if (map_s.containsKey(digit) && !map_t.containsKey(digit))
                output += map_s.get(digit);
            digit++;
        }
        return output / 2;
    }
    
    public int maxStudents(char[][] seats) {
        int output = 0;

        return output;
    }
}
class TweetCounts {

    public TweetCounts() {
        
    }
    
    public void recordTweet(String tweetName, int time) {
        
    }
    
    // public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
        
    // }
}

/**
 * Your TweetCounts object will be instantiated and called as such:
 * TweetCounts obj = new TweetCounts();
 * obj.recordTweet(tweetName,time);
 * List<Integer> param_2 = obj.getTweetCountsPerFrequency(freq,tweetName,startTime,endTime);
 */