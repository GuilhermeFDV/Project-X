import org.springframework.context.annotation.Import;

import lombok.Data;

@Data
public class UsuarioPutRequestBody {

    private Long id;
    private String name;
}