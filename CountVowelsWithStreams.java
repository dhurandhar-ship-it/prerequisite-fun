public class CountVowelsWithStreams {
    public static void main (String[] args){
        String str = "Abracadabra";
        long count = str.toLowerCase()
                .chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
        System.out.println("No. of vowels: " + count);
    }
}
