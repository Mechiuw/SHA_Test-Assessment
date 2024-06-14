import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args){
        validateString( "pemrroRGGggramanDasarJ##a&&va18765-");
        System.out.println(roger(8,8));
        rusak(8);
    }

    public static void validateString(String words){
        Map<String, Long> wordsMap = words.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(
                        c -> {
                            if(Character.isUpperCase(c)){
                                return "uppercase" ;
                            } else if(Character.isLowerCase(c)){
                                return "lowercase";
                            } else if(Character.isDigit(c)) {
                                return "digitcase";
                            } else {
                                return "other";
                            }
                        },
                        Collectors.counting()
                ));
        System.out.println("uppercase : " + wordsMap.getOrDefault("uppercase",0L));
        System.out.println("lowercase : " + wordsMap.getOrDefault("lowercase",0L));
        System.out.println("angka : " + wordsMap.getOrDefault("digitcase",0L));
        System.out.println("symbol : " + wordsMap.getOrDefault("other",0L));
    }
    public static int roger(int k, int b){
        if(b == 1) return 1;
        else if (k % b == 0) return 1 + roger(k, --b);
        else return 0 + roger(k, --b);  // return
    }

    public static void rusak(int n){
        if(n == 0){
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("hello");
        }

        rusak((int)n /2);
    }
}