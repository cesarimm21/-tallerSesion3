package runner;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.When;

import java.util.Map;

public class MyStepObjects {
    @When("creo un contacto completo con:")
    public void creoUnContactoCompletoCon(Contact contact) {
        System.out.println("contacto: nombre: "+contact.getNombre());
        System.out.println("contacto: apellido: "+contact.getApellido());
        System.out.println("contacto: direccion: "+contact.getDireccion());
        System.out.println("contacto: alias: "+contact.getAlias());
        System.out.println("contacto: email: "+contact.getEmail());
        System.out.println("contacto: telefono: "+contact.getTelefono());
    }
    @DataTableType
    public Contact convertToContact(Map<String, String> entity){
        Contact contact = new Contact();
        contact.setAlias(entity.get("alias"))
                .setApellido(entity.get("apellido"))
                .setNombre(entity.get("nombre"))
                .setDireccion(entity.get("direccion"))
                .setEmail(entity.get("email"))
                .setTelefono(entity.get("telefono"));
        return contact;
    }
}
