import org.junit.jupiter.api.Test;

import com.example.Usuario;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {




    //teste01
    @Test
    public void testCadastroSucesso() {
        Usuario usuario = new Usuario("Erick Ribeiro", "erick.ribeiro@example.com", "senha123", "senha123", "123.456.789-09", "12345-678");
        String resultado = usuario.cadastrar();
        assertEquals("Usuário cadastrado com sucesso.", resultado);
    }


    //teste01
    @Test
    public void testSenhaDiferente() {
        Usuario usuario = new Usuario("Erick Ribeiro", "erick.ribeiro@example.com", "senha123", "senha456", "123.456.789-09", "12345-678");
        String resultado = usuario.cadastrar();
        assertEquals("Erro ao salvar o usuário: A senha e a confirmação de senha não correspondem.", resultado);
    }

    //teste02
    @Test
    public void testNomeVazio() {
        Usuario usuario = new Usuario("", "erick.ribeiro@example.com", "senha123", "senha123", "123.456.789-09", "12345-678");
        String resultado = usuario.cadastrar();
        assertEquals("Erro ao salvar o usuário: O nome é obrigatório.", resultado);
    }

    //teste03
    @Test
    public void testEmailVazio() {
        Usuario usuario = new Usuario("Erick Ribeiro", "", "senha123", "senha123", "123.456.789-09", "12345-678");
        String resultado = usuario.cadastrar();
        assertEquals("Erro ao salvar o usuário: O e-mail é obrigatório.", resultado);
    }

    //teste04
    @Test
    public void testSenhaVazia() {
        Usuario usuario = new Usuario("Erick Ribeiro", "erick.ribeiro@example.com", "", "", "123.456.789-09", "12345-678");
        String resultado = usuario.cadastrar();
        assertEquals("Erro ao salvar o usuário: A senha e a confirmação de senha são obrigatórias.", resultado);
    }

    //teste05
    @Test
    public void testCpfVazio() {
        Usuario usuario = new Usuario("Erick Ribeiro", "erick.ribeiro@example.com", "senha123", "senha123", "", "12345-678");
        String resultado = usuario.cadastrar();
        assertEquals("Erro ao salvar o usuário: O CPF ou CNPJ é obrigatório.", resultado);
    }

    //teste06
    @Test
    public void testCepVazio() {
        Usuario usuario = new Usuario("Erick Ribeiro", "erick.ribeiro@example.com", "senha123", "senha123", "123.456.789-09", "");
        String resultado = usuario.cadastrar();
        assertEquals("Erro ao salvar o usuário: O CEP é obrigatório.", resultado);
    }

    //teste07
    @Test
    public void testEmailInvalido() {
        Usuario usuario = new Usuario("Erick Ribeiro", "erick.ribeiro@", "senha123", "senha123", "123.456.789-09", "12345-678");
        String resultado = usuario.cadastrar();
        assertEquals("Erro ao salvar o usuário: O e-mail fornecido é inválido.", resultado);
    }

    //teste08
    @Test
    public void testSenhaMenorQueOitoCaracteres() {
        Usuario usuario = new Usuario("Erick Ribeiro", "erick.ribeiro@example.com", "senha7", "senha7", "123.456.789-09", "12345-678");
        String resultado = usuario.cadastrar();
        assertEquals("Erro ao salvar o usuário: A senha deve ter no mínimo 8 caracteres.", resultado);
    }

    //teste09
    @Test
    public void testCpfInvalido() {
        Usuario usuario = new Usuario("Erick Ribeiro", "erick.ribeiro@example.com", "senha123", "senha123", "123.456.789-00", "12345-678");
        String resultado = usuario.cadastrar();
        assertEquals("Erro ao salvar o usuário: O CPF ou CNPJ fornecido é inválido.", resultado);
    }

    //teste10

    @Test
    public void testCnpjInvalido() {
        Usuario usuario = new Usuario("Erick Ribeiro", "erick.ribeiro@example.com", "senha123", "senha123", "00.000.000/0000-00", "12345-678");
        String resultado = usuario.cadastrar();
        assertEquals("Erro ao salvar o usuário: O CPF ou CNPJ fornecido é inválido.", resultado);
    }

    //teste11
    @Test
    public void testCepInvalido() {
        Usuario usuario = new Usuario("Erick Ribeiro", "erick.ribeiro@example.com", "senha123", "senha123", "123.456.789-09", "1234-567");
        String resultado = usuario.cadastrar();
        assertEquals("Erro ao salvar o usuário: O CEP fornecido é inválido.", resultado);
    }
}
