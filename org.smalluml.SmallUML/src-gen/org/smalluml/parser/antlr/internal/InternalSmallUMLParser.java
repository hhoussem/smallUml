package org.smalluml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.smalluml.services.SmallUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'class'", "','", "'}'", "'relation'", "'Class'", "'attributes'", "'methods'", "'Relation'", "'from'", "'to'", "'cardinality'", "'Attribute'", "'typedValue'", "'Method'", "'returnTypedValue'", "'parameters'", "'Type'", "'Boolean'", "'Real'", "'Integer'", "'String'", "'Enumeration'", "'value'", "'Cardinality'", "'lowerBound'", "'upperBound'", "'-'"
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

        public InternalSmallUMLParser(TokenStream input, SmallUMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Package";
       	}

       	@Override
       	protected SmallUMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePackage"
    // InternalSmallUML.g:64:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalSmallUML.g:64:48: (iv_rulePackage= rulePackage EOF )
            // InternalSmallUML.g:65:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalSmallUML.g:71:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'Package' otherlv_2= '{' (otherlv_3= 'class' otherlv_4= '{' ( (lv_class_5_0= ruleClass ) ) (otherlv_6= ',' ( (lv_class_7_0= ruleClass ) ) )* otherlv_8= '}' )? (otherlv_9= 'relation' otherlv_10= '{' ( (lv_relation_11_0= ruleRelation ) ) (otherlv_12= ',' ( (lv_relation_13_0= ruleRelation ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_class_5_0 = null;

        EObject lv_class_7_0 = null;

        EObject lv_relation_11_0 = null;

        EObject lv_relation_13_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:77:2: ( ( () otherlv_1= 'Package' otherlv_2= '{' (otherlv_3= 'class' otherlv_4= '{' ( (lv_class_5_0= ruleClass ) ) (otherlv_6= ',' ( (lv_class_7_0= ruleClass ) ) )* otherlv_8= '}' )? (otherlv_9= 'relation' otherlv_10= '{' ( (lv_relation_11_0= ruleRelation ) ) (otherlv_12= ',' ( (lv_relation_13_0= ruleRelation ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalSmallUML.g:78:2: ( () otherlv_1= 'Package' otherlv_2= '{' (otherlv_3= 'class' otherlv_4= '{' ( (lv_class_5_0= ruleClass ) ) (otherlv_6= ',' ( (lv_class_7_0= ruleClass ) ) )* otherlv_8= '}' )? (otherlv_9= 'relation' otherlv_10= '{' ( (lv_relation_11_0= ruleRelation ) ) (otherlv_12= ',' ( (lv_relation_13_0= ruleRelation ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalSmallUML.g:78:2: ( () otherlv_1= 'Package' otherlv_2= '{' (otherlv_3= 'class' otherlv_4= '{' ( (lv_class_5_0= ruleClass ) ) (otherlv_6= ',' ( (lv_class_7_0= ruleClass ) ) )* otherlv_8= '}' )? (otherlv_9= 'relation' otherlv_10= '{' ( (lv_relation_11_0= ruleRelation ) ) (otherlv_12= ',' ( (lv_relation_13_0= ruleRelation ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalSmallUML.g:79:3: () otherlv_1= 'Package' otherlv_2= '{' (otherlv_3= 'class' otherlv_4= '{' ( (lv_class_5_0= ruleClass ) ) (otherlv_6= ',' ( (lv_class_7_0= ruleClass ) ) )* otherlv_8= '}' )? (otherlv_9= 'relation' otherlv_10= '{' ( (lv_relation_11_0= ruleRelation ) ) (otherlv_12= ',' ( (lv_relation_13_0= ruleRelation ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalSmallUML.g:79:3: ()
            // InternalSmallUML.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackageAccess().getPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmallUML.g:94:3: (otherlv_3= 'class' otherlv_4= '{' ( (lv_class_5_0= ruleClass ) ) (otherlv_6= ',' ( (lv_class_7_0= ruleClass ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmallUML.g:95:4: otherlv_3= 'class' otherlv_4= '{' ( (lv_class_5_0= ruleClass ) ) (otherlv_6= ',' ( (lv_class_7_0= ruleClass ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getClassKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSmallUML.g:103:4: ( (lv_class_5_0= ruleClass ) )
                    // InternalSmallUML.g:104:5: (lv_class_5_0= ruleClass )
                    {
                    // InternalSmallUML.g:104:5: (lv_class_5_0= ruleClass )
                    // InternalSmallUML.g:105:6: lv_class_5_0= ruleClass
                    {

                    						newCompositeNode(grammarAccess.getPackageAccess().getClassClassParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_class_5_0=ruleClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackageRule());
                    						}
                    						add(
                    							current,
                    							"class",
                    							lv_class_5_0,
                    							"org.smalluml.SmallUML.Class");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:122:4: (otherlv_6= ',' ( (lv_class_7_0= ruleClass ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSmallUML.g:123:5: otherlv_6= ',' ( (lv_class_7_0= ruleClass ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPackageAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSmallUML.g:127:5: ( (lv_class_7_0= ruleClass ) )
                    	    // InternalSmallUML.g:128:6: (lv_class_7_0= ruleClass )
                    	    {
                    	    // InternalSmallUML.g:128:6: (lv_class_7_0= ruleClass )
                    	    // InternalSmallUML.g:129:7: lv_class_7_0= ruleClass
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackageAccess().getClassClassParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_class_7_0=ruleClass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"class",
                    	    								lv_class_7_0,
                    	    								"org.smalluml.SmallUML.Class");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:152:3: (otherlv_9= 'relation' otherlv_10= '{' ( (lv_relation_11_0= ruleRelation ) ) (otherlv_12= ',' ( (lv_relation_13_0= ruleRelation ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmallUML.g:153:4: otherlv_9= 'relation' otherlv_10= '{' ( (lv_relation_11_0= ruleRelation ) ) (otherlv_12= ',' ( (lv_relation_13_0= ruleRelation ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getPackageAccess().getRelationKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSmallUML.g:161:4: ( (lv_relation_11_0= ruleRelation ) )
                    // InternalSmallUML.g:162:5: (lv_relation_11_0= ruleRelation )
                    {
                    // InternalSmallUML.g:162:5: (lv_relation_11_0= ruleRelation )
                    // InternalSmallUML.g:163:6: lv_relation_11_0= ruleRelation
                    {

                    						newCompositeNode(grammarAccess.getPackageAccess().getRelationRelationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_relation_11_0=ruleRelation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackageRule());
                    						}
                    						add(
                    							current,
                    							"relation",
                    							lv_relation_11_0,
                    							"org.smalluml.SmallUML.Relation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:180:4: (otherlv_12= ',' ( (lv_relation_13_0= ruleRelation ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSmallUML.g:181:5: otherlv_12= ',' ( (lv_relation_13_0= ruleRelation ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getPackageAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSmallUML.g:185:5: ( (lv_relation_13_0= ruleRelation ) )
                    	    // InternalSmallUML.g:186:6: (lv_relation_13_0= ruleRelation )
                    	    {
                    	    // InternalSmallUML.g:186:6: (lv_relation_13_0= ruleRelation )
                    	    // InternalSmallUML.g:187:7: lv_relation_13_0= ruleRelation
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackageAccess().getRelationRelationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_relation_13_0=ruleRelation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relation",
                    	    								lv_relation_13_0,
                    	    								"org.smalluml.SmallUML.Relation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleType"
    // InternalSmallUML.g:218:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSmallUML.g:218:45: (iv_ruleType= ruleType EOF )
            // InternalSmallUML.g:219:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSmallUML.g:225:1: ruleType returns [EObject current=null] : (this_Type_Impl_0= ruleType_Impl | this_Boolean_1= ruleBoolean | this_Real_2= ruleReal | this_Integer_3= ruleInteger | this_String0_4= ruleString0 | this_Enumeration_5= ruleEnumeration ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Type_Impl_0 = null;

        EObject this_Boolean_1 = null;

        EObject this_Real_2 = null;

        EObject this_Integer_3 = null;

        EObject this_String0_4 = null;

        EObject this_Enumeration_5 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:231:2: ( (this_Type_Impl_0= ruleType_Impl | this_Boolean_1= ruleBoolean | this_Real_2= ruleReal | this_Integer_3= ruleInteger | this_String0_4= ruleString0 | this_Enumeration_5= ruleEnumeration ) )
            // InternalSmallUML.g:232:2: (this_Type_Impl_0= ruleType_Impl | this_Boolean_1= ruleBoolean | this_Real_2= ruleReal | this_Integer_3= ruleInteger | this_String0_4= ruleString0 | this_Enumeration_5= ruleEnumeration )
            {
            // InternalSmallUML.g:232:2: (this_Type_Impl_0= ruleType_Impl | this_Boolean_1= ruleBoolean | this_Real_2= ruleReal | this_Integer_3= ruleInteger | this_String0_4= ruleString0 | this_Enumeration_5= ruleEnumeration )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt5=1;
                }
                break;
            case 30:
                {
                alt5=2;
                }
                break;
            case 31:
                {
                alt5=3;
                }
                break;
            case 32:
                {
                alt5=4;
                }
                break;
            case 33:
                {
                alt5=5;
                }
                break;
            case 34:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSmallUML.g:233:3: this_Type_Impl_0= ruleType_Impl
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_Impl_0=ruleType_Impl();

                    state._fsp--;


                    			current = this_Type_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:242:3: this_Boolean_1= ruleBoolean
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBooleanParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Boolean_1=ruleBoolean();

                    state._fsp--;


                    			current = this_Boolean_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmallUML.g:251:3: this_Real_2= ruleReal
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getRealParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Real_2=ruleReal();

                    state._fsp--;


                    			current = this_Real_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSmallUML.g:260:3: this_Integer_3= ruleInteger
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getIntegerParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Integer_3=ruleInteger();

                    state._fsp--;


                    			current = this_Integer_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSmallUML.g:269:3: this_String0_4= ruleString0
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getString0ParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_String0_4=ruleString0();

                    state._fsp--;


                    			current = this_String0_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSmallUML.g:278:3: this_Enumeration_5= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_5=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleClass"
    // InternalSmallUML.g:290:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalSmallUML.g:290:46: (iv_ruleClass= ruleClass EOF )
            // InternalSmallUML.g:291:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalSmallUML.g:297:1: ruleClass returns [EObject current=null] : ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'methods' otherlv_11= '{' ( (lv_methods_12_0= ruleMethod ) ) (otherlv_13= ',' ( (lv_methods_14_0= ruleMethod ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_attributes_6_0 = null;

        EObject lv_attributes_8_0 = null;

        EObject lv_methods_12_0 = null;

        EObject lv_methods_14_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:303:2: ( ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'methods' otherlv_11= '{' ( (lv_methods_12_0= ruleMethod ) ) (otherlv_13= ',' ( (lv_methods_14_0= ruleMethod ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalSmallUML.g:304:2: ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'methods' otherlv_11= '{' ( (lv_methods_12_0= ruleMethod ) ) (otherlv_13= ',' ( (lv_methods_14_0= ruleMethod ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalSmallUML.g:304:2: ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'methods' otherlv_11= '{' ( (lv_methods_12_0= ruleMethod ) ) (otherlv_13= ',' ( (lv_methods_14_0= ruleMethod ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalSmallUML.g:305:3: () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'methods' otherlv_11= '{' ( (lv_methods_12_0= ruleMethod ) ) (otherlv_13= ',' ( (lv_methods_14_0= ruleMethod ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalSmallUML.g:305:3: ()
            // InternalSmallUML.g:306:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassAccess().getClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalSmallUML.g:316:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:317:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:317:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:318:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:339:3: (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmallUML.g:340:4: otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getClassAccess().getAttributesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSmallUML.g:348:4: ( (lv_attributes_6_0= ruleAttribute ) )
                    // InternalSmallUML.g:349:5: (lv_attributes_6_0= ruleAttribute )
                    {
                    // InternalSmallUML.g:349:5: (lv_attributes_6_0= ruleAttribute )
                    // InternalSmallUML.g:350:6: lv_attributes_6_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_attributes_6_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_6_0,
                    							"org.smalluml.SmallUML.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:367:4: (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSmallUML.g:368:5: otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getClassAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSmallUML.g:372:5: ( (lv_attributes_8_0= ruleAttribute ) )
                    	    // InternalSmallUML.g:373:6: (lv_attributes_8_0= ruleAttribute )
                    	    {
                    	    // InternalSmallUML.g:373:6: (lv_attributes_8_0= ruleAttribute )
                    	    // InternalSmallUML.g:374:7: lv_attributes_8_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_attributes_8_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_8_0,
                    	    								"org.smalluml.SmallUML.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:397:3: (otherlv_10= 'methods' otherlv_11= '{' ( (lv_methods_12_0= ruleMethod ) ) (otherlv_13= ',' ( (lv_methods_14_0= ruleMethod ) ) )* otherlv_15= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmallUML.g:398:4: otherlv_10= 'methods' otherlv_11= '{' ( (lv_methods_12_0= ruleMethod ) ) (otherlv_13= ',' ( (lv_methods_14_0= ruleMethod ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getClassAccess().getMethodsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSmallUML.g:406:4: ( (lv_methods_12_0= ruleMethod ) )
                    // InternalSmallUML.g:407:5: (lv_methods_12_0= ruleMethod )
                    {
                    // InternalSmallUML.g:407:5: (lv_methods_12_0= ruleMethod )
                    // InternalSmallUML.g:408:6: lv_methods_12_0= ruleMethod
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_methods_12_0=ruleMethod();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"methods",
                    							lv_methods_12_0,
                    							"org.smalluml.SmallUML.Method");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:425:4: (otherlv_13= ',' ( (lv_methods_14_0= ruleMethod ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSmallUML.g:426:5: otherlv_13= ',' ( (lv_methods_14_0= ruleMethod ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSmallUML.g:430:5: ( (lv_methods_14_0= ruleMethod ) )
                    	    // InternalSmallUML.g:431:6: (lv_methods_14_0= ruleMethod )
                    	    {
                    	    // InternalSmallUML.g:431:6: (lv_methods_14_0= ruleMethod )
                    	    // InternalSmallUML.g:432:7: lv_methods_14_0= ruleMethod
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_methods_14_0=ruleMethod();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"methods",
                    	    								lv_methods_14_0,
                    	    								"org.smalluml.SmallUML.Method");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleRelation"
    // InternalSmallUML.g:463:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalSmallUML.g:463:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalSmallUML.g:464:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalSmallUML.g:470:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'Relation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) otherlv_7= 'cardinality' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= '}' ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_cardinality_8_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:476:2: ( (otherlv_0= 'Relation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) otherlv_7= 'cardinality' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= '}' ) )
            // InternalSmallUML.g:477:2: (otherlv_0= 'Relation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) otherlv_7= 'cardinality' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= '}' )
            {
            // InternalSmallUML.g:477:2: (otherlv_0= 'Relation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) otherlv_7= 'cardinality' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= '}' )
            // InternalSmallUML.g:478:3: otherlv_0= 'Relation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) otherlv_7= 'cardinality' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            // InternalSmallUML.g:482:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:483:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:483:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:484:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRelationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getFromKeyword_3());
            		
            // InternalSmallUML.g:509:3: ( ( ruleEString ) )
            // InternalSmallUML.g:510:4: ( ruleEString )
            {
            // InternalSmallUML.g:510:4: ( ruleEString )
            // InternalSmallUML.g:511:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRelationAccess().getFromClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getToKeyword_5());
            		
            // InternalSmallUML.g:529:3: ( ( ruleEString ) )
            // InternalSmallUML.g:530:4: ( ruleEString )
            {
            // InternalSmallUML.g:530:4: ( ruleEString )
            // InternalSmallUML.g:531:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRelationAccess().getToClassCrossReference_6_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getCardinalityKeyword_7());
            		
            // InternalSmallUML.g:549:3: ( (lv_cardinality_8_0= ruleCardinality ) )
            // InternalSmallUML.g:550:4: (lv_cardinality_8_0= ruleCardinality )
            {
            // InternalSmallUML.g:550:4: (lv_cardinality_8_0= ruleCardinality )
            // InternalSmallUML.g:551:5: lv_cardinality_8_0= ruleCardinality
            {

            					newCompositeNode(grammarAccess.getRelationAccess().getCardinalityCardinalityParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_cardinality_8_0=ruleCardinality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationRule());
            					}
            					set(
            						current,
            						"cardinality",
            						lv_cardinality_8_0,
            						"org.smalluml.SmallUML.Cardinality");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleEString"
    // InternalSmallUML.g:576:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmallUML.g:576:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmallUML.g:577:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSmallUML.g:583:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:589:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmallUML.g:590:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmallUML.g:590:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmallUML.g:591:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:599:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAttribute"
    // InternalSmallUML.g:610:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSmallUML.g:610:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSmallUML.g:611:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSmallUML.g:617:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'typedValue' ( (lv_typedValue_4_0= ruleType ) ) otherlv_5= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_typedValue_4_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:623:2: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'typedValue' ( (lv_typedValue_4_0= ruleType ) ) otherlv_5= '}' ) )
            // InternalSmallUML.g:624:2: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'typedValue' ( (lv_typedValue_4_0= ruleType ) ) otherlv_5= '}' )
            {
            // InternalSmallUML.g:624:2: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'typedValue' ( (lv_typedValue_4_0= ruleType ) ) otherlv_5= '}' )
            // InternalSmallUML.g:625:3: otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'typedValue' ( (lv_typedValue_4_0= ruleType ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalSmallUML.g:629:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:630:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:630:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:631:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getTypedValueKeyword_3());
            		
            // InternalSmallUML.g:656:3: ( (lv_typedValue_4_0= ruleType ) )
            // InternalSmallUML.g:657:4: (lv_typedValue_4_0= ruleType )
            {
            // InternalSmallUML.g:657:4: (lv_typedValue_4_0= ruleType )
            // InternalSmallUML.g:658:5: lv_typedValue_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypedValueTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_typedValue_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"typedValue",
            						lv_typedValue_4_0,
            						"org.smalluml.SmallUML.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleMethod"
    // InternalSmallUML.g:683:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalSmallUML.g:683:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalSmallUML.g:684:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalSmallUML.g:690:1: ruleMethod returns [EObject current=null] : ( () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnTypedValue' ( (lv_returnTypedValue_5_0= ruleType ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_returnTypedValue_5_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_parameters_10_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:696:2: ( ( () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnTypedValue' ( (lv_returnTypedValue_5_0= ruleType ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalSmallUML.g:697:2: ( () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnTypedValue' ( (lv_returnTypedValue_5_0= ruleType ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalSmallUML.g:697:2: ( () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnTypedValue' ( (lv_returnTypedValue_5_0= ruleType ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalSmallUML.g:698:3: () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnTypedValue' ( (lv_returnTypedValue_5_0= ruleType ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalSmallUML.g:698:3: ()
            // InternalSmallUML.g:699:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodAccess().getMethodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getMethodKeyword_1());
            		
            // InternalSmallUML.g:709:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:710:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:710:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:711:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:732:3: (otherlv_4= 'returnTypedValue' ( (lv_returnTypedValue_5_0= ruleType ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmallUML.g:733:4: otherlv_4= 'returnTypedValue' ( (lv_returnTypedValue_5_0= ruleType ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getReturnTypedValueKeyword_4_0());
                    			
                    // InternalSmallUML.g:737:4: ( (lv_returnTypedValue_5_0= ruleType ) )
                    // InternalSmallUML.g:738:5: (lv_returnTypedValue_5_0= ruleType )
                    {
                    // InternalSmallUML.g:738:5: (lv_returnTypedValue_5_0= ruleType )
                    // InternalSmallUML.g:739:6: lv_returnTypedValue_5_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getReturnTypedValueTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_returnTypedValue_5_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    						}
                    						set(
                    							current,
                    							"returnTypedValue",
                    							lv_returnTypedValue_5_0,
                    							"org.smalluml.SmallUML.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmallUML.g:757:3: (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleAttribute ) ) )* otherlv_11= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSmallUML.g:758:4: otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleAttribute ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getParametersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSmallUML.g:766:4: ( (lv_parameters_8_0= ruleAttribute ) )
                    // InternalSmallUML.g:767:5: (lv_parameters_8_0= ruleAttribute )
                    {
                    // InternalSmallUML.g:767:5: (lv_parameters_8_0= ruleAttribute )
                    // InternalSmallUML.g:768:6: lv_parameters_8_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getParametersAttributeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_parameters_8_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_8_0,
                    							"org.smalluml.SmallUML.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:785:4: (otherlv_9= ',' ( (lv_parameters_10_0= ruleAttribute ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSmallUML.g:786:5: otherlv_9= ',' ( (lv_parameters_10_0= ruleAttribute ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSmallUML.g:790:5: ( (lv_parameters_10_0= ruleAttribute ) )
                    	    // InternalSmallUML.g:791:6: (lv_parameters_10_0= ruleAttribute )
                    	    {
                    	    // InternalSmallUML.g:791:6: (lv_parameters_10_0= ruleAttribute )
                    	    // InternalSmallUML.g:792:7: lv_parameters_10_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodAccess().getParametersAttributeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_parameters_10_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_10_0,
                    	    								"org.smalluml.SmallUML.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleType_Impl"
    // InternalSmallUML.g:823:1: entryRuleType_Impl returns [EObject current=null] : iv_ruleType_Impl= ruleType_Impl EOF ;
    public final EObject entryRuleType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_Impl = null;


        try {
            // InternalSmallUML.g:823:50: (iv_ruleType_Impl= ruleType_Impl EOF )
            // InternalSmallUML.g:824:2: iv_ruleType_Impl= ruleType_Impl EOF
            {
             newCompositeNode(grammarAccess.getType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType_Impl=ruleType_Impl();

            state._fsp--;

             current =iv_ruleType_Impl; 
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
    // $ANTLR end "entryRuleType_Impl"


    // $ANTLR start "ruleType_Impl"
    // InternalSmallUML.g:830:1: ruleType_Impl returns [EObject current=null] : ( () otherlv_1= 'Type' ) ;
    public final EObject ruleType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:836:2: ( ( () otherlv_1= 'Type' ) )
            // InternalSmallUML.g:837:2: ( () otherlv_1= 'Type' )
            {
            // InternalSmallUML.g:837:2: ( () otherlv_1= 'Type' )
            // InternalSmallUML.g:838:3: () otherlv_1= 'Type'
            {
            // InternalSmallUML.g:838:3: ()
            // InternalSmallUML.g:839:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getType_ImplAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getType_ImplAccess().getTypeKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType_Impl"


    // $ANTLR start "entryRuleBoolean"
    // InternalSmallUML.g:853:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalSmallUML.g:853:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalSmallUML.g:854:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalSmallUML.g:860:1: ruleBoolean returns [EObject current=null] : ( () otherlv_1= 'Boolean' ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:866:2: ( ( () otherlv_1= 'Boolean' ) )
            // InternalSmallUML.g:867:2: ( () otherlv_1= 'Boolean' )
            {
            // InternalSmallUML.g:867:2: ( () otherlv_1= 'Boolean' )
            // InternalSmallUML.g:868:3: () otherlv_1= 'Boolean'
            {
            // InternalSmallUML.g:868:3: ()
            // InternalSmallUML.g:869:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanAccess().getBooleanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanAccess().getBooleanKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleReal"
    // InternalSmallUML.g:883:1: entryRuleReal returns [EObject current=null] : iv_ruleReal= ruleReal EOF ;
    public final EObject entryRuleReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReal = null;


        try {
            // InternalSmallUML.g:883:45: (iv_ruleReal= ruleReal EOF )
            // InternalSmallUML.g:884:2: iv_ruleReal= ruleReal EOF
            {
             newCompositeNode(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReal=ruleReal();

            state._fsp--;

             current =iv_ruleReal; 
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
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // InternalSmallUML.g:890:1: ruleReal returns [EObject current=null] : ( () otherlv_1= 'Real' ) ;
    public final EObject ruleReal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:896:2: ( ( () otherlv_1= 'Real' ) )
            // InternalSmallUML.g:897:2: ( () otherlv_1= 'Real' )
            {
            // InternalSmallUML.g:897:2: ( () otherlv_1= 'Real' )
            // InternalSmallUML.g:898:3: () otherlv_1= 'Real'
            {
            // InternalSmallUML.g:898:3: ()
            // InternalSmallUML.g:899:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealAccess().getRealAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRealAccess().getRealKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleInteger"
    // InternalSmallUML.g:913:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // InternalSmallUML.g:913:48: (iv_ruleInteger= ruleInteger EOF )
            // InternalSmallUML.g:914:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger; 
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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalSmallUML.g:920:1: ruleInteger returns [EObject current=null] : ( () otherlv_1= 'Integer' ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:926:2: ( ( () otherlv_1= 'Integer' ) )
            // InternalSmallUML.g:927:2: ( () otherlv_1= 'Integer' )
            {
            // InternalSmallUML.g:927:2: ( () otherlv_1= 'Integer' )
            // InternalSmallUML.g:928:3: () otherlv_1= 'Integer'
            {
            // InternalSmallUML.g:928:3: ()
            // InternalSmallUML.g:929:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerAccess().getIntegerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerAccess().getIntegerKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleString0"
    // InternalSmallUML.g:943:1: entryRuleString0 returns [EObject current=null] : iv_ruleString0= ruleString0 EOF ;
    public final EObject entryRuleString0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString0 = null;


        try {
            // InternalSmallUML.g:943:48: (iv_ruleString0= ruleString0 EOF )
            // InternalSmallUML.g:944:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0; 
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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalSmallUML.g:950:1: ruleString0 returns [EObject current=null] : ( () otherlv_1= 'String' ) ;
    public final EObject ruleString0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:956:2: ( ( () otherlv_1= 'String' ) )
            // InternalSmallUML.g:957:2: ( () otherlv_1= 'String' )
            {
            // InternalSmallUML.g:957:2: ( () otherlv_1= 'String' )
            // InternalSmallUML.g:958:3: () otherlv_1= 'String'
            {
            // InternalSmallUML.g:958:3: ()
            // InternalSmallUML.g:959:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0Access().getStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getString0Access().getStringKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleEnumeration"
    // InternalSmallUML.g:973:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalSmallUML.g:973:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalSmallUML.g:974:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalSmallUML.g:980:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'Enumeration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:986:2: ( (otherlv_0= 'Enumeration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalSmallUML.g:987:2: (otherlv_0= 'Enumeration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalSmallUML.g:987:2: (otherlv_0= 'Enumeration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalSmallUML.g:988:3: otherlv_0= 'Enumeration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
            		
            // InternalSmallUML.g:992:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:993:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:993:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:994:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getValueKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSmallUML.g:1023:3: ( (lv_value_5_0= ruleString0 ) )
            // InternalSmallUML.g:1024:4: (lv_value_5_0= ruleString0 )
            {
            // InternalSmallUML.g:1024:4: (lv_value_5_0= ruleString0 )
            // InternalSmallUML.g:1025:5: lv_value_5_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_value_5_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					add(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.smalluml.SmallUML.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUML.g:1042:3: (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSmallUML.g:1043:4: otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_24); 

            	    				newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalSmallUML.g:1047:4: ( (lv_value_7_0= ruleString0 ) )
            	    // InternalSmallUML.g:1048:5: (lv_value_7_0= ruleString0 )
            	    {
            	    // InternalSmallUML.g:1048:5: (lv_value_7_0= ruleString0 )
            	    // InternalSmallUML.g:1049:6: lv_value_7_0= ruleString0
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_value_7_0=ruleString0();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_7_0,
            	    							"org.smalluml.SmallUML.String0");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleCardinality"
    // InternalSmallUML.g:1079:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalSmallUML.g:1079:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalSmallUML.g:1080:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality; 
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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalSmallUML.g:1086:1: ruleCardinality returns [EObject current=null] : (otherlv_0= 'Cardinality' otherlv_1= '{' otherlv_2= 'lowerBound' ( (lv_lowerBound_3_0= ruleEInt ) ) otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) otherlv_6= '}' ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_lowerBound_3_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_5_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:1092:2: ( (otherlv_0= 'Cardinality' otherlv_1= '{' otherlv_2= 'lowerBound' ( (lv_lowerBound_3_0= ruleEInt ) ) otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) otherlv_6= '}' ) )
            // InternalSmallUML.g:1093:2: (otherlv_0= 'Cardinality' otherlv_1= '{' otherlv_2= 'lowerBound' ( (lv_lowerBound_3_0= ruleEInt ) ) otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) otherlv_6= '}' )
            {
            // InternalSmallUML.g:1093:2: (otherlv_0= 'Cardinality' otherlv_1= '{' otherlv_2= 'lowerBound' ( (lv_lowerBound_3_0= ruleEInt ) ) otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) otherlv_6= '}' )
            // InternalSmallUML.g:1094:3: otherlv_0= 'Cardinality' otherlv_1= '{' otherlv_2= 'lowerBound' ( (lv_lowerBound_3_0= ruleEInt ) ) otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCardinalityAccess().getCardinalityKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getCardinalityAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getCardinalityAccess().getLowerBoundKeyword_2());
            		
            // InternalSmallUML.g:1106:3: ( (lv_lowerBound_3_0= ruleEInt ) )
            // InternalSmallUML.g:1107:4: (lv_lowerBound_3_0= ruleEInt )
            {
            // InternalSmallUML.g:1107:4: (lv_lowerBound_3_0= ruleEInt )
            // InternalSmallUML.g:1108:5: lv_lowerBound_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getLowerBoundEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_lowerBound_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinalityRule());
            					}
            					set(
            						current,
            						"lowerBound",
            						lv_lowerBound_3_0,
            						"org.smalluml.SmallUML.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,38,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getCardinalityAccess().getUpperBoundKeyword_4());
            		
            // InternalSmallUML.g:1129:3: ( (lv_upperBound_5_0= ruleEInt ) )
            // InternalSmallUML.g:1130:4: (lv_upperBound_5_0= ruleEInt )
            {
            // InternalSmallUML.g:1130:4: (lv_upperBound_5_0= ruleEInt )
            // InternalSmallUML.g:1131:5: lv_upperBound_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getUpperBoundEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_upperBound_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinalityRule());
            					}
            					set(
            						current,
            						"upperBound",
            						lv_upperBound_5_0,
            						"org.smalluml.SmallUML.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCardinalityAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleEInt"
    // InternalSmallUML.g:1156:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSmallUML.g:1156:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSmallUML.g:1157:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSmallUML.g:1163:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:1169:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSmallUML.g:1170:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSmallUML.g:1170:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSmallUML.g:1171:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSmallUML.g:1171:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSmallUML.g:1172:4: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_28); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000007E0000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000018008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});

}