package uml.teaching.test;

import org.junit.Assert;
import org.junit.Test;

import uml.teaching.plugin.Activator;

public class ActivatorTest {

	@Test
	public void testActivatorId() {
		Assert.assertNotNull(Activator.PLUGIN_ID);
	}

}
