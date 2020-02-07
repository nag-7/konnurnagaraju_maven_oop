package epam2;
import java.util.ArrayList;
import java.util.*;
class Candies{
    int count(Integer n[],int u,int v){
    int count=0;
    for (int i=u+1;i<v-1;i++){
        if(n[i]==3){
            count=count+1;
        }
    }
    
    System.out.println("Candies in the given range:\t"+count);
    return count;
}
}
class Snickers{
    int count(Integer n[],int t){
    int count=0;
    for (int i=0;i<t;i++){
        if(n[i]==1){
            count=count+1;
        }
    }
    System.out.println("Snickers:\t"+count);
    return count;
}
}
class Pera{
int count(Integer n[],int t){
    int count=0;
    for (int i=0;i<t;i++){
        if(n[i]==2){
            count++;
        }
    }
    System.out.println("Pera:\t"+count);
    return count;
}
 
}  

class MilkBar{
    int count(Integer n[],int t){
    int count=0;
    for (int i=0;i<t;i++){
        if(n[i]==4){
            count=count+1;
        }
    }
    System.out.println("MilkBar:\t"+count);
    return count;
}
}  

class GulabJamun{
    int count=0;
}

class NewYear{
public static void main(String []args){
    Snickers sn=new Snickers();
    Pera p=new Pera();
    MilkBar m=new MilkBar();
    Candies c=new Candies();
GulabJamun g=new GulabJamun();
    System.out.println("1.Snickers\n2.Pera\n3.Candy\n4.MilkBar\n5.GulabJamun\n6.Exit(Gift selection is completed)\nEnter choice:");
    ArrayList<Integer> a =new ArrayList<>();
    
    for(int i=0;i<100;i++){
    	Scanner obj=new Scanner(System.in);
    	int x=obj.nextInt();
    	 a.add(x);
         if(x>6 || x<1)
         {
             System.out.printf("wrong option\n");
             break;
         }
         if(x==6)
         {
        	 break;
         }
    }
    
    int size1=a.size();
    int size=size1-1;
    System.out.println("Total weight is:" +size);
    Integer[] arr=a.toArray(new Integer[a.size()]);
    
    int k1=sn.count(arr,size);
    int d1=p.count(arr,size);
    int m1=m.count(arr,size);
    System.out.println("Sorting Chocolates in Ascending Order based on number of Chocolates of same type");
    
    
    if (k1<=d1 && k1<=m1)  {
        
        sn.count(arr,size);
        if(m1<=d1){
            m.count(arr,size);
            
            p.count(arr,size);
        }
        else if(d1<=m1){
            p.count(arr,size);
            
            m.count(arr,size);
        }
        
    }
        
    else if(d1<=k1 && d1<=m1){
        p.count(arr,size);
        if(k1<=m1)
        {
            sn.count(arr,size);
            
            m.count(arr,size);
        }
        else if(m1<=k1)
        {
            m.count(arr,size);
            sn.count(arr,size);
        }
    }
    else{
        m.count(arr,size);
        if(k1<=d1){
            sn.count(arr,size);
            p.count(arr,size);
        }
        else if(d1<=k1){
            p.count(arr,size);
            sn.count(arr,size);
        }
        
        
    }
    System.out.println("Enter the lower limit of range:");
    Scanner obj1=new Scanner(System.in);
    int x1=obj1.nextInt();

    System.out.println("Enter the upper limit of range:");
    Scanner obj2=new Scanner(System.in);
    int x2=obj2.nextInt();
    
    int c1=c.count(arr,x1,x2);
    
}
    
}

