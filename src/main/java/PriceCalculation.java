// A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk.
//If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?

public class PriceCalculation {
    public static void main(String[] args) {
        String str="A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk.If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";
        str = str.replaceAll("[^0-9]", " ");
        str = str.trim();
        str = str.replaceAll(" + ", " ");
        str=str.substring(2,str.length());

        String[] arr = str.split(" ");
        double laptop_price = Double.parseDouble(arr[0]);
        double mouse_price = Double.parseDouble(arr[1]);
        int quantity=Integer.parseInt(arr[2]);
        double discount = Double.parseDouble(arr[3]);

        double product_price =(laptop_price*quantity) + (mouse_price*quantity);
        double total_discount=product_price*(discount/100);
       // System.out.println(total_discount);
        double total_price=product_price - total_discount ;
        System.out.println("Total Cost :" + total_price);
    }

}
