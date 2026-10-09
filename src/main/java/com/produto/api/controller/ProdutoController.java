package com.produto.api.controller;
import com.produto.api.model.Produto;
import com.produto.api.model.Carro;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ProdutoController {
    @GetMapping("/Produto")
    public String Produto(){
        return "Api Funcionando";
    }
    @PostMapping("/Produto")
    public Produto cadastrar(@RequestBody Produto produto) {
        return produto;
    }

    @GetMapping("/Carro")
    public String Carro(){
        return "Carro";
    }
    @PostMapping ("/Carro")
    public Carro Carro1 (@RequestBody Carro oi){
        return oi;
    }
}