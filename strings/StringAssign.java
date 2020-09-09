package strings;

public class StringAssign {
    public static void main(String[] args) {
        String query = "   I Love   java,        the coffee";
        String list[] = query.split(" ");

        for(int i = list.length-1;i>=0;i--){
            System.out.print(list[i].strip() + " ");
        }
    }
}
