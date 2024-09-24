package main.java.com.example;

public class Login {
    private String usuario;
    private String senha;

    public Login() {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String SenhaNull(String senha){
        if (senha == null){
            return "A senha é obrigatoria";
        }else{
            return "Sucesso";
        }
        
                
    }

    public String LoginInvalido(String usuario, String senha) {
        if (!usuario.equals("admin") || !senha.equals("123")) {
            return "Login ou senha errados";
        }
        return "Login bem-sucedido";
    }

    public String SenhaMinima(String senha){
        if (senha.length() <= 3) {
            return "A senha deve ter mais de 3 dígitos.";
        }

        return "Senha válida.";
    }
    

}
    
   