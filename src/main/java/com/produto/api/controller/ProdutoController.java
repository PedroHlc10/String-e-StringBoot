package com.produto.api.controller;
import com.produto.api.model.Produto;
import com.produto.api.model.Carro;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import java.util.List;
import java.util.ArrayList;


@RestController
public class ProdutoController {
    
    private List<Produto> produtos = new ArrayList<>();
    
    @GetMapping("/Produto")
    public List<Produto> listarProdutos(){
        return produtos;
    }
    @PostMapping("/Produto")
    public Produto cadastrar(@RequestBody Produto produto) {
        produtos.add(produto);
        return produto;
    }
    @GetMapping("/Produto/{id}")
    public Produto buscarPorId(@PathVariable Long id){
        for(Produto produto : produtos){
            if(produto.getId().equals(id)){
                return produto;
            }
        }
        return null;
    }

    @DeleteMapping("/Produto/{id}")
    public String excluir(@PathVariable Long id){
        for(Produto produto : produtos){
            if(produto.getId().equals(id)){
            produtos.remove(produto);
            return "Produto excluido com sucesso";
            }
        }
        return "Produto não encontrado";
    }
    
}