public class StringP1 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Nupur");
        sb.append("Baraskar");
        //sb.delete(0, 4);
        sb.reverse();

        sb.insert(0,"amazing ");
        sb.setCharAt(2, 'a');
        sb.replace(0, 7, "awesome ");   
        System.out.println(sb);
        }
}
