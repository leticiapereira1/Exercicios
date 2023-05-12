
import com.mysql.cj.protocol.Message;
import com.mysql.cj.xdevapi.Session;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import org.example.jdbc.CriarBanco;
import org.junit.Assert;
import org.junit.Test;
import sun.rmi.transport.Transport;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import static org.junit.Assert.assertEquals;

public class HealthBotsTest {

    @Test

    public void testarAcessoaoBanco (){

        CriarBanco criarBanco = new CriarBanco();

        String senhaEsperada = "12345678";

        String senhaRecebida = "00000000";

        assertEquals(senhaEsperada, senhaRecebida);



    }



}
