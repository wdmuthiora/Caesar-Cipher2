import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeTest {
    @Test
    @DisplayName("Decode Instantiates Correctly.")
    public void newDecode_instantiatesCorrectly(){
        Decode decode = new Decode();
        assertTrue(decode instanceof Decode);
    }

}