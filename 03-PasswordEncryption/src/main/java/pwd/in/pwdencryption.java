package pwd.in;

import java.util.Base64;
import java.util.Base64.Encoder;;

public class pwdencryption {

	public pwdencryption() {
		System.out.println("pwdservice::consturcter");
	}

	public String encodepassword(String pwd) {

		Encoder encoder = Base64.getEncoder();

		byte[] encodedpwd = encoder.encode(pwd.getBytes());

		return new String(encodedpwd);

	}

}
