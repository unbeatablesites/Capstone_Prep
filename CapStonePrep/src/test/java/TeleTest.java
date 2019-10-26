import org.junit.Test;

import static org.junit.Assert.*;

public class TeleTest {

    @Test
    public void shouldReturnTrueForPowerOn() {

        Tele tel = new Tele();

        assertTrue(tel.powerOn());

    }

    @Test
    public void powerOff() {

        Tele tel = new Tele();

        assertFalse(tel.powerOff());
    }
}