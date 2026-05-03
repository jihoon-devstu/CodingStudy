class Solution {
    public int solution(int n) {
        double rootN = Math.sqrt(n);
        long integerPart = (long) rootN;
        return (integerPart * integerPart == n) ? 1 : 2;
    }
}