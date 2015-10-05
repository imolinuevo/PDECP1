package singleton.factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class ReferencesFactoryTest {

    @Test
    public void testReferencesFactoryIsSingleton() {
        assertSame(ReferencesFactory.getReferencesFactory(), ReferencesFactory.getReferencesFactory());
    }

    @Test
    public void testReferencesFactorySingletonNotNull() {
        assertNotNull(ReferencesFactory.getReferencesFactory());
    }

    @Test
    public void testReferencesFactory() {
        assertEquals(0, ReferencesFactory.getReferencesFactory().getReference("cero"));
        assertEquals(1, ReferencesFactory.getReferencesFactory().getReference("uno"));
        ReferencesFactory.getReferencesFactory().removeReference("cero");
        assertEquals(2, ReferencesFactory.getReferencesFactory().getReference("cero"));
    }
}