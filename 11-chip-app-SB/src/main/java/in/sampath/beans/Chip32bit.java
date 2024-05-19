package in.sampath.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("chip32")
@Primary
public class Chip32bit implements IChip {

	public Chip32bit() {
		System.out.println("Chip32 :: constructor");
	}

	@Override
	public boolean process() {

		System.out.println("Chip32 has been started::");
		return true;
	}
}
