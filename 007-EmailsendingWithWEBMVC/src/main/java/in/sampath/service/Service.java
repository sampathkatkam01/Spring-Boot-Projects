package in.sampath.service;

import org.springframework.beans.factory.annotation.Autowired;

import in.sampath.Repo.UserRepository;
import in.sampath.entity.User;


@org.springframework.stereotype.Service
public class Service {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private emailservice emailService;

  public User registerUser(User user) {
    User savedUser = userRepository.save(user);
    emailService.sendRegistrationEmail(user);
    return savedUser;
  }

  public User getUserByEmail(String email) {
    return userRepository.findByEmail(email);
  }
}
