package in.sampath.handling;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.sampath.ExInfo.ExInfo;

@RestControllerAdvice
public class ExceptionHandling {

//	@ExceptionHandler(value = Exception.class)
//	public ResponseEntity<String> handlingException(Exception e) {
//		String msg = e.getMessage();
//		return new ResponseEntity<>(msg, HttpStatus.INTERNAL_SERVER_ERROR);
//	}

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ExInfo> HandlingException(Exception e) {
		ExInfo ex = new ExInfo();
		ex.setExCode("ICICI0001");
		ex.setExMsg(e.getMessage());
		ex.setExDate(LocalDate.now());
		return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
