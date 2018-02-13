package NotVlad;

import java.io.File;

import auto.CommandList;
import auto.ICommand;

public class NotVladXMLInterpreterTester {
	public static void main(String[] args) {
		CommandList test = new CommandList();
		long startParse = System.nanoTime();
		try {
			NotVladXMLInterpreter interp = new NotVladXMLInterpreter(new File("Paths.xml"));
			test = interp.getPathList("L3-1");
		} catch (NullPointerException e) {
			System.out.println("OOF");
		}
		long endParse = System.nanoTime();
		System.out.println((endParse - startParse) / 1000000 + " Millisecond runtime");
		System.out.println("Command List: ");
		for (int i = 0; i < test.size(); i++) {
			ICommand cur = test.getCommand(i);
			System.out.println(cur);
		}
	}
}
