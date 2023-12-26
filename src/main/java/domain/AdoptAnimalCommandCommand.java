package petshop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class AdoptAnimalCommandCommand {

    private UUID animalId;
}
