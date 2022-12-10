package domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserData {
    private final String city;
    private final String name;
    private final String phone;
}