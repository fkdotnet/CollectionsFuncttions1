package collections;
import java.util.ArrayList;

public class App {
static ArrayList<String> listNames = new ArrayList<>();
	public static void main(String[] args) {
		App app = new App();
		listNames.add("Jacob");
		listNames.add("David");
		listNames.add("Howard");
		listNames.add("jojo");
		listNames.add("dio");
		System.out.println(app.listSearch(listNames, "Jacob"));
		app.displayList(listNames);
		//app.removeNamebyPosition(3);
		//app.removeName("dio");
		app.displayList(listNames);
		app.modifyName(listNames, 4, "Dio Brando");
		app.displayList(listNames);

	}

	void removeNamebyPosition( ArrayList <String> names , int position) {
		listNames.remove(position);
	}

	void removeName(String name) {
		listNames.remove(name);
	}

	void displayList(ArrayList<String> names) {
		System.out.println(names);
	}
	int listSearch(ArrayList<String> names, String body) {
		return names.indexOf(body);
		  
	}
	void modifyName(ArrayList<String> names, int posi, String newName) {
		names.set(posi, newName);
	}
}