package uml.teaching.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * This is a parameterized test to validate all model in the plugin
 * 
 * @author Benoit Maggi
 */
@SuppressWarnings("nls")
@RunWith(Parameterized.class)
public class ModelValidationTest {

	private static final String PLUGIN_ID = "uml.teaching.plugin"; 

	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
			{"/resources/CompositeStructure.paletteconfiguration"},
			{"/resources/PapyrusInteractionOverviewDiagram.paletteconfiguration"},
			{"/resources/PapyrusUMLActivityDiagram.paletteconfiguration"},
			{"/resources/PapyrusUMLClassDiagram.paletteconfiguration"},
			{"/resources/PapyrusUMLCommunicationDiagram.paletteconfiguration"},
			{"/resources/PapyrusUMLComponentDiagram.paletteconfiguration"},
			{"/resources/PapyrusUMLDeploymentDiagram.paletteconfiguration"},
			{"/resources/PapyrusUMLProfileDiagram.paletteconfiguration"},
			{"/resources/PapyrusUMLSequenceDiagram.paletteconfiguration"},
			{"/resources/PapyrusUMLStateMachineDiagram.paletteconfiguration"},
			{"/resources/teaching.architecture"},
			{"/resources/UML.creationmenumodel"},
			{"/resources/UMLEdges.creationmenumodel"},
			{"/resources/UseCase.paletteconfiguration"},
		});
	}

	private String modelPath; 
	    
	public ModelValidationTest(String modelPath) {
		this.modelPath = modelPath;
	}
	
	/**
	 * Validate the model with the rules defined in the meta-model tooling
	 */
	@Test
	public void validateModel() {
		String fullPath = PLUGIN_ID + this.modelPath;
		URI modelPlatformURI = URI.createPlatformPluginURI(fullPath, true);
		Resource resource = new ResourceSetImpl().getResource(modelPlatformURI, true);
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
		Assert.assertEquals("The "+modelPath+" model is invalid "+print(diagnostic), Diagnostic.OK, diagnostic.getSeverity());
	}

	private String print(Diagnostic diagnostic) {
		List<Diagnostic> children = diagnostic.getChildren();
		StringBuilder stringBuilder = new StringBuilder(diagnostic.getMessage());
		for (Diagnostic diagnosticChildren : children) {
			stringBuilder.append("\n"); //$NON-NLS-1$
			stringBuilder.append(diagnosticChildren.getMessage());
		}
		return stringBuilder.toString();
	}
}