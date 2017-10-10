import java.util.LinkedList;

public class Lab7 {	
	public static void main(String[] args) {
		LinkedList<String> listOne = new LinkedList<String>();
		LinkedList<String> listTwo = new LinkedList<String>();
		//populate listOne
		listOne.add("Tulsa");
		listOne.add("Ada");
		listOne.add("Broken Arrow");
		listOne.add("Owasso");
		listOne.add(1,"OKC");
		//populate listTwo
		listTwo.add("74104");
		listTwo.add("74135");
		listTwo.add("foo");
		listTwo.add("hello world");
		listTwo.add("777");
		//add listTwo to listOne
		listOne.addAll(listTwo);
		//set every second element to empty String
		for(int i = 0;i < listOne.size();i++) {
			if(i%2 == 1) {
				listOne.set(i,"");
			}}
		//remove empty strings
		while(listOne.remove("")) {}
		//list to be populated by a deep copy of listTwo
		LinkedList<String> listThree = new LinkedList<String>();
		//Populates listThree
		for(int i = 0; i < listTwo.size();i++) {
			listThree.add(listTwo.get(i));
		}
	}
}
