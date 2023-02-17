package backend.initializer;

import backend.entities.role.Role;
import backend.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RoleInitializer implements CommandLineRunner {

    @Autowired
    private RoleService roleService;
    @Override
    public void run(String... args) throws Exception {

       /* if (!roleService.findByCode("ADMIN").isPresent()){

        }
        if (roleService.findByCode("ADMIN").isEmpty()){

        }*/
        
        Role role1 = new Role();
        role1.setCode("ADMIN");
        role1.setLabel("BANK_ADMIN");
        roleService.save(role1);

        roleService.findAll()
                .stream()
                .forEach(role -> {
                    System.out.println(role.getId() + " , " + role.getLabel() + " , " + role.getCode());
                });
    }
}
