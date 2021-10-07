package registration;

import org.springframework.stereotype.Service;

/**
 *
 * @author hamat
 */

@Service
public class RegistrationService {
    public String register(RegistrationRequest request) {
        return "working";
    }
}
