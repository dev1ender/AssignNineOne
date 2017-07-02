import java.util.ArrayList;
import java.util.Iterator;

//HDTV class creadeted
class HDTV{
	public String Brandname;
	public int Size;
	
	//constructor to set the values of the properties
	public HDTV(String brandname, int size) {
		
		Brandname = brandname;
		Size = size;
	}
}

//clas that contain the main method 
public class NineOne {
	
	//main method
	public static void main(String []args){
		
			//HDTV class object created
			HDTV tv1 = new HDTV("Sony",40);
			HDTV tv2 = new HDTV("Sony1",56);
			HDTV tv3 = new HDTV("Sony2",60);
			
			//Arraylist creaeted that ccan hold the HDTV object
			ArrayList<HDTV> list = new ArrayList<HDTV>();
			
			//HDTV object added to the arraylist
			list.add(tv1);
			list.add(tv2);
			list.add(tv3);
			
			//Iterator created that can iterate thorugh all the elements of the arraylist
			 Iterator<HDTV> itr=list.iterator();  
			  //traversing elements of ArrayList object  
			  while(itr.hasNext()){  
			    HDTV st=(HDTV)itr.next();  
			    System.out.println(st.Brandname+" "+st.Size);  
			  }  
			 }   
	}

