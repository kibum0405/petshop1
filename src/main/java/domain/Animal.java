package petshop.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import petshop.PetshopApplication;
import petshop.domain.AnimalAdopted;

@Entity
@Table(name = "Animal_table")
@Data
//<<< DDD / Aggregate Root
public class Animal {

    @Id
    private UUID id;

    private String name;

    private String healthStatus;

    private healthStatusType healthStatusType;

    private String temperament;

    @PostPersist
    public void onPostPersist() {
        AnimalAdopted animalAdopted = new AnimalAdopted(this);
        animalAdopted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static AnimalRepository repository() {
        AnimalRepository animalRepository = PetshopApplication.applicationContext.getBean(
            AnimalRepository.class
        );
        return animalRepository;
    }
}
//>>> DDD / Aggregate Root
