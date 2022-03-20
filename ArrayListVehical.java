package collectionrevision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListVehical {
	public void VehicalList() {
		ArrayList<String> VehicalList = new ArrayList<String>();

		// Add:1
		VehicalList.add("Bus");
		VehicalList.add("Auto");
		VehicalList.add("Van");
		VehicalList.add("Bike");
		VehicalList.add("Train");
		VehicalList.add("Jet");
		VehicalList.add("Train"); // Duplicate

		System.out.println(VehicalList);// [Bus, Auto, Van, Bike, Train, Jet, Train]

		// Get:2
		System.out.println(VehicalList.get(0));// Bus
		System.out.println(VehicalList.get(3));// Bike
		System.out.println(VehicalList.get(6));// Train

		// IndexOf:3
		System.out.println(VehicalList.indexOf("Train")); // 4
		System.out.println(VehicalList.indexOf("bus")); // -1
		System.out.println(VehicalList.indexOf("Scooter")); // -1

		// LastIndexOf:4
		System.out.println(VehicalList.lastIndexOf("Train"));// 6

		// BooleanContains:5
		System.out.println(VehicalList.contains("bus"));// false
		System.out.println(VehicalList.contains("Bus"));// true
		System.out.println(VehicalList.isEmpty());// false

		// AnotherList toCopy (addAll):6
		ArrayList<String> anotherList = new ArrayList<String>();
		anotherList.addAll(VehicalList);
		VehicalList.clone();
		System.out.println(VehicalList);
		System.out.println("-------------------------");
		System.out.println(anotherList);// [Bus, Auto, Van, Bike, Train, Jet, Train]

		// ClearAnotherList:7
		anotherList.clear();
		System.out.println(anotherList); // []

		// ParticularElementRemove(Index or Value):8
		VehicalList.remove(0);
		System.out.println(VehicalList); // [Auto, Van, Bike, Train, Jet, Train]
		VehicalList.remove("Train");
		System.out.println(VehicalList); // [Auto, Van, Bike, Jet, Train]

		// null:9
		VehicalList.add(null);
		System.out.println(VehicalList); // [Auto, Van, Bike, Jet, Train, null]

		// Set:10
		VehicalList.set(5, "Cycle");
		VehicalList.remove(5);
		
		System.out.println(VehicalList + "\n"); // [Auto, Van, Bike, Jet, Train, Cycle]

		System.out.println("**********************************************" + "\n");

		// Iterate:
		// foreachloop:11
		for (String string : VehicalList) {
			System.out.print("Using for each :" + string + ";" + " ");   // Using for each :Auto; Using for each :Van;
																		// Using for each :Bike; Using for each :Jet;
		}                                                              // Using for each :Train; Using for each :Cycle;
		System.out.print("\n");
		//for (String string : anotherList) {
			
		

		// forloop:12

		for (int i = 0; i < VehicalList.size(); i++) {
			System.out.print("Using for loop :" + VehicalList.get(i) + ";" + " "); // Using for loop :Auto; Using for
																					// Using for loop :Jet; Using for
																					// loop :Train; Using for loop
																					// :Cycle;
		}
 
		System.out.println("\n");

		// ListIterater:13

		ListIterator<String> list_iterator = VehicalList.listIterator();
		while (list_iterator.hasNext()) {
			System.out.print(list_iterator.next() + "  "); // Auto Van Bike Jet Train Cycle
		}

		System.out.print("\n");

		while (list_iterator.hasPrevious()) {
			System.out.print(list_iterator.previous() + "  "); // Cycle Train Jet Bike Van Auto

		}

		System.out.print("\n");
		System.out.print("\n");

		// Iterate(hasNext):

		Iterator<String> iterator = VehicalList.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "  "); // Auto Van Bike Jet Train Cycle
		}
	}

	public static void main(String[] args) {
		ArrayListVehical vehical = new ArrayListVehical();
		vehical.VehicalList();
	}
}
