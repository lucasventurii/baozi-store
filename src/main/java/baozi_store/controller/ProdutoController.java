package baozi_store.controller;


import baozi_store.model.Produto;
import baozi_store.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;


    }
    //listar
    @GetMapping
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    //criar
    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    //buscar ID
    @GetMapping("/{id}")
    public Produto buscarProduto(@PathVariable Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    //excluir
    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id) {
        produtoRepository.deleteById(id);
    }

}
