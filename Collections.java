package epam;

import java.util.List;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
public class Collections { 
    private static Logger LOGGER = LogManager.getLogger(Collections.class);
    public List<Integer> addElement(List<Integer> list,int k){
      list.add(k);     
      return list;
    }
    public List<Integer> removeElement(List<Integer> list,int k){
      list.remove(k);//removing object from arraylist        
      return list;
    }
    public int findElement(List<Integer> list, int k){
      if(!list.isEmpty()){
       int index = list.indexOf(k);
       if(index==-1)
          return 0;
       else
           return index;
      }      
      else
      return 0;
    }
    public void displayList(List<Integer> list){
        LOGGER.error(list);
    }
 public static void main(String args[]){  
     List<Integer> list=new ArrayList <Integer>();//Creating arraylist 
     Scanner scanner=new Scanner(System.in);
     list.add(10);//Adding object in arraylist    
      list.add(20);    
      list.add(30);    
      list.add(40);
      list.add(50);
      list.add(60);
      list.add(70);
      list.add(80);
      list.add(90);
      list.add(100);
      Collections collection =new Collections();
      collection.displayList(list);
      
      LOGGER.error("Enter element to be added");
      int k=scanner.nextInt();
      collection.addElement(list,k);
      LOGGER.error("After adding list is:");
      collection.displayList(list);
      
      LOGGER.error("enter index from where element has to be removed");
      int b=scanner.nextInt();
      collection.removeElement(list,b);
      LOGGER.error("After removing list is:");
      collection.displayList(list);
      
      LOGGER.error("Enter element to be searched");
      int c=scanner.nextInt();
      int d=collection.findElement(list,c);
      if(d==0)
          LOGGER.error("Element does not exist in the list");
      else
          LOGGER.error(c+" found at "+(d+1));
      scanner.close();
  }  
}