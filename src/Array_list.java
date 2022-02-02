
import java.util.ArrayList;
	public class Array_list {
		public static void main(String[] args) 
		{
			
			ArrayList<String> x = new ArrayList<String>();
			x.add("Maclaren");
			x.add("Lamborgini");
			x.add("ferrari");
			x.add("Kamalendu");
			x.add("Lamborgini");
			x.add("ferrari");
			
			x.set(2,"Subhadeep");
			x.remove(4);
		//	x.clear();
			
			
			for(int i=0; i<x.size(); i++)
			{
				System.out.println(x.get(i));
			}
		}

	}
