import java.util.Stack;

public class Stocks_span {
    public static void main(String[] args) {
        int stocks[] = {100 , 80 , 60 , 70 , 60 , 85 , 100};
        int spans[] = new int[stocks.length];

        spanStocks(stocks , spans);

        for(int i =0; i<spans.length; i++){
            System.out.print(spans[i] + " " );
        }
    }

    public static void spanStocks(int stocks[] , int span[]){
        Stack<Integer> s  = new Stack<>();
        span[0] =1;
        s.push(0);
        for(int i =1; i<stocks.length; i++){
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice > stocks[s.peek()] )  {
                s.pop();       
            }
            if(s.isEmpty()){
               span[i] = i+1; 
            }else{
                int prevlength = s.peek();
                span[i] = i - prevlength;
            }
            s.push(i);
            
        }
    }
}
