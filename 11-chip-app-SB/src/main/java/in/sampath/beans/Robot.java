package in.sampath.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	@Autowired
	private IChip chip;

	public void dowork() {

		System.out.println("Injected:" + chip.getClass().getName());

		boolean status = chip.process();

		if (status) {
			System.out.println("Robot is working..");
		} else {
			System.out.println("Robot is not working");
		}
	}

}
