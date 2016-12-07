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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'}'", "'class'", "','", "'relation'", "'Class'", "'attributes'", "'methods'", "'Relation'", "'from'", "'to'", "'cardinality'", "'Attribute'", "'typedValue'", "'Method'", "'returnTypedValue'", "'parameters'", "'Type'", "'Boolean'", "'Real'", "'Integer'", "'String'", "'Enumeration'", "'value'", "'Cardinality'", "'lowerBound'", "'upperBound'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


    // $ANTLR start "entryRuleEnumeration"
    // InternalSmallUML.g:353:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalSmallUML.g:354:1: ( ruleEnumeration EOF )
            // InternalSmallUML.g:355:1: ruleEnumeration EOF
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
    // InternalSmallUML.g:362:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:366:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalSmallUML.g:367:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalSmallUML.g:367:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalSmallUML.g:368:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalSmallUML.g:369:3: ( rule__Enumeration__Group__0 )
            // InternalSmallUML.g:369:4: rule__Enumeration__Group__0
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
    // InternalSmallUML.g:378:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalSmallUML.g:379:1: ( ruleCardinality EOF )
            // InternalSmallUML.g:380:1: ruleCardinality EOF
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
    // InternalSmallUML.g:387:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:391:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // InternalSmallUML.g:392:2: ( ( rule__Cardinality__Group__0 ) )
            {
            // InternalSmallUML.g:392:2: ( ( rule__Cardinality__Group__0 ) )
            // InternalSmallUML.g:393:3: ( rule__Cardinality__Group__0 )
            {
             before(grammarAccess.getCardinalityAccess().getGroup()); 
            // InternalSmallUML.g:394:3: ( rule__Cardinality__Group__0 )
            // InternalSmallUML.g:394:4: rule__Cardinality__Group__0
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
    // InternalSmallUML.g:403:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSmallUML.g:404:1: ( ruleEInt EOF )
            // InternalSmallUML.g:405:1: ruleEInt EOF
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
    // InternalSmallUML.g:412:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:416:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSmallUML.g:417:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSmallUML.g:417:2: ( ( rule__EInt__Group__0 ) )
            // InternalSmallUML.g:418:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSmallUML.g:419:3: ( rule__EInt__Group__0 )
            // InternalSmallUML.g:419:4: rule__EInt__Group__0
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
    // InternalSmallUML.g:427:1: rule__Type__Alternatives : ( ( ruleType_Impl ) | ( ruleBoolean ) | ( ruleReal ) | ( ruleInteger ) | ( ruleString0 ) | ( ruleEnumeration ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:431:1: ( ( ruleType_Impl ) | ( ruleBoolean ) | ( ruleReal ) | ( ruleInteger ) | ( ruleString0 ) | ( ruleEnumeration ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 31:
                {
                alt1=3;
                }
                break;
            case 32:
                {
                alt1=4;
                }
                break;
            case 33:
                {
                alt1=5;
                }
                break;
            case 34:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSmallUML.g:432:2: ( ruleType_Impl )
                    {
                    // InternalSmallUML.g:432:2: ( ruleType_Impl )
                    // InternalSmallUML.g:433:3: ruleType_Impl
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
                    // InternalSmallUML.g:438:2: ( ruleBoolean )
                    {
                    // InternalSmallUML.g:438:2: ( ruleBoolean )
                    // InternalSmallUML.g:439:3: ruleBoolean
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
                    // InternalSmallUML.g:444:2: ( ruleReal )
                    {
                    // InternalSmallUML.g:444:2: ( ruleReal )
                    // InternalSmallUML.g:445:3: ruleReal
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
                    // InternalSmallUML.g:450:2: ( ruleInteger )
                    {
                    // InternalSmallUML.g:450:2: ( ruleInteger )
                    // InternalSmallUML.g:451:3: ruleInteger
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
                    // InternalSmallUML.g:456:2: ( ruleString0 )
                    {
                    // InternalSmallUML.g:456:2: ( ruleString0 )
                    // InternalSmallUML.g:457:3: ruleString0
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
                    // InternalSmallUML.g:462:2: ( ruleEnumeration )
                    {
                    // InternalSmallUML.g:462:2: ( ruleEnumeration )
                    // InternalSmallUML.g:463:3: ruleEnumeration
                    {
                     before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_5()); 

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
    // InternalSmallUML.g:472:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:476:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSmallUML.g:477:2: ( RULE_STRING )
                    {
                    // InternalSmallUML.g:477:2: ( RULE_STRING )
                    // InternalSmallUML.g:478:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:483:2: ( RULE_ID )
                    {
                    // InternalSmallUML.g:483:2: ( RULE_ID )
                    // InternalSmallUML.g:484:3: RULE_ID
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
    // InternalSmallUML.g:493:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:497:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalSmallUML.g:498:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // InternalSmallUML.g:505:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:509:1: ( ( () ) )
            // InternalSmallUML.g:510:1: ( () )
            {
            // InternalSmallUML.g:510:1: ( () )
            // InternalSmallUML.g:511:2: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // InternalSmallUML.g:512:2: ()
            // InternalSmallUML.g:512:3: 
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
    // InternalSmallUML.g:520:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:524:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalSmallUML.g:525:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalSmallUML.g:532:1: rule__Package__Group__1__Impl : ( 'Package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:536:1: ( ( 'Package' ) )
            // InternalSmallUML.g:537:1: ( 'Package' )
            {
            // InternalSmallUML.g:537:1: ( 'Package' )
            // InternalSmallUML.g:538:2: 'Package'
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
    // InternalSmallUML.g:547:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:551:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalSmallUML.g:552:2: rule__Package__Group__2__Impl rule__Package__Group__3
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
    // InternalSmallUML.g:559:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:563:1: ( ( '{' ) )
            // InternalSmallUML.g:564:1: ( '{' )
            {
            // InternalSmallUML.g:564:1: ( '{' )
            // InternalSmallUML.g:565:2: '{'
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
    // InternalSmallUML.g:574:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:578:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalSmallUML.g:579:2: rule__Package__Group__3__Impl rule__Package__Group__4
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
    // InternalSmallUML.g:586:1: rule__Package__Group__3__Impl : ( ( rule__Package__Group_3__0 )? ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:590:1: ( ( ( rule__Package__Group_3__0 )? ) )
            // InternalSmallUML.g:591:1: ( ( rule__Package__Group_3__0 )? )
            {
            // InternalSmallUML.g:591:1: ( ( rule__Package__Group_3__0 )? )
            // InternalSmallUML.g:592:2: ( rule__Package__Group_3__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_3()); 
            // InternalSmallUML.g:593:2: ( rule__Package__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSmallUML.g:593:3: rule__Package__Group_3__0
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
    // InternalSmallUML.g:601:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:605:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalSmallUML.g:606:2: rule__Package__Group__4__Impl rule__Package__Group__5
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
    // InternalSmallUML.g:613:1: rule__Package__Group__4__Impl : ( ( rule__Package__Group_4__0 )? ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:617:1: ( ( ( rule__Package__Group_4__0 )? ) )
            // InternalSmallUML.g:618:1: ( ( rule__Package__Group_4__0 )? )
            {
            // InternalSmallUML.g:618:1: ( ( rule__Package__Group_4__0 )? )
            // InternalSmallUML.g:619:2: ( rule__Package__Group_4__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_4()); 
            // InternalSmallUML.g:620:2: ( rule__Package__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmallUML.g:620:3: rule__Package__Group_4__0
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
    // InternalSmallUML.g:628:1: rule__Package__Group__5 : rule__Package__Group__5__Impl ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:632:1: ( rule__Package__Group__5__Impl )
            // InternalSmallUML.g:633:2: rule__Package__Group__5__Impl
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
    // InternalSmallUML.g:639:1: rule__Package__Group__5__Impl : ( '}' ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:643:1: ( ( '}' ) )
            // InternalSmallUML.g:644:1: ( '}' )
            {
            // InternalSmallUML.g:644:1: ( '}' )
            // InternalSmallUML.g:645:2: '}'
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
    // InternalSmallUML.g:655:1: rule__Package__Group_3__0 : rule__Package__Group_3__0__Impl rule__Package__Group_3__1 ;
    public final void rule__Package__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:659:1: ( rule__Package__Group_3__0__Impl rule__Package__Group_3__1 )
            // InternalSmallUML.g:660:2: rule__Package__Group_3__0__Impl rule__Package__Group_3__1
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
    // InternalSmallUML.g:667:1: rule__Package__Group_3__0__Impl : ( 'class' ) ;
    public final void rule__Package__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:671:1: ( ( 'class' ) )
            // InternalSmallUML.g:672:1: ( 'class' )
            {
            // InternalSmallUML.g:672:1: ( 'class' )
            // InternalSmallUML.g:673:2: 'class'
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
    // InternalSmallUML.g:682:1: rule__Package__Group_3__1 : rule__Package__Group_3__1__Impl rule__Package__Group_3__2 ;
    public final void rule__Package__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:686:1: ( rule__Package__Group_3__1__Impl rule__Package__Group_3__2 )
            // InternalSmallUML.g:687:2: rule__Package__Group_3__1__Impl rule__Package__Group_3__2
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
    // InternalSmallUML.g:694:1: rule__Package__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Package__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:698:1: ( ( '{' ) )
            // InternalSmallUML.g:699:1: ( '{' )
            {
            // InternalSmallUML.g:699:1: ( '{' )
            // InternalSmallUML.g:700:2: '{'
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
    // InternalSmallUML.g:709:1: rule__Package__Group_3__2 : rule__Package__Group_3__2__Impl rule__Package__Group_3__3 ;
    public final void rule__Package__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:713:1: ( rule__Package__Group_3__2__Impl rule__Package__Group_3__3 )
            // InternalSmallUML.g:714:2: rule__Package__Group_3__2__Impl rule__Package__Group_3__3
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
    // InternalSmallUML.g:721:1: rule__Package__Group_3__2__Impl : ( ( rule__Package__ClassAssignment_3_2 ) ) ;
    public final void rule__Package__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:725:1: ( ( ( rule__Package__ClassAssignment_3_2 ) ) )
            // InternalSmallUML.g:726:1: ( ( rule__Package__ClassAssignment_3_2 ) )
            {
            // InternalSmallUML.g:726:1: ( ( rule__Package__ClassAssignment_3_2 ) )
            // InternalSmallUML.g:727:2: ( rule__Package__ClassAssignment_3_2 )
            {
             before(grammarAccess.getPackageAccess().getClassAssignment_3_2()); 
            // InternalSmallUML.g:728:2: ( rule__Package__ClassAssignment_3_2 )
            // InternalSmallUML.g:728:3: rule__Package__ClassAssignment_3_2
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
    // InternalSmallUML.g:736:1: rule__Package__Group_3__3 : rule__Package__Group_3__3__Impl rule__Package__Group_3__4 ;
    public final void rule__Package__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:740:1: ( rule__Package__Group_3__3__Impl rule__Package__Group_3__4 )
            // InternalSmallUML.g:741:2: rule__Package__Group_3__3__Impl rule__Package__Group_3__4
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
    // InternalSmallUML.g:748:1: rule__Package__Group_3__3__Impl : ( ( rule__Package__Group_3_3__0 )* ) ;
    public final void rule__Package__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:752:1: ( ( ( rule__Package__Group_3_3__0 )* ) )
            // InternalSmallUML.g:753:1: ( ( rule__Package__Group_3_3__0 )* )
            {
            // InternalSmallUML.g:753:1: ( ( rule__Package__Group_3_3__0 )* )
            // InternalSmallUML.g:754:2: ( rule__Package__Group_3_3__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_3_3()); 
            // InternalSmallUML.g:755:2: ( rule__Package__Group_3_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmallUML.g:755:3: rule__Package__Group_3_3__0
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
    // InternalSmallUML.g:763:1: rule__Package__Group_3__4 : rule__Package__Group_3__4__Impl ;
    public final void rule__Package__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:767:1: ( rule__Package__Group_3__4__Impl )
            // InternalSmallUML.g:768:2: rule__Package__Group_3__4__Impl
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
    // InternalSmallUML.g:774:1: rule__Package__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Package__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:778:1: ( ( '}' ) )
            // InternalSmallUML.g:779:1: ( '}' )
            {
            // InternalSmallUML.g:779:1: ( '}' )
            // InternalSmallUML.g:780:2: '}'
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
    // InternalSmallUML.g:790:1: rule__Package__Group_3_3__0 : rule__Package__Group_3_3__0__Impl rule__Package__Group_3_3__1 ;
    public final void rule__Package__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:794:1: ( rule__Package__Group_3_3__0__Impl rule__Package__Group_3_3__1 )
            // InternalSmallUML.g:795:2: rule__Package__Group_3_3__0__Impl rule__Package__Group_3_3__1
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
    // InternalSmallUML.g:802:1: rule__Package__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Package__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:806:1: ( ( ',' ) )
            // InternalSmallUML.g:807:1: ( ',' )
            {
            // InternalSmallUML.g:807:1: ( ',' )
            // InternalSmallUML.g:808:2: ','
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
    // InternalSmallUML.g:817:1: rule__Package__Group_3_3__1 : rule__Package__Group_3_3__1__Impl ;
    public final void rule__Package__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:821:1: ( rule__Package__Group_3_3__1__Impl )
            // InternalSmallUML.g:822:2: rule__Package__Group_3_3__1__Impl
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
    // InternalSmallUML.g:828:1: rule__Package__Group_3_3__1__Impl : ( ( rule__Package__ClassAssignment_3_3_1 ) ) ;
    public final void rule__Package__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:832:1: ( ( ( rule__Package__ClassAssignment_3_3_1 ) ) )
            // InternalSmallUML.g:833:1: ( ( rule__Package__ClassAssignment_3_3_1 ) )
            {
            // InternalSmallUML.g:833:1: ( ( rule__Package__ClassAssignment_3_3_1 ) )
            // InternalSmallUML.g:834:2: ( rule__Package__ClassAssignment_3_3_1 )
            {
             before(grammarAccess.getPackageAccess().getClassAssignment_3_3_1()); 
            // InternalSmallUML.g:835:2: ( rule__Package__ClassAssignment_3_3_1 )
            // InternalSmallUML.g:835:3: rule__Package__ClassAssignment_3_3_1
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
    // InternalSmallUML.g:844:1: rule__Package__Group_4__0 : rule__Package__Group_4__0__Impl rule__Package__Group_4__1 ;
    public final void rule__Package__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:848:1: ( rule__Package__Group_4__0__Impl rule__Package__Group_4__1 )
            // InternalSmallUML.g:849:2: rule__Package__Group_4__0__Impl rule__Package__Group_4__1
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
    // InternalSmallUML.g:856:1: rule__Package__Group_4__0__Impl : ( 'relation' ) ;
    public final void rule__Package__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:860:1: ( ( 'relation' ) )
            // InternalSmallUML.g:861:1: ( 'relation' )
            {
            // InternalSmallUML.g:861:1: ( 'relation' )
            // InternalSmallUML.g:862:2: 'relation'
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
    // InternalSmallUML.g:871:1: rule__Package__Group_4__1 : rule__Package__Group_4__1__Impl rule__Package__Group_4__2 ;
    public final void rule__Package__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:875:1: ( rule__Package__Group_4__1__Impl rule__Package__Group_4__2 )
            // InternalSmallUML.g:876:2: rule__Package__Group_4__1__Impl rule__Package__Group_4__2
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
    // InternalSmallUML.g:883:1: rule__Package__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Package__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:887:1: ( ( '{' ) )
            // InternalSmallUML.g:888:1: ( '{' )
            {
            // InternalSmallUML.g:888:1: ( '{' )
            // InternalSmallUML.g:889:2: '{'
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
    // InternalSmallUML.g:898:1: rule__Package__Group_4__2 : rule__Package__Group_4__2__Impl rule__Package__Group_4__3 ;
    public final void rule__Package__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:902:1: ( rule__Package__Group_4__2__Impl rule__Package__Group_4__3 )
            // InternalSmallUML.g:903:2: rule__Package__Group_4__2__Impl rule__Package__Group_4__3
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
    // InternalSmallUML.g:910:1: rule__Package__Group_4__2__Impl : ( ( rule__Package__RelationAssignment_4_2 ) ) ;
    public final void rule__Package__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:914:1: ( ( ( rule__Package__RelationAssignment_4_2 ) ) )
            // InternalSmallUML.g:915:1: ( ( rule__Package__RelationAssignment_4_2 ) )
            {
            // InternalSmallUML.g:915:1: ( ( rule__Package__RelationAssignment_4_2 ) )
            // InternalSmallUML.g:916:2: ( rule__Package__RelationAssignment_4_2 )
            {
             before(grammarAccess.getPackageAccess().getRelationAssignment_4_2()); 
            // InternalSmallUML.g:917:2: ( rule__Package__RelationAssignment_4_2 )
            // InternalSmallUML.g:917:3: rule__Package__RelationAssignment_4_2
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
    // InternalSmallUML.g:925:1: rule__Package__Group_4__3 : rule__Package__Group_4__3__Impl rule__Package__Group_4__4 ;
    public final void rule__Package__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:929:1: ( rule__Package__Group_4__3__Impl rule__Package__Group_4__4 )
            // InternalSmallUML.g:930:2: rule__Package__Group_4__3__Impl rule__Package__Group_4__4
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
    // InternalSmallUML.g:937:1: rule__Package__Group_4__3__Impl : ( ( rule__Package__Group_4_3__0 )* ) ;
    public final void rule__Package__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:941:1: ( ( ( rule__Package__Group_4_3__0 )* ) )
            // InternalSmallUML.g:942:1: ( ( rule__Package__Group_4_3__0 )* )
            {
            // InternalSmallUML.g:942:1: ( ( rule__Package__Group_4_3__0 )* )
            // InternalSmallUML.g:943:2: ( rule__Package__Group_4_3__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_4_3()); 
            // InternalSmallUML.g:944:2: ( rule__Package__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSmallUML.g:944:3: rule__Package__Group_4_3__0
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
    // InternalSmallUML.g:952:1: rule__Package__Group_4__4 : rule__Package__Group_4__4__Impl ;
    public final void rule__Package__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:956:1: ( rule__Package__Group_4__4__Impl )
            // InternalSmallUML.g:957:2: rule__Package__Group_4__4__Impl
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
    // InternalSmallUML.g:963:1: rule__Package__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Package__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:967:1: ( ( '}' ) )
            // InternalSmallUML.g:968:1: ( '}' )
            {
            // InternalSmallUML.g:968:1: ( '}' )
            // InternalSmallUML.g:969:2: '}'
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
    // InternalSmallUML.g:979:1: rule__Package__Group_4_3__0 : rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1 ;
    public final void rule__Package__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:983:1: ( rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1 )
            // InternalSmallUML.g:984:2: rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1
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
    // InternalSmallUML.g:991:1: rule__Package__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Package__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:995:1: ( ( ',' ) )
            // InternalSmallUML.g:996:1: ( ',' )
            {
            // InternalSmallUML.g:996:1: ( ',' )
            // InternalSmallUML.g:997:2: ','
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
    // InternalSmallUML.g:1006:1: rule__Package__Group_4_3__1 : rule__Package__Group_4_3__1__Impl ;
    public final void rule__Package__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1010:1: ( rule__Package__Group_4_3__1__Impl )
            // InternalSmallUML.g:1011:2: rule__Package__Group_4_3__1__Impl
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
    // InternalSmallUML.g:1017:1: rule__Package__Group_4_3__1__Impl : ( ( rule__Package__RelationAssignment_4_3_1 ) ) ;
    public final void rule__Package__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1021:1: ( ( ( rule__Package__RelationAssignment_4_3_1 ) ) )
            // InternalSmallUML.g:1022:1: ( ( rule__Package__RelationAssignment_4_3_1 ) )
            {
            // InternalSmallUML.g:1022:1: ( ( rule__Package__RelationAssignment_4_3_1 ) )
            // InternalSmallUML.g:1023:2: ( rule__Package__RelationAssignment_4_3_1 )
            {
             before(grammarAccess.getPackageAccess().getRelationAssignment_4_3_1()); 
            // InternalSmallUML.g:1024:2: ( rule__Package__RelationAssignment_4_3_1 )
            // InternalSmallUML.g:1024:3: rule__Package__RelationAssignment_4_3_1
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
    // InternalSmallUML.g:1033:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1037:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalSmallUML.g:1038:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalSmallUML.g:1045:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1049:1: ( ( () ) )
            // InternalSmallUML.g:1050:1: ( () )
            {
            // InternalSmallUML.g:1050:1: ( () )
            // InternalSmallUML.g:1051:2: ()
            {
             before(grammarAccess.getClassAccess().getClassAction_0()); 
            // InternalSmallUML.g:1052:2: ()
            // InternalSmallUML.g:1052:3: 
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
    // InternalSmallUML.g:1060:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1064:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalSmallUML.g:1065:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalSmallUML.g:1072:1: rule__Class__Group__1__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1076:1: ( ( 'Class' ) )
            // InternalSmallUML.g:1077:1: ( 'Class' )
            {
            // InternalSmallUML.g:1077:1: ( 'Class' )
            // InternalSmallUML.g:1078:2: 'Class'
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
    // InternalSmallUML.g:1087:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1091:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalSmallUML.g:1092:2: rule__Class__Group__2__Impl rule__Class__Group__3
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
    // InternalSmallUML.g:1099:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1103:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalSmallUML.g:1104:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:1104:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalSmallUML.g:1105:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:1106:2: ( rule__Class__NameAssignment_2 )
            // InternalSmallUML.g:1106:3: rule__Class__NameAssignment_2
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
    // InternalSmallUML.g:1114:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1118:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalSmallUML.g:1119:2: rule__Class__Group__3__Impl rule__Class__Group__4
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
    // InternalSmallUML.g:1126:1: rule__Class__Group__3__Impl : ( '{' ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1130:1: ( ( '{' ) )
            // InternalSmallUML.g:1131:1: ( '{' )
            {
            // InternalSmallUML.g:1131:1: ( '{' )
            // InternalSmallUML.g:1132:2: '{'
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
    // InternalSmallUML.g:1141:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1145:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalSmallUML.g:1146:2: rule__Class__Group__4__Impl rule__Class__Group__5
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
    // InternalSmallUML.g:1153:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1157:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalSmallUML.g:1158:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalSmallUML.g:1158:1: ( ( rule__Class__Group_4__0 )? )
            // InternalSmallUML.g:1159:2: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // InternalSmallUML.g:1160:2: ( rule__Class__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmallUML.g:1160:3: rule__Class__Group_4__0
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
    // InternalSmallUML.g:1168:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1172:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalSmallUML.g:1173:2: rule__Class__Group__5__Impl rule__Class__Group__6
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
    // InternalSmallUML.g:1180:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1184:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // InternalSmallUML.g:1185:1: ( ( rule__Class__Group_5__0 )? )
            {
            // InternalSmallUML.g:1185:1: ( ( rule__Class__Group_5__0 )? )
            // InternalSmallUML.g:1186:2: ( rule__Class__Group_5__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_5()); 
            // InternalSmallUML.g:1187:2: ( rule__Class__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmallUML.g:1187:3: rule__Class__Group_5__0
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
    // InternalSmallUML.g:1195:1: rule__Class__Group__6 : rule__Class__Group__6__Impl ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1199:1: ( rule__Class__Group__6__Impl )
            // InternalSmallUML.g:1200:2: rule__Class__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__6__Impl();

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
    // InternalSmallUML.g:1206:1: rule__Class__Group__6__Impl : ( '}' ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1210:1: ( ( '}' ) )
            // InternalSmallUML.g:1211:1: ( '}' )
            {
            // InternalSmallUML.g:1211:1: ( '}' )
            // InternalSmallUML.g:1212:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6()); 

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


    // $ANTLR start "rule__Class__Group_4__0"
    // InternalSmallUML.g:1222:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1226:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalSmallUML.g:1227:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSmallUML.g:1234:1: rule__Class__Group_4__0__Impl : ( 'attributes' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1238:1: ( ( 'attributes' ) )
            // InternalSmallUML.g:1239:1: ( 'attributes' )
            {
            // InternalSmallUML.g:1239:1: ( 'attributes' )
            // InternalSmallUML.g:1240:2: 'attributes'
            {
             before(grammarAccess.getClassAccess().getAttributesKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAttributesKeyword_4_0()); 

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
    // InternalSmallUML.g:1249:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl rule__Class__Group_4__2 ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1253:1: ( rule__Class__Group_4__1__Impl rule__Class__Group_4__2 )
            // InternalSmallUML.g:1254:2: rule__Class__Group_4__1__Impl rule__Class__Group_4__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSmallUML.g:1261:1: rule__Class__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1265:1: ( ( '{' ) )
            // InternalSmallUML.g:1266:1: ( '{' )
            {
            // InternalSmallUML.g:1266:1: ( '{' )
            // InternalSmallUML.g:1267:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // InternalSmallUML.g:1276:1: rule__Class__Group_4__2 : rule__Class__Group_4__2__Impl rule__Class__Group_4__3 ;
    public final void rule__Class__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1280:1: ( rule__Class__Group_4__2__Impl rule__Class__Group_4__3 )
            // InternalSmallUML.g:1281:2: rule__Class__Group_4__2__Impl rule__Class__Group_4__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalSmallUML.g:1288:1: rule__Class__Group_4__2__Impl : ( ( rule__Class__AttributesAssignment_4_2 ) ) ;
    public final void rule__Class__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1292:1: ( ( ( rule__Class__AttributesAssignment_4_2 ) ) )
            // InternalSmallUML.g:1293:1: ( ( rule__Class__AttributesAssignment_4_2 ) )
            {
            // InternalSmallUML.g:1293:1: ( ( rule__Class__AttributesAssignment_4_2 ) )
            // InternalSmallUML.g:1294:2: ( rule__Class__AttributesAssignment_4_2 )
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_4_2()); 
            // InternalSmallUML.g:1295:2: ( rule__Class__AttributesAssignment_4_2 )
            // InternalSmallUML.g:1295:3: rule__Class__AttributesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__AttributesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAttributesAssignment_4_2()); 

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
    // InternalSmallUML.g:1303:1: rule__Class__Group_4__3 : rule__Class__Group_4__3__Impl rule__Class__Group_4__4 ;
    public final void rule__Class__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1307:1: ( rule__Class__Group_4__3__Impl rule__Class__Group_4__4 )
            // InternalSmallUML.g:1308:2: rule__Class__Group_4__3__Impl rule__Class__Group_4__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalSmallUML.g:1315:1: rule__Class__Group_4__3__Impl : ( ( rule__Class__Group_4_3__0 )* ) ;
    public final void rule__Class__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1319:1: ( ( ( rule__Class__Group_4_3__0 )* ) )
            // InternalSmallUML.g:1320:1: ( ( rule__Class__Group_4_3__0 )* )
            {
            // InternalSmallUML.g:1320:1: ( ( rule__Class__Group_4_3__0 )* )
            // InternalSmallUML.g:1321:2: ( rule__Class__Group_4_3__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_4_3()); 
            // InternalSmallUML.g:1322:2: ( rule__Class__Group_4_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSmallUML.g:1322:3: rule__Class__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Class__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalSmallUML.g:1330:1: rule__Class__Group_4__4 : rule__Class__Group_4__4__Impl ;
    public final void rule__Class__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1334:1: ( rule__Class__Group_4__4__Impl )
            // InternalSmallUML.g:1335:2: rule__Class__Group_4__4__Impl
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
    // InternalSmallUML.g:1341:1: rule__Class__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Class__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1345:1: ( ( '}' ) )
            // InternalSmallUML.g:1346:1: ( '}' )
            {
            // InternalSmallUML.g:1346:1: ( '}' )
            // InternalSmallUML.g:1347:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // InternalSmallUML.g:1357:1: rule__Class__Group_4_3__0 : rule__Class__Group_4_3__0__Impl rule__Class__Group_4_3__1 ;
    public final void rule__Class__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1361:1: ( rule__Class__Group_4_3__0__Impl rule__Class__Group_4_3__1 )
            // InternalSmallUML.g:1362:2: rule__Class__Group_4_3__0__Impl rule__Class__Group_4_3__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSmallUML.g:1369:1: rule__Class__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1373:1: ( ( ',' ) )
            // InternalSmallUML.g:1374:1: ( ',' )
            {
            // InternalSmallUML.g:1374:1: ( ',' )
            // InternalSmallUML.g:1375:2: ','
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
    // InternalSmallUML.g:1384:1: rule__Class__Group_4_3__1 : rule__Class__Group_4_3__1__Impl ;
    public final void rule__Class__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1388:1: ( rule__Class__Group_4_3__1__Impl )
            // InternalSmallUML.g:1389:2: rule__Class__Group_4_3__1__Impl
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
    // InternalSmallUML.g:1395:1: rule__Class__Group_4_3__1__Impl : ( ( rule__Class__AttributesAssignment_4_3_1 ) ) ;
    public final void rule__Class__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1399:1: ( ( ( rule__Class__AttributesAssignment_4_3_1 ) ) )
            // InternalSmallUML.g:1400:1: ( ( rule__Class__AttributesAssignment_4_3_1 ) )
            {
            // InternalSmallUML.g:1400:1: ( ( rule__Class__AttributesAssignment_4_3_1 ) )
            // InternalSmallUML.g:1401:2: ( rule__Class__AttributesAssignment_4_3_1 )
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_4_3_1()); 
            // InternalSmallUML.g:1402:2: ( rule__Class__AttributesAssignment_4_3_1 )
            // InternalSmallUML.g:1402:3: rule__Class__AttributesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__AttributesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAttributesAssignment_4_3_1()); 

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
    // InternalSmallUML.g:1411:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1415:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // InternalSmallUML.g:1416:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
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
    // InternalSmallUML.g:1423:1: rule__Class__Group_5__0__Impl : ( 'methods' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1427:1: ( ( 'methods' ) )
            // InternalSmallUML.g:1428:1: ( 'methods' )
            {
            // InternalSmallUML.g:1428:1: ( 'methods' )
            // InternalSmallUML.g:1429:2: 'methods'
            {
             before(grammarAccess.getClassAccess().getMethodsKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getMethodsKeyword_5_0()); 

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
    // InternalSmallUML.g:1438:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl rule__Class__Group_5__2 ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1442:1: ( rule__Class__Group_5__1__Impl rule__Class__Group_5__2 )
            // InternalSmallUML.g:1443:2: rule__Class__Group_5__1__Impl rule__Class__Group_5__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalSmallUML.g:1450:1: rule__Class__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1454:1: ( ( '{' ) )
            // InternalSmallUML.g:1455:1: ( '{' )
            {
            // InternalSmallUML.g:1455:1: ( '{' )
            // InternalSmallUML.g:1456:2: '{'
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
    // InternalSmallUML.g:1465:1: rule__Class__Group_5__2 : rule__Class__Group_5__2__Impl rule__Class__Group_5__3 ;
    public final void rule__Class__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1469:1: ( rule__Class__Group_5__2__Impl rule__Class__Group_5__3 )
            // InternalSmallUML.g:1470:2: rule__Class__Group_5__2__Impl rule__Class__Group_5__3
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
    // InternalSmallUML.g:1477:1: rule__Class__Group_5__2__Impl : ( ( rule__Class__MethodsAssignment_5_2 ) ) ;
    public final void rule__Class__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1481:1: ( ( ( rule__Class__MethodsAssignment_5_2 ) ) )
            // InternalSmallUML.g:1482:1: ( ( rule__Class__MethodsAssignment_5_2 ) )
            {
            // InternalSmallUML.g:1482:1: ( ( rule__Class__MethodsAssignment_5_2 ) )
            // InternalSmallUML.g:1483:2: ( rule__Class__MethodsAssignment_5_2 )
            {
             before(grammarAccess.getClassAccess().getMethodsAssignment_5_2()); 
            // InternalSmallUML.g:1484:2: ( rule__Class__MethodsAssignment_5_2 )
            // InternalSmallUML.g:1484:3: rule__Class__MethodsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__MethodsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getMethodsAssignment_5_2()); 

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
    // InternalSmallUML.g:1492:1: rule__Class__Group_5__3 : rule__Class__Group_5__3__Impl rule__Class__Group_5__4 ;
    public final void rule__Class__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1496:1: ( rule__Class__Group_5__3__Impl rule__Class__Group_5__4 )
            // InternalSmallUML.g:1497:2: rule__Class__Group_5__3__Impl rule__Class__Group_5__4
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
    // InternalSmallUML.g:1504:1: rule__Class__Group_5__3__Impl : ( ( rule__Class__Group_5_3__0 )* ) ;
    public final void rule__Class__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1508:1: ( ( ( rule__Class__Group_5_3__0 )* ) )
            // InternalSmallUML.g:1509:1: ( ( rule__Class__Group_5_3__0 )* )
            {
            // InternalSmallUML.g:1509:1: ( ( rule__Class__Group_5_3__0 )* )
            // InternalSmallUML.g:1510:2: ( rule__Class__Group_5_3__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_5_3()); 
            // InternalSmallUML.g:1511:2: ( rule__Class__Group_5_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSmallUML.g:1511:3: rule__Class__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Class__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalSmallUML.g:1519:1: rule__Class__Group_5__4 : rule__Class__Group_5__4__Impl ;
    public final void rule__Class__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1523:1: ( rule__Class__Group_5__4__Impl )
            // InternalSmallUML.g:1524:2: rule__Class__Group_5__4__Impl
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
    // InternalSmallUML.g:1530:1: rule__Class__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Class__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1534:1: ( ( '}' ) )
            // InternalSmallUML.g:1535:1: ( '}' )
            {
            // InternalSmallUML.g:1535:1: ( '}' )
            // InternalSmallUML.g:1536:2: '}'
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
    // InternalSmallUML.g:1546:1: rule__Class__Group_5_3__0 : rule__Class__Group_5_3__0__Impl rule__Class__Group_5_3__1 ;
    public final void rule__Class__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1550:1: ( rule__Class__Group_5_3__0__Impl rule__Class__Group_5_3__1 )
            // InternalSmallUML.g:1551:2: rule__Class__Group_5_3__0__Impl rule__Class__Group_5_3__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSmallUML.g:1558:1: rule__Class__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1562:1: ( ( ',' ) )
            // InternalSmallUML.g:1563:1: ( ',' )
            {
            // InternalSmallUML.g:1563:1: ( ',' )
            // InternalSmallUML.g:1564:2: ','
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
    // InternalSmallUML.g:1573:1: rule__Class__Group_5_3__1 : rule__Class__Group_5_3__1__Impl ;
    public final void rule__Class__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1577:1: ( rule__Class__Group_5_3__1__Impl )
            // InternalSmallUML.g:1578:2: rule__Class__Group_5_3__1__Impl
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
    // InternalSmallUML.g:1584:1: rule__Class__Group_5_3__1__Impl : ( ( rule__Class__MethodsAssignment_5_3_1 ) ) ;
    public final void rule__Class__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1588:1: ( ( ( rule__Class__MethodsAssignment_5_3_1 ) ) )
            // InternalSmallUML.g:1589:1: ( ( rule__Class__MethodsAssignment_5_3_1 ) )
            {
            // InternalSmallUML.g:1589:1: ( ( rule__Class__MethodsAssignment_5_3_1 ) )
            // InternalSmallUML.g:1590:2: ( rule__Class__MethodsAssignment_5_3_1 )
            {
             before(grammarAccess.getClassAccess().getMethodsAssignment_5_3_1()); 
            // InternalSmallUML.g:1591:2: ( rule__Class__MethodsAssignment_5_3_1 )
            // InternalSmallUML.g:1591:3: rule__Class__MethodsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__MethodsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getMethodsAssignment_5_3_1()); 

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


    // $ANTLR start "rule__Relation__Group__0"
    // InternalSmallUML.g:1600:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1604:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalSmallUML.g:1605:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
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
    // InternalSmallUML.g:1612:1: rule__Relation__Group__0__Impl : ( 'Relation' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1616:1: ( ( 'Relation' ) )
            // InternalSmallUML.g:1617:1: ( 'Relation' )
            {
            // InternalSmallUML.g:1617:1: ( 'Relation' )
            // InternalSmallUML.g:1618:2: 'Relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSmallUML.g:1627:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1631:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalSmallUML.g:1632:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
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
    // InternalSmallUML.g:1639:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__NameAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1643:1: ( ( ( rule__Relation__NameAssignment_1 ) ) )
            // InternalSmallUML.g:1644:1: ( ( rule__Relation__NameAssignment_1 ) )
            {
            // InternalSmallUML.g:1644:1: ( ( rule__Relation__NameAssignment_1 ) )
            // InternalSmallUML.g:1645:2: ( rule__Relation__NameAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_1()); 
            // InternalSmallUML.g:1646:2: ( rule__Relation__NameAssignment_1 )
            // InternalSmallUML.g:1646:3: rule__Relation__NameAssignment_1
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
    // InternalSmallUML.g:1654:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1658:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalSmallUML.g:1659:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalSmallUML.g:1666:1: rule__Relation__Group__2__Impl : ( '{' ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1670:1: ( ( '{' ) )
            // InternalSmallUML.g:1671:1: ( '{' )
            {
            // InternalSmallUML.g:1671:1: ( '{' )
            // InternalSmallUML.g:1672:2: '{'
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
    // InternalSmallUML.g:1681:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1685:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // InternalSmallUML.g:1686:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
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
    // InternalSmallUML.g:1693:1: rule__Relation__Group__3__Impl : ( 'from' ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1697:1: ( ( 'from' ) )
            // InternalSmallUML.g:1698:1: ( 'from' )
            {
            // InternalSmallUML.g:1698:1: ( 'from' )
            // InternalSmallUML.g:1699:2: 'from'
            {
             before(grammarAccess.getRelationAccess().getFromKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSmallUML.g:1708:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1712:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // InternalSmallUML.g:1713:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalSmallUML.g:1720:1: rule__Relation__Group__4__Impl : ( ( rule__Relation__FromAssignment_4 ) ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1724:1: ( ( ( rule__Relation__FromAssignment_4 ) ) )
            // InternalSmallUML.g:1725:1: ( ( rule__Relation__FromAssignment_4 ) )
            {
            // InternalSmallUML.g:1725:1: ( ( rule__Relation__FromAssignment_4 ) )
            // InternalSmallUML.g:1726:2: ( rule__Relation__FromAssignment_4 )
            {
             before(grammarAccess.getRelationAccess().getFromAssignment_4()); 
            // InternalSmallUML.g:1727:2: ( rule__Relation__FromAssignment_4 )
            // InternalSmallUML.g:1727:3: rule__Relation__FromAssignment_4
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
    // InternalSmallUML.g:1735:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl rule__Relation__Group__6 ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1739:1: ( rule__Relation__Group__5__Impl rule__Relation__Group__6 )
            // InternalSmallUML.g:1740:2: rule__Relation__Group__5__Impl rule__Relation__Group__6
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
    // InternalSmallUML.g:1747:1: rule__Relation__Group__5__Impl : ( 'to' ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1751:1: ( ( 'to' ) )
            // InternalSmallUML.g:1752:1: ( 'to' )
            {
            // InternalSmallUML.g:1752:1: ( 'to' )
            // InternalSmallUML.g:1753:2: 'to'
            {
             before(grammarAccess.getRelationAccess().getToKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSmallUML.g:1762:1: rule__Relation__Group__6 : rule__Relation__Group__6__Impl rule__Relation__Group__7 ;
    public final void rule__Relation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1766:1: ( rule__Relation__Group__6__Impl rule__Relation__Group__7 )
            // InternalSmallUML.g:1767:2: rule__Relation__Group__6__Impl rule__Relation__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalSmallUML.g:1774:1: rule__Relation__Group__6__Impl : ( ( rule__Relation__ToAssignment_6 ) ) ;
    public final void rule__Relation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1778:1: ( ( ( rule__Relation__ToAssignment_6 ) ) )
            // InternalSmallUML.g:1779:1: ( ( rule__Relation__ToAssignment_6 ) )
            {
            // InternalSmallUML.g:1779:1: ( ( rule__Relation__ToAssignment_6 ) )
            // InternalSmallUML.g:1780:2: ( rule__Relation__ToAssignment_6 )
            {
             before(grammarAccess.getRelationAccess().getToAssignment_6()); 
            // InternalSmallUML.g:1781:2: ( rule__Relation__ToAssignment_6 )
            // InternalSmallUML.g:1781:3: rule__Relation__ToAssignment_6
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
    // InternalSmallUML.g:1789:1: rule__Relation__Group__7 : rule__Relation__Group__7__Impl rule__Relation__Group__8 ;
    public final void rule__Relation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1793:1: ( rule__Relation__Group__7__Impl rule__Relation__Group__8 )
            // InternalSmallUML.g:1794:2: rule__Relation__Group__7__Impl rule__Relation__Group__8
            {
            pushFollow(FOLLOW_17);
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
    // InternalSmallUML.g:1801:1: rule__Relation__Group__7__Impl : ( 'cardinality' ) ;
    public final void rule__Relation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1805:1: ( ( 'cardinality' ) )
            // InternalSmallUML.g:1806:1: ( 'cardinality' )
            {
            // InternalSmallUML.g:1806:1: ( 'cardinality' )
            // InternalSmallUML.g:1807:2: 'cardinality'
            {
             before(grammarAccess.getRelationAccess().getCardinalityKeyword_7()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSmallUML.g:1816:1: rule__Relation__Group__8 : rule__Relation__Group__8__Impl rule__Relation__Group__9 ;
    public final void rule__Relation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1820:1: ( rule__Relation__Group__8__Impl rule__Relation__Group__9 )
            // InternalSmallUML.g:1821:2: rule__Relation__Group__8__Impl rule__Relation__Group__9
            {
            pushFollow(FOLLOW_18);
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
    // InternalSmallUML.g:1828:1: rule__Relation__Group__8__Impl : ( ( rule__Relation__CardinalityAssignment_8 ) ) ;
    public final void rule__Relation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1832:1: ( ( ( rule__Relation__CardinalityAssignment_8 ) ) )
            // InternalSmallUML.g:1833:1: ( ( rule__Relation__CardinalityAssignment_8 ) )
            {
            // InternalSmallUML.g:1833:1: ( ( rule__Relation__CardinalityAssignment_8 ) )
            // InternalSmallUML.g:1834:2: ( rule__Relation__CardinalityAssignment_8 )
            {
             before(grammarAccess.getRelationAccess().getCardinalityAssignment_8()); 
            // InternalSmallUML.g:1835:2: ( rule__Relation__CardinalityAssignment_8 )
            // InternalSmallUML.g:1835:3: rule__Relation__CardinalityAssignment_8
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
    // InternalSmallUML.g:1843:1: rule__Relation__Group__9 : rule__Relation__Group__9__Impl ;
    public final void rule__Relation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1847:1: ( rule__Relation__Group__9__Impl )
            // InternalSmallUML.g:1848:2: rule__Relation__Group__9__Impl
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
    // InternalSmallUML.g:1854:1: rule__Relation__Group__9__Impl : ( '}' ) ;
    public final void rule__Relation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1858:1: ( ( '}' ) )
            // InternalSmallUML.g:1859:1: ( '}' )
            {
            // InternalSmallUML.g:1859:1: ( '}' )
            // InternalSmallUML.g:1860:2: '}'
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
    // InternalSmallUML.g:1870:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1874:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSmallUML.g:1875:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalSmallUML.g:1882:1: rule__Attribute__Group__0__Impl : ( 'Attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1886:1: ( ( 'Attribute' ) )
            // InternalSmallUML.g:1887:1: ( 'Attribute' )
            {
            // InternalSmallUML.g:1887:1: ( 'Attribute' )
            // InternalSmallUML.g:1888:2: 'Attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSmallUML.g:1897:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1901:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSmallUML.g:1902:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalSmallUML.g:1909:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1913:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalSmallUML.g:1914:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalSmallUML.g:1914:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalSmallUML.g:1915:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalSmallUML.g:1916:2: ( rule__Attribute__NameAssignment_1 )
            // InternalSmallUML.g:1916:3: rule__Attribute__NameAssignment_1
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
    // InternalSmallUML.g:1924:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1928:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSmallUML.g:1929:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalSmallUML.g:1936:1: rule__Attribute__Group__2__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1940:1: ( ( '{' ) )
            // InternalSmallUML.g:1941:1: ( '{' )
            {
            // InternalSmallUML.g:1941:1: ( '{' )
            // InternalSmallUML.g:1942:2: '{'
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
    // InternalSmallUML.g:1951:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1955:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalSmallUML.g:1956:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalSmallUML.g:1963:1: rule__Attribute__Group__3__Impl : ( 'typedValue' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1967:1: ( ( 'typedValue' ) )
            // InternalSmallUML.g:1968:1: ( 'typedValue' )
            {
            // InternalSmallUML.g:1968:1: ( 'typedValue' )
            // InternalSmallUML.g:1969:2: 'typedValue'
            {
             before(grammarAccess.getAttributeAccess().getTypedValueKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSmallUML.g:1978:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1982:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalSmallUML.g:1983:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalSmallUML.g:1990:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypedValueAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1994:1: ( ( ( rule__Attribute__TypedValueAssignment_4 ) ) )
            // InternalSmallUML.g:1995:1: ( ( rule__Attribute__TypedValueAssignment_4 ) )
            {
            // InternalSmallUML.g:1995:1: ( ( rule__Attribute__TypedValueAssignment_4 ) )
            // InternalSmallUML.g:1996:2: ( rule__Attribute__TypedValueAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypedValueAssignment_4()); 
            // InternalSmallUML.g:1997:2: ( rule__Attribute__TypedValueAssignment_4 )
            // InternalSmallUML.g:1997:3: rule__Attribute__TypedValueAssignment_4
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
    // InternalSmallUML.g:2005:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2009:1: ( rule__Attribute__Group__5__Impl )
            // InternalSmallUML.g:2010:2: rule__Attribute__Group__5__Impl
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
    // InternalSmallUML.g:2016:1: rule__Attribute__Group__5__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2020:1: ( ( '}' ) )
            // InternalSmallUML.g:2021:1: ( '}' )
            {
            // InternalSmallUML.g:2021:1: ( '}' )
            // InternalSmallUML.g:2022:2: '}'
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
    // InternalSmallUML.g:2032:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2036:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalSmallUML.g:2037:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSmallUML.g:2044:1: rule__Method__Group__0__Impl : ( () ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2048:1: ( ( () ) )
            // InternalSmallUML.g:2049:1: ( () )
            {
            // InternalSmallUML.g:2049:1: ( () )
            // InternalSmallUML.g:2050:2: ()
            {
             before(grammarAccess.getMethodAccess().getMethodAction_0()); 
            // InternalSmallUML.g:2051:2: ()
            // InternalSmallUML.g:2051:3: 
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
    // InternalSmallUML.g:2059:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2063:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalSmallUML.g:2064:2: rule__Method__Group__1__Impl rule__Method__Group__2
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
    // InternalSmallUML.g:2071:1: rule__Method__Group__1__Impl : ( 'Method' ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2075:1: ( ( 'Method' ) )
            // InternalSmallUML.g:2076:1: ( 'Method' )
            {
            // InternalSmallUML.g:2076:1: ( 'Method' )
            // InternalSmallUML.g:2077:2: 'Method'
            {
             before(grammarAccess.getMethodAccess().getMethodKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSmallUML.g:2086:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2090:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalSmallUML.g:2091:2: rule__Method__Group__2__Impl rule__Method__Group__3
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
    // InternalSmallUML.g:2098:1: rule__Method__Group__2__Impl : ( ( rule__Method__NameAssignment_2 ) ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2102:1: ( ( ( rule__Method__NameAssignment_2 ) ) )
            // InternalSmallUML.g:2103:1: ( ( rule__Method__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:2103:1: ( ( rule__Method__NameAssignment_2 ) )
            // InternalSmallUML.g:2104:2: ( rule__Method__NameAssignment_2 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:2105:2: ( rule__Method__NameAssignment_2 )
            // InternalSmallUML.g:2105:3: rule__Method__NameAssignment_2
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
    // InternalSmallUML.g:2113:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2117:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalSmallUML.g:2118:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalSmallUML.g:2125:1: rule__Method__Group__3__Impl : ( '{' ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2129:1: ( ( '{' ) )
            // InternalSmallUML.g:2130:1: ( '{' )
            {
            // InternalSmallUML.g:2130:1: ( '{' )
            // InternalSmallUML.g:2131:2: '{'
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
    // InternalSmallUML.g:2140:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2144:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalSmallUML.g:2145:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalSmallUML.g:2152:1: rule__Method__Group__4__Impl : ( ( rule__Method__Group_4__0 )? ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2156:1: ( ( ( rule__Method__Group_4__0 )? ) )
            // InternalSmallUML.g:2157:1: ( ( rule__Method__Group_4__0 )? )
            {
            // InternalSmallUML.g:2157:1: ( ( rule__Method__Group_4__0 )? )
            // InternalSmallUML.g:2158:2: ( rule__Method__Group_4__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_4()); 
            // InternalSmallUML.g:2159:2: ( rule__Method__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmallUML.g:2159:3: rule__Method__Group_4__0
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
    // InternalSmallUML.g:2167:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2171:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalSmallUML.g:2172:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalSmallUML.g:2179:1: rule__Method__Group__5__Impl : ( ( rule__Method__Group_5__0 )? ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2183:1: ( ( ( rule__Method__Group_5__0 )? ) )
            // InternalSmallUML.g:2184:1: ( ( rule__Method__Group_5__0 )? )
            {
            // InternalSmallUML.g:2184:1: ( ( rule__Method__Group_5__0 )? )
            // InternalSmallUML.g:2185:2: ( rule__Method__Group_5__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_5()); 
            // InternalSmallUML.g:2186:2: ( rule__Method__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSmallUML.g:2186:3: rule__Method__Group_5__0
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
    // InternalSmallUML.g:2194:1: rule__Method__Group__6 : rule__Method__Group__6__Impl ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2198:1: ( rule__Method__Group__6__Impl )
            // InternalSmallUML.g:2199:2: rule__Method__Group__6__Impl
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
    // InternalSmallUML.g:2205:1: rule__Method__Group__6__Impl : ( '}' ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2209:1: ( ( '}' ) )
            // InternalSmallUML.g:2210:1: ( '}' )
            {
            // InternalSmallUML.g:2210:1: ( '}' )
            // InternalSmallUML.g:2211:2: '}'
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
    // InternalSmallUML.g:2221:1: rule__Method__Group_4__0 : rule__Method__Group_4__0__Impl rule__Method__Group_4__1 ;
    public final void rule__Method__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2225:1: ( rule__Method__Group_4__0__Impl rule__Method__Group_4__1 )
            // InternalSmallUML.g:2226:2: rule__Method__Group_4__0__Impl rule__Method__Group_4__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalSmallUML.g:2233:1: rule__Method__Group_4__0__Impl : ( 'returnTypedValue' ) ;
    public final void rule__Method__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2237:1: ( ( 'returnTypedValue' ) )
            // InternalSmallUML.g:2238:1: ( 'returnTypedValue' )
            {
            // InternalSmallUML.g:2238:1: ( 'returnTypedValue' )
            // InternalSmallUML.g:2239:2: 'returnTypedValue'
            {
             before(grammarAccess.getMethodAccess().getReturnTypedValueKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSmallUML.g:2248:1: rule__Method__Group_4__1 : rule__Method__Group_4__1__Impl ;
    public final void rule__Method__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2252:1: ( rule__Method__Group_4__1__Impl )
            // InternalSmallUML.g:2253:2: rule__Method__Group_4__1__Impl
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
    // InternalSmallUML.g:2259:1: rule__Method__Group_4__1__Impl : ( ( rule__Method__ReturnTypedValueAssignment_4_1 ) ) ;
    public final void rule__Method__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2263:1: ( ( ( rule__Method__ReturnTypedValueAssignment_4_1 ) ) )
            // InternalSmallUML.g:2264:1: ( ( rule__Method__ReturnTypedValueAssignment_4_1 ) )
            {
            // InternalSmallUML.g:2264:1: ( ( rule__Method__ReturnTypedValueAssignment_4_1 ) )
            // InternalSmallUML.g:2265:2: ( rule__Method__ReturnTypedValueAssignment_4_1 )
            {
             before(grammarAccess.getMethodAccess().getReturnTypedValueAssignment_4_1()); 
            // InternalSmallUML.g:2266:2: ( rule__Method__ReturnTypedValueAssignment_4_1 )
            // InternalSmallUML.g:2266:3: rule__Method__ReturnTypedValueAssignment_4_1
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
    // InternalSmallUML.g:2275:1: rule__Method__Group_5__0 : rule__Method__Group_5__0__Impl rule__Method__Group_5__1 ;
    public final void rule__Method__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2279:1: ( rule__Method__Group_5__0__Impl rule__Method__Group_5__1 )
            // InternalSmallUML.g:2280:2: rule__Method__Group_5__0__Impl rule__Method__Group_5__1
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
    // InternalSmallUML.g:2287:1: rule__Method__Group_5__0__Impl : ( 'parameters' ) ;
    public final void rule__Method__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2291:1: ( ( 'parameters' ) )
            // InternalSmallUML.g:2292:1: ( 'parameters' )
            {
            // InternalSmallUML.g:2292:1: ( 'parameters' )
            // InternalSmallUML.g:2293:2: 'parameters'
            {
             before(grammarAccess.getMethodAccess().getParametersKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSmallUML.g:2302:1: rule__Method__Group_5__1 : rule__Method__Group_5__1__Impl rule__Method__Group_5__2 ;
    public final void rule__Method__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2306:1: ( rule__Method__Group_5__1__Impl rule__Method__Group_5__2 )
            // InternalSmallUML.g:2307:2: rule__Method__Group_5__1__Impl rule__Method__Group_5__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSmallUML.g:2314:1: rule__Method__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Method__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2318:1: ( ( '{' ) )
            // InternalSmallUML.g:2319:1: ( '{' )
            {
            // InternalSmallUML.g:2319:1: ( '{' )
            // InternalSmallUML.g:2320:2: '{'
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
    // InternalSmallUML.g:2329:1: rule__Method__Group_5__2 : rule__Method__Group_5__2__Impl rule__Method__Group_5__3 ;
    public final void rule__Method__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2333:1: ( rule__Method__Group_5__2__Impl rule__Method__Group_5__3 )
            // InternalSmallUML.g:2334:2: rule__Method__Group_5__2__Impl rule__Method__Group_5__3
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
    // InternalSmallUML.g:2341:1: rule__Method__Group_5__2__Impl : ( ( rule__Method__ParametersAssignment_5_2 ) ) ;
    public final void rule__Method__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2345:1: ( ( ( rule__Method__ParametersAssignment_5_2 ) ) )
            // InternalSmallUML.g:2346:1: ( ( rule__Method__ParametersAssignment_5_2 ) )
            {
            // InternalSmallUML.g:2346:1: ( ( rule__Method__ParametersAssignment_5_2 ) )
            // InternalSmallUML.g:2347:2: ( rule__Method__ParametersAssignment_5_2 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_5_2()); 
            // InternalSmallUML.g:2348:2: ( rule__Method__ParametersAssignment_5_2 )
            // InternalSmallUML.g:2348:3: rule__Method__ParametersAssignment_5_2
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
    // InternalSmallUML.g:2356:1: rule__Method__Group_5__3 : rule__Method__Group_5__3__Impl rule__Method__Group_5__4 ;
    public final void rule__Method__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2360:1: ( rule__Method__Group_5__3__Impl rule__Method__Group_5__4 )
            // InternalSmallUML.g:2361:2: rule__Method__Group_5__3__Impl rule__Method__Group_5__4
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
    // InternalSmallUML.g:2368:1: rule__Method__Group_5__3__Impl : ( ( rule__Method__Group_5_3__0 )* ) ;
    public final void rule__Method__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2372:1: ( ( ( rule__Method__Group_5_3__0 )* ) )
            // InternalSmallUML.g:2373:1: ( ( rule__Method__Group_5_3__0 )* )
            {
            // InternalSmallUML.g:2373:1: ( ( rule__Method__Group_5_3__0 )* )
            // InternalSmallUML.g:2374:2: ( rule__Method__Group_5_3__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_5_3()); 
            // InternalSmallUML.g:2375:2: ( rule__Method__Group_5_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSmallUML.g:2375:3: rule__Method__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Method__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSmallUML.g:2383:1: rule__Method__Group_5__4 : rule__Method__Group_5__4__Impl ;
    public final void rule__Method__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2387:1: ( rule__Method__Group_5__4__Impl )
            // InternalSmallUML.g:2388:2: rule__Method__Group_5__4__Impl
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
    // InternalSmallUML.g:2394:1: rule__Method__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Method__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2398:1: ( ( '}' ) )
            // InternalSmallUML.g:2399:1: ( '}' )
            {
            // InternalSmallUML.g:2399:1: ( '}' )
            // InternalSmallUML.g:2400:2: '}'
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
    // InternalSmallUML.g:2410:1: rule__Method__Group_5_3__0 : rule__Method__Group_5_3__0__Impl rule__Method__Group_5_3__1 ;
    public final void rule__Method__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2414:1: ( rule__Method__Group_5_3__0__Impl rule__Method__Group_5_3__1 )
            // InternalSmallUML.g:2415:2: rule__Method__Group_5_3__0__Impl rule__Method__Group_5_3__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSmallUML.g:2422:1: rule__Method__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2426:1: ( ( ',' ) )
            // InternalSmallUML.g:2427:1: ( ',' )
            {
            // InternalSmallUML.g:2427:1: ( ',' )
            // InternalSmallUML.g:2428:2: ','
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
    // InternalSmallUML.g:2437:1: rule__Method__Group_5_3__1 : rule__Method__Group_5_3__1__Impl ;
    public final void rule__Method__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2441:1: ( rule__Method__Group_5_3__1__Impl )
            // InternalSmallUML.g:2442:2: rule__Method__Group_5_3__1__Impl
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
    // InternalSmallUML.g:2448:1: rule__Method__Group_5_3__1__Impl : ( ( rule__Method__ParametersAssignment_5_3_1 ) ) ;
    public final void rule__Method__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2452:1: ( ( ( rule__Method__ParametersAssignment_5_3_1 ) ) )
            // InternalSmallUML.g:2453:1: ( ( rule__Method__ParametersAssignment_5_3_1 ) )
            {
            // InternalSmallUML.g:2453:1: ( ( rule__Method__ParametersAssignment_5_3_1 ) )
            // InternalSmallUML.g:2454:2: ( rule__Method__ParametersAssignment_5_3_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_5_3_1()); 
            // InternalSmallUML.g:2455:2: ( rule__Method__ParametersAssignment_5_3_1 )
            // InternalSmallUML.g:2455:3: rule__Method__ParametersAssignment_5_3_1
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
    // InternalSmallUML.g:2464:1: rule__Type_Impl__Group__0 : rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 ;
    public final void rule__Type_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2468:1: ( rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 )
            // InternalSmallUML.g:2469:2: rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSmallUML.g:2476:1: rule__Type_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Type_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2480:1: ( ( () ) )
            // InternalSmallUML.g:2481:1: ( () )
            {
            // InternalSmallUML.g:2481:1: ( () )
            // InternalSmallUML.g:2482:2: ()
            {
             before(grammarAccess.getType_ImplAccess().getTypeAction_0()); 
            // InternalSmallUML.g:2483:2: ()
            // InternalSmallUML.g:2483:3: 
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
    // InternalSmallUML.g:2491:1: rule__Type_Impl__Group__1 : rule__Type_Impl__Group__1__Impl ;
    public final void rule__Type_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2495:1: ( rule__Type_Impl__Group__1__Impl )
            // InternalSmallUML.g:2496:2: rule__Type_Impl__Group__1__Impl
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
    // InternalSmallUML.g:2502:1: rule__Type_Impl__Group__1__Impl : ( 'Type' ) ;
    public final void rule__Type_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2506:1: ( ( 'Type' ) )
            // InternalSmallUML.g:2507:1: ( 'Type' )
            {
            // InternalSmallUML.g:2507:1: ( 'Type' )
            // InternalSmallUML.g:2508:2: 'Type'
            {
             before(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSmallUML.g:2518:1: rule__Boolean__Group__0 : rule__Boolean__Group__0__Impl rule__Boolean__Group__1 ;
    public final void rule__Boolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2522:1: ( rule__Boolean__Group__0__Impl rule__Boolean__Group__1 )
            // InternalSmallUML.g:2523:2: rule__Boolean__Group__0__Impl rule__Boolean__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSmallUML.g:2530:1: rule__Boolean__Group__0__Impl : ( () ) ;
    public final void rule__Boolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2534:1: ( ( () ) )
            // InternalSmallUML.g:2535:1: ( () )
            {
            // InternalSmallUML.g:2535:1: ( () )
            // InternalSmallUML.g:2536:2: ()
            {
             before(grammarAccess.getBooleanAccess().getBooleanAction_0()); 
            // InternalSmallUML.g:2537:2: ()
            // InternalSmallUML.g:2537:3: 
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
    // InternalSmallUML.g:2545:1: rule__Boolean__Group__1 : rule__Boolean__Group__1__Impl ;
    public final void rule__Boolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2549:1: ( rule__Boolean__Group__1__Impl )
            // InternalSmallUML.g:2550:2: rule__Boolean__Group__1__Impl
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
    // InternalSmallUML.g:2556:1: rule__Boolean__Group__1__Impl : ( 'Boolean' ) ;
    public final void rule__Boolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2560:1: ( ( 'Boolean' ) )
            // InternalSmallUML.g:2561:1: ( 'Boolean' )
            {
            // InternalSmallUML.g:2561:1: ( 'Boolean' )
            // InternalSmallUML.g:2562:2: 'Boolean'
            {
             before(grammarAccess.getBooleanAccess().getBooleanKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSmallUML.g:2572:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2576:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // InternalSmallUML.g:2577:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSmallUML.g:2584:1: rule__Real__Group__0__Impl : ( () ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2588:1: ( ( () ) )
            // InternalSmallUML.g:2589:1: ( () )
            {
            // InternalSmallUML.g:2589:1: ( () )
            // InternalSmallUML.g:2590:2: ()
            {
             before(grammarAccess.getRealAccess().getRealAction_0()); 
            // InternalSmallUML.g:2591:2: ()
            // InternalSmallUML.g:2591:3: 
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
    // InternalSmallUML.g:2599:1: rule__Real__Group__1 : rule__Real__Group__1__Impl ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2603:1: ( rule__Real__Group__1__Impl )
            // InternalSmallUML.g:2604:2: rule__Real__Group__1__Impl
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
    // InternalSmallUML.g:2610:1: rule__Real__Group__1__Impl : ( 'Real' ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2614:1: ( ( 'Real' ) )
            // InternalSmallUML.g:2615:1: ( 'Real' )
            {
            // InternalSmallUML.g:2615:1: ( 'Real' )
            // InternalSmallUML.g:2616:2: 'Real'
            {
             before(grammarAccess.getRealAccess().getRealKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSmallUML.g:2626:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2630:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalSmallUML.g:2631:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSmallUML.g:2638:1: rule__Integer__Group__0__Impl : ( () ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2642:1: ( ( () ) )
            // InternalSmallUML.g:2643:1: ( () )
            {
            // InternalSmallUML.g:2643:1: ( () )
            // InternalSmallUML.g:2644:2: ()
            {
             before(grammarAccess.getIntegerAccess().getIntegerAction_0()); 
            // InternalSmallUML.g:2645:2: ()
            // InternalSmallUML.g:2645:3: 
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
    // InternalSmallUML.g:2653:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2657:1: ( rule__Integer__Group__1__Impl )
            // InternalSmallUML.g:2658:2: rule__Integer__Group__1__Impl
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
    // InternalSmallUML.g:2664:1: rule__Integer__Group__1__Impl : ( 'Integer' ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2668:1: ( ( 'Integer' ) )
            // InternalSmallUML.g:2669:1: ( 'Integer' )
            {
            // InternalSmallUML.g:2669:1: ( 'Integer' )
            // InternalSmallUML.g:2670:2: 'Integer'
            {
             before(grammarAccess.getIntegerAccess().getIntegerKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSmallUML.g:2680:1: rule__String0__Group__0 : rule__String0__Group__0__Impl rule__String0__Group__1 ;
    public final void rule__String0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2684:1: ( rule__String0__Group__0__Impl rule__String0__Group__1 )
            // InternalSmallUML.g:2685:2: rule__String0__Group__0__Impl rule__String0__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSmallUML.g:2692:1: rule__String0__Group__0__Impl : ( () ) ;
    public final void rule__String0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2696:1: ( ( () ) )
            // InternalSmallUML.g:2697:1: ( () )
            {
            // InternalSmallUML.g:2697:1: ( () )
            // InternalSmallUML.g:2698:2: ()
            {
             before(grammarAccess.getString0Access().getStringAction_0()); 
            // InternalSmallUML.g:2699:2: ()
            // InternalSmallUML.g:2699:3: 
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
    // InternalSmallUML.g:2707:1: rule__String0__Group__1 : rule__String0__Group__1__Impl ;
    public final void rule__String0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2711:1: ( rule__String0__Group__1__Impl )
            // InternalSmallUML.g:2712:2: rule__String0__Group__1__Impl
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
    // InternalSmallUML.g:2718:1: rule__String0__Group__1__Impl : ( 'String' ) ;
    public final void rule__String0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2722:1: ( ( 'String' ) )
            // InternalSmallUML.g:2723:1: ( 'String' )
            {
            // InternalSmallUML.g:2723:1: ( 'String' )
            // InternalSmallUML.g:2724:2: 'String'
            {
             before(grammarAccess.getString0Access().getStringKeyword_1()); 
            match(input,33,FOLLOW_2); 
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


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalSmallUML.g:2734:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2738:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalSmallUML.g:2739:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
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
    // InternalSmallUML.g:2746:1: rule__Enumeration__Group__0__Impl : ( 'Enumeration' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2750:1: ( ( 'Enumeration' ) )
            // InternalSmallUML.g:2751:1: ( 'Enumeration' )
            {
            // InternalSmallUML.g:2751:1: ( 'Enumeration' )
            // InternalSmallUML.g:2752:2: 'Enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSmallUML.g:2761:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2765:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalSmallUML.g:2766:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
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
    // InternalSmallUML.g:2773:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2777:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // InternalSmallUML.g:2778:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // InternalSmallUML.g:2778:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // InternalSmallUML.g:2779:2: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // InternalSmallUML.g:2780:2: ( rule__Enumeration__NameAssignment_1 )
            // InternalSmallUML.g:2780:3: rule__Enumeration__NameAssignment_1
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
    // InternalSmallUML.g:2788:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2792:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalSmallUML.g:2793:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalSmallUML.g:2800:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2804:1: ( ( '{' ) )
            // InternalSmallUML.g:2805:1: ( '{' )
            {
            // InternalSmallUML.g:2805:1: ( '{' )
            // InternalSmallUML.g:2806:2: '{'
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
    // InternalSmallUML.g:2815:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2819:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalSmallUML.g:2820:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
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
    // InternalSmallUML.g:2827:1: rule__Enumeration__Group__3__Impl : ( 'value' ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2831:1: ( ( 'value' ) )
            // InternalSmallUML.g:2832:1: ( 'value' )
            {
            // InternalSmallUML.g:2832:1: ( 'value' )
            // InternalSmallUML.g:2833:2: 'value'
            {
             before(grammarAccess.getEnumerationAccess().getValueKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSmallUML.g:2842:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2846:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // InternalSmallUML.g:2847:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalSmallUML.g:2854:1: rule__Enumeration__Group__4__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2858:1: ( ( '{' ) )
            // InternalSmallUML.g:2859:1: ( '{' )
            {
            // InternalSmallUML.g:2859:1: ( '{' )
            // InternalSmallUML.g:2860:2: '{'
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
    // InternalSmallUML.g:2869:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6 ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2873:1: ( rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6 )
            // InternalSmallUML.g:2874:2: rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6
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
    // InternalSmallUML.g:2881:1: rule__Enumeration__Group__5__Impl : ( ( rule__Enumeration__ValueAssignment_5 ) ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2885:1: ( ( ( rule__Enumeration__ValueAssignment_5 ) ) )
            // InternalSmallUML.g:2886:1: ( ( rule__Enumeration__ValueAssignment_5 ) )
            {
            // InternalSmallUML.g:2886:1: ( ( rule__Enumeration__ValueAssignment_5 ) )
            // InternalSmallUML.g:2887:2: ( rule__Enumeration__ValueAssignment_5 )
            {
             before(grammarAccess.getEnumerationAccess().getValueAssignment_5()); 
            // InternalSmallUML.g:2888:2: ( rule__Enumeration__ValueAssignment_5 )
            // InternalSmallUML.g:2888:3: rule__Enumeration__ValueAssignment_5
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
    // InternalSmallUML.g:2896:1: rule__Enumeration__Group__6 : rule__Enumeration__Group__6__Impl rule__Enumeration__Group__7 ;
    public final void rule__Enumeration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2900:1: ( rule__Enumeration__Group__6__Impl rule__Enumeration__Group__7 )
            // InternalSmallUML.g:2901:2: rule__Enumeration__Group__6__Impl rule__Enumeration__Group__7
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
    // InternalSmallUML.g:2908:1: rule__Enumeration__Group__6__Impl : ( ( rule__Enumeration__Group_6__0 )* ) ;
    public final void rule__Enumeration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2912:1: ( ( ( rule__Enumeration__Group_6__0 )* ) )
            // InternalSmallUML.g:2913:1: ( ( rule__Enumeration__Group_6__0 )* )
            {
            // InternalSmallUML.g:2913:1: ( ( rule__Enumeration__Group_6__0 )* )
            // InternalSmallUML.g:2914:2: ( rule__Enumeration__Group_6__0 )*
            {
             before(grammarAccess.getEnumerationAccess().getGroup_6()); 
            // InternalSmallUML.g:2915:2: ( rule__Enumeration__Group_6__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSmallUML.g:2915:3: rule__Enumeration__Group_6__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Enumeration__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalSmallUML.g:2923:1: rule__Enumeration__Group__7 : rule__Enumeration__Group__7__Impl rule__Enumeration__Group__8 ;
    public final void rule__Enumeration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2927:1: ( rule__Enumeration__Group__7__Impl rule__Enumeration__Group__8 )
            // InternalSmallUML.g:2928:2: rule__Enumeration__Group__7__Impl rule__Enumeration__Group__8
            {
            pushFollow(FOLLOW_18);
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
    // InternalSmallUML.g:2935:1: rule__Enumeration__Group__7__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2939:1: ( ( '}' ) )
            // InternalSmallUML.g:2940:1: ( '}' )
            {
            // InternalSmallUML.g:2940:1: ( '}' )
            // InternalSmallUML.g:2941:2: '}'
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
    // InternalSmallUML.g:2950:1: rule__Enumeration__Group__8 : rule__Enumeration__Group__8__Impl ;
    public final void rule__Enumeration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2954:1: ( rule__Enumeration__Group__8__Impl )
            // InternalSmallUML.g:2955:2: rule__Enumeration__Group__8__Impl
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
    // InternalSmallUML.g:2961:1: rule__Enumeration__Group__8__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2965:1: ( ( '}' ) )
            // InternalSmallUML.g:2966:1: ( '}' )
            {
            // InternalSmallUML.g:2966:1: ( '}' )
            // InternalSmallUML.g:2967:2: '}'
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
    // InternalSmallUML.g:2977:1: rule__Enumeration__Group_6__0 : rule__Enumeration__Group_6__0__Impl rule__Enumeration__Group_6__1 ;
    public final void rule__Enumeration__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2981:1: ( rule__Enumeration__Group_6__0__Impl rule__Enumeration__Group_6__1 )
            // InternalSmallUML.g:2982:2: rule__Enumeration__Group_6__0__Impl rule__Enumeration__Group_6__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSmallUML.g:2989:1: rule__Enumeration__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Enumeration__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2993:1: ( ( ',' ) )
            // InternalSmallUML.g:2994:1: ( ',' )
            {
            // InternalSmallUML.g:2994:1: ( ',' )
            // InternalSmallUML.g:2995:2: ','
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
    // InternalSmallUML.g:3004:1: rule__Enumeration__Group_6__1 : rule__Enumeration__Group_6__1__Impl ;
    public final void rule__Enumeration__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3008:1: ( rule__Enumeration__Group_6__1__Impl )
            // InternalSmallUML.g:3009:2: rule__Enumeration__Group_6__1__Impl
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
    // InternalSmallUML.g:3015:1: rule__Enumeration__Group_6__1__Impl : ( ( rule__Enumeration__ValueAssignment_6_1 ) ) ;
    public final void rule__Enumeration__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3019:1: ( ( ( rule__Enumeration__ValueAssignment_6_1 ) ) )
            // InternalSmallUML.g:3020:1: ( ( rule__Enumeration__ValueAssignment_6_1 ) )
            {
            // InternalSmallUML.g:3020:1: ( ( rule__Enumeration__ValueAssignment_6_1 ) )
            // InternalSmallUML.g:3021:2: ( rule__Enumeration__ValueAssignment_6_1 )
            {
             before(grammarAccess.getEnumerationAccess().getValueAssignment_6_1()); 
            // InternalSmallUML.g:3022:2: ( rule__Enumeration__ValueAssignment_6_1 )
            // InternalSmallUML.g:3022:3: rule__Enumeration__ValueAssignment_6_1
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
    // InternalSmallUML.g:3031:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3035:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // InternalSmallUML.g:3036:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
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
    // InternalSmallUML.g:3043:1: rule__Cardinality__Group__0__Impl : ( 'Cardinality' ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3047:1: ( ( 'Cardinality' ) )
            // InternalSmallUML.g:3048:1: ( 'Cardinality' )
            {
            // InternalSmallUML.g:3048:1: ( 'Cardinality' )
            // InternalSmallUML.g:3049:2: 'Cardinality'
            {
             before(grammarAccess.getCardinalityAccess().getCardinalityKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSmallUML.g:3058:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3062:1: ( rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 )
            // InternalSmallUML.g:3063:2: rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSmallUML.g:3070:1: rule__Cardinality__Group__1__Impl : ( '{' ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3074:1: ( ( '{' ) )
            // InternalSmallUML.g:3075:1: ( '{' )
            {
            // InternalSmallUML.g:3075:1: ( '{' )
            // InternalSmallUML.g:3076:2: '{'
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
    // InternalSmallUML.g:3085:1: rule__Cardinality__Group__2 : rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3 ;
    public final void rule__Cardinality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3089:1: ( rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3 )
            // InternalSmallUML.g:3090:2: rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalSmallUML.g:3097:1: rule__Cardinality__Group__2__Impl : ( 'lowerBound' ) ;
    public final void rule__Cardinality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3101:1: ( ( 'lowerBound' ) )
            // InternalSmallUML.g:3102:1: ( 'lowerBound' )
            {
            // InternalSmallUML.g:3102:1: ( 'lowerBound' )
            // InternalSmallUML.g:3103:2: 'lowerBound'
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSmallUML.g:3112:1: rule__Cardinality__Group__3 : rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4 ;
    public final void rule__Cardinality__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3116:1: ( rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4 )
            // InternalSmallUML.g:3117:2: rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalSmallUML.g:3124:1: rule__Cardinality__Group__3__Impl : ( ( rule__Cardinality__LowerBoundAssignment_3 ) ) ;
    public final void rule__Cardinality__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3128:1: ( ( ( rule__Cardinality__LowerBoundAssignment_3 ) ) )
            // InternalSmallUML.g:3129:1: ( ( rule__Cardinality__LowerBoundAssignment_3 ) )
            {
            // InternalSmallUML.g:3129:1: ( ( rule__Cardinality__LowerBoundAssignment_3 ) )
            // InternalSmallUML.g:3130:2: ( rule__Cardinality__LowerBoundAssignment_3 )
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_3()); 
            // InternalSmallUML.g:3131:2: ( rule__Cardinality__LowerBoundAssignment_3 )
            // InternalSmallUML.g:3131:3: rule__Cardinality__LowerBoundAssignment_3
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
    // InternalSmallUML.g:3139:1: rule__Cardinality__Group__4 : rule__Cardinality__Group__4__Impl rule__Cardinality__Group__5 ;
    public final void rule__Cardinality__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3143:1: ( rule__Cardinality__Group__4__Impl rule__Cardinality__Group__5 )
            // InternalSmallUML.g:3144:2: rule__Cardinality__Group__4__Impl rule__Cardinality__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalSmallUML.g:3151:1: rule__Cardinality__Group__4__Impl : ( 'upperBound' ) ;
    public final void rule__Cardinality__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3155:1: ( ( 'upperBound' ) )
            // InternalSmallUML.g:3156:1: ( 'upperBound' )
            {
            // InternalSmallUML.g:3156:1: ( 'upperBound' )
            // InternalSmallUML.g:3157:2: 'upperBound'
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundKeyword_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSmallUML.g:3166:1: rule__Cardinality__Group__5 : rule__Cardinality__Group__5__Impl rule__Cardinality__Group__6 ;
    public final void rule__Cardinality__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3170:1: ( rule__Cardinality__Group__5__Impl rule__Cardinality__Group__6 )
            // InternalSmallUML.g:3171:2: rule__Cardinality__Group__5__Impl rule__Cardinality__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalSmallUML.g:3178:1: rule__Cardinality__Group__5__Impl : ( ( rule__Cardinality__UpperBoundAssignment_5 ) ) ;
    public final void rule__Cardinality__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3182:1: ( ( ( rule__Cardinality__UpperBoundAssignment_5 ) ) )
            // InternalSmallUML.g:3183:1: ( ( rule__Cardinality__UpperBoundAssignment_5 ) )
            {
            // InternalSmallUML.g:3183:1: ( ( rule__Cardinality__UpperBoundAssignment_5 ) )
            // InternalSmallUML.g:3184:2: ( rule__Cardinality__UpperBoundAssignment_5 )
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_5()); 
            // InternalSmallUML.g:3185:2: ( rule__Cardinality__UpperBoundAssignment_5 )
            // InternalSmallUML.g:3185:3: rule__Cardinality__UpperBoundAssignment_5
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
    // InternalSmallUML.g:3193:1: rule__Cardinality__Group__6 : rule__Cardinality__Group__6__Impl ;
    public final void rule__Cardinality__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3197:1: ( rule__Cardinality__Group__6__Impl )
            // InternalSmallUML.g:3198:2: rule__Cardinality__Group__6__Impl
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
    // InternalSmallUML.g:3204:1: rule__Cardinality__Group__6__Impl : ( '}' ) ;
    public final void rule__Cardinality__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3208:1: ( ( '}' ) )
            // InternalSmallUML.g:3209:1: ( '}' )
            {
            // InternalSmallUML.g:3209:1: ( '}' )
            // InternalSmallUML.g:3210:2: '}'
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
    // InternalSmallUML.g:3220:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3224:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSmallUML.g:3225:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSmallUML.g:3232:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3236:1: ( ( ( '-' )? ) )
            // InternalSmallUML.g:3237:1: ( ( '-' )? )
            {
            // InternalSmallUML.g:3237:1: ( ( '-' )? )
            // InternalSmallUML.g:3238:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSmallUML.g:3239:2: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSmallUML.g:3239:3: '-'
                    {
                    match(input,39,FOLLOW_2); 

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
    // InternalSmallUML.g:3247:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3251:1: ( rule__EInt__Group__1__Impl )
            // InternalSmallUML.g:3252:2: rule__EInt__Group__1__Impl
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
    // InternalSmallUML.g:3258:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3262:1: ( ( RULE_INT ) )
            // InternalSmallUML.g:3263:1: ( RULE_INT )
            {
            // InternalSmallUML.g:3263:1: ( RULE_INT )
            // InternalSmallUML.g:3264:2: RULE_INT
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
    // InternalSmallUML.g:3274:1: rule__Package__ClassAssignment_3_2 : ( ruleClass ) ;
    public final void rule__Package__ClassAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3278:1: ( ( ruleClass ) )
            // InternalSmallUML.g:3279:2: ( ruleClass )
            {
            // InternalSmallUML.g:3279:2: ( ruleClass )
            // InternalSmallUML.g:3280:3: ruleClass
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
    // InternalSmallUML.g:3289:1: rule__Package__ClassAssignment_3_3_1 : ( ruleClass ) ;
    public final void rule__Package__ClassAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3293:1: ( ( ruleClass ) )
            // InternalSmallUML.g:3294:2: ( ruleClass )
            {
            // InternalSmallUML.g:3294:2: ( ruleClass )
            // InternalSmallUML.g:3295:3: ruleClass
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
    // InternalSmallUML.g:3304:1: rule__Package__RelationAssignment_4_2 : ( ruleRelation ) ;
    public final void rule__Package__RelationAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3308:1: ( ( ruleRelation ) )
            // InternalSmallUML.g:3309:2: ( ruleRelation )
            {
            // InternalSmallUML.g:3309:2: ( ruleRelation )
            // InternalSmallUML.g:3310:3: ruleRelation
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
    // InternalSmallUML.g:3319:1: rule__Package__RelationAssignment_4_3_1 : ( ruleRelation ) ;
    public final void rule__Package__RelationAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3323:1: ( ( ruleRelation ) )
            // InternalSmallUML.g:3324:2: ( ruleRelation )
            {
            // InternalSmallUML.g:3324:2: ( ruleRelation )
            // InternalSmallUML.g:3325:3: ruleRelation
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
    // InternalSmallUML.g:3334:1: rule__Class__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3338:1: ( ( ruleEString ) )
            // InternalSmallUML.g:3339:2: ( ruleEString )
            {
            // InternalSmallUML.g:3339:2: ( ruleEString )
            // InternalSmallUML.g:3340:3: ruleEString
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


    // $ANTLR start "rule__Class__AttributesAssignment_4_2"
    // InternalSmallUML.g:3349:1: rule__Class__AttributesAssignment_4_2 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3353:1: ( ( ruleAttribute ) )
            // InternalSmallUML.g:3354:2: ( ruleAttribute )
            {
            // InternalSmallUML.g:3354:2: ( ruleAttribute )
            // InternalSmallUML.g:3355:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Class__AttributesAssignment_4_2"


    // $ANTLR start "rule__Class__AttributesAssignment_4_3_1"
    // InternalSmallUML.g:3364:1: rule__Class__AttributesAssignment_4_3_1 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3368:1: ( ( ruleAttribute ) )
            // InternalSmallUML.g:3369:2: ( ruleAttribute )
            {
            // InternalSmallUML.g:3369:2: ( ruleAttribute )
            // InternalSmallUML.g:3370:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Class__AttributesAssignment_4_3_1"


    // $ANTLR start "rule__Class__MethodsAssignment_5_2"
    // InternalSmallUML.g:3379:1: rule__Class__MethodsAssignment_5_2 : ( ruleMethod ) ;
    public final void rule__Class__MethodsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3383:1: ( ( ruleMethod ) )
            // InternalSmallUML.g:3384:2: ( ruleMethod )
            {
            // InternalSmallUML.g:3384:2: ( ruleMethod )
            // InternalSmallUML.g:3385:3: ruleMethod
            {
             before(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Class__MethodsAssignment_5_2"


    // $ANTLR start "rule__Class__MethodsAssignment_5_3_1"
    // InternalSmallUML.g:3394:1: rule__Class__MethodsAssignment_5_3_1 : ( ruleMethod ) ;
    public final void rule__Class__MethodsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3398:1: ( ( ruleMethod ) )
            // InternalSmallUML.g:3399:2: ( ruleMethod )
            {
            // InternalSmallUML.g:3399:2: ( ruleMethod )
            // InternalSmallUML.g:3400:3: ruleMethod
            {
             before(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Class__MethodsAssignment_5_3_1"


    // $ANTLR start "rule__Relation__NameAssignment_1"
    // InternalSmallUML.g:3409:1: rule__Relation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Relation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3413:1: ( ( ruleEString ) )
            // InternalSmallUML.g:3414:2: ( ruleEString )
            {
            // InternalSmallUML.g:3414:2: ( ruleEString )
            // InternalSmallUML.g:3415:3: ruleEString
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
    // InternalSmallUML.g:3424:1: rule__Relation__FromAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Relation__FromAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3428:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:3429:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:3429:2: ( ( ruleEString ) )
            // InternalSmallUML.g:3430:3: ( ruleEString )
            {
             before(grammarAccess.getRelationAccess().getFromClassCrossReference_4_0()); 
            // InternalSmallUML.g:3431:3: ( ruleEString )
            // InternalSmallUML.g:3432:4: ruleEString
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
    // InternalSmallUML.g:3443:1: rule__Relation__ToAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Relation__ToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3447:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:3448:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:3448:2: ( ( ruleEString ) )
            // InternalSmallUML.g:3449:3: ( ruleEString )
            {
             before(grammarAccess.getRelationAccess().getToClassCrossReference_6_0()); 
            // InternalSmallUML.g:3450:3: ( ruleEString )
            // InternalSmallUML.g:3451:4: ruleEString
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
    // InternalSmallUML.g:3462:1: rule__Relation__CardinalityAssignment_8 : ( ruleCardinality ) ;
    public final void rule__Relation__CardinalityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3466:1: ( ( ruleCardinality ) )
            // InternalSmallUML.g:3467:2: ( ruleCardinality )
            {
            // InternalSmallUML.g:3467:2: ( ruleCardinality )
            // InternalSmallUML.g:3468:3: ruleCardinality
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
    // InternalSmallUML.g:3477:1: rule__Attribute__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3481:1: ( ( ruleEString ) )
            // InternalSmallUML.g:3482:2: ( ruleEString )
            {
            // InternalSmallUML.g:3482:2: ( ruleEString )
            // InternalSmallUML.g:3483:3: ruleEString
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
    // InternalSmallUML.g:3492:1: rule__Attribute__TypedValueAssignment_4 : ( ruleType ) ;
    public final void rule__Attribute__TypedValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3496:1: ( ( ruleType ) )
            // InternalSmallUML.g:3497:2: ( ruleType )
            {
            // InternalSmallUML.g:3497:2: ( ruleType )
            // InternalSmallUML.g:3498:3: ruleType
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
    // InternalSmallUML.g:3507:1: rule__Method__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Method__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3511:1: ( ( ruleEString ) )
            // InternalSmallUML.g:3512:2: ( ruleEString )
            {
            // InternalSmallUML.g:3512:2: ( ruleEString )
            // InternalSmallUML.g:3513:3: ruleEString
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
    // InternalSmallUML.g:3522:1: rule__Method__ReturnTypedValueAssignment_4_1 : ( ruleType ) ;
    public final void rule__Method__ReturnTypedValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3526:1: ( ( ruleType ) )
            // InternalSmallUML.g:3527:2: ( ruleType )
            {
            // InternalSmallUML.g:3527:2: ( ruleType )
            // InternalSmallUML.g:3528:3: ruleType
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
    // InternalSmallUML.g:3537:1: rule__Method__ParametersAssignment_5_2 : ( ruleAttribute ) ;
    public final void rule__Method__ParametersAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3541:1: ( ( ruleAttribute ) )
            // InternalSmallUML.g:3542:2: ( ruleAttribute )
            {
            // InternalSmallUML.g:3542:2: ( ruleAttribute )
            // InternalSmallUML.g:3543:3: ruleAttribute
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
    // InternalSmallUML.g:3552:1: rule__Method__ParametersAssignment_5_3_1 : ( ruleAttribute ) ;
    public final void rule__Method__ParametersAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3556:1: ( ( ruleAttribute ) )
            // InternalSmallUML.g:3557:2: ( ruleAttribute )
            {
            // InternalSmallUML.g:3557:2: ( ruleAttribute )
            // InternalSmallUML.g:3558:3: ruleAttribute
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
    // InternalSmallUML.g:3567:1: rule__Enumeration__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3571:1: ( ( ruleEString ) )
            // InternalSmallUML.g:3572:2: ( ruleEString )
            {
            // InternalSmallUML.g:3572:2: ( ruleEString )
            // InternalSmallUML.g:3573:3: ruleEString
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
    // InternalSmallUML.g:3582:1: rule__Enumeration__ValueAssignment_5 : ( ruleString0 ) ;
    public final void rule__Enumeration__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3586:1: ( ( ruleString0 ) )
            // InternalSmallUML.g:3587:2: ( ruleString0 )
            {
            // InternalSmallUML.g:3587:2: ( ruleString0 )
            // InternalSmallUML.g:3588:3: ruleString0
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
    // InternalSmallUML.g:3597:1: rule__Enumeration__ValueAssignment_6_1 : ( ruleString0 ) ;
    public final void rule__Enumeration__ValueAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3601:1: ( ( ruleString0 ) )
            // InternalSmallUML.g:3602:2: ( ruleString0 )
            {
            // InternalSmallUML.g:3602:2: ( ruleString0 )
            // InternalSmallUML.g:3603:3: ruleString0
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
    // InternalSmallUML.g:3612:1: rule__Cardinality__LowerBoundAssignment_3 : ( ruleEInt ) ;
    public final void rule__Cardinality__LowerBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3616:1: ( ( ruleEInt ) )
            // InternalSmallUML.g:3617:2: ( ruleEInt )
            {
            // InternalSmallUML.g:3617:2: ( ruleEInt )
            // InternalSmallUML.g:3618:3: ruleEInt
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
    // InternalSmallUML.g:3627:1: rule__Cardinality__UpperBoundAssignment_5 : ( ruleEInt ) ;
    public final void rule__Cardinality__UpperBoundAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3631:1: ( ( ruleEInt ) )
            // InternalSmallUML.g:3632:2: ( ruleEInt )
            {
            // InternalSmallUML.g:3632:2: ( ruleEInt )
            // InternalSmallUML.g:3633:3: ruleEInt
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C2000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000007E0000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000018002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});

}