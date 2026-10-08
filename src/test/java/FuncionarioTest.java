
import org.example.entity.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FuncionarioTest {

    private Funcionario funcionario;

    @BeforeEach
    void configurar() {
        // Um funcionário novo para cada teste, evitando que um teste "contamine" o outro
        funcionario = new Funcionario("Ana Silva", 3000.0);
    }

    @Test
    void funcionarioDeveNascerAtivo() {
        assertTrue(funcionario.isAtivo());
    }

    @Test
    void demitirDeveDesativarFuncionario() {
        funcionario.demitir();
        assertFalse(funcionario.isAtivo());
    }

    @Test
    void aumentarSalarioDeveAplicarPercentualCorretamente() {
        funcionario.aumentarSalario(10); // 10% de aumento
        assertEquals(3300.0, funcionario.getSalario());
    }
}