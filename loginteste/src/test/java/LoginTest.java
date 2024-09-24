import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.com.example.Login;

public class LoginTest {
    
    @Test
    public void testSenhaNull() {
        Login login = new Login();
        String resultado = login.SenhaNull(null); 
        assertEquals("A senha é obrigatoria", resultado); 
    }

    @Test
    public void testLoginInvalido(){
        Login login = new Login();
        String resultado = login.LoginInvalido("admin", "1234");
        assertEquals("Login ou senha errados", resultado );
    }

    
        @Test
        public void testSenhaValida() {
            Login login = new Login();
            String resultado = login.SenhaMinima("admin");
            assertEquals("Senha válida.", resultado);
        }
    }





