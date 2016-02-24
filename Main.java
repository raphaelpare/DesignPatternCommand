package com.company;

public class Main {

   public static void main(String[] args) {
   	   WriteStuff writestuff = new WriteStuff();
   	   WriteThing writething = new WriteThing();

       Writer writer = new Writer();
       writer.registerCommand(writestuff);
       writer.registerCommand(writething);

       writer.writeALL();
   }
}

public interface Command {
	public abstract void execute();
}

public class Writer {
	private List<Command> writingList = new List<Command>();

	public void registerCommand(Command command) {
		writingList.add(command);
	}

    public void writeALL {
		for (Command command : writingList) {
		         command.execute();
	      }
	      writingList.clear();
    }
}

public class WriteStuff implements Command {
	public void execute() {
		System.out.println('Stuff');
	}
}

public class WriteThing implements Command {
	public void execute() {
		System.out.println('Thing');
	}
}