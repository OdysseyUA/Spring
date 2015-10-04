package org.springbyexample.di.xml;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:SetterMessageTest-context.xml")
public class SetterMessageTest {
    final Logger logger = LoggerFactory.getLogger(SetterMessageTest.class);

    @Autowired
    private SetterMessage message;

    /**
     * Tests message.
     */
    @Test
    public void testMessage() {
        assertNotNull("Constructor message instance is null.", message);
        String msg = message.getMsg();
        assertNotNull("Message is null.", msg);
        String expectedMessage = "Spring is fun.";
        assertEquals("Message should be '" + expectedMessage + "'.", expectedMessage, msg);
        logger.info("message='{}'", msg);
    }
}
