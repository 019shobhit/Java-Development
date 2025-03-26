package Journal_App.demo.entity;

import jakarta.annotation.Generated;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;
import org.springframework.stereotype.Indexed;

@Data
@Entity
public class User {

    @Id
    private int id;

    private String userName;

    private String Password;


}
