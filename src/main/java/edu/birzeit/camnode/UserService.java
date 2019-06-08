package edu.birzeit.camnode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public List<User> getAllCompanies() {
        return userRepository.findAllByType(1);
    }

    public User getUser(String id) {
        return userRepository.findByName(id);
    }

    public ResponseWrapper getPrivate(String id) {
        return new ResponseWrapper(userRepository.findByName(id).getPrivateKey());
    }
}
