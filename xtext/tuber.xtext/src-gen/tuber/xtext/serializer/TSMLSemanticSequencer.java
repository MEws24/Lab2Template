/*
 * generated by Xtext 2.35.0
 */
package tuber.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import tuber.TUber;
import tuber.TuberPackage;
import tuber.xtext.services.TSMLGrammarAccess;

@SuppressWarnings("all")
public class TSMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TSMLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TuberPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TuberPackage.TUBER:
				sequence_TUber(context, (TUber) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     TUber returns TUber
	 *
	 * Constraint:
	 *     {TUber}
	 * </pre>
	 */
	protected void sequence_TUber(ISerializationContext context, TUber semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
