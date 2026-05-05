package gregtech.api.util;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class GTSplitTest {

    @Test
    void splitFormattedKeepsValidFormatStrings() {
        assertArrayEquals(new String[] { "first alpha", "second beta" },
            GTSplit.splitFormatted("first %s" + GTSplit.LB + "second %s", "alpha", "beta"));
    }

    @Test
    void splitFormattedToleratesSpaceFlagOnStringPlaceholder() {
        assertArrayEquals(new String[] { "first alpha", "second beta" },
            GTSplit.splitFormatted("first % s" + GTSplit.LB + "second % s", "alpha", "beta"));
    }
}
