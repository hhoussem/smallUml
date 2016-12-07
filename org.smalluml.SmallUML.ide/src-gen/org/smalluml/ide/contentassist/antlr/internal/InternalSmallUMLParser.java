package org.smalluml.ide.contentassist.antlr.internal;

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
import org.smalluml.services.SmallUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'}'", "'class'", "','", "'relation'", "'Class'", "'parents'", "'('", "')'", "'attributes'", "'methods'", "'Relation'", "'from'", "'to'", "'cardinality'", "'Attribute'", "'typedValue'", "'Method'", "'returnTypedValue'", "'parameters'", "'Type'", "'Boolean'", "'Real'", "'Integer'", "'String'", "'Infinity'", "'Enumeration'", "'value'", "'Cardinality'", "'lowerBound'", "'upperBound'", "'-'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSmallUMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallUMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallUMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmallUML.g"; }


    	private SmallUMLGrammarAccess grammarAccess;

    	public void setGrammarAccess(SmallUMLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRulePackage"
    // InternalSmallUML.g:53:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalSmallUML.g:54:1: ( rulePackage EOF )
            // InternalSmallUML.g:55:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalSmallUML.g:62:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:66:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalSmallUML.g:67:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalSmallUML.g:67:2: ( ( rule__Package__Group__0 ) )
            // InternalSmallUML.g:68:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalSmallUML.g:69:3: ( rule__Package__Group__0 )
            // InternalSmallUML.g:69:4: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleType"
    // InternalSmallUML.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalSmallUML.g:79:1: ( ruleType EOF )
            // InternalSmallUML.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSmallUML.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSmallUML.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSmallUML.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalSmallUML.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSmallUML.g:94:3: ( rule__Type__Alternatives )
            // InternalSmallUML.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleClass"
    // InternalSmallUML.g:103:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalSmallUML.g:104:1: ( ruleClass EOF )
            // InternalSmallUML.g:105:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalSmallUML.g:112:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:116:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalSmallUML.g:117:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalSmallUML.g:117:2: ( ( rule__Class__Group__0 ) )
            // InternalSmallUML.g:118:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalSmallUML.g:119:3: ( rule__Class__Group__0 )
            // InternalSmallUML.g:119:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleRelation"
    // InternalSmallUML.g:128:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalSmallUML.g:129:1: ( ruleRelation EOF )
            // InternalSmallUML.g:130:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalSmallUML.g:137:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:141:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalSmallUML.g:142:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalSmallUML.g:142:2: ( ( rule__Relation__Group__0 ) )
            // InternalSmallUML.g:143:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalSmallUML.g:144:3: ( rule__Relation__Group__0 )
            // InternalSmallUML.g:144:4: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleEString"
    // InternalSmallUML.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSmallUML.g:154:1: ( ruleEString EOF )
            // InternalSmallUML.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSmallUML.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSmallUML.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSmallUML.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalSmallUML.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSmallUML.g:169:3: ( rule__EString__Alternatives )
            // InternalSmallUML.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAttribute"
    // InternalSmallUML.g:178:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSmallUML.g:179:1: ( ruleAttribute EOF )
            // InternalSmallUML.g:180:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSmallUML.g:187:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:191:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalSmallUML.g:192:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalSmallUML.g:192:2: ( ( rule__Attribute__Group__0 ) )
            // InternalSmallUML.g:193:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalSmallUML.g:194:3: ( rule__Attribute__Group__0 )
            // InternalSmallUML.g:194:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleMethod"
    // InternalSmallUML.g:203:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalSmallUML.g:204:1: ( ruleMethod EOF )
            // InternalSmallUML.g:205:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalSmallUML.g:212:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:216:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalSmallUML.g:217:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalSmallUML.g:217:2: ( ( rule__Method__Group__0 ) )
            // InternalSmallUML.g:218:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalSmallUML.g:219:3: ( rule__Method__Group__0 )
            // InternalSmallUML.g:219:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleType_Impl"
    // InternalSmallUML.g:228:1: entryRuleType_Impl : ruleType_Impl EOF ;
    public final void entryRuleType_Impl() throws RecognitionException {
        try {
            // InternalSmallUML.g:229:1: ( ruleType_Impl EOF )
            // InternalSmallUML.g:230:1: ruleType_Impl EOF
            {
             before(grammarAccess.getType_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleType_Impl();

            state._fsp--;

             after(grammarAccess.getType_ImplRule()); 
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
    // $ANTLR end "entryRuleType_Impl"


    // $ANTLR start "ruleType_Impl"
    // InternalSmallUML.g:237:1: ruleType_Impl : ( ( rule__Type_Impl__Group__0 ) ) ;
    public final void ruleType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:241:2: ( ( ( rule__Type_Impl__Group__0 ) ) )
            // InternalSmallUML.g:242:2: ( ( rule__Type_Impl__Group__0 ) )
            {
            // InternalSmallUML.g:242:2: ( ( rule__Type_Impl__Group__0 ) )
            // InternalSmallUML.g:243:3: ( rule__Type_Impl__Group__0 )
            {
             before(grammarAccess.getType_ImplAccess().getGroup()); 
            // InternalSmallUML.g:244:3: ( rule__Type_Impl__Group__0 )
            // InternalSmallUML.g:244:4: rule__Type_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getType_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType_Impl"


    // $ANTLR start "entryRuleBoolean"
    // InternalSmallUML.g:253:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalSmallUML.g:254:1: ( ruleBoolean EOF )
            // InternalSmallUML.g:255:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalSmallUML.g:262:1: ruleBoolean : ( ( rule__Boolean__Group__0 ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:266:2: ( ( ( rule__Boolean__Group__0 ) ) )
            // InternalSmallUML.g:267:2: ( ( rule__Boolean__Group__0 ) )
            {
            // InternalSmallUML.g:267:2: ( ( rule__Boolean__Group__0 ) )
            // InternalSmallUML.g:268:3: ( rule__Boolean__Group__0 )
            {
             before(grammarAccess.getBooleanAccess().getGroup()); 
            // InternalSmallUML.g:269:3: ( rule__Boolean__Group__0 )
            // InternalSmallUML.g:269:4: rule__Boolean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleReal"
    // InternalSmallUML.g:278:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // InternalSmallUML.g:279:1: ( ruleReal EOF )
            // InternalSmallUML.g:280:1: ruleReal EOF
            {
             before(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_1);
            ruleReal();

            state._fsp--;

             after(grammarAccess.getRealRule()); 
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
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // InternalSmallUML.g:287:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:291:2: ( ( ( rule__Real__Group__0 ) ) )
            // InternalSmallUML.g:292:2: ( ( rule__Real__Group__0 ) )
            {
            // InternalSmallUML.g:292:2: ( ( rule__Real__Group__0 ) )
            // InternalSmallUML.g:293:3: ( rule__Real__Group__0 )
            {
             before(grammarAccess.getRealAccess().getGroup()); 
            // InternalSmallUML.g:294:3: ( rule__Real__Group__0 )
            // InternalSmallUML.g:294:4: rule__Real__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRealAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleInteger"
    // InternalSmallUML.g:303:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalSmallUML.g:304:1: ( ruleInteger EOF )
            // InternalSmallUML.g:305:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalSmallUML.g:312:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:316:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalSmallUML.g:317:2: ( ( rule__Integer__Group__0 ) )
            {
            // InternalSmallUML.g:317:2: ( ( rule__Integer__Group__0 ) )
            // InternalSmallUML.g:318:3: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // InternalSmallUML.g:319:3: ( rule__Integer__Group__0 )
            // InternalSmallUML.g:319:4: rule__Integer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Integer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleString0"
    // InternalSmallUML.g:328:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalSmallUML.g:329:1: ( ruleString0 EOF )
            // InternalSmallUML.g:330:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalSmallUML.g:337:1: ruleString0 : ( ( rule__String0__Group__0 ) ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:341:2: ( ( ( rule__String0__Group__0 ) ) )
            // InternalSmallUML.g:342:2: ( ( rule__String0__Group__0 ) )
            {
            // InternalSmallUML.g:342:2: ( ( rule__String0__Group__0 ) )
            // InternalSmallUML.g:343:3: ( rule__String0__Group__0 )
            {
             before(grammarAccess.getString0Access().getGroup()); 
            // InternalSmallUML.g:344:3: ( rule__String0__Group__0 )
            // InternalSmallUML.g:344:4: rule__String0__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getString0Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleInfinity"
    // InternalSmallUML.g:353:1: entryRuleInfinity : ruleInfinity EOF ;
    public final void entryRuleInfinity() throws RecognitionException {
        try {
            // InternalSmallUML.g:354:1: ( ruleInfinity EOF )
            // InternalSmallUML.g:355:1: ruleInfinity EOF
            {
             before(grammarAccess.getInfinityRule()); 
            pushFollow(FOLLOW_1);
            ruleInfinity();

            state._fsp--;

             after(grammarAccess.getInfinityRule()); 
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
    // $ANTLR end "entryRuleInfinity"


    // $ANTLR start "ruleInfinity"
    // InternalSmallUML.g:362:1: ruleInfinity : ( ( rule__Infinity__Group__0 ) ) ;
    public final void ruleInfinity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:366:2: ( ( ( rule__Infinity__Group__0 ) ) )
            // InternalSmallUML.g:367:2: ( ( rule__Infinity__Group__0 ) )
            {
            // InternalSmallUML.g:367:2: ( ( rule__Infinity__Group__0 ) )
            // InternalSmallUML.g:368:3: ( rule__Infinity__Group__0 )
            {
             before(grammarAccess.getInfinityAccess().getGroup()); 
            // InternalSmallUML.g:369:3: ( rule__Infinity__Group__0 )
            // InternalSmallUML.g:369:4: rule__Infinity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Infinity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInfinityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInfinity"


    // $ANTLR start "entryRuleEnumeration"
    // InternalSmallUML.g:378:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalSmallUML.g:379:1: ( ruleEnumeration EOF )
            // InternalSmallUML.g:380:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalSmallUML.g:387:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:391:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalSmallUML.g:392:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalSmallUML.g:392:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalSmallUML.g:393:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalSmallUML.g:394:3: ( rule__Enumeration__Group__0 )
            // InternalSmallUML.g:394:4: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleCardinality"
    // InternalSmallUML.g:403:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalSmallUML.g:404:1: ( ruleCardinality EOF )
            // InternalSmallUML.g:405:1: ruleCardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalSmallUML.g:412:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:416:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // InternalSmallUML.g:417:2: ( ( rule__Cardinality__Group__0 ) )
            {
            // InternalSmallUML.g:417:2: ( ( rule__Cardinality__Group__0 ) )
            // InternalSmallUML.g:418:3: ( rule__Cardinality__Group__0 )
            {
             before(grammarAccess.getCardinalityAccess().getGroup()); 
            // InternalSmallUML.g:419:3: ( rule__Cardinality__Group__0 )
            // InternalSmallUML.g:419:4: rule__Cardinality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleEInt"
    // InternalSmallUML.g:428:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSmallUML.g:429:1: ( ruleEInt EOF )
            // InternalSmallUML.g:430:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSmallUML.g:437:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:441:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSmallUML.g:442:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSmallUML.g:442:2: ( ( rule__EInt__Group__0 ) )
            // InternalSmallUML.g:443:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSmallUML.g:444:3: ( rule__EInt__Group__0 )
            // InternalSmallUML.g:444:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalSmallUML.g:452:1: rule__Type__Alternatives : ( ( ruleType_Impl ) | ( ruleBoolean ) | ( ruleReal ) | ( ruleInteger ) | ( ruleString0 ) | ( ruleInfinity ) | ( ruleEnumeration ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:456:1: ( ( ruleType_Impl ) | ( ruleBoolean ) | ( ruleReal ) | ( ruleInteger ) | ( ruleString0 ) | ( ruleInfinity ) | ( ruleEnumeration ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt1=1;
                }
                break;
            case 33:
                {
                alt1=2;
                }
                break;
            case 34:
                {
                alt1=3;
                }
                break;
            case 35:
                {
                alt1=4;
                }
                break;
            case 36:
                {
                alt1=5;
                }
                break;
            case 37:
                {
                alt1=6;
                }
                break;
            case 38:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSmallUML.g:457:2: ( ruleType_Impl )
                    {
                    // InternalSmallUML.g:457:2: ( ruleType_Impl )
                    // InternalSmallUML.g:458:3: ruleType_Impl
                    {
                     before(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleType_Impl();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:463:2: ( ruleBoolean )
                    {
                    // InternalSmallUML.g:463:2: ( ruleBoolean )
                    // InternalSmallUML.g:464:3: ruleBoolean
                    {
                     before(grammarAccess.getTypeAccess().getBooleanParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBooleanParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSmallUML.g:469:2: ( ruleReal )
                    {
                    // InternalSmallUML.g:469:2: ( ruleReal )
                    // InternalSmallUML.g:470:3: ruleReal
                    {
                     before(grammarAccess.getTypeAccess().getRealParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleReal();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getRealParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSmallUML.g:475:2: ( ruleInteger )
                    {
                    // InternalSmallUML.g:475:2: ( ruleInteger )
                    // InternalSmallUML.g:476:3: ruleInteger
                    {
                     before(grammarAccess.getTypeAccess().getIntegerParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleInteger();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getIntegerParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSmallUML.g:481:2: ( ruleString0 )
                    {
                    // InternalSmallUML.g:481:2: ( ruleString0 )
                    // InternalSmallUML.g:482:3: ruleString0
                    {
                     before(grammarAccess.getTypeAccess().getString0ParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleString0();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getString0ParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSmallUML.g:487:2: ( ruleInfinity )
                    {
                    // InternalSmallUML.g:487:2: ( ruleInfinity )
                    // InternalSmallUML.g:488:3: ruleInfinity
                    {
                     before(grammarAccess.getTypeAccess().getInfinityParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleInfinity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getInfinityParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSmallUML.g:493:2: ( ruleEnumeration )
                    {
                    // InternalSmallUML.g:493:2: ( ruleEnumeration )
                    // InternalSmallUML.g:494:3: ruleEnumeration
                    {
                     before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSmallUML.g:503:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:507:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmallUML.g:508:2: ( RULE_STRING )
                    {
                    // InternalSmallUML.g:508:2: ( RULE_STRING )
                    // InternalSmallUML.g:509:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:514:2: ( RULE_ID )
                    {
                    // InternalSmallUML.g:514:2: ( RULE_ID )
                    // InternalSmallUML.g:515:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Package__Group__0"
    // InternalSmallUML.g:524:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:528:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalSmallUML.g:529:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // InternalSmallUML.g:536:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:540:1: ( ( () ) )
            // InternalSmallUML.g:541:1: ( () )
            {
            // InternalSmallUML.g:541:1: ( () )
            // InternalSmallUML.g:542:2: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // InternalSmallUML.g:543:2: ()
            // InternalSmallUML.g:543:3: 
            {
            }

             after(grammarAccess.getPackageAccess().getPackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalSmallUML.g:551:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:555:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalSmallUML.g:556:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // InternalSmallUML.g:563:1: rule__Package__Group__1__Impl : ( 'Package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:567:1: ( ( 'Package' ) )
            // InternalSmallUML.g:568:1: ( 'Package' )
            {
            // InternalSmallUML.g:568:1: ( 'Package' )
            // InternalSmallUML.g:569:2: 'Package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // InternalSmallUML.g:578:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:582:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalSmallUML.g:583:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // InternalSmallUML.g:590:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:594:1: ( ( '{' ) )
            // InternalSmallUML.g:595:1: ( '{' )
            {
            // InternalSmallUML.g:595:1: ( '{' )
            // InternalSmallUML.g:596:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // InternalSmallUML.g:605:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:609:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalSmallUML.g:610:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // InternalSmallUML.g:617:1: rule__Package__Group__3__Impl : ( ( rule__Package__Group_3__0 )? ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:621:1: ( ( ( rule__Package__Group_3__0 )? ) )
            // InternalSmallUML.g:622:1: ( ( rule__Package__Group_3__0 )? )
            {
            // InternalSmallUML.g:622:1: ( ( rule__Package__Group_3__0 )? )
            // InternalSmallUML.g:623:2: ( rule__Package__Group_3__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_3()); 
            // InternalSmallUML.g:624:2: ( rule__Package__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSmallUML.g:624:3: rule__Package__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Package__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // InternalSmallUML.g:632:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:636:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalSmallUML.g:637:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // InternalSmallUML.g:644:1: rule__Package__Group__4__Impl : ( ( rule__Package__Group_4__0 )? ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:648:1: ( ( ( rule__Package__Group_4__0 )? ) )
            // InternalSmallUML.g:649:1: ( ( rule__Package__Group_4__0 )? )
            {
            // InternalSmallUML.g:649:1: ( ( rule__Package__Group_4__0 )? )
            // InternalSmallUML.g:650:2: ( rule__Package__Group_4__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_4()); 
            // InternalSmallUML.g:651:2: ( rule__Package__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmallUML.g:651:3: rule__Package__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Package__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Package__Group__5"
    // InternalSmallUML.g:659:1: rule__Package__Group__5 : rule__Package__Group__5__Impl ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:663:1: ( rule__Package__Group__5__Impl )
            // InternalSmallUML.g:664:2: rule__Package__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5"


    // $ANTLR start "rule__Package__Group__5__Impl"
    // InternalSmallUML.g:670:1: rule__Package__Group__5__Impl : ( '}' ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:674:1: ( ( '}' ) )
            // InternalSmallUML.g:675:1: ( '}' )
            {
            // InternalSmallUML.g:675:1: ( '}' )
            // InternalSmallUML.g:676:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5__Impl"


    // $ANTLR start "rule__Package__Group_3__0"
    // InternalSmallUML.g:686:1: rule__Package__Group_3__0 : rule__Package__Group_3__0__Impl rule__Package__Group_3__1 ;
    public final void rule__Package__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:690:1: ( rule__Package__Group_3__0__Impl rule__Package__Group_3__1 )
            // InternalSmallUML.g:691:2: rule__Package__Group_3__0__Impl rule__Package__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Package__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3__0"


    // $ANTLR start "rule__Package__Group_3__0__Impl"
    // InternalSmallUML.g:698:1: rule__Package__Group_3__0__Impl : ( 'class' ) ;
    public final void rule__Package__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:702:1: ( ( 'class' ) )
            // InternalSmallUML.g:703:1: ( 'class' )
            {
            // InternalSmallUML.g:703:1: ( 'class' )
            // InternalSmallUML.g:704:2: 'class'
            {
             before(grammarAccess.getPackageAccess().getClassKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getClassKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3__0__Impl"


    // $ANTLR start "rule__Package__Group_3__1"
    // InternalSmallUML.g:713:1: rule__Package__Group_3__1 : rule__Package__Group_3__1__Impl rule__Package__Group_3__2 ;
    public final void rule__Package__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:717:1: ( rule__Package__Group_3__1__Impl rule__Package__Group_3__2 )
            // InternalSmallUML.g:718:2: rule__Package__Group_3__1__Impl rule__Package__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3__1"


    // $ANTLR start "rule__Package__Group_3__1__Impl"
    // InternalSmallUML.g:725:1: rule__Package__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Package__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:729:1: ( ( '{' ) )
            // InternalSmallUML.g:730:1: ( '{' )
            {
            // InternalSmallUML.g:730:1: ( '{' )
            // InternalSmallUML.g:731:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3__1__Impl"


    // $ANTLR start "rule__Package__Group_3__2"
    // InternalSmallUML.g:740:1: rule__Package__Group_3__2 : rule__Package__Group_3__2__Impl rule__Package__Group_3__3 ;
    public final void rule__Package__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:744:1: ( rule__Package__Group_3__2__Impl rule__Package__Group_3__3 )
            // InternalSmallUML.g:745:2: rule__Package__Group_3__2__Impl rule__Package__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3__2"


    // $ANTLR start "rule__Package__Group_3__2__Impl"
    // InternalSmallUML.g:752:1: rule__Package__Group_3__2__Impl : ( ( rule__Package__ClassAssignment_3_2 ) ) ;
    public final void rule__Package__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:756:1: ( ( ( rule__Package__ClassAssignment_3_2 ) ) )
            // InternalSmallUML.g:757:1: ( ( rule__Package__ClassAssignment_3_2 ) )
            {
            // InternalSmallUML.g:757:1: ( ( rule__Package__ClassAssignment_3_2 ) )
            // InternalSmallUML.g:758:2: ( rule__Package__ClassAssignment_3_2 )
            {
             before(grammarAccess.getPackageAccess().getClassAssignment_3_2()); 
            // InternalSmallUML.g:759:2: ( rule__Package__ClassAssignment_3_2 )
            // InternalSmallUML.g:759:3: rule__Package__ClassAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Package__ClassAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getClassAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3__2__Impl"


    // $ANTLR start "rule__Package__Group_3__3"
    // InternalSmallUML.g:767:1: rule__Package__Group_3__3 : rule__Package__Group_3__3__Impl rule__Package__Group_3__4 ;
    public final void rule__Package__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:771:1: ( rule__Package__Group_3__3__Impl rule__Package__Group_3__4 )
            // InternalSmallUML.g:772:2: rule__Package__Group_3__3__Impl rule__Package__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3__3"


    // $ANTLR start "rule__Package__Group_3__3__Impl"
    // InternalSmallUML.g:779:1: rule__Package__Group_3__3__Impl : ( ( rule__Package__Group_3_3__0 )* ) ;
    public final void rule__Package__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:783:1: ( ( ( rule__Package__Group_3_3__0 )* ) )
            // InternalSmallUML.g:784:1: ( ( rule__Package__Group_3_3__0 )* )
            {
            // InternalSmallUML.g:784:1: ( ( rule__Package__Group_3_3__0 )* )
            // InternalSmallUML.g:785:2: ( rule__Package__Group_3_3__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_3_3()); 
            // InternalSmallUML.g:786:2: ( rule__Package__Group_3_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmallUML.g:786:3: rule__Package__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Package__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3__3__Impl"


    // $ANTLR start "rule__Package__Group_3__4"
    // InternalSmallUML.g:794:1: rule__Package__Group_3__4 : rule__Package__Group_3__4__Impl ;
    public final void rule__Package__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:798:1: ( rule__Package__Group_3__4__Impl )
            // InternalSmallUML.g:799:2: rule__Package__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3__4"


    // $ANTLR start "rule__Package__Group_3__4__Impl"
    // InternalSmallUML.g:805:1: rule__Package__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Package__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:809:1: ( ( '}' ) )
            // InternalSmallUML.g:810:1: ( '}' )
            {
            // InternalSmallUML.g:810:1: ( '}' )
            // InternalSmallUML.g:811:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3__4__Impl"


    // $ANTLR start "rule__Package__Group_3_3__0"
    // InternalSmallUML.g:821:1: rule__Package__Group_3_3__0 : rule__Package__Group_3_3__0__Impl rule__Package__Group_3_3__1 ;
    public final void rule__Package__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:825:1: ( rule__Package__Group_3_3__0__Impl rule__Package__Group_3_3__1 )
            // InternalSmallUML.g:826:2: rule__Package__Group_3_3__0__Impl rule__Package__Group_3_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3_3__0"


    // $ANTLR start "rule__Package__Group_3_3__0__Impl"
    // InternalSmallUML.g:833:1: rule__Package__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Package__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:837:1: ( ( ',' ) )
            // InternalSmallUML.g:838:1: ( ',' )
            {
            // InternalSmallUML.g:838:1: ( ',' )
            // InternalSmallUML.g:839:2: ','
            {
             before(grammarAccess.getPackageAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3_3__0__Impl"


    // $ANTLR start "rule__Package__Group_3_3__1"
    // InternalSmallUML.g:848:1: rule__Package__Group_3_3__1 : rule__Package__Group_3_3__1__Impl ;
    public final void rule__Package__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:852:1: ( rule__Package__Group_3_3__1__Impl )
            // InternalSmallUML.g:853:2: rule__Package__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3_3__1"


    // $ANTLR start "rule__Package__Group_3_3__1__Impl"
    // InternalSmallUML.g:859:1: rule__Package__Group_3_3__1__Impl : ( ( rule__Package__ClassAssignment_3_3_1 ) ) ;
    public final void rule__Package__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:863:1: ( ( ( rule__Package__ClassAssignment_3_3_1 ) ) )
            // InternalSmallUML.g:864:1: ( ( rule__Package__ClassAssignment_3_3_1 ) )
            {
            // InternalSmallUML.g:864:1: ( ( rule__Package__ClassAssignment_3_3_1 ) )
            // InternalSmallUML.g:865:2: ( rule__Package__ClassAssignment_3_3_1 )
            {
             before(grammarAccess.getPackageAccess().getClassAssignment_3_3_1()); 
            // InternalSmallUML.g:866:2: ( rule__Package__ClassAssignment_3_3_1 )
            // InternalSmallUML.g:866:3: rule__Package__ClassAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Package__ClassAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getClassAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3_3__1__Impl"


    // $ANTLR start "rule__Package__Group_4__0"
    // InternalSmallUML.g:875:1: rule__Package__Group_4__0 : rule__Package__Group_4__0__Impl rule__Package__Group_4__1 ;
    public final void rule__Package__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:879:1: ( rule__Package__Group_4__0__Impl rule__Package__Group_4__1 )
            // InternalSmallUML.g:880:2: rule__Package__Group_4__0__Impl rule__Package__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Package__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__0"


    // $ANTLR start "rule__Package__Group_4__0__Impl"
    // InternalSmallUML.g:887:1: rule__Package__Group_4__0__Impl : ( 'relation' ) ;
    public final void rule__Package__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:891:1: ( ( 'relation' ) )
            // InternalSmallUML.g:892:1: ( 'relation' )
            {
            // InternalSmallUML.g:892:1: ( 'relation' )
            // InternalSmallUML.g:893:2: 'relation'
            {
             before(grammarAccess.getPackageAccess().getRelationKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getRelationKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__0__Impl"


    // $ANTLR start "rule__Package__Group_4__1"
    // InternalSmallUML.g:902:1: rule__Package__Group_4__1 : rule__Package__Group_4__1__Impl rule__Package__Group_4__2 ;
    public final void rule__Package__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:906:1: ( rule__Package__Group_4__1__Impl rule__Package__Group_4__2 )
            // InternalSmallUML.g:907:2: rule__Package__Group_4__1__Impl rule__Package__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__Package__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__1"


    // $ANTLR start "rule__Package__Group_4__1__Impl"
    // InternalSmallUML.g:914:1: rule__Package__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Package__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:918:1: ( ( '{' ) )
            // InternalSmallUML.g:919:1: ( '{' )
            {
            // InternalSmallUML.g:919:1: ( '{' )
            // InternalSmallUML.g:920:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__1__Impl"


    // $ANTLR start "rule__Package__Group_4__2"
    // InternalSmallUML.g:929:1: rule__Package__Group_4__2 : rule__Package__Group_4__2__Impl rule__Package__Group_4__3 ;
    public final void rule__Package__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:933:1: ( rule__Package__Group_4__2__Impl rule__Package__Group_4__3 )
            // InternalSmallUML.g:934:2: rule__Package__Group_4__2__Impl rule__Package__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__2"


    // $ANTLR start "rule__Package__Group_4__2__Impl"
    // InternalSmallUML.g:941:1: rule__Package__Group_4__2__Impl : ( ( rule__Package__RelationAssignment_4_2 ) ) ;
    public final void rule__Package__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:945:1: ( ( ( rule__Package__RelationAssignment_4_2 ) ) )
            // InternalSmallUML.g:946:1: ( ( rule__Package__RelationAssignment_4_2 ) )
            {
            // InternalSmallUML.g:946:1: ( ( rule__Package__RelationAssignment_4_2 ) )
            // InternalSmallUML.g:947:2: ( rule__Package__RelationAssignment_4_2 )
            {
             before(grammarAccess.getPackageAccess().getRelationAssignment_4_2()); 
            // InternalSmallUML.g:948:2: ( rule__Package__RelationAssignment_4_2 )
            // InternalSmallUML.g:948:3: rule__Package__RelationAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Package__RelationAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getRelationAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__2__Impl"


    // $ANTLR start "rule__Package__Group_4__3"
    // InternalSmallUML.g:956:1: rule__Package__Group_4__3 : rule__Package__Group_4__3__Impl rule__Package__Group_4__4 ;
    public final void rule__Package__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:960:1: ( rule__Package__Group_4__3__Impl rule__Package__Group_4__4 )
            // InternalSmallUML.g:961:2: rule__Package__Group_4__3__Impl rule__Package__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__3"


    // $ANTLR start "rule__Package__Group_4__3__Impl"
    // InternalSmallUML.g:968:1: rule__Package__Group_4__3__Impl : ( ( rule__Package__Group_4_3__0 )* ) ;
    public final void rule__Package__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:972:1: ( ( ( rule__Package__Group_4_3__0 )* ) )
            // InternalSmallUML.g:973:1: ( ( rule__Package__Group_4_3__0 )* )
            {
            // InternalSmallUML.g:973:1: ( ( rule__Package__Group_4_3__0 )* )
            // InternalSmallUML.g:974:2: ( rule__Package__Group_4_3__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_4_3()); 
            // InternalSmallUML.g:975:2: ( rule__Package__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSmallUML.g:975:3: rule__Package__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Package__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__3__Impl"


    // $ANTLR start "rule__Package__Group_4__4"
    // InternalSmallUML.g:983:1: rule__Package__Group_4__4 : rule__Package__Group_4__4__Impl ;
    public final void rule__Package__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:987:1: ( rule__Package__Group_4__4__Impl )
            // InternalSmallUML.g:988:2: rule__Package__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__4"


    // $ANTLR start "rule__Package__Group_4__4__Impl"
    // InternalSmallUML.g:994:1: rule__Package__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Package__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:998:1: ( ( '}' ) )
            // InternalSmallUML.g:999:1: ( '}' )
            {
            // InternalSmallUML.g:999:1: ( '}' )
            // InternalSmallUML.g:1000:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__4__Impl"


    // $ANTLR start "rule__Package__Group_4_3__0"
    // InternalSmallUML.g:1010:1: rule__Package__Group_4_3__0 : rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1 ;
    public final void rule__Package__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1014:1: ( rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1 )
            // InternalSmallUML.g:1015:2: rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Package__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4_3__0"


    // $ANTLR start "rule__Package__Group_4_3__0__Impl"
    // InternalSmallUML.g:1022:1: rule__Package__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Package__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1026:1: ( ( ',' ) )
            // InternalSmallUML.g:1027:1: ( ',' )
            {
            // InternalSmallUML.g:1027:1: ( ',' )
            // InternalSmallUML.g:1028:2: ','
            {
             before(grammarAccess.getPackageAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4_3__0__Impl"


    // $ANTLR start "rule__Package__Group_4_3__1"
    // InternalSmallUML.g:1037:1: rule__Package__Group_4_3__1 : rule__Package__Group_4_3__1__Impl ;
    public final void rule__Package__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1041:1: ( rule__Package__Group_4_3__1__Impl )
            // InternalSmallUML.g:1042:2: rule__Package__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4_3__1"


    // $ANTLR start "rule__Package__Group_4_3__1__Impl"
    // InternalSmallUML.g:1048:1: rule__Package__Group_4_3__1__Impl : ( ( rule__Package__RelationAssignment_4_3_1 ) ) ;
    public final void rule__Package__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1052:1: ( ( ( rule__Package__RelationAssignment_4_3_1 ) ) )
            // InternalSmallUML.g:1053:1: ( ( rule__Package__RelationAssignment_4_3_1 ) )
            {
            // InternalSmallUML.g:1053:1: ( ( rule__Package__RelationAssignment_4_3_1 ) )
            // InternalSmallUML.g:1054:2: ( rule__Package__RelationAssignment_4_3_1 )
            {
             before(grammarAccess.getPackageAccess().getRelationAssignment_4_3_1()); 
            // InternalSmallUML.g:1055:2: ( rule__Package__RelationAssignment_4_3_1 )
            // InternalSmallUML.g:1055:3: rule__Package__RelationAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Package__RelationAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getRelationAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4_3__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalSmallUML.g:1064:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1068:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalSmallUML.g:1069:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalSmallUML.g:1076:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1080:1: ( ( () ) )
            // InternalSmallUML.g:1081:1: ( () )
            {
            // InternalSmallUML.g:1081:1: ( () )
            // InternalSmallUML.g:1082:2: ()
            {
             before(grammarAccess.getClassAccess().getClassAction_0()); 
            // InternalSmallUML.g:1083:2: ()
            // InternalSmallUML.g:1083:3: 
            {
            }

             after(grammarAccess.getClassAccess().getClassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalSmallUML.g:1091:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1095:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalSmallUML.g:1096:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalSmallUML.g:1103:1: rule__Class__Group__1__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1107:1: ( ( 'Class' ) )
            // InternalSmallUML.g:1108:1: ( 'Class' )
            {
            // InternalSmallUML.g:1108:1: ( 'Class' )
            // InternalSmallUML.g:1109:2: 'Class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalSmallUML.g:1118:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1122:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalSmallUML.g:1123:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalSmallUML.g:1130:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1134:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalSmallUML.g:1135:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:1135:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalSmallUML.g:1136:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:1137:2: ( rule__Class__NameAssignment_2 )
            // InternalSmallUML.g:1137:3: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalSmallUML.g:1145:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1149:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalSmallUML.g:1150:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalSmallUML.g:1157:1: rule__Class__Group__3__Impl : ( '{' ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1161:1: ( ( '{' ) )
            // InternalSmallUML.g:1162:1: ( '{' )
            {
            // InternalSmallUML.g:1162:1: ( '{' )
            // InternalSmallUML.g:1163:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // InternalSmallUML.g:1172:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1176:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalSmallUML.g:1177:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // InternalSmallUML.g:1184:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1188:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalSmallUML.g:1189:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalSmallUML.g:1189:1: ( ( rule__Class__Group_4__0 )? )
            // InternalSmallUML.g:1190:2: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // InternalSmallUML.g:1191:2: ( rule__Class__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmallUML.g:1191:3: rule__Class__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // InternalSmallUML.g:1199:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1203:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalSmallUML.g:1204:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // InternalSmallUML.g:1211:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1215:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // InternalSmallUML.g:1216:1: ( ( rule__Class__Group_5__0 )? )
            {
            // InternalSmallUML.g:1216:1: ( ( rule__Class__Group_5__0 )? )
            // InternalSmallUML.g:1217:2: ( rule__Class__Group_5__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_5()); 
            // InternalSmallUML.g:1218:2: ( rule__Class__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmallUML.g:1218:3: rule__Class__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // InternalSmallUML.g:1226:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1230:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalSmallUML.g:1231:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // InternalSmallUML.g:1238:1: rule__Class__Group__6__Impl : ( ( rule__Class__Group_6__0 )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1242:1: ( ( ( rule__Class__Group_6__0 )? ) )
            // InternalSmallUML.g:1243:1: ( ( rule__Class__Group_6__0 )? )
            {
            // InternalSmallUML.g:1243:1: ( ( rule__Class__Group_6__0 )? )
            // InternalSmallUML.g:1244:2: ( rule__Class__Group_6__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_6()); 
            // InternalSmallUML.g:1245:2: ( rule__Class__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmallUML.g:1245:3: rule__Class__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group__7"
    // InternalSmallUML.g:1253:1: rule__Class__Group__7 : rule__Class__Group__7__Impl ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1257:1: ( rule__Class__Group__7__Impl )
            // InternalSmallUML.g:1258:2: rule__Class__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7"


    // $ANTLR start "rule__Class__Group__7__Impl"
    // InternalSmallUML.g:1264:1: rule__Class__Group__7__Impl : ( '}' ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1268:1: ( ( '}' ) )
            // InternalSmallUML.g:1269:1: ( '}' )
            {
            // InternalSmallUML.g:1269:1: ( '}' )
            // InternalSmallUML.g:1270:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7__Impl"


    // $ANTLR start "rule__Class__Group_4__0"
    // InternalSmallUML.g:1280:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1284:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalSmallUML.g:1285:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0"


    // $ANTLR start "rule__Class__Group_4__0__Impl"
    // InternalSmallUML.g:1292:1: rule__Class__Group_4__0__Impl : ( 'parents' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1296:1: ( ( 'parents' ) )
            // InternalSmallUML.g:1297:1: ( 'parents' )
            {
            // InternalSmallUML.g:1297:1: ( 'parents' )
            // InternalSmallUML.g:1298:2: 'parents'
            {
             before(grammarAccess.getClassAccess().getParentsKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getParentsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0__Impl"


    // $ANTLR start "rule__Class__Group_4__1"
    // InternalSmallUML.g:1307:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl rule__Class__Group_4__2 ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1311:1: ( rule__Class__Group_4__1__Impl rule__Class__Group_4__2 )
            // InternalSmallUML.g:1312:2: rule__Class__Group_4__1__Impl rule__Class__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1"


    // $ANTLR start "rule__Class__Group_4__1__Impl"
    // InternalSmallUML.g:1319:1: rule__Class__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1323:1: ( ( '(' ) )
            // InternalSmallUML.g:1324:1: ( '(' )
            {
            // InternalSmallUML.g:1324:1: ( '(' )
            // InternalSmallUML.g:1325:2: '('
            {
             before(grammarAccess.getClassAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1__Impl"


    // $ANTLR start "rule__Class__Group_4__2"
    // InternalSmallUML.g:1334:1: rule__Class__Group_4__2 : rule__Class__Group_4__2__Impl rule__Class__Group_4__3 ;
    public final void rule__Class__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1338:1: ( rule__Class__Group_4__2__Impl rule__Class__Group_4__3 )
            // InternalSmallUML.g:1339:2: rule__Class__Group_4__2__Impl rule__Class__Group_4__3
            {
            pushFollow(FOLLOW_13);
            rule__Class__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__2"


    // $ANTLR start "rule__Class__Group_4__2__Impl"
    // InternalSmallUML.g:1346:1: rule__Class__Group_4__2__Impl : ( ( rule__Class__ParentsAssignment_4_2 ) ) ;
    public final void rule__Class__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1350:1: ( ( ( rule__Class__ParentsAssignment_4_2 ) ) )
            // InternalSmallUML.g:1351:1: ( ( rule__Class__ParentsAssignment_4_2 ) )
            {
            // InternalSmallUML.g:1351:1: ( ( rule__Class__ParentsAssignment_4_2 ) )
            // InternalSmallUML.g:1352:2: ( rule__Class__ParentsAssignment_4_2 )
            {
             before(grammarAccess.getClassAccess().getParentsAssignment_4_2()); 
            // InternalSmallUML.g:1353:2: ( rule__Class__ParentsAssignment_4_2 )
            // InternalSmallUML.g:1353:3: rule__Class__ParentsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__ParentsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getParentsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__2__Impl"


    // $ANTLR start "rule__Class__Group_4__3"
    // InternalSmallUML.g:1361:1: rule__Class__Group_4__3 : rule__Class__Group_4__3__Impl rule__Class__Group_4__4 ;
    public final void rule__Class__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1365:1: ( rule__Class__Group_4__3__Impl rule__Class__Group_4__4 )
            // InternalSmallUML.g:1366:2: rule__Class__Group_4__3__Impl rule__Class__Group_4__4
            {
            pushFollow(FOLLOW_13);
            rule__Class__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__3"


    // $ANTLR start "rule__Class__Group_4__3__Impl"
    // InternalSmallUML.g:1373:1: rule__Class__Group_4__3__Impl : ( ( rule__Class__Group_4_3__0 )* ) ;
    public final void rule__Class__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1377:1: ( ( ( rule__Class__Group_4_3__0 )* ) )
            // InternalSmallUML.g:1378:1: ( ( rule__Class__Group_4_3__0 )* )
            {
            // InternalSmallUML.g:1378:1: ( ( rule__Class__Group_4_3__0 )* )
            // InternalSmallUML.g:1379:2: ( rule__Class__Group_4_3__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_4_3()); 
            // InternalSmallUML.g:1380:2: ( rule__Class__Group_4_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSmallUML.g:1380:3: rule__Class__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Class__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__3__Impl"


    // $ANTLR start "rule__Class__Group_4__4"
    // InternalSmallUML.g:1388:1: rule__Class__Group_4__4 : rule__Class__Group_4__4__Impl ;
    public final void rule__Class__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1392:1: ( rule__Class__Group_4__4__Impl )
            // InternalSmallUML.g:1393:2: rule__Class__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__4"


    // $ANTLR start "rule__Class__Group_4__4__Impl"
    // InternalSmallUML.g:1399:1: rule__Class__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Class__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1403:1: ( ( ')' ) )
            // InternalSmallUML.g:1404:1: ( ')' )
            {
            // InternalSmallUML.g:1404:1: ( ')' )
            // InternalSmallUML.g:1405:2: ')'
            {
             before(grammarAccess.getClassAccess().getRightParenthesisKeyword_4_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__4__Impl"


    // $ANTLR start "rule__Class__Group_4_3__0"
    // InternalSmallUML.g:1415:1: rule__Class__Group_4_3__0 : rule__Class__Group_4_3__0__Impl rule__Class__Group_4_3__1 ;
    public final void rule__Class__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1419:1: ( rule__Class__Group_4_3__0__Impl rule__Class__Group_4_3__1 )
            // InternalSmallUML.g:1420:2: rule__Class__Group_4_3__0__Impl rule__Class__Group_4_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4_3__0"


    // $ANTLR start "rule__Class__Group_4_3__0__Impl"
    // InternalSmallUML.g:1427:1: rule__Class__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1431:1: ( ( ',' ) )
            // InternalSmallUML.g:1432:1: ( ',' )
            {
            // InternalSmallUML.g:1432:1: ( ',' )
            // InternalSmallUML.g:1433:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4_3__0__Impl"


    // $ANTLR start "rule__Class__Group_4_3__1"
    // InternalSmallUML.g:1442:1: rule__Class__Group_4_3__1 : rule__Class__Group_4_3__1__Impl ;
    public final void rule__Class__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1446:1: ( rule__Class__Group_4_3__1__Impl )
            // InternalSmallUML.g:1447:2: rule__Class__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4_3__1"


    // $ANTLR start "rule__Class__Group_4_3__1__Impl"
    // InternalSmallUML.g:1453:1: rule__Class__Group_4_3__1__Impl : ( ( rule__Class__ParentsAssignment_4_3_1 ) ) ;
    public final void rule__Class__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1457:1: ( ( ( rule__Class__ParentsAssignment_4_3_1 ) ) )
            // InternalSmallUML.g:1458:1: ( ( rule__Class__ParentsAssignment_4_3_1 ) )
            {
            // InternalSmallUML.g:1458:1: ( ( rule__Class__ParentsAssignment_4_3_1 ) )
            // InternalSmallUML.g:1459:2: ( rule__Class__ParentsAssignment_4_3_1 )
            {
             before(grammarAccess.getClassAccess().getParentsAssignment_4_3_1()); 
            // InternalSmallUML.g:1460:2: ( rule__Class__ParentsAssignment_4_3_1 )
            // InternalSmallUML.g:1460:3: rule__Class__ParentsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__ParentsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getParentsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4_3__1__Impl"


    // $ANTLR start "rule__Class__Group_5__0"
    // InternalSmallUML.g:1469:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1473:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // InternalSmallUML.g:1474:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0"


    // $ANTLR start "rule__Class__Group_5__0__Impl"
    // InternalSmallUML.g:1481:1: rule__Class__Group_5__0__Impl : ( 'attributes' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1485:1: ( ( 'attributes' ) )
            // InternalSmallUML.g:1486:1: ( 'attributes' )
            {
            // InternalSmallUML.g:1486:1: ( 'attributes' )
            // InternalSmallUML.g:1487:2: 'attributes'
            {
             before(grammarAccess.getClassAccess().getAttributesKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAttributesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0__Impl"


    // $ANTLR start "rule__Class__Group_5__1"
    // InternalSmallUML.g:1496:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl rule__Class__Group_5__2 ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1500:1: ( rule__Class__Group_5__1__Impl rule__Class__Group_5__2 )
            // InternalSmallUML.g:1501:2: rule__Class__Group_5__1__Impl rule__Class__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__Class__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1"


    // $ANTLR start "rule__Class__Group_5__1__Impl"
    // InternalSmallUML.g:1508:1: rule__Class__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1512:1: ( ( '{' ) )
            // InternalSmallUML.g:1513:1: ( '{' )
            {
            // InternalSmallUML.g:1513:1: ( '{' )
            // InternalSmallUML.g:1514:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1__Impl"


    // $ANTLR start "rule__Class__Group_5__2"
    // InternalSmallUML.g:1523:1: rule__Class__Group_5__2 : rule__Class__Group_5__2__Impl rule__Class__Group_5__3 ;
    public final void rule__Class__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1527:1: ( rule__Class__Group_5__2__Impl rule__Class__Group_5__3 )
            // InternalSmallUML.g:1528:2: rule__Class__Group_5__2__Impl rule__Class__Group_5__3
            {
            pushFollow(FOLLOW_7);
            rule__Class__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__2"


    // $ANTLR start "rule__Class__Group_5__2__Impl"
    // InternalSmallUML.g:1535:1: rule__Class__Group_5__2__Impl : ( ( rule__Class__AttributesAssignment_5_2 ) ) ;
    public final void rule__Class__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1539:1: ( ( ( rule__Class__AttributesAssignment_5_2 ) ) )
            // InternalSmallUML.g:1540:1: ( ( rule__Class__AttributesAssignment_5_2 ) )
            {
            // InternalSmallUML.g:1540:1: ( ( rule__Class__AttributesAssignment_5_2 ) )
            // InternalSmallUML.g:1541:2: ( rule__Class__AttributesAssignment_5_2 )
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_5_2()); 
            // InternalSmallUML.g:1542:2: ( rule__Class__AttributesAssignment_5_2 )
            // InternalSmallUML.g:1542:3: rule__Class__AttributesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__AttributesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAttributesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__2__Impl"


    // $ANTLR start "rule__Class__Group_5__3"
    // InternalSmallUML.g:1550:1: rule__Class__Group_5__3 : rule__Class__Group_5__3__Impl rule__Class__Group_5__4 ;
    public final void rule__Class__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1554:1: ( rule__Class__Group_5__3__Impl rule__Class__Group_5__4 )
            // InternalSmallUML.g:1555:2: rule__Class__Group_5__3__Impl rule__Class__Group_5__4
            {
            pushFollow(FOLLOW_7);
            rule__Class__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__3"


    // $ANTLR start "rule__Class__Group_5__3__Impl"
    // InternalSmallUML.g:1562:1: rule__Class__Group_5__3__Impl : ( ( rule__Class__Group_5_3__0 )* ) ;
    public final void rule__Class__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1566:1: ( ( ( rule__Class__Group_5_3__0 )* ) )
            // InternalSmallUML.g:1567:1: ( ( rule__Class__Group_5_3__0 )* )
            {
            // InternalSmallUML.g:1567:1: ( ( rule__Class__Group_5_3__0 )* )
            // InternalSmallUML.g:1568:2: ( rule__Class__Group_5_3__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_5_3()); 
            // InternalSmallUML.g:1569:2: ( rule__Class__Group_5_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSmallUML.g:1569:3: rule__Class__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Class__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__3__Impl"


    // $ANTLR start "rule__Class__Group_5__4"
    // InternalSmallUML.g:1577:1: rule__Class__Group_5__4 : rule__Class__Group_5__4__Impl ;
    public final void rule__Class__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1581:1: ( rule__Class__Group_5__4__Impl )
            // InternalSmallUML.g:1582:2: rule__Class__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__4"


    // $ANTLR start "rule__Class__Group_5__4__Impl"
    // InternalSmallUML.g:1588:1: rule__Class__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Class__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1592:1: ( ( '}' ) )
            // InternalSmallUML.g:1593:1: ( '}' )
            {
            // InternalSmallUML.g:1593:1: ( '}' )
            // InternalSmallUML.g:1594:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__4__Impl"


    // $ANTLR start "rule__Class__Group_5_3__0"
    // InternalSmallUML.g:1604:1: rule__Class__Group_5_3__0 : rule__Class__Group_5_3__0__Impl rule__Class__Group_5_3__1 ;
    public final void rule__Class__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1608:1: ( rule__Class__Group_5_3__0__Impl rule__Class__Group_5_3__1 )
            // InternalSmallUML.g:1609:2: rule__Class__Group_5_3__0__Impl rule__Class__Group_5_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Class__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_3__0"


    // $ANTLR start "rule__Class__Group_5_3__0__Impl"
    // InternalSmallUML.g:1616:1: rule__Class__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1620:1: ( ( ',' ) )
            // InternalSmallUML.g:1621:1: ( ',' )
            {
            // InternalSmallUML.g:1621:1: ( ',' )
            // InternalSmallUML.g:1622:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_3__0__Impl"


    // $ANTLR start "rule__Class__Group_5_3__1"
    // InternalSmallUML.g:1631:1: rule__Class__Group_5_3__1 : rule__Class__Group_5_3__1__Impl ;
    public final void rule__Class__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1635:1: ( rule__Class__Group_5_3__1__Impl )
            // InternalSmallUML.g:1636:2: rule__Class__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_3__1"


    // $ANTLR start "rule__Class__Group_5_3__1__Impl"
    // InternalSmallUML.g:1642:1: rule__Class__Group_5_3__1__Impl : ( ( rule__Class__AttributesAssignment_5_3_1 ) ) ;
    public final void rule__Class__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1646:1: ( ( ( rule__Class__AttributesAssignment_5_3_1 ) ) )
            // InternalSmallUML.g:1647:1: ( ( rule__Class__AttributesAssignment_5_3_1 ) )
            {
            // InternalSmallUML.g:1647:1: ( ( rule__Class__AttributesAssignment_5_3_1 ) )
            // InternalSmallUML.g:1648:2: ( rule__Class__AttributesAssignment_5_3_1 )
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_5_3_1()); 
            // InternalSmallUML.g:1649:2: ( rule__Class__AttributesAssignment_5_3_1 )
            // InternalSmallUML.g:1649:3: rule__Class__AttributesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__AttributesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAttributesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_3__1__Impl"


    // $ANTLR start "rule__Class__Group_6__0"
    // InternalSmallUML.g:1658:1: rule__Class__Group_6__0 : rule__Class__Group_6__0__Impl rule__Class__Group_6__1 ;
    public final void rule__Class__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1662:1: ( rule__Class__Group_6__0__Impl rule__Class__Group_6__1 )
            // InternalSmallUML.g:1663:2: rule__Class__Group_6__0__Impl rule__Class__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__0"


    // $ANTLR start "rule__Class__Group_6__0__Impl"
    // InternalSmallUML.g:1670:1: rule__Class__Group_6__0__Impl : ( 'methods' ) ;
    public final void rule__Class__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1674:1: ( ( 'methods' ) )
            // InternalSmallUML.g:1675:1: ( 'methods' )
            {
            // InternalSmallUML.g:1675:1: ( 'methods' )
            // InternalSmallUML.g:1676:2: 'methods'
            {
             before(grammarAccess.getClassAccess().getMethodsKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getMethodsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__0__Impl"


    // $ANTLR start "rule__Class__Group_6__1"
    // InternalSmallUML.g:1685:1: rule__Class__Group_6__1 : rule__Class__Group_6__1__Impl rule__Class__Group_6__2 ;
    public final void rule__Class__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1689:1: ( rule__Class__Group_6__1__Impl rule__Class__Group_6__2 )
            // InternalSmallUML.g:1690:2: rule__Class__Group_6__1__Impl rule__Class__Group_6__2
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__1"


    // $ANTLR start "rule__Class__Group_6__1__Impl"
    // InternalSmallUML.g:1697:1: rule__Class__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1701:1: ( ( '{' ) )
            // InternalSmallUML.g:1702:1: ( '{' )
            {
            // InternalSmallUML.g:1702:1: ( '{' )
            // InternalSmallUML.g:1703:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__1__Impl"


    // $ANTLR start "rule__Class__Group_6__2"
    // InternalSmallUML.g:1712:1: rule__Class__Group_6__2 : rule__Class__Group_6__2__Impl rule__Class__Group_6__3 ;
    public final void rule__Class__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1716:1: ( rule__Class__Group_6__2__Impl rule__Class__Group_6__3 )
            // InternalSmallUML.g:1717:2: rule__Class__Group_6__2__Impl rule__Class__Group_6__3
            {
            pushFollow(FOLLOW_7);
            rule__Class__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__2"


    // $ANTLR start "rule__Class__Group_6__2__Impl"
    // InternalSmallUML.g:1724:1: rule__Class__Group_6__2__Impl : ( ( rule__Class__MethodsAssignment_6_2 ) ) ;
    public final void rule__Class__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1728:1: ( ( ( rule__Class__MethodsAssignment_6_2 ) ) )
            // InternalSmallUML.g:1729:1: ( ( rule__Class__MethodsAssignment_6_2 ) )
            {
            // InternalSmallUML.g:1729:1: ( ( rule__Class__MethodsAssignment_6_2 ) )
            // InternalSmallUML.g:1730:2: ( rule__Class__MethodsAssignment_6_2 )
            {
             before(grammarAccess.getClassAccess().getMethodsAssignment_6_2()); 
            // InternalSmallUML.g:1731:2: ( rule__Class__MethodsAssignment_6_2 )
            // InternalSmallUML.g:1731:3: rule__Class__MethodsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__MethodsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getMethodsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__2__Impl"


    // $ANTLR start "rule__Class__Group_6__3"
    // InternalSmallUML.g:1739:1: rule__Class__Group_6__3 : rule__Class__Group_6__3__Impl rule__Class__Group_6__4 ;
    public final void rule__Class__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1743:1: ( rule__Class__Group_6__3__Impl rule__Class__Group_6__4 )
            // InternalSmallUML.g:1744:2: rule__Class__Group_6__3__Impl rule__Class__Group_6__4
            {
            pushFollow(FOLLOW_7);
            rule__Class__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__3"


    // $ANTLR start "rule__Class__Group_6__3__Impl"
    // InternalSmallUML.g:1751:1: rule__Class__Group_6__3__Impl : ( ( rule__Class__Group_6_3__0 )* ) ;
    public final void rule__Class__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1755:1: ( ( ( rule__Class__Group_6_3__0 )* ) )
            // InternalSmallUML.g:1756:1: ( ( rule__Class__Group_6_3__0 )* )
            {
            // InternalSmallUML.g:1756:1: ( ( rule__Class__Group_6_3__0 )* )
            // InternalSmallUML.g:1757:2: ( rule__Class__Group_6_3__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_6_3()); 
            // InternalSmallUML.g:1758:2: ( rule__Class__Group_6_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSmallUML.g:1758:3: rule__Class__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Class__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__3__Impl"


    // $ANTLR start "rule__Class__Group_6__4"
    // InternalSmallUML.g:1766:1: rule__Class__Group_6__4 : rule__Class__Group_6__4__Impl ;
    public final void rule__Class__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1770:1: ( rule__Class__Group_6__4__Impl )
            // InternalSmallUML.g:1771:2: rule__Class__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__4"


    // $ANTLR start "rule__Class__Group_6__4__Impl"
    // InternalSmallUML.g:1777:1: rule__Class__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Class__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1781:1: ( ( '}' ) )
            // InternalSmallUML.g:1782:1: ( '}' )
            {
            // InternalSmallUML.g:1782:1: ( '}' )
            // InternalSmallUML.g:1783:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__4__Impl"


    // $ANTLR start "rule__Class__Group_6_3__0"
    // InternalSmallUML.g:1793:1: rule__Class__Group_6_3__0 : rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1 ;
    public final void rule__Class__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1797:1: ( rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1 )
            // InternalSmallUML.g:1798:2: rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__0"


    // $ANTLR start "rule__Class__Group_6_3__0__Impl"
    // InternalSmallUML.g:1805:1: rule__Class__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1809:1: ( ( ',' ) )
            // InternalSmallUML.g:1810:1: ( ',' )
            {
            // InternalSmallUML.g:1810:1: ( ',' )
            // InternalSmallUML.g:1811:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_6_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__0__Impl"


    // $ANTLR start "rule__Class__Group_6_3__1"
    // InternalSmallUML.g:1820:1: rule__Class__Group_6_3__1 : rule__Class__Group_6_3__1__Impl ;
    public final void rule__Class__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1824:1: ( rule__Class__Group_6_3__1__Impl )
            // InternalSmallUML.g:1825:2: rule__Class__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__1"


    // $ANTLR start "rule__Class__Group_6_3__1__Impl"
    // InternalSmallUML.g:1831:1: rule__Class__Group_6_3__1__Impl : ( ( rule__Class__MethodsAssignment_6_3_1 ) ) ;
    public final void rule__Class__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1835:1: ( ( ( rule__Class__MethodsAssignment_6_3_1 ) ) )
            // InternalSmallUML.g:1836:1: ( ( rule__Class__MethodsAssignment_6_3_1 ) )
            {
            // InternalSmallUML.g:1836:1: ( ( rule__Class__MethodsAssignment_6_3_1 ) )
            // InternalSmallUML.g:1837:2: ( rule__Class__MethodsAssignment_6_3_1 )
            {
             before(grammarAccess.getClassAccess().getMethodsAssignment_6_3_1()); 
            // InternalSmallUML.g:1838:2: ( rule__Class__MethodsAssignment_6_3_1 )
            // InternalSmallUML.g:1838:3: rule__Class__MethodsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__MethodsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getMethodsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__1__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalSmallUML.g:1847:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1851:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalSmallUML.g:1852:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // InternalSmallUML.g:1859:1: rule__Relation__Group__0__Impl : ( 'Relation' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1863:1: ( ( 'Relation' ) )
            // InternalSmallUML.g:1864:1: ( 'Relation' )
            {
            // InternalSmallUML.g:1864:1: ( 'Relation' )
            // InternalSmallUML.g:1865:2: 'Relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // InternalSmallUML.g:1874:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1878:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalSmallUML.g:1879:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // InternalSmallUML.g:1886:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__NameAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1890:1: ( ( ( rule__Relation__NameAssignment_1 ) ) )
            // InternalSmallUML.g:1891:1: ( ( rule__Relation__NameAssignment_1 ) )
            {
            // InternalSmallUML.g:1891:1: ( ( rule__Relation__NameAssignment_1 ) )
            // InternalSmallUML.g:1892:2: ( rule__Relation__NameAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_1()); 
            // InternalSmallUML.g:1893:2: ( rule__Relation__NameAssignment_1 )
            // InternalSmallUML.g:1893:3: rule__Relation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // InternalSmallUML.g:1901:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1905:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalSmallUML.g:1906:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // InternalSmallUML.g:1913:1: rule__Relation__Group__2__Impl : ( '{' ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1917:1: ( ( '{' ) )
            // InternalSmallUML.g:1918:1: ( '{' )
            {
            // InternalSmallUML.g:1918:1: ( '{' )
            // InternalSmallUML.g:1919:2: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group__3"
    // InternalSmallUML.g:1928:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1932:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // InternalSmallUML.g:1933:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Relation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3"


    // $ANTLR start "rule__Relation__Group__3__Impl"
    // InternalSmallUML.g:1940:1: rule__Relation__Group__3__Impl : ( 'from' ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1944:1: ( ( 'from' ) )
            // InternalSmallUML.g:1945:1: ( 'from' )
            {
            // InternalSmallUML.g:1945:1: ( 'from' )
            // InternalSmallUML.g:1946:2: 'from'
            {
             before(grammarAccess.getRelationAccess().getFromKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group__4"
    // InternalSmallUML.g:1955:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1959:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // InternalSmallUML.g:1960:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Relation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__4"


    // $ANTLR start "rule__Relation__Group__4__Impl"
    // InternalSmallUML.g:1967:1: rule__Relation__Group__4__Impl : ( ( rule__Relation__FromAssignment_4 ) ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1971:1: ( ( ( rule__Relation__FromAssignment_4 ) ) )
            // InternalSmallUML.g:1972:1: ( ( rule__Relation__FromAssignment_4 ) )
            {
            // InternalSmallUML.g:1972:1: ( ( rule__Relation__FromAssignment_4 ) )
            // InternalSmallUML.g:1973:2: ( rule__Relation__FromAssignment_4 )
            {
             before(grammarAccess.getRelationAccess().getFromAssignment_4()); 
            // InternalSmallUML.g:1974:2: ( rule__Relation__FromAssignment_4 )
            // InternalSmallUML.g:1974:3: rule__Relation__FromAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Relation__FromAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getFromAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__4__Impl"


    // $ANTLR start "rule__Relation__Group__5"
    // InternalSmallUML.g:1982:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl rule__Relation__Group__6 ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1986:1: ( rule__Relation__Group__5__Impl rule__Relation__Group__6 )
            // InternalSmallUML.g:1987:2: rule__Relation__Group__5__Impl rule__Relation__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Relation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__5"


    // $ANTLR start "rule__Relation__Group__5__Impl"
    // InternalSmallUML.g:1994:1: rule__Relation__Group__5__Impl : ( 'to' ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1998:1: ( ( 'to' ) )
            // InternalSmallUML.g:1999:1: ( 'to' )
            {
            // InternalSmallUML.g:1999:1: ( 'to' )
            // InternalSmallUML.g:2000:2: 'to'
            {
             before(grammarAccess.getRelationAccess().getToKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__5__Impl"


    // $ANTLR start "rule__Relation__Group__6"
    // InternalSmallUML.g:2009:1: rule__Relation__Group__6 : rule__Relation__Group__6__Impl rule__Relation__Group__7 ;
    public final void rule__Relation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2013:1: ( rule__Relation__Group__6__Impl rule__Relation__Group__7 )
            // InternalSmallUML.g:2014:2: rule__Relation__Group__6__Impl rule__Relation__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Relation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__6"


    // $ANTLR start "rule__Relation__Group__6__Impl"
    // InternalSmallUML.g:2021:1: rule__Relation__Group__6__Impl : ( ( rule__Relation__ToAssignment_6 ) ) ;
    public final void rule__Relation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2025:1: ( ( ( rule__Relation__ToAssignment_6 ) ) )
            // InternalSmallUML.g:2026:1: ( ( rule__Relation__ToAssignment_6 ) )
            {
            // InternalSmallUML.g:2026:1: ( ( rule__Relation__ToAssignment_6 ) )
            // InternalSmallUML.g:2027:2: ( rule__Relation__ToAssignment_6 )
            {
             before(grammarAccess.getRelationAccess().getToAssignment_6()); 
            // InternalSmallUML.g:2028:2: ( rule__Relation__ToAssignment_6 )
            // InternalSmallUML.g:2028:3: rule__Relation__ToAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Relation__ToAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getToAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__6__Impl"


    // $ANTLR start "rule__Relation__Group__7"
    // InternalSmallUML.g:2036:1: rule__Relation__Group__7 : rule__Relation__Group__7__Impl rule__Relation__Group__8 ;
    public final void rule__Relation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2040:1: ( rule__Relation__Group__7__Impl rule__Relation__Group__8 )
            // InternalSmallUML.g:2041:2: rule__Relation__Group__7__Impl rule__Relation__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Relation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__7"


    // $ANTLR start "rule__Relation__Group__7__Impl"
    // InternalSmallUML.g:2048:1: rule__Relation__Group__7__Impl : ( 'cardinality' ) ;
    public final void rule__Relation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2052:1: ( ( 'cardinality' ) )
            // InternalSmallUML.g:2053:1: ( 'cardinality' )
            {
            // InternalSmallUML.g:2053:1: ( 'cardinality' )
            // InternalSmallUML.g:2054:2: 'cardinality'
            {
             before(grammarAccess.getRelationAccess().getCardinalityKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getCardinalityKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__7__Impl"


    // $ANTLR start "rule__Relation__Group__8"
    // InternalSmallUML.g:2063:1: rule__Relation__Group__8 : rule__Relation__Group__8__Impl rule__Relation__Group__9 ;
    public final void rule__Relation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2067:1: ( rule__Relation__Group__8__Impl rule__Relation__Group__9 )
            // InternalSmallUML.g:2068:2: rule__Relation__Group__8__Impl rule__Relation__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__Relation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__8"


    // $ANTLR start "rule__Relation__Group__8__Impl"
    // InternalSmallUML.g:2075:1: rule__Relation__Group__8__Impl : ( ( rule__Relation__CardinalityAssignment_8 ) ) ;
    public final void rule__Relation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2079:1: ( ( ( rule__Relation__CardinalityAssignment_8 ) ) )
            // InternalSmallUML.g:2080:1: ( ( rule__Relation__CardinalityAssignment_8 ) )
            {
            // InternalSmallUML.g:2080:1: ( ( rule__Relation__CardinalityAssignment_8 ) )
            // InternalSmallUML.g:2081:2: ( rule__Relation__CardinalityAssignment_8 )
            {
             before(grammarAccess.getRelationAccess().getCardinalityAssignment_8()); 
            // InternalSmallUML.g:2082:2: ( rule__Relation__CardinalityAssignment_8 )
            // InternalSmallUML.g:2082:3: rule__Relation__CardinalityAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Relation__CardinalityAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getCardinalityAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__8__Impl"


    // $ANTLR start "rule__Relation__Group__9"
    // InternalSmallUML.g:2090:1: rule__Relation__Group__9 : rule__Relation__Group__9__Impl ;
    public final void rule__Relation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2094:1: ( rule__Relation__Group__9__Impl )
            // InternalSmallUML.g:2095:2: rule__Relation__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__9"


    // $ANTLR start "rule__Relation__Group__9__Impl"
    // InternalSmallUML.g:2101:1: rule__Relation__Group__9__Impl : ( '}' ) ;
    public final void rule__Relation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2105:1: ( ( '}' ) )
            // InternalSmallUML.g:2106:1: ( '}' )
            {
            // InternalSmallUML.g:2106:1: ( '}' )
            // InternalSmallUML.g:2107:2: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__9__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalSmallUML.g:2117:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2121:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSmallUML.g:2122:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalSmallUML.g:2129:1: rule__Attribute__Group__0__Impl : ( 'Attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2133:1: ( ( 'Attribute' ) )
            // InternalSmallUML.g:2134:1: ( 'Attribute' )
            {
            // InternalSmallUML.g:2134:1: ( 'Attribute' )
            // InternalSmallUML.g:2135:2: 'Attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalSmallUML.g:2144:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2148:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSmallUML.g:2149:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalSmallUML.g:2156:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2160:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalSmallUML.g:2161:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalSmallUML.g:2161:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalSmallUML.g:2162:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalSmallUML.g:2163:2: ( rule__Attribute__NameAssignment_1 )
            // InternalSmallUML.g:2163:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalSmallUML.g:2171:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2175:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSmallUML.g:2176:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalSmallUML.g:2183:1: rule__Attribute__Group__2__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2187:1: ( ( '{' ) )
            // InternalSmallUML.g:2188:1: ( '{' )
            {
            // InternalSmallUML.g:2188:1: ( '{' )
            // InternalSmallUML.g:2189:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalSmallUML.g:2198:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2202:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalSmallUML.g:2203:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalSmallUML.g:2210:1: rule__Attribute__Group__3__Impl : ( 'typedValue' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2214:1: ( ( 'typedValue' ) )
            // InternalSmallUML.g:2215:1: ( 'typedValue' )
            {
            // InternalSmallUML.g:2215:1: ( 'typedValue' )
            // InternalSmallUML.g:2216:2: 'typedValue'
            {
             before(grammarAccess.getAttributeAccess().getTypedValueKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypedValueKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalSmallUML.g:2225:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2229:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalSmallUML.g:2230:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalSmallUML.g:2237:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypedValueAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2241:1: ( ( ( rule__Attribute__TypedValueAssignment_4 ) ) )
            // InternalSmallUML.g:2242:1: ( ( rule__Attribute__TypedValueAssignment_4 ) )
            {
            // InternalSmallUML.g:2242:1: ( ( rule__Attribute__TypedValueAssignment_4 ) )
            // InternalSmallUML.g:2243:2: ( rule__Attribute__TypedValueAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypedValueAssignment_4()); 
            // InternalSmallUML.g:2244:2: ( rule__Attribute__TypedValueAssignment_4 )
            // InternalSmallUML.g:2244:3: rule__Attribute__TypedValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypedValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypedValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalSmallUML.g:2252:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2256:1: ( rule__Attribute__Group__5__Impl )
            // InternalSmallUML.g:2257:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalSmallUML.g:2263:1: rule__Attribute__Group__5__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2267:1: ( ( '}' ) )
            // InternalSmallUML.g:2268:1: ( '}' )
            {
            // InternalSmallUML.g:2268:1: ( '}' )
            // InternalSmallUML.g:2269:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalSmallUML.g:2279:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2283:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalSmallUML.g:2284:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalSmallUML.g:2291:1: rule__Method__Group__0__Impl : ( () ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2295:1: ( ( () ) )
            // InternalSmallUML.g:2296:1: ( () )
            {
            // InternalSmallUML.g:2296:1: ( () )
            // InternalSmallUML.g:2297:2: ()
            {
             before(grammarAccess.getMethodAccess().getMethodAction_0()); 
            // InternalSmallUML.g:2298:2: ()
            // InternalSmallUML.g:2298:3: 
            {
            }

             after(grammarAccess.getMethodAccess().getMethodAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalSmallUML.g:2306:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2310:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalSmallUML.g:2311:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalSmallUML.g:2318:1: rule__Method__Group__1__Impl : ( 'Method' ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2322:1: ( ( 'Method' ) )
            // InternalSmallUML.g:2323:1: ( 'Method' )
            {
            // InternalSmallUML.g:2323:1: ( 'Method' )
            // InternalSmallUML.g:2324:2: 'Method'
            {
             before(grammarAccess.getMethodAccess().getMethodKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getMethodKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalSmallUML.g:2333:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2337:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalSmallUML.g:2338:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalSmallUML.g:2345:1: rule__Method__Group__2__Impl : ( ( rule__Method__NameAssignment_2 ) ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2349:1: ( ( ( rule__Method__NameAssignment_2 ) ) )
            // InternalSmallUML.g:2350:1: ( ( rule__Method__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:2350:1: ( ( rule__Method__NameAssignment_2 ) )
            // InternalSmallUML.g:2351:2: ( rule__Method__NameAssignment_2 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:2352:2: ( rule__Method__NameAssignment_2 )
            // InternalSmallUML.g:2352:3: rule__Method__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalSmallUML.g:2360:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2364:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalSmallUML.g:2365:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalSmallUML.g:2372:1: rule__Method__Group__3__Impl : ( '{' ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2376:1: ( ( '{' ) )
            // InternalSmallUML.g:2377:1: ( '{' )
            {
            // InternalSmallUML.g:2377:1: ( '{' )
            // InternalSmallUML.g:2378:2: '{'
            {
             before(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalSmallUML.g:2387:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2391:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalSmallUML.g:2392:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalSmallUML.g:2399:1: rule__Method__Group__4__Impl : ( ( rule__Method__Group_4__0 )? ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2403:1: ( ( ( rule__Method__Group_4__0 )? ) )
            // InternalSmallUML.g:2404:1: ( ( rule__Method__Group_4__0 )? )
            {
            // InternalSmallUML.g:2404:1: ( ( rule__Method__Group_4__0 )? )
            // InternalSmallUML.g:2405:2: ( rule__Method__Group_4__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_4()); 
            // InternalSmallUML.g:2406:2: ( rule__Method__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSmallUML.g:2406:3: rule__Method__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // InternalSmallUML.g:2414:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2418:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalSmallUML.g:2419:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Method__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // InternalSmallUML.g:2426:1: rule__Method__Group__5__Impl : ( ( rule__Method__Group_5__0 )? ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2430:1: ( ( ( rule__Method__Group_5__0 )? ) )
            // InternalSmallUML.g:2431:1: ( ( rule__Method__Group_5__0 )? )
            {
            // InternalSmallUML.g:2431:1: ( ( rule__Method__Group_5__0 )? )
            // InternalSmallUML.g:2432:2: ( rule__Method__Group_5__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_5()); 
            // InternalSmallUML.g:2433:2: ( rule__Method__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSmallUML.g:2433:3: rule__Method__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__6"
    // InternalSmallUML.g:2441:1: rule__Method__Group__6 : rule__Method__Group__6__Impl ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2445:1: ( rule__Method__Group__6__Impl )
            // InternalSmallUML.g:2446:2: rule__Method__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // InternalSmallUML.g:2452:1: rule__Method__Group__6__Impl : ( '}' ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2456:1: ( ( '}' ) )
            // InternalSmallUML.g:2457:1: ( '}' )
            {
            // InternalSmallUML.g:2457:1: ( '}' )
            // InternalSmallUML.g:2458:2: '}'
            {
             before(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Method__Group_4__0"
    // InternalSmallUML.g:2468:1: rule__Method__Group_4__0 : rule__Method__Group_4__0__Impl rule__Method__Group_4__1 ;
    public final void rule__Method__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2472:1: ( rule__Method__Group_4__0__Impl rule__Method__Group_4__1 )
            // InternalSmallUML.g:2473:2: rule__Method__Group_4__0__Impl rule__Method__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__Method__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__0"


    // $ANTLR start "rule__Method__Group_4__0__Impl"
    // InternalSmallUML.g:2480:1: rule__Method__Group_4__0__Impl : ( 'returnTypedValue' ) ;
    public final void rule__Method__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2484:1: ( ( 'returnTypedValue' ) )
            // InternalSmallUML.g:2485:1: ( 'returnTypedValue' )
            {
            // InternalSmallUML.g:2485:1: ( 'returnTypedValue' )
            // InternalSmallUML.g:2486:2: 'returnTypedValue'
            {
             before(grammarAccess.getMethodAccess().getReturnTypedValueKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getReturnTypedValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__0__Impl"


    // $ANTLR start "rule__Method__Group_4__1"
    // InternalSmallUML.g:2495:1: rule__Method__Group_4__1 : rule__Method__Group_4__1__Impl ;
    public final void rule__Method__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2499:1: ( rule__Method__Group_4__1__Impl )
            // InternalSmallUML.g:2500:2: rule__Method__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__1"


    // $ANTLR start "rule__Method__Group_4__1__Impl"
    // InternalSmallUML.g:2506:1: rule__Method__Group_4__1__Impl : ( ( rule__Method__ReturnTypedValueAssignment_4_1 ) ) ;
    public final void rule__Method__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2510:1: ( ( ( rule__Method__ReturnTypedValueAssignment_4_1 ) ) )
            // InternalSmallUML.g:2511:1: ( ( rule__Method__ReturnTypedValueAssignment_4_1 ) )
            {
            // InternalSmallUML.g:2511:1: ( ( rule__Method__ReturnTypedValueAssignment_4_1 ) )
            // InternalSmallUML.g:2512:2: ( rule__Method__ReturnTypedValueAssignment_4_1 )
            {
             before(grammarAccess.getMethodAccess().getReturnTypedValueAssignment_4_1()); 
            // InternalSmallUML.g:2513:2: ( rule__Method__ReturnTypedValueAssignment_4_1 )
            // InternalSmallUML.g:2513:3: rule__Method__ReturnTypedValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ReturnTypedValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getReturnTypedValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__1__Impl"


    // $ANTLR start "rule__Method__Group_5__0"
    // InternalSmallUML.g:2522:1: rule__Method__Group_5__0 : rule__Method__Group_5__0__Impl rule__Method__Group_5__1 ;
    public final void rule__Method__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2526:1: ( rule__Method__Group_5__0__Impl rule__Method__Group_5__1 )
            // InternalSmallUML.g:2527:2: rule__Method__Group_5__0__Impl rule__Method__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Method__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__0"


    // $ANTLR start "rule__Method__Group_5__0__Impl"
    // InternalSmallUML.g:2534:1: rule__Method__Group_5__0__Impl : ( 'parameters' ) ;
    public final void rule__Method__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2538:1: ( ( 'parameters' ) )
            // InternalSmallUML.g:2539:1: ( 'parameters' )
            {
            // InternalSmallUML.g:2539:1: ( 'parameters' )
            // InternalSmallUML.g:2540:2: 'parameters'
            {
             before(grammarAccess.getMethodAccess().getParametersKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getParametersKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__0__Impl"


    // $ANTLR start "rule__Method__Group_5__1"
    // InternalSmallUML.g:2549:1: rule__Method__Group_5__1 : rule__Method__Group_5__1__Impl rule__Method__Group_5__2 ;
    public final void rule__Method__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2553:1: ( rule__Method__Group_5__1__Impl rule__Method__Group_5__2 )
            // InternalSmallUML.g:2554:2: rule__Method__Group_5__1__Impl rule__Method__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__Method__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__1"


    // $ANTLR start "rule__Method__Group_5__1__Impl"
    // InternalSmallUML.g:2561:1: rule__Method__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Method__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2565:1: ( ( '{' ) )
            // InternalSmallUML.g:2566:1: ( '{' )
            {
            // InternalSmallUML.g:2566:1: ( '{' )
            // InternalSmallUML.g:2567:2: '{'
            {
             before(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__1__Impl"


    // $ANTLR start "rule__Method__Group_5__2"
    // InternalSmallUML.g:2576:1: rule__Method__Group_5__2 : rule__Method__Group_5__2__Impl rule__Method__Group_5__3 ;
    public final void rule__Method__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2580:1: ( rule__Method__Group_5__2__Impl rule__Method__Group_5__3 )
            // InternalSmallUML.g:2581:2: rule__Method__Group_5__2__Impl rule__Method__Group_5__3
            {
            pushFollow(FOLLOW_7);
            rule__Method__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__2"


    // $ANTLR start "rule__Method__Group_5__2__Impl"
    // InternalSmallUML.g:2588:1: rule__Method__Group_5__2__Impl : ( ( rule__Method__ParametersAssignment_5_2 ) ) ;
    public final void rule__Method__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2592:1: ( ( ( rule__Method__ParametersAssignment_5_2 ) ) )
            // InternalSmallUML.g:2593:1: ( ( rule__Method__ParametersAssignment_5_2 ) )
            {
            // InternalSmallUML.g:2593:1: ( ( rule__Method__ParametersAssignment_5_2 ) )
            // InternalSmallUML.g:2594:2: ( rule__Method__ParametersAssignment_5_2 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_5_2()); 
            // InternalSmallUML.g:2595:2: ( rule__Method__ParametersAssignment_5_2 )
            // InternalSmallUML.g:2595:3: rule__Method__ParametersAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParametersAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__2__Impl"


    // $ANTLR start "rule__Method__Group_5__3"
    // InternalSmallUML.g:2603:1: rule__Method__Group_5__3 : rule__Method__Group_5__3__Impl rule__Method__Group_5__4 ;
    public final void rule__Method__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2607:1: ( rule__Method__Group_5__3__Impl rule__Method__Group_5__4 )
            // InternalSmallUML.g:2608:2: rule__Method__Group_5__3__Impl rule__Method__Group_5__4
            {
            pushFollow(FOLLOW_7);
            rule__Method__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__3"


    // $ANTLR start "rule__Method__Group_5__3__Impl"
    // InternalSmallUML.g:2615:1: rule__Method__Group_5__3__Impl : ( ( rule__Method__Group_5_3__0 )* ) ;
    public final void rule__Method__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2619:1: ( ( ( rule__Method__Group_5_3__0 )* ) )
            // InternalSmallUML.g:2620:1: ( ( rule__Method__Group_5_3__0 )* )
            {
            // InternalSmallUML.g:2620:1: ( ( rule__Method__Group_5_3__0 )* )
            // InternalSmallUML.g:2621:2: ( rule__Method__Group_5_3__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_5_3()); 
            // InternalSmallUML.g:2622:2: ( rule__Method__Group_5_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSmallUML.g:2622:3: rule__Method__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Method__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__3__Impl"


    // $ANTLR start "rule__Method__Group_5__4"
    // InternalSmallUML.g:2630:1: rule__Method__Group_5__4 : rule__Method__Group_5__4__Impl ;
    public final void rule__Method__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2634:1: ( rule__Method__Group_5__4__Impl )
            // InternalSmallUML.g:2635:2: rule__Method__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__4"


    // $ANTLR start "rule__Method__Group_5__4__Impl"
    // InternalSmallUML.g:2641:1: rule__Method__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Method__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2645:1: ( ( '}' ) )
            // InternalSmallUML.g:2646:1: ( '}' )
            {
            // InternalSmallUML.g:2646:1: ( '}' )
            // InternalSmallUML.g:2647:2: '}'
            {
             before(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__4__Impl"


    // $ANTLR start "rule__Method__Group_5_3__0"
    // InternalSmallUML.g:2657:1: rule__Method__Group_5_3__0 : rule__Method__Group_5_3__0__Impl rule__Method__Group_5_3__1 ;
    public final void rule__Method__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2661:1: ( rule__Method__Group_5_3__0__Impl rule__Method__Group_5_3__1 )
            // InternalSmallUML.g:2662:2: rule__Method__Group_5_3__0__Impl rule__Method__Group_5_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Method__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_3__0"


    // $ANTLR start "rule__Method__Group_5_3__0__Impl"
    // InternalSmallUML.g:2669:1: rule__Method__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2673:1: ( ( ',' ) )
            // InternalSmallUML.g:2674:1: ( ',' )
            {
            // InternalSmallUML.g:2674:1: ( ',' )
            // InternalSmallUML.g:2675:2: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_3__0__Impl"


    // $ANTLR start "rule__Method__Group_5_3__1"
    // InternalSmallUML.g:2684:1: rule__Method__Group_5_3__1 : rule__Method__Group_5_3__1__Impl ;
    public final void rule__Method__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2688:1: ( rule__Method__Group_5_3__1__Impl )
            // InternalSmallUML.g:2689:2: rule__Method__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_3__1"


    // $ANTLR start "rule__Method__Group_5_3__1__Impl"
    // InternalSmallUML.g:2695:1: rule__Method__Group_5_3__1__Impl : ( ( rule__Method__ParametersAssignment_5_3_1 ) ) ;
    public final void rule__Method__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2699:1: ( ( ( rule__Method__ParametersAssignment_5_3_1 ) ) )
            // InternalSmallUML.g:2700:1: ( ( rule__Method__ParametersAssignment_5_3_1 ) )
            {
            // InternalSmallUML.g:2700:1: ( ( rule__Method__ParametersAssignment_5_3_1 ) )
            // InternalSmallUML.g:2701:2: ( rule__Method__ParametersAssignment_5_3_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_5_3_1()); 
            // InternalSmallUML.g:2702:2: ( rule__Method__ParametersAssignment_5_3_1 )
            // InternalSmallUML.g:2702:3: rule__Method__ParametersAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParametersAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_3__1__Impl"


    // $ANTLR start "rule__Type_Impl__Group__0"
    // InternalSmallUML.g:2711:1: rule__Type_Impl__Group__0 : rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 ;
    public final void rule__Type_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2715:1: ( rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 )
            // InternalSmallUML.g:2716:2: rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Type_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__0"


    // $ANTLR start "rule__Type_Impl__Group__0__Impl"
    // InternalSmallUML.g:2723:1: rule__Type_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Type_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2727:1: ( ( () ) )
            // InternalSmallUML.g:2728:1: ( () )
            {
            // InternalSmallUML.g:2728:1: ( () )
            // InternalSmallUML.g:2729:2: ()
            {
             before(grammarAccess.getType_ImplAccess().getTypeAction_0()); 
            // InternalSmallUML.g:2730:2: ()
            // InternalSmallUML.g:2730:3: 
            {
            }

             after(grammarAccess.getType_ImplAccess().getTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__0__Impl"


    // $ANTLR start "rule__Type_Impl__Group__1"
    // InternalSmallUML.g:2738:1: rule__Type_Impl__Group__1 : rule__Type_Impl__Group__1__Impl ;
    public final void rule__Type_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2742:1: ( rule__Type_Impl__Group__1__Impl )
            // InternalSmallUML.g:2743:2: rule__Type_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__1"


    // $ANTLR start "rule__Type_Impl__Group__1__Impl"
    // InternalSmallUML.g:2749:1: rule__Type_Impl__Group__1__Impl : ( 'Type' ) ;
    public final void rule__Type_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2753:1: ( ( 'Type' ) )
            // InternalSmallUML.g:2754:1: ( 'Type' )
            {
            // InternalSmallUML.g:2754:1: ( 'Type' )
            // InternalSmallUML.g:2755:2: 'Type'
            {
             before(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__1__Impl"


    // $ANTLR start "rule__Boolean__Group__0"
    // InternalSmallUML.g:2765:1: rule__Boolean__Group__0 : rule__Boolean__Group__0__Impl rule__Boolean__Group__1 ;
    public final void rule__Boolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2769:1: ( rule__Boolean__Group__0__Impl rule__Boolean__Group__1 )
            // InternalSmallUML.g:2770:2: rule__Boolean__Group__0__Impl rule__Boolean__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Boolean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Boolean__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__0"


    // $ANTLR start "rule__Boolean__Group__0__Impl"
    // InternalSmallUML.g:2777:1: rule__Boolean__Group__0__Impl : ( () ) ;
    public final void rule__Boolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2781:1: ( ( () ) )
            // InternalSmallUML.g:2782:1: ( () )
            {
            // InternalSmallUML.g:2782:1: ( () )
            // InternalSmallUML.g:2783:2: ()
            {
             before(grammarAccess.getBooleanAccess().getBooleanAction_0()); 
            // InternalSmallUML.g:2784:2: ()
            // InternalSmallUML.g:2784:3: 
            {
            }

             after(grammarAccess.getBooleanAccess().getBooleanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__0__Impl"


    // $ANTLR start "rule__Boolean__Group__1"
    // InternalSmallUML.g:2792:1: rule__Boolean__Group__1 : rule__Boolean__Group__1__Impl ;
    public final void rule__Boolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2796:1: ( rule__Boolean__Group__1__Impl )
            // InternalSmallUML.g:2797:2: rule__Boolean__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__1"


    // $ANTLR start "rule__Boolean__Group__1__Impl"
    // InternalSmallUML.g:2803:1: rule__Boolean__Group__1__Impl : ( 'Boolean' ) ;
    public final void rule__Boolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2807:1: ( ( 'Boolean' ) )
            // InternalSmallUML.g:2808:1: ( 'Boolean' )
            {
            // InternalSmallUML.g:2808:1: ( 'Boolean' )
            // InternalSmallUML.g:2809:2: 'Boolean'
            {
             before(grammarAccess.getBooleanAccess().getBooleanKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBooleanAccess().getBooleanKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__1__Impl"


    // $ANTLR start "rule__Real__Group__0"
    // InternalSmallUML.g:2819:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2823:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // InternalSmallUML.g:2824:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Real__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__0"


    // $ANTLR start "rule__Real__Group__0__Impl"
    // InternalSmallUML.g:2831:1: rule__Real__Group__0__Impl : ( () ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2835:1: ( ( () ) )
            // InternalSmallUML.g:2836:1: ( () )
            {
            // InternalSmallUML.g:2836:1: ( () )
            // InternalSmallUML.g:2837:2: ()
            {
             before(grammarAccess.getRealAccess().getRealAction_0()); 
            // InternalSmallUML.g:2838:2: ()
            // InternalSmallUML.g:2838:3: 
            {
            }

             after(grammarAccess.getRealAccess().getRealAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__0__Impl"


    // $ANTLR start "rule__Real__Group__1"
    // InternalSmallUML.g:2846:1: rule__Real__Group__1 : rule__Real__Group__1__Impl ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2850:1: ( rule__Real__Group__1__Impl )
            // InternalSmallUML.g:2851:2: rule__Real__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__1"


    // $ANTLR start "rule__Real__Group__1__Impl"
    // InternalSmallUML.g:2857:1: rule__Real__Group__1__Impl : ( 'Real' ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2861:1: ( ( 'Real' ) )
            // InternalSmallUML.g:2862:1: ( 'Real' )
            {
            // InternalSmallUML.g:2862:1: ( 'Real' )
            // InternalSmallUML.g:2863:2: 'Real'
            {
             before(grammarAccess.getRealAccess().getRealKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRealAccess().getRealKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__1__Impl"


    // $ANTLR start "rule__Integer__Group__0"
    // InternalSmallUML.g:2873:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2877:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalSmallUML.g:2878:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Integer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Integer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0"


    // $ANTLR start "rule__Integer__Group__0__Impl"
    // InternalSmallUML.g:2885:1: rule__Integer__Group__0__Impl : ( () ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2889:1: ( ( () ) )
            // InternalSmallUML.g:2890:1: ( () )
            {
            // InternalSmallUML.g:2890:1: ( () )
            // InternalSmallUML.g:2891:2: ()
            {
             before(grammarAccess.getIntegerAccess().getIntegerAction_0()); 
            // InternalSmallUML.g:2892:2: ()
            // InternalSmallUML.g:2892:3: 
            {
            }

             after(grammarAccess.getIntegerAccess().getIntegerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0__Impl"


    // $ANTLR start "rule__Integer__Group__1"
    // InternalSmallUML.g:2900:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2904:1: ( rule__Integer__Group__1__Impl )
            // InternalSmallUML.g:2905:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Integer__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1"


    // $ANTLR start "rule__Integer__Group__1__Impl"
    // InternalSmallUML.g:2911:1: rule__Integer__Group__1__Impl : ( 'Integer' ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2915:1: ( ( 'Integer' ) )
            // InternalSmallUML.g:2916:1: ( 'Integer' )
            {
            // InternalSmallUML.g:2916:1: ( 'Integer' )
            // InternalSmallUML.g:2917:2: 'Integer'
            {
             before(grammarAccess.getIntegerAccess().getIntegerKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getIntegerAccess().getIntegerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1__Impl"


    // $ANTLR start "rule__String0__Group__0"
    // InternalSmallUML.g:2927:1: rule__String0__Group__0 : rule__String0__Group__0__Impl rule__String0__Group__1 ;
    public final void rule__String0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2931:1: ( rule__String0__Group__0__Impl rule__String0__Group__1 )
            // InternalSmallUML.g:2932:2: rule__String0__Group__0__Impl rule__String0__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__String0__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String0__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__0"


    // $ANTLR start "rule__String0__Group__0__Impl"
    // InternalSmallUML.g:2939:1: rule__String0__Group__0__Impl : ( () ) ;
    public final void rule__String0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2943:1: ( ( () ) )
            // InternalSmallUML.g:2944:1: ( () )
            {
            // InternalSmallUML.g:2944:1: ( () )
            // InternalSmallUML.g:2945:2: ()
            {
             before(grammarAccess.getString0Access().getStringAction_0()); 
            // InternalSmallUML.g:2946:2: ()
            // InternalSmallUML.g:2946:3: 
            {
            }

             after(grammarAccess.getString0Access().getStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__0__Impl"


    // $ANTLR start "rule__String0__Group__1"
    // InternalSmallUML.g:2954:1: rule__String0__Group__1 : rule__String0__Group__1__Impl ;
    public final void rule__String0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2958:1: ( rule__String0__Group__1__Impl )
            // InternalSmallUML.g:2959:2: rule__String0__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__1"


    // $ANTLR start "rule__String0__Group__1__Impl"
    // InternalSmallUML.g:2965:1: rule__String0__Group__1__Impl : ( 'String' ) ;
    public final void rule__String0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2969:1: ( ( 'String' ) )
            // InternalSmallUML.g:2970:1: ( 'String' )
            {
            // InternalSmallUML.g:2970:1: ( 'String' )
            // InternalSmallUML.g:2971:2: 'String'
            {
             before(grammarAccess.getString0Access().getStringKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getString0Access().getStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__1__Impl"


    // $ANTLR start "rule__Infinity__Group__0"
    // InternalSmallUML.g:2981:1: rule__Infinity__Group__0 : rule__Infinity__Group__0__Impl rule__Infinity__Group__1 ;
    public final void rule__Infinity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2985:1: ( rule__Infinity__Group__0__Impl rule__Infinity__Group__1 )
            // InternalSmallUML.g:2986:2: rule__Infinity__Group__0__Impl rule__Infinity__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Infinity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infinity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infinity__Group__0"


    // $ANTLR start "rule__Infinity__Group__0__Impl"
    // InternalSmallUML.g:2993:1: rule__Infinity__Group__0__Impl : ( () ) ;
    public final void rule__Infinity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2997:1: ( ( () ) )
            // InternalSmallUML.g:2998:1: ( () )
            {
            // InternalSmallUML.g:2998:1: ( () )
            // InternalSmallUML.g:2999:2: ()
            {
             before(grammarAccess.getInfinityAccess().getInfinityAction_0()); 
            // InternalSmallUML.g:3000:2: ()
            // InternalSmallUML.g:3000:3: 
            {
            }

             after(grammarAccess.getInfinityAccess().getInfinityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infinity__Group__0__Impl"


    // $ANTLR start "rule__Infinity__Group__1"
    // InternalSmallUML.g:3008:1: rule__Infinity__Group__1 : rule__Infinity__Group__1__Impl ;
    public final void rule__Infinity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3012:1: ( rule__Infinity__Group__1__Impl )
            // InternalSmallUML.g:3013:2: rule__Infinity__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Infinity__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infinity__Group__1"


    // $ANTLR start "rule__Infinity__Group__1__Impl"
    // InternalSmallUML.g:3019:1: rule__Infinity__Group__1__Impl : ( 'Infinity' ) ;
    public final void rule__Infinity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3023:1: ( ( 'Infinity' ) )
            // InternalSmallUML.g:3024:1: ( 'Infinity' )
            {
            // InternalSmallUML.g:3024:1: ( 'Infinity' )
            // InternalSmallUML.g:3025:2: 'Infinity'
            {
             before(grammarAccess.getInfinityAccess().getInfinityKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getInfinityAccess().getInfinityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infinity__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalSmallUML.g:3035:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3039:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalSmallUML.g:3040:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // InternalSmallUML.g:3047:1: rule__Enumeration__Group__0__Impl : ( 'Enumeration' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3051:1: ( ( 'Enumeration' ) )
            // InternalSmallUML.g:3052:1: ( 'Enumeration' )
            {
            // InternalSmallUML.g:3052:1: ( 'Enumeration' )
            // InternalSmallUML.g:3053:2: 'Enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // InternalSmallUML.g:3062:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3066:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalSmallUML.g:3067:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // InternalSmallUML.g:3074:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3078:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // InternalSmallUML.g:3079:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // InternalSmallUML.g:3079:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // InternalSmallUML.g:3080:2: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // InternalSmallUML.g:3081:2: ( rule__Enumeration__NameAssignment_1 )
            // InternalSmallUML.g:3081:3: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // InternalSmallUML.g:3089:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3093:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalSmallUML.g:3094:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // InternalSmallUML.g:3101:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3105:1: ( ( '{' ) )
            // InternalSmallUML.g:3106:1: ( '{' )
            {
            // InternalSmallUML.g:3106:1: ( '{' )
            // InternalSmallUML.g:3107:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // InternalSmallUML.g:3116:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3120:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalSmallUML.g:3121:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // InternalSmallUML.g:3128:1: rule__Enumeration__Group__3__Impl : ( 'value' ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3132:1: ( ( 'value' ) )
            // InternalSmallUML.g:3133:1: ( 'value' )
            {
            // InternalSmallUML.g:3133:1: ( 'value' )
            // InternalSmallUML.g:3134:2: 'value'
            {
             before(grammarAccess.getEnumerationAccess().getValueKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getValueKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__4"
    // InternalSmallUML.g:3143:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3147:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // InternalSmallUML.g:3148:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // InternalSmallUML.g:3155:1: rule__Enumeration__Group__4__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3159:1: ( ( '{' ) )
            // InternalSmallUML.g:3160:1: ( '{' )
            {
            // InternalSmallUML.g:3160:1: ( '{' )
            // InternalSmallUML.g:3161:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__Enumeration__Group__5"
    // InternalSmallUML.g:3170:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6 ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3174:1: ( rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6 )
            // InternalSmallUML.g:3175:2: rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Enumeration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5"


    // $ANTLR start "rule__Enumeration__Group__5__Impl"
    // InternalSmallUML.g:3182:1: rule__Enumeration__Group__5__Impl : ( ( rule__Enumeration__ValueAssignment_5 ) ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3186:1: ( ( ( rule__Enumeration__ValueAssignment_5 ) ) )
            // InternalSmallUML.g:3187:1: ( ( rule__Enumeration__ValueAssignment_5 ) )
            {
            // InternalSmallUML.g:3187:1: ( ( rule__Enumeration__ValueAssignment_5 ) )
            // InternalSmallUML.g:3188:2: ( rule__Enumeration__ValueAssignment_5 )
            {
             before(grammarAccess.getEnumerationAccess().getValueAssignment_5()); 
            // InternalSmallUML.g:3189:2: ( rule__Enumeration__ValueAssignment_5 )
            // InternalSmallUML.g:3189:3: rule__Enumeration__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5__Impl"


    // $ANTLR start "rule__Enumeration__Group__6"
    // InternalSmallUML.g:3197:1: rule__Enumeration__Group__6 : rule__Enumeration__Group__6__Impl rule__Enumeration__Group__7 ;
    public final void rule__Enumeration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3201:1: ( rule__Enumeration__Group__6__Impl rule__Enumeration__Group__7 )
            // InternalSmallUML.g:3202:2: rule__Enumeration__Group__6__Impl rule__Enumeration__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Enumeration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__6"


    // $ANTLR start "rule__Enumeration__Group__6__Impl"
    // InternalSmallUML.g:3209:1: rule__Enumeration__Group__6__Impl : ( ( rule__Enumeration__Group_6__0 )* ) ;
    public final void rule__Enumeration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3213:1: ( ( ( rule__Enumeration__Group_6__0 )* ) )
            // InternalSmallUML.g:3214:1: ( ( rule__Enumeration__Group_6__0 )* )
            {
            // InternalSmallUML.g:3214:1: ( ( rule__Enumeration__Group_6__0 )* )
            // InternalSmallUML.g:3215:2: ( rule__Enumeration__Group_6__0 )*
            {
             before(grammarAccess.getEnumerationAccess().getGroup_6()); 
            // InternalSmallUML.g:3216:2: ( rule__Enumeration__Group_6__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSmallUML.g:3216:3: rule__Enumeration__Group_6__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Enumeration__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__6__Impl"


    // $ANTLR start "rule__Enumeration__Group__7"
    // InternalSmallUML.g:3224:1: rule__Enumeration__Group__7 : rule__Enumeration__Group__7__Impl rule__Enumeration__Group__8 ;
    public final void rule__Enumeration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3228:1: ( rule__Enumeration__Group__7__Impl rule__Enumeration__Group__8 )
            // InternalSmallUML.g:3229:2: rule__Enumeration__Group__7__Impl rule__Enumeration__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Enumeration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__7"


    // $ANTLR start "rule__Enumeration__Group__7__Impl"
    // InternalSmallUML.g:3236:1: rule__Enumeration__Group__7__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3240:1: ( ( '}' ) )
            // InternalSmallUML.g:3241:1: ( '}' )
            {
            // InternalSmallUML.g:3241:1: ( '}' )
            // InternalSmallUML.g:3242:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__7__Impl"


    // $ANTLR start "rule__Enumeration__Group__8"
    // InternalSmallUML.g:3251:1: rule__Enumeration__Group__8 : rule__Enumeration__Group__8__Impl ;
    public final void rule__Enumeration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3255:1: ( rule__Enumeration__Group__8__Impl )
            // InternalSmallUML.g:3256:2: rule__Enumeration__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__8"


    // $ANTLR start "rule__Enumeration__Group__8__Impl"
    // InternalSmallUML.g:3262:1: rule__Enumeration__Group__8__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3266:1: ( ( '}' ) )
            // InternalSmallUML.g:3267:1: ( '}' )
            {
            // InternalSmallUML.g:3267:1: ( '}' )
            // InternalSmallUML.g:3268:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__8__Impl"


    // $ANTLR start "rule__Enumeration__Group_6__0"
    // InternalSmallUML.g:3278:1: rule__Enumeration__Group_6__0 : rule__Enumeration__Group_6__0__Impl rule__Enumeration__Group_6__1 ;
    public final void rule__Enumeration__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3282:1: ( rule__Enumeration__Group_6__0__Impl rule__Enumeration__Group_6__1 )
            // InternalSmallUML.g:3283:2: rule__Enumeration__Group_6__0__Impl rule__Enumeration__Group_6__1
            {
            pushFollow(FOLLOW_28);
            rule__Enumeration__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_6__0"


    // $ANTLR start "rule__Enumeration__Group_6__0__Impl"
    // InternalSmallUML.g:3290:1: rule__Enumeration__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Enumeration__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3294:1: ( ( ',' ) )
            // InternalSmallUML.g:3295:1: ( ',' )
            {
            // InternalSmallUML.g:3295:1: ( ',' )
            // InternalSmallUML.g:3296:2: ','
            {
             before(grammarAccess.getEnumerationAccess().getCommaKeyword_6_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_6__0__Impl"


    // $ANTLR start "rule__Enumeration__Group_6__1"
    // InternalSmallUML.g:3305:1: rule__Enumeration__Group_6__1 : rule__Enumeration__Group_6__1__Impl ;
    public final void rule__Enumeration__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3309:1: ( rule__Enumeration__Group_6__1__Impl )
            // InternalSmallUML.g:3310:2: rule__Enumeration__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_6__1"


    // $ANTLR start "rule__Enumeration__Group_6__1__Impl"
    // InternalSmallUML.g:3316:1: rule__Enumeration__Group_6__1__Impl : ( ( rule__Enumeration__ValueAssignment_6_1 ) ) ;
    public final void rule__Enumeration__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3320:1: ( ( ( rule__Enumeration__ValueAssignment_6_1 ) ) )
            // InternalSmallUML.g:3321:1: ( ( rule__Enumeration__ValueAssignment_6_1 ) )
            {
            // InternalSmallUML.g:3321:1: ( ( rule__Enumeration__ValueAssignment_6_1 ) )
            // InternalSmallUML.g:3322:2: ( rule__Enumeration__ValueAssignment_6_1 )
            {
             before(grammarAccess.getEnumerationAccess().getValueAssignment_6_1()); 
            // InternalSmallUML.g:3323:2: ( rule__Enumeration__ValueAssignment_6_1 )
            // InternalSmallUML.g:3323:3: rule__Enumeration__ValueAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__ValueAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getValueAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_6__1__Impl"


    // $ANTLR start "rule__Cardinality__Group__0"
    // InternalSmallUML.g:3332:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3336:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // InternalSmallUML.g:3337:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Cardinality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__0"


    // $ANTLR start "rule__Cardinality__Group__0__Impl"
    // InternalSmallUML.g:3344:1: rule__Cardinality__Group__0__Impl : ( 'Cardinality' ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3348:1: ( ( 'Cardinality' ) )
            // InternalSmallUML.g:3349:1: ( 'Cardinality' )
            {
            // InternalSmallUML.g:3349:1: ( 'Cardinality' )
            // InternalSmallUML.g:3350:2: 'Cardinality'
            {
             before(grammarAccess.getCardinalityAccess().getCardinalityKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getCardinalityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__0__Impl"


    // $ANTLR start "rule__Cardinality__Group__1"
    // InternalSmallUML.g:3359:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3363:1: ( rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 )
            // InternalSmallUML.g:3364:2: rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Cardinality__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__1"


    // $ANTLR start "rule__Cardinality__Group__1__Impl"
    // InternalSmallUML.g:3371:1: rule__Cardinality__Group__1__Impl : ( '{' ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3375:1: ( ( '{' ) )
            // InternalSmallUML.g:3376:1: ( '{' )
            {
            // InternalSmallUML.g:3376:1: ( '{' )
            // InternalSmallUML.g:3377:2: '{'
            {
             before(grammarAccess.getCardinalityAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__1__Impl"


    // $ANTLR start "rule__Cardinality__Group__2"
    // InternalSmallUML.g:3386:1: rule__Cardinality__Group__2 : rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3 ;
    public final void rule__Cardinality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3390:1: ( rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3 )
            // InternalSmallUML.g:3391:2: rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Cardinality__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__2"


    // $ANTLR start "rule__Cardinality__Group__2__Impl"
    // InternalSmallUML.g:3398:1: rule__Cardinality__Group__2__Impl : ( 'lowerBound' ) ;
    public final void rule__Cardinality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3402:1: ( ( 'lowerBound' ) )
            // InternalSmallUML.g:3403:1: ( 'lowerBound' )
            {
            // InternalSmallUML.g:3403:1: ( 'lowerBound' )
            // InternalSmallUML.g:3404:2: 'lowerBound'
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getLowerBoundKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__2__Impl"


    // $ANTLR start "rule__Cardinality__Group__3"
    // InternalSmallUML.g:3413:1: rule__Cardinality__Group__3 : rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4 ;
    public final void rule__Cardinality__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3417:1: ( rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4 )
            // InternalSmallUML.g:3418:2: rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Cardinality__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__3"


    // $ANTLR start "rule__Cardinality__Group__3__Impl"
    // InternalSmallUML.g:3425:1: rule__Cardinality__Group__3__Impl : ( ( rule__Cardinality__LowerBoundAssignment_3 ) ) ;
    public final void rule__Cardinality__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3429:1: ( ( ( rule__Cardinality__LowerBoundAssignment_3 ) ) )
            // InternalSmallUML.g:3430:1: ( ( rule__Cardinality__LowerBoundAssignment_3 ) )
            {
            // InternalSmallUML.g:3430:1: ( ( rule__Cardinality__LowerBoundAssignment_3 ) )
            // InternalSmallUML.g:3431:2: ( rule__Cardinality__LowerBoundAssignment_3 )
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_3()); 
            // InternalSmallUML.g:3432:2: ( rule__Cardinality__LowerBoundAssignment_3 )
            // InternalSmallUML.g:3432:3: rule__Cardinality__LowerBoundAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__LowerBoundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__3__Impl"


    // $ANTLR start "rule__Cardinality__Group__4"
    // InternalSmallUML.g:3440:1: rule__Cardinality__Group__4 : rule__Cardinality__Group__4__Impl rule__Cardinality__Group__5 ;
    public final void rule__Cardinality__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3444:1: ( rule__Cardinality__Group__4__Impl rule__Cardinality__Group__5 )
            // InternalSmallUML.g:3445:2: rule__Cardinality__Group__4__Impl rule__Cardinality__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Cardinality__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__4"


    // $ANTLR start "rule__Cardinality__Group__4__Impl"
    // InternalSmallUML.g:3452:1: rule__Cardinality__Group__4__Impl : ( 'upperBound' ) ;
    public final void rule__Cardinality__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3456:1: ( ( 'upperBound' ) )
            // InternalSmallUML.g:3457:1: ( 'upperBound' )
            {
            // InternalSmallUML.g:3457:1: ( 'upperBound' )
            // InternalSmallUML.g:3458:2: 'upperBound'
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getUpperBoundKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__4__Impl"


    // $ANTLR start "rule__Cardinality__Group__5"
    // InternalSmallUML.g:3467:1: rule__Cardinality__Group__5 : rule__Cardinality__Group__5__Impl rule__Cardinality__Group__6 ;
    public final void rule__Cardinality__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3471:1: ( rule__Cardinality__Group__5__Impl rule__Cardinality__Group__6 )
            // InternalSmallUML.g:3472:2: rule__Cardinality__Group__5__Impl rule__Cardinality__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Cardinality__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__5"


    // $ANTLR start "rule__Cardinality__Group__5__Impl"
    // InternalSmallUML.g:3479:1: rule__Cardinality__Group__5__Impl : ( ( rule__Cardinality__UpperBoundAssignment_5 ) ) ;
    public final void rule__Cardinality__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3483:1: ( ( ( rule__Cardinality__UpperBoundAssignment_5 ) ) )
            // InternalSmallUML.g:3484:1: ( ( rule__Cardinality__UpperBoundAssignment_5 ) )
            {
            // InternalSmallUML.g:3484:1: ( ( rule__Cardinality__UpperBoundAssignment_5 ) )
            // InternalSmallUML.g:3485:2: ( rule__Cardinality__UpperBoundAssignment_5 )
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_5()); 
            // InternalSmallUML.g:3486:2: ( rule__Cardinality__UpperBoundAssignment_5 )
            // InternalSmallUML.g:3486:3: rule__Cardinality__UpperBoundAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__UpperBoundAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__5__Impl"


    // $ANTLR start "rule__Cardinality__Group__6"
    // InternalSmallUML.g:3494:1: rule__Cardinality__Group__6 : rule__Cardinality__Group__6__Impl ;
    public final void rule__Cardinality__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3498:1: ( rule__Cardinality__Group__6__Impl )
            // InternalSmallUML.g:3499:2: rule__Cardinality__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__6"


    // $ANTLR start "rule__Cardinality__Group__6__Impl"
    // InternalSmallUML.g:3505:1: rule__Cardinality__Group__6__Impl : ( '}' ) ;
    public final void rule__Cardinality__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3509:1: ( ( '}' ) )
            // InternalSmallUML.g:3510:1: ( '}' )
            {
            // InternalSmallUML.g:3510:1: ( '}' )
            // InternalSmallUML.g:3511:2: '}'
            {
             before(grammarAccess.getCardinalityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__6__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalSmallUML.g:3521:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3525:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSmallUML.g:3526:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalSmallUML.g:3533:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3537:1: ( ( ( '-' )? ) )
            // InternalSmallUML.g:3538:1: ( ( '-' )? )
            {
            // InternalSmallUML.g:3538:1: ( ( '-' )? )
            // InternalSmallUML.g:3539:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSmallUML.g:3540:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSmallUML.g:3540:3: '-'
                    {
                    match(input,43,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalSmallUML.g:3548:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3552:1: ( rule__EInt__Group__1__Impl )
            // InternalSmallUML.g:3553:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalSmallUML.g:3559:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3563:1: ( ( RULE_INT ) )
            // InternalSmallUML.g:3564:1: ( RULE_INT )
            {
            // InternalSmallUML.g:3564:1: ( RULE_INT )
            // InternalSmallUML.g:3565:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Package__ClassAssignment_3_2"
    // InternalSmallUML.g:3575:1: rule__Package__ClassAssignment_3_2 : ( ruleClass ) ;
    public final void rule__Package__ClassAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3579:1: ( ( ruleClass ) )
            // InternalSmallUML.g:3580:2: ( ruleClass )
            {
            // InternalSmallUML.g:3580:2: ( ruleClass )
            // InternalSmallUML.g:3581:3: ruleClass
            {
             before(grammarAccess.getPackageAccess().getClassClassParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getClassClassParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ClassAssignment_3_2"


    // $ANTLR start "rule__Package__ClassAssignment_3_3_1"
    // InternalSmallUML.g:3590:1: rule__Package__ClassAssignment_3_3_1 : ( ruleClass ) ;
    public final void rule__Package__ClassAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3594:1: ( ( ruleClass ) )
            // InternalSmallUML.g:3595:2: ( ruleClass )
            {
            // InternalSmallUML.g:3595:2: ( ruleClass )
            // InternalSmallUML.g:3596:3: ruleClass
            {
             before(grammarAccess.getPackageAccess().getClassClassParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getClassClassParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ClassAssignment_3_3_1"


    // $ANTLR start "rule__Package__RelationAssignment_4_2"
    // InternalSmallUML.g:3605:1: rule__Package__RelationAssignment_4_2 : ( ruleRelation ) ;
    public final void rule__Package__RelationAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3609:1: ( ( ruleRelation ) )
            // InternalSmallUML.g:3610:2: ( ruleRelation )
            {
            // InternalSmallUML.g:3610:2: ( ruleRelation )
            // InternalSmallUML.g:3611:3: ruleRelation
            {
             before(grammarAccess.getPackageAccess().getRelationRelationParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getRelationRelationParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__RelationAssignment_4_2"


    // $ANTLR start "rule__Package__RelationAssignment_4_3_1"
    // InternalSmallUML.g:3620:1: rule__Package__RelationAssignment_4_3_1 : ( ruleRelation ) ;
    public final void rule__Package__RelationAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3624:1: ( ( ruleRelation ) )
            // InternalSmallUML.g:3625:2: ( ruleRelation )
            {
            // InternalSmallUML.g:3625:2: ( ruleRelation )
            // InternalSmallUML.g:3626:3: ruleRelation
            {
             before(grammarAccess.getPackageAccess().getRelationRelationParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getRelationRelationParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__RelationAssignment_4_3_1"


    // $ANTLR start "rule__Class__NameAssignment_2"
    // InternalSmallUML.g:3635:1: rule__Class__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3639:1: ( ( ruleEString ) )
            // InternalSmallUML.g:3640:2: ( ruleEString )
            {
            // InternalSmallUML.g:3640:2: ( ruleEString )
            // InternalSmallUML.g:3641:3: ruleEString
            {
             before(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_2"


    // $ANTLR start "rule__Class__ParentsAssignment_4_2"
    // InternalSmallUML.g:3650:1: rule__Class__ParentsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Class__ParentsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3654:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:3655:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:3655:2: ( ( ruleEString ) )
            // InternalSmallUML.g:3656:3: ( ruleEString )
            {
             before(grammarAccess.getClassAccess().getParentsClassCrossReference_4_2_0()); 
            // InternalSmallUML.g:3657:3: ( ruleEString )
            // InternalSmallUML.g:3658:4: ruleEString
            {
             before(grammarAccess.getClassAccess().getParentsClassEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassAccess().getParentsClassEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getClassAccess().getParentsClassCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ParentsAssignment_4_2"


    // $ANTLR start "rule__Class__ParentsAssignment_4_3_1"
    // InternalSmallUML.g:3669:1: rule__Class__ParentsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Class__ParentsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3673:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:3674:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:3674:2: ( ( ruleEString ) )
            // InternalSmallUML.g:3675:3: ( ruleEString )
            {
             before(grammarAccess.getClassAccess().getParentsClassCrossReference_4_3_1_0()); 
            // InternalSmallUML.g:3676:3: ( ruleEString )
            // InternalSmallUML.g:3677:4: ruleEString
            {
             before(grammarAccess.getClassAccess().getParentsClassEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassAccess().getParentsClassEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getParentsClassCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ParentsAssignment_4_3_1"


    // $ANTLR start "rule__Class__AttributesAssignment_5_2"
    // InternalSmallUML.g:3688:1: rule__Class__AttributesAssignment_5_2 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3692:1: ( ( ruleAttribute ) )
            // InternalSmallUML.g:3693:2: ( ruleAttribute )
            {
            // InternalSmallUML.g:3693:2: ( ruleAttribute )
            // InternalSmallUML.g:3694:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AttributesAssignment_5_2"


    // $ANTLR start "rule__Class__AttributesAssignment_5_3_1"
    // InternalSmallUML.g:3703:1: rule__Class__AttributesAssignment_5_3_1 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3707:1: ( ( ruleAttribute ) )
            // InternalSmallUML.g:3708:2: ( ruleAttribute )
            {
            // InternalSmallUML.g:3708:2: ( ruleAttribute )
            // InternalSmallUML.g:3709:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AttributesAssignment_5_3_1"


    // $ANTLR start "rule__Class__MethodsAssignment_6_2"
    // InternalSmallUML.g:3718:1: rule__Class__MethodsAssignment_6_2 : ( ruleMethod ) ;
    public final void rule__Class__MethodsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3722:1: ( ( ruleMethod ) )
            // InternalSmallUML.g:3723:2: ( ruleMethod )
            {
            // InternalSmallUML.g:3723:2: ( ruleMethod )
            // InternalSmallUML.g:3724:3: ruleMethod
            {
             before(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MethodsAssignment_6_2"


    // $ANTLR start "rule__Class__MethodsAssignment_6_3_1"
    // InternalSmallUML.g:3733:1: rule__Class__MethodsAssignment_6_3_1 : ( ruleMethod ) ;
    public final void rule__Class__MethodsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3737:1: ( ( ruleMethod ) )
            // InternalSmallUML.g:3738:2: ( ruleMethod )
            {
            // InternalSmallUML.g:3738:2: ( ruleMethod )
            // InternalSmallUML.g:3739:3: ruleMethod
            {
             before(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MethodsAssignment_6_3_1"


    // $ANTLR start "rule__Relation__NameAssignment_1"
    // InternalSmallUML.g:3748:1: rule__Relation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Relation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3752:1: ( ( ruleEString ) )
            // InternalSmallUML.g:3753:2: ( ruleEString )
            {
            // InternalSmallUML.g:3753:2: ( ruleEString )
            // InternalSmallUML.g:3754:3: ruleEString
            {
             before(grammarAccess.getRelationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__NameAssignment_1"


    // $ANTLR start "rule__Relation__FromAssignment_4"
    // InternalSmallUML.g:3763:1: rule__Relation__FromAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Relation__FromAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3767:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:3768:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:3768:2: ( ( ruleEString ) )
            // InternalSmallUML.g:3769:3: ( ruleEString )
            {
             before(grammarAccess.getRelationAccess().getFromClassCrossReference_4_0()); 
            // InternalSmallUML.g:3770:3: ( ruleEString )
            // InternalSmallUML.g:3771:4: ruleEString
            {
             before(grammarAccess.getRelationAccess().getFromClassEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getFromClassEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getFromClassCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__FromAssignment_4"


    // $ANTLR start "rule__Relation__ToAssignment_6"
    // InternalSmallUML.g:3782:1: rule__Relation__ToAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Relation__ToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3786:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:3787:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:3787:2: ( ( ruleEString ) )
            // InternalSmallUML.g:3788:3: ( ruleEString )
            {
             before(grammarAccess.getRelationAccess().getToClassCrossReference_6_0()); 
            // InternalSmallUML.g:3789:3: ( ruleEString )
            // InternalSmallUML.g:3790:4: ruleEString
            {
             before(grammarAccess.getRelationAccess().getToClassEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getToClassEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getToClassCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__ToAssignment_6"


    // $ANTLR start "rule__Relation__CardinalityAssignment_8"
    // InternalSmallUML.g:3801:1: rule__Relation__CardinalityAssignment_8 : ( ruleCardinality ) ;
    public final void rule__Relation__CardinalityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3805:1: ( ( ruleCardinality ) )
            // InternalSmallUML.g:3806:2: ( ruleCardinality )
            {
            // InternalSmallUML.g:3806:2: ( ruleCardinality )
            // InternalSmallUML.g:3807:3: ruleCardinality
            {
             before(grammarAccess.getRelationAccess().getCardinalityCardinalityParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getCardinalityCardinalityParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__CardinalityAssignment_8"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalSmallUML.g:3816:1: rule__Attribute__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3820:1: ( ( ruleEString ) )
            // InternalSmallUML.g:3821:2: ( ruleEString )
            {
            // InternalSmallUML.g:3821:2: ( ruleEString )
            // InternalSmallUML.g:3822:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypedValueAssignment_4"
    // InternalSmallUML.g:3831:1: rule__Attribute__TypedValueAssignment_4 : ( ruleType ) ;
    public final void rule__Attribute__TypedValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3835:1: ( ( ruleType ) )
            // InternalSmallUML.g:3836:2: ( ruleType )
            {
            // InternalSmallUML.g:3836:2: ( ruleType )
            // InternalSmallUML.g:3837:3: ruleType
            {
             before(grammarAccess.getAttributeAccess().getTypedValueTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypedValueTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypedValueAssignment_4"


    // $ANTLR start "rule__Method__NameAssignment_2"
    // InternalSmallUML.g:3846:1: rule__Method__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Method__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3850:1: ( ( ruleEString ) )
            // InternalSmallUML.g:3851:2: ( ruleEString )
            {
            // InternalSmallUML.g:3851:2: ( ruleEString )
            // InternalSmallUML.g:3852:3: ruleEString
            {
             before(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_2"


    // $ANTLR start "rule__Method__ReturnTypedValueAssignment_4_1"
    // InternalSmallUML.g:3861:1: rule__Method__ReturnTypedValueAssignment_4_1 : ( ruleType ) ;
    public final void rule__Method__ReturnTypedValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3865:1: ( ( ruleType ) )
            // InternalSmallUML.g:3866:2: ( ruleType )
            {
            // InternalSmallUML.g:3866:2: ( ruleType )
            // InternalSmallUML.g:3867:3: ruleType
            {
             before(grammarAccess.getMethodAccess().getReturnTypedValueTypeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getReturnTypedValueTypeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ReturnTypedValueAssignment_4_1"


    // $ANTLR start "rule__Method__ParametersAssignment_5_2"
    // InternalSmallUML.g:3876:1: rule__Method__ParametersAssignment_5_2 : ( ruleAttribute ) ;
    public final void rule__Method__ParametersAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3880:1: ( ( ruleAttribute ) )
            // InternalSmallUML.g:3881:2: ( ruleAttribute )
            {
            // InternalSmallUML.g:3881:2: ( ruleAttribute )
            // InternalSmallUML.g:3882:3: ruleAttribute
            {
             before(grammarAccess.getMethodAccess().getParametersAttributeParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersAttributeParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_5_2"


    // $ANTLR start "rule__Method__ParametersAssignment_5_3_1"
    // InternalSmallUML.g:3891:1: rule__Method__ParametersAssignment_5_3_1 : ( ruleAttribute ) ;
    public final void rule__Method__ParametersAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3895:1: ( ( ruleAttribute ) )
            // InternalSmallUML.g:3896:2: ( ruleAttribute )
            {
            // InternalSmallUML.g:3896:2: ( ruleAttribute )
            // InternalSmallUML.g:3897:3: ruleAttribute
            {
             before(grammarAccess.getMethodAccess().getParametersAttributeParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersAttributeParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_5_3_1"


    // $ANTLR start "rule__Enumeration__NameAssignment_1"
    // InternalSmallUML.g:3906:1: rule__Enumeration__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3910:1: ( ( ruleEString ) )
            // InternalSmallUML.g:3911:2: ( ruleEString )
            {
            // InternalSmallUML.g:3911:2: ( ruleEString )
            // InternalSmallUML.g:3912:3: ruleEString
            {
             before(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__NameAssignment_1"


    // $ANTLR start "rule__Enumeration__ValueAssignment_5"
    // InternalSmallUML.g:3921:1: rule__Enumeration__ValueAssignment_5 : ( ruleString0 ) ;
    public final void rule__Enumeration__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3925:1: ( ( ruleString0 ) )
            // InternalSmallUML.g:3926:2: ( ruleString0 )
            {
            // InternalSmallUML.g:3926:2: ( ruleString0 )
            // InternalSmallUML.g:3927:3: ruleString0
            {
             before(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ValueAssignment_5"


    // $ANTLR start "rule__Enumeration__ValueAssignment_6_1"
    // InternalSmallUML.g:3936:1: rule__Enumeration__ValueAssignment_6_1 : ( ruleString0 ) ;
    public final void rule__Enumeration__ValueAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3940:1: ( ( ruleString0 ) )
            // InternalSmallUML.g:3941:2: ( ruleString0 )
            {
            // InternalSmallUML.g:3941:2: ( ruleString0 )
            // InternalSmallUML.g:3942:3: ruleString0
            {
             before(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ValueAssignment_6_1"


    // $ANTLR start "rule__Cardinality__LowerBoundAssignment_3"
    // InternalSmallUML.g:3951:1: rule__Cardinality__LowerBoundAssignment_3 : ( ruleEInt ) ;
    public final void rule__Cardinality__LowerBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3955:1: ( ( ruleEInt ) )
            // InternalSmallUML.g:3956:2: ( ruleEInt )
            {
            // InternalSmallUML.g:3956:2: ( ruleEInt )
            // InternalSmallUML.g:3957:3: ruleEInt
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCardinalityAccess().getLowerBoundEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__LowerBoundAssignment_3"


    // $ANTLR start "rule__Cardinality__UpperBoundAssignment_5"
    // InternalSmallUML.g:3966:1: rule__Cardinality__UpperBoundAssignment_5 : ( ruleEInt ) ;
    public final void rule__Cardinality__UpperBoundAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3970:1: ( ( ruleEInt ) )
            // InternalSmallUML.g:3971:2: ( ruleEInt )
            {
            // InternalSmallUML.g:3971:2: ( ruleEInt )
            // InternalSmallUML.g:3972:3: ruleEInt
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCardinalityAccess().getUpperBoundEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__UpperBoundAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000642000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000007F00000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000C0002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});

}