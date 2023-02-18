public class ArrayAndLoop 
{
    public static void main(String[] args)
    {
        String[] cars= {"fiat", "golf", "cat"};
        int[] num = {4,2,7};
        for(int i =0,  j =0; i < cars.length && j < num.length; i ++, j ++  )
        { 
            System.out.println( cars[i] + " potenza " + num[j]);
        }

        boolean[] bArray = {true, false, false, true};
        for(boolean b :bArray)
            System.out.println(b);

        String[] searchText = {"one","two","three","four"};
        String searchItem = "five";
        for(String st : searchText){ 
            if(st.equals(searchItem)){ 
                System.out.println("trovato" + st);
                
            }else{
                System.out.println("non trovato");
                break;
            }
        }
    }    
}
