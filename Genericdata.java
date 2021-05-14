import java. util.* ;
  
class Test
{
    public static void main(String args[])
    {
        
        Vector<Integer> v = new Vector<Integer>();
  
        
        v.add(10);
        v.add(20);
        v.add(30);
  
        
        ListIterator lit = v.listIterator();
        System.out.println("In Forward direction:");
  
        while (lit.hasNext())
            System.out.print(lit.next()+" ") ;
  
        System.out.print("\n\nIn backward direction:\n") ;
        while (lit.hasPrevious())
            System.out.print(lit.previous()+" ");
    }
}
