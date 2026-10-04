package baozi_store.controller;

import baozi_store.model.Cliente;
import baozi_store.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;


import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteRepository clienteRepository;


    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;

    }

    @GetMapping
    public List<Cliente> listarClientes(){
        return clienteRepository.findAll();
    }


    @PostMapping
    public Cliente criarCliente(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);

    }

    @GetMapping("/{id}")
    public Cliente buscarClientePorId(@PathVariable Long id){
        return clienteRepository.findById(id).orElse(null);
    }


    @DeleteMapping("/{id}")
    public void deletarCliente(@PathVariable Long id){
        clienteRepository.deleteById(id);
    }


}
