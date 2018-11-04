package de.arcadius.firstApp.util;

import de.arcadius.firstApp.utility.TextUtil;
import org.junit.Assert;
import org.junit.Test;

public class TextUtilTest {

    @Test
    public void shouldSanitize() {
        Assert.assertEquals("lorem ipsum dolor sit.", new TextUtil().sanitize("lorem  ipsum   dolor \n sit."));
        Assert.assertEquals("lorem ipsum dolor sit.", new TextUtil().sanitize("lorem ipsum dolor sit."));
        Assert.assertEquals("lorem ipsum dolor sit.", new TextUtil().sanitize("lorem ipsum dolor  sit."));
    }
}
