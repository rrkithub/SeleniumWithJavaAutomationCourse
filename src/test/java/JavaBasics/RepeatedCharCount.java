package JavaBasics;

public class RepeatedCharCount {
    public static void main(String[] args) {
        String name = "SeleniumSelen";
        char c[]=name.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int count=1;
            for (int j = 0; j < c.length; j++) {
                if (i != j && c[i] == c[j]) {
                   count=count+1;
                   c[j]='0';
                }
            }
            if(c[i]!='0'){
                System.out.println(c[i]+"--->"+count);
            }
        }
    }
}
