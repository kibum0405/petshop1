package petshop.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import petshop.domain.*;

@Component
public class AnimalHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Animal>> {

    @Override
    public EntityModel<Animal> process(EntityModel<Animal> model) {
        return model;
    }
}
