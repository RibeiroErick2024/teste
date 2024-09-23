package com.example;

import java.util.regex.Pattern;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String confirmacaoSenha;
    private String cpf;
    private String cep;

    
    public Usuario(String nome, String email, String senha, String confirmacaoSenha, String cpf, String cep) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.confirmacaoSenha = confirmacaoSenha;
        this.cpf = cpf;
        this.cep = cep;
    }

    public String cadastrar() {
        if (nome == null || nome.isEmpty()) {
            return "Erro ao salvar o usuário: O nome é obrigatório.";
        }
        if (email == null || email.isEmpty()) {
            return "Erro ao salvar o usuário: O e-mail é obrigatório.";
        }
        if (senha == null || senha.isEmpty() || confirmacaoSenha == null || confirmacaoSenha.isEmpty()) {
            return "Erro ao salvar o usuário: A senha e a confirmação de senha são obrigatórias.";
        }
        if (!senha.equals(confirmacaoSenha)) {
            return "Erro ao salvar o usuário: A senha e a confirmação de senha não correspondem.";
        }
        if (cpf == null || cpf.isEmpty()) {
            return "Erro ao salvar o usuário: O CPF ou CNPJ é obrigatório.";
        }
        if (cep == null || cep.isEmpty()) {
            return "Erro ao salvar o usuário: O CEP é obrigatório.";
        }
        if (senha.length() < 8) {
            return "Erro ao salvar o usuário: A senha deve ter no mínimo 8 caracteres.";
        }
        if (!isEmailValido(email)) {
            return "Erro ao salvar o usuário: O e-mail fornecido é inválido.";
        }
        if (!isCpfValido(cpf) && !isCnpjValido(cpf)) {
            return "Erro ao salvar o usuário: O CPF ou CNPJ fornecido é inválido.";
        }
        if (!isCepValido(cep)) {
            return "Erro ao salvar o usuário: O CEP fornecido é inválido.";
        }

        
        return "Usuário cadastrado com sucesso.";
    }

    private boolean isEmailValido(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(email).matches();
    }

    private boolean isCpfValido(String cpf) {
       
        return cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
    }

    private boolean isCnpjValido(String cnpj) {
        
        return cnpj.matches("\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}");
    }

    private boolean isCepValido(String cep) {
       
        return cep.matches("\\d{5}-\\d{3}");
    }
}
