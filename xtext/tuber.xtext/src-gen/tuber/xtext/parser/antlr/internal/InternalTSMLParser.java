package tuber.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import tuber.xtext.services.TSMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTSMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalTSMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTSMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTSMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTSML.g"; }



     	private TSMLGrammarAccess grammarAccess;

        public InternalTSMLParser(TokenStream input, TSMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TUber";
       	}

       	@Override
       	protected TSMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTUber"
    // InternalTSML.g:64:1: entryRuleTUber returns [EObject current=null] : iv_ruleTUber= ruleTUber EOF ;
    public final EObject entryRuleTUber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTUber = null;


        try {
            // InternalTSML.g:64:46: (iv_ruleTUber= ruleTUber EOF )
            // InternalTSML.g:65:2: iv_ruleTUber= ruleTUber EOF
            {
             newCompositeNode(grammarAccess.getTUberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTUber=ruleTUber();

            state._fsp--;

             current =iv_ruleTUber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTUber"


    // $ANTLR start "ruleTUber"
    // InternalTSML.g:71:1: ruleTUber returns [EObject current=null] : () ;
    public final EObject ruleTUber() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalTSML.g:77:2: ( () )
            // InternalTSML.g:78:2: ()
            {
            // InternalTSML.g:78:2: ()
            // InternalTSML.g:79:3: 
            {

            			current = forceCreateModelElement(
            				grammarAccess.getTUberAccess().getTUberAction(),
            				current);
            		

            }


            }


            	leaveRule();

        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTUber"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});

}