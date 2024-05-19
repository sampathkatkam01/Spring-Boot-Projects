package in.sampath.beans;

import org.springframework.stereotype.Component;

@Component("chip64")
public class Chip64bit implements IChip {

	public Chip64bit() {
		System.out.println("Chip64 bit :: constructor");
	}

	@Override
	public boolean process() {
		System.out.println("Chip64 process has started ::");
		return true;
	}

}
