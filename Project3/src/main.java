
public class main {
    public static void main(String[] args) {

        boundedStack <String> browserBack = new boundedStack<String>();

        for(int i = 0; i <52; i ++){
            browserBack.push("www.google.com");
        }
        browserBack.pop();
        System.out.print(browserBack.toString());
        

        boundedStack <Double> maji = new boundedStack<Double>();
        for(int i = 0; i <52; i ++){
            maji.push(35.1);
        }
        
        maji.pop();
        System.out.print(maji.toString());
        
    }
}
