package guru.framework.sfgpetclinic.bootStrap;

import guru.framework.sfgpetclinic.map.OwnerServiceMap;
import guru.framework.sfgpetclinic.map.VetServiceMap;
import guru.framework.sfgpetclinic.model.Owner;
import guru.framework.sfgpetclinic.model.Vet;
import guru.framework.sfgpetclinic.services.OwnerService;
import guru.framework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;

public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Jimmy");
        owner1.setLastName("John");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Cindy");
        owner2.setLastName("Williams");
        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Billy");
        vet1.setLastName("Blakes");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Wendy");
        vet2.setLastName("Williams");
        vetService.save(vet2);

        System.out.println("Loaded Vets.....");
    }
}