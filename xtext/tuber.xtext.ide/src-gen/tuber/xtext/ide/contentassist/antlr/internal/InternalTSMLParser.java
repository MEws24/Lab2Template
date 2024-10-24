package tuber.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import tuber.xtext.services.TSMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTSMLParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(TSMLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTUber"
    // InternalTSML.g:53:1: entryRuleTUber : ruleTUber EOF ;
    public final void entryRuleTUber() throws RecognitionException {
        try {
            // InternalTSML.g:54:1: ( ruleTUber EOF )
            // InternalTSML.g:55:1: ruleTUber EOF
            {
             before(grammarAccess.getTUberRule()); 
            pushFollow(FOLLOW_1);
            ruleTUber();

            state._fsp--;

             after(grammarAccess.getTUberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTUber"


    // $ANTLR start "ruleTUber"
    // InternalTSML.g:62:1: ruleTUber : ( () ) ;
    public final void ruleTUber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSML.g:66:2: ( ( () ) )
            // InternalTSML.g:67:2: ( () )
            {
            // InternalTSML.g:67:2: ( () )
            // InternalTSML.g:68:3: ()
            {
             before(grammarAccess.getTUberAccess().getTUberAction()); 
            // InternalTSML.g:69:3: ()
            // InternalTSML.g:69:4: 
            {
            }

             after(grammarAccess.getTUberAccess().getTUberAction()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTUber"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});

}