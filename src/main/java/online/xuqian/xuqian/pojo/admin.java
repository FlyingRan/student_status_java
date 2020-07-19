package online.xuqian.xuqian.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
public class admin {
    private String username;
    private String password;

    public admin(String s, String s1) {
        this.username=s;
        this.password=s1;
    }
}
