package petshop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import petshop.domain.*;
import petshop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class AnimalAdopted extends AbstractEvent {

    private UUID animalId;

    public AnimalAdopted(Animal aggregate) {
        super(aggregate);
    }

    public AnimalAdopted() {
        super();
    }
}
//>>> DDD / Domain Event
