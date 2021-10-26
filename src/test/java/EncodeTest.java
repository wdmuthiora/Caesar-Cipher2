import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.*;

public class EncodeTest {
    @Test
    @DisplayName("Encode Instantiates Correctly.")
    public void encode_instantiatesCorrectly() {
        Encode encode = new Encode();
        assertTrue(encode instanceof Encode);
    }
}