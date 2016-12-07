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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'class'", "','", "'}'", "'relation'", "'Class'", "'parents'", "'('", "')'", "'attributes'", "'methods'", "'Relation'", "'from'", "'to'", "'cardinality'", "'Attribute'", "'typedValue'", "'Method'", "'returnTypedValue'", "'parameters'", "'Type'", "'Boolean'", "'Real'", "'Integer'", "'String'", "'Infinity'", "'Enumeration'", "'value'", "'Cardinality'", "'lowerBound'", "'upperBound'", "'-'"
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
    // InternalSmallUML.g:225:1: ruleType returns [EObject current=null] : (this_Type_Impl_0= ruleType_Impl | this_Boolean_1= ruleBoolean | this_Real_2= ruleReal | this_Integer_3= ruleInteger | this_String0_4= ruleString0 | this_Infinity_5= ruleInfinity | this_Enumeration_6= ruleEnumeration ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Type_Impl_0 = null;

        EObject this_Boolean_1 = null;

        EObject this_Real_2 = null;

        EObject this_Integer_3 = null;

        EObject this_String0_4 = null;

        EObject this_Infinity_5 = null;

        EObject this_Enumeration_6 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:231:2: ( (this_Type_Impl_0= ruleType_Impl | this_Boolean_1= ruleBoolean | this_Real_2= ruleReal | this_Integer_3= ruleInteger | this_String0_4= ruleString0 | this_Infinity_5= ruleInfinity | this_Enumeration_6= ruleEnumeration ) )
            // InternalSmallUML.g:232:2: (this_Type_Impl_0= ruleType_Impl | this_Boolean_1= ruleBoolean | this_Real_2= ruleReal | this_Integer_3= ruleInteger | this_String0_4= ruleString0 | this_Infinity_5= ruleInfinity | this_Enumeration_6= ruleEnumeration )
            {
            // InternalSmallUML.g:232:2: (this_Type_Impl_0= ruleType_Impl | this_Boolean_1= ruleBoolean | this_Real_2= ruleReal | this_Integer_3= ruleInteger | this_String0_4= ruleString0 | this_Infinity_5= ruleInfinity | this_Enumeration_6= ruleEnumeration )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt5=1;
                }
                break;
            case 33:
                {
                alt5=2;
                }
                break;
            case 34:
                {
                alt5=3;
                }
                break;
            case 35:
                {
                alt5=4;
                }
                break;
            case 36:
                {
                alt5=5;
                }
                break;
            case 37:
                {
                alt5=6;
                }
                break;
            case 38:
                {
                alt5=7;
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
                    // InternalSmallUML.g:278:3: this_Infinity_5= ruleInfinity
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getInfinityParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Infinity_5=ruleInfinity();

                    state._fsp--;


                    			current = this_Infinity_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSmallUML.g:287:3: this_Enumeration_6= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_6=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_6;
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
    // InternalSmallUML.g:299:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalSmallUML.g:299:46: (iv_ruleClass= ruleClass EOF )
            // InternalSmallUML.g:300:2: iv_ruleClass= ruleClass EOF
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
    // InternalSmallUML.g:306:1: ruleClass returns [EObject current=null] : ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'attributes' otherlv_11= '{' ( (lv_attributes_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_attributes_14_0= ruleAttribute ) ) )* otherlv_15= '}' )? (otherlv_16= 'methods' otherlv_17= '{' ( (lv_methods_18_0= ruleMethod ) ) (otherlv_19= ',' ( (lv_methods_20_0= ruleMethod ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
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
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_attributes_12_0 = null;

        EObject lv_attributes_14_0 = null;

        EObject lv_methods_18_0 = null;

        EObject lv_methods_20_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:312:2: ( ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'attributes' otherlv_11= '{' ( (lv_attributes_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_attributes_14_0= ruleAttribute ) ) )* otherlv_15= '}' )? (otherlv_16= 'methods' otherlv_17= '{' ( (lv_methods_18_0= ruleMethod ) ) (otherlv_19= ',' ( (lv_methods_20_0= ruleMethod ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalSmallUML.g:313:2: ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'attributes' otherlv_11= '{' ( (lv_attributes_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_attributes_14_0= ruleAttribute ) ) )* otherlv_15= '}' )? (otherlv_16= 'methods' otherlv_17= '{' ( (lv_methods_18_0= ruleMethod ) ) (otherlv_19= ',' ( (lv_methods_20_0= ruleMethod ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalSmallUML.g:313:2: ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'attributes' otherlv_11= '{' ( (lv_attributes_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_attributes_14_0= ruleAttribute ) ) )* otherlv_15= '}' )? (otherlv_16= 'methods' otherlv_17= '{' ( (lv_methods_18_0= ruleMethod ) ) (otherlv_19= ',' ( (lv_methods_20_0= ruleMethod ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalSmallUML.g:314:3: () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'attributes' otherlv_11= '{' ( (lv_attributes_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_attributes_14_0= ruleAttribute ) ) )* otherlv_15= '}' )? (otherlv_16= 'methods' otherlv_17= '{' ( (lv_methods_18_0= ruleMethod ) ) (otherlv_19= ',' ( (lv_methods_20_0= ruleMethod ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalSmallUML.g:314:3: ()
            // InternalSmallUML.g:315:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassAccess().getClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalSmallUML.g:325:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:326:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:326:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:327:5: lv_name_2_0= ruleEString
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
            		
            // InternalSmallUML.g:348:3: (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmallUML.g:349:4: otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getClassAccess().getParentsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getClassAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalSmallUML.g:357:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:358:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:358:5: ( ruleEString )
                    // InternalSmallUML.g:359:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClassAccess().getParentsClassCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:373:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSmallUML.g:374:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getClassAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSmallUML.g:378:5: ( ( ruleEString ) )
                    	    // InternalSmallUML.g:379:6: ( ruleEString )
                    	    {
                    	    // InternalSmallUML.g:379:6: ( ruleEString )
                    	    // InternalSmallUML.g:380:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getClassAccess().getParentsClassCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getClassAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:400:3: (otherlv_10= 'attributes' otherlv_11= '{' ( (lv_attributes_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_attributes_14_0= ruleAttribute ) ) )* otherlv_15= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmallUML.g:401:4: otherlv_10= 'attributes' otherlv_11= '{' ( (lv_attributes_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_attributes_14_0= ruleAttribute ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getClassAccess().getAttributesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSmallUML.g:409:4: ( (lv_attributes_12_0= ruleAttribute ) )
                    // InternalSmallUML.g:410:5: (lv_attributes_12_0= ruleAttribute )
                    {
                    // InternalSmallUML.g:410:5: (lv_attributes_12_0= ruleAttribute )
                    // InternalSmallUML.g:411:6: lv_attributes_12_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_attributes_12_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_12_0,
                    							"org.smalluml.SmallUML.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:428:4: (otherlv_13= ',' ( (lv_attributes_14_0= ruleAttribute ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSmallUML.g:429:5: otherlv_13= ',' ( (lv_attributes_14_0= ruleAttribute ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSmallUML.g:433:5: ( (lv_attributes_14_0= ruleAttribute ) )
                    	    // InternalSmallUML.g:434:6: (lv_attributes_14_0= ruleAttribute )
                    	    {
                    	    // InternalSmallUML.g:434:6: (lv_attributes_14_0= ruleAttribute )
                    	    // InternalSmallUML.g:435:7: lv_attributes_14_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_attributes_14_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_14_0,
                    	    								"org.smalluml.SmallUML.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_15, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:458:3: (otherlv_16= 'methods' otherlv_17= '{' ( (lv_methods_18_0= ruleMethod ) ) (otherlv_19= ',' ( (lv_methods_20_0= ruleMethod ) ) )* otherlv_21= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmallUML.g:459:4: otherlv_16= 'methods' otherlv_17= '{' ( (lv_methods_18_0= ruleMethod ) ) (otherlv_19= ',' ( (lv_methods_20_0= ruleMethod ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getClassAccess().getMethodsKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalSmallUML.g:467:4: ( (lv_methods_18_0= ruleMethod ) )
                    // InternalSmallUML.g:468:5: (lv_methods_18_0= ruleMethod )
                    {
                    // InternalSmallUML.g:468:5: (lv_methods_18_0= ruleMethod )
                    // InternalSmallUML.g:469:6: lv_methods_18_0= ruleMethod
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_methods_18_0=ruleMethod();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"methods",
                    							lv_methods_18_0,
                    							"org.smalluml.SmallUML.Method");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:486:4: (otherlv_19= ',' ( (lv_methods_20_0= ruleMethod ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSmallUML.g:487:5: otherlv_19= ',' ( (lv_methods_20_0= ruleMethod ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSmallUML.g:491:5: ( (lv_methods_20_0= ruleMethod ) )
                    	    // InternalSmallUML.g:492:6: (lv_methods_20_0= ruleMethod )
                    	    {
                    	    // InternalSmallUML.g:492:6: (lv_methods_20_0= ruleMethod )
                    	    // InternalSmallUML.g:493:7: lv_methods_20_0= ruleMethod
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_methods_20_0=ruleMethod();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"methods",
                    	    								lv_methods_20_0,
                    	    								"org.smalluml.SmallUML.Method");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_21, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalSmallUML.g:524:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalSmallUML.g:524:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalSmallUML.g:525:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalSmallUML.g:531:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'Relation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) otherlv_7= 'cardinality' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= '}' ) ;
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
            // InternalSmallUML.g:537:2: ( (otherlv_0= 'Relation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) otherlv_7= 'cardinality' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= '}' ) )
            // InternalSmallUML.g:538:2: (otherlv_0= 'Relation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) otherlv_7= 'cardinality' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= '}' )
            {
            // InternalSmallUML.g:538:2: (otherlv_0= 'Relation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) otherlv_7= 'cardinality' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= '}' )
            // InternalSmallUML.g:539:3: otherlv_0= 'Relation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) otherlv_7= 'cardinality' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            // InternalSmallUML.g:543:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:544:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:544:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:545:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getFromKeyword_3());
            		
            // InternalSmallUML.g:570:3: ( ( ruleEString ) )
            // InternalSmallUML.g:571:4: ( ruleEString )
            {
            // InternalSmallUML.g:571:4: ( ruleEString )
            // InternalSmallUML.g:572:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRelationAccess().getFromClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getToKeyword_5());
            		
            // InternalSmallUML.g:590:3: ( ( ruleEString ) )
            // InternalSmallUML.g:591:4: ( ruleEString )
            {
            // InternalSmallUML.g:591:4: ( ruleEString )
            // InternalSmallUML.g:592:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRelationAccess().getToClassCrossReference_6_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getCardinalityKeyword_7());
            		
            // InternalSmallUML.g:610:3: ( (lv_cardinality_8_0= ruleCardinality ) )
            // InternalSmallUML.g:611:4: (lv_cardinality_8_0= ruleCardinality )
            {
            // InternalSmallUML.g:611:4: (lv_cardinality_8_0= ruleCardinality )
            // InternalSmallUML.g:612:5: lv_cardinality_8_0= ruleCardinality
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
    // InternalSmallUML.g:637:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmallUML.g:637:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmallUML.g:638:2: iv_ruleEString= ruleEString EOF
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
    // InternalSmallUML.g:644:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:650:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmallUML.g:651:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmallUML.g:651:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSmallUML.g:652:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:660:3: this_ID_1= RULE_ID
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
    // InternalSmallUML.g:671:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSmallUML.g:671:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSmallUML.g:672:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalSmallUML.g:678:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'typedValue' ( (lv_typedValue_4_0= ruleType ) ) otherlv_5= '}' ) ;
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
            // InternalSmallUML.g:684:2: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'typedValue' ( (lv_typedValue_4_0= ruleType ) ) otherlv_5= '}' ) )
            // InternalSmallUML.g:685:2: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'typedValue' ( (lv_typedValue_4_0= ruleType ) ) otherlv_5= '}' )
            {
            // InternalSmallUML.g:685:2: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'typedValue' ( (lv_typedValue_4_0= ruleType ) ) otherlv_5= '}' )
            // InternalSmallUML.g:686:3: otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'typedValue' ( (lv_typedValue_4_0= ruleType ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalSmallUML.g:690:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:691:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:691:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:692:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getTypedValueKeyword_3());
            		
            // InternalSmallUML.g:717:3: ( (lv_typedValue_4_0= ruleType ) )
            // InternalSmallUML.g:718:4: (lv_typedValue_4_0= ruleType )
            {
            // InternalSmallUML.g:718:4: (lv_typedValue_4_0= ruleType )
            // InternalSmallUML.g:719:5: lv_typedValue_4_0= ruleType
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
    // InternalSmallUML.g:744:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalSmallUML.g:744:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalSmallUML.g:745:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalSmallUML.g:751:1: ruleMethod returns [EObject current=null] : ( () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnTypedValue' ( (lv_returnTypedValue_5_0= ruleType ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalSmallUML.g:757:2: ( ( () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnTypedValue' ( (lv_returnTypedValue_5_0= ruleType ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalSmallUML.g:758:2: ( () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnTypedValue' ( (lv_returnTypedValue_5_0= ruleType ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalSmallUML.g:758:2: ( () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnTypedValue' ( (lv_returnTypedValue_5_0= ruleType ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalSmallUML.g:759:3: () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnTypedValue' ( (lv_returnTypedValue_5_0= ruleType ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalSmallUML.g:759:3: ()
            // InternalSmallUML.g:760:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodAccess().getMethodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getMethodKeyword_1());
            		
            // InternalSmallUML.g:770:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:771:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:771:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:772:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:793:3: (otherlv_4= 'returnTypedValue' ( (lv_returnTypedValue_5_0= ruleType ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSmallUML.g:794:4: otherlv_4= 'returnTypedValue' ( (lv_returnTypedValue_5_0= ruleType ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getReturnTypedValueKeyword_4_0());
                    			
                    // InternalSmallUML.g:798:4: ( (lv_returnTypedValue_5_0= ruleType ) )
                    // InternalSmallUML.g:799:5: (lv_returnTypedValue_5_0= ruleType )
                    {
                    // InternalSmallUML.g:799:5: (lv_returnTypedValue_5_0= ruleType )
                    // InternalSmallUML.g:800:6: lv_returnTypedValue_5_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getReturnTypedValueTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_25);
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

            // InternalSmallUML.g:818:3: (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleAttribute ) ) )* otherlv_11= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSmallUML.g:819:4: otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleAttribute ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getParametersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSmallUML.g:827:4: ( (lv_parameters_8_0= ruleAttribute ) )
                    // InternalSmallUML.g:828:5: (lv_parameters_8_0= ruleAttribute )
                    {
                    // InternalSmallUML.g:828:5: (lv_parameters_8_0= ruleAttribute )
                    // InternalSmallUML.g:829:6: lv_parameters_8_0= ruleAttribute
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

                    // InternalSmallUML.g:846:4: (otherlv_9= ',' ( (lv_parameters_10_0= ruleAttribute ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSmallUML.g:847:5: otherlv_9= ',' ( (lv_parameters_10_0= ruleAttribute ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSmallUML.g:851:5: ( (lv_parameters_10_0= ruleAttribute ) )
                    	    // InternalSmallUML.g:852:6: (lv_parameters_10_0= ruleAttribute )
                    	    {
                    	    // InternalSmallUML.g:852:6: (lv_parameters_10_0= ruleAttribute )
                    	    // InternalSmallUML.g:853:7: lv_parameters_10_0= ruleAttribute
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
                    	    break loop14;
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
    // InternalSmallUML.g:884:1: entryRuleType_Impl returns [EObject current=null] : iv_ruleType_Impl= ruleType_Impl EOF ;
    public final EObject entryRuleType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_Impl = null;


        try {
            // InternalSmallUML.g:884:50: (iv_ruleType_Impl= ruleType_Impl EOF )
            // InternalSmallUML.g:885:2: iv_ruleType_Impl= ruleType_Impl EOF
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
    // InternalSmallUML.g:891:1: ruleType_Impl returns [EObject current=null] : ( () otherlv_1= 'Type' ) ;
    public final EObject ruleType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:897:2: ( ( () otherlv_1= 'Type' ) )
            // InternalSmallUML.g:898:2: ( () otherlv_1= 'Type' )
            {
            // InternalSmallUML.g:898:2: ( () otherlv_1= 'Type' )
            // InternalSmallUML.g:899:3: () otherlv_1= 'Type'
            {
            // InternalSmallUML.g:899:3: ()
            // InternalSmallUML.g:900:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getType_ImplAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

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
    // InternalSmallUML.g:914:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalSmallUML.g:914:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalSmallUML.g:915:2: iv_ruleBoolean= ruleBoolean EOF
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
    // InternalSmallUML.g:921:1: ruleBoolean returns [EObject current=null] : ( () otherlv_1= 'Boolean' ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:927:2: ( ( () otherlv_1= 'Boolean' ) )
            // InternalSmallUML.g:928:2: ( () otherlv_1= 'Boolean' )
            {
            // InternalSmallUML.g:928:2: ( () otherlv_1= 'Boolean' )
            // InternalSmallUML.g:929:3: () otherlv_1= 'Boolean'
            {
            // InternalSmallUML.g:929:3: ()
            // InternalSmallUML.g:930:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanAccess().getBooleanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_2); 

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
    // InternalSmallUML.g:944:1: entryRuleReal returns [EObject current=null] : iv_ruleReal= ruleReal EOF ;
    public final EObject entryRuleReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReal = null;


        try {
            // InternalSmallUML.g:944:45: (iv_ruleReal= ruleReal EOF )
            // InternalSmallUML.g:945:2: iv_ruleReal= ruleReal EOF
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
    // InternalSmallUML.g:951:1: ruleReal returns [EObject current=null] : ( () otherlv_1= 'Real' ) ;
    public final EObject ruleReal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:957:2: ( ( () otherlv_1= 'Real' ) )
            // InternalSmallUML.g:958:2: ( () otherlv_1= 'Real' )
            {
            // InternalSmallUML.g:958:2: ( () otherlv_1= 'Real' )
            // InternalSmallUML.g:959:3: () otherlv_1= 'Real'
            {
            // InternalSmallUML.g:959:3: ()
            // InternalSmallUML.g:960:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealAccess().getRealAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_2); 

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
    // InternalSmallUML.g:974:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // InternalSmallUML.g:974:48: (iv_ruleInteger= ruleInteger EOF )
            // InternalSmallUML.g:975:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalSmallUML.g:981:1: ruleInteger returns [EObject current=null] : ( () otherlv_1= 'Integer' ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:987:2: ( ( () otherlv_1= 'Integer' ) )
            // InternalSmallUML.g:988:2: ( () otherlv_1= 'Integer' )
            {
            // InternalSmallUML.g:988:2: ( () otherlv_1= 'Integer' )
            // InternalSmallUML.g:989:3: () otherlv_1= 'Integer'
            {
            // InternalSmallUML.g:989:3: ()
            // InternalSmallUML.g:990:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerAccess().getIntegerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); 

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
    // InternalSmallUML.g:1004:1: entryRuleString0 returns [EObject current=null] : iv_ruleString0= ruleString0 EOF ;
    public final EObject entryRuleString0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString0 = null;


        try {
            // InternalSmallUML.g:1004:48: (iv_ruleString0= ruleString0 EOF )
            // InternalSmallUML.g:1005:2: iv_ruleString0= ruleString0 EOF
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
    // InternalSmallUML.g:1011:1: ruleString0 returns [EObject current=null] : ( () otherlv_1= 'String' ) ;
    public final EObject ruleString0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:1017:2: ( ( () otherlv_1= 'String' ) )
            // InternalSmallUML.g:1018:2: ( () otherlv_1= 'String' )
            {
            // InternalSmallUML.g:1018:2: ( () otherlv_1= 'String' )
            // InternalSmallUML.g:1019:3: () otherlv_1= 'String'
            {
            // InternalSmallUML.g:1019:3: ()
            // InternalSmallUML.g:1020:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0Access().getStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

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


    // $ANTLR start "entryRuleInfinity"
    // InternalSmallUML.g:1034:1: entryRuleInfinity returns [EObject current=null] : iv_ruleInfinity= ruleInfinity EOF ;
    public final EObject entryRuleInfinity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfinity = null;


        try {
            // InternalSmallUML.g:1034:49: (iv_ruleInfinity= ruleInfinity EOF )
            // InternalSmallUML.g:1035:2: iv_ruleInfinity= ruleInfinity EOF
            {
             newCompositeNode(grammarAccess.getInfinityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfinity=ruleInfinity();

            state._fsp--;

             current =iv_ruleInfinity; 
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
    // $ANTLR end "entryRuleInfinity"


    // $ANTLR start "ruleInfinity"
    // InternalSmallUML.g:1041:1: ruleInfinity returns [EObject current=null] : ( () otherlv_1= 'Infinity' ) ;
    public final EObject ruleInfinity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:1047:2: ( ( () otherlv_1= 'Infinity' ) )
            // InternalSmallUML.g:1048:2: ( () otherlv_1= 'Infinity' )
            {
            // InternalSmallUML.g:1048:2: ( () otherlv_1= 'Infinity' )
            // InternalSmallUML.g:1049:3: () otherlv_1= 'Infinity'
            {
            // InternalSmallUML.g:1049:3: ()
            // InternalSmallUML.g:1050:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInfinityAccess().getInfinityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInfinityAccess().getInfinityKeyword_1());
            		

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
    // $ANTLR end "ruleInfinity"


    // $ANTLR start "entryRuleEnumeration"
    // InternalSmallUML.g:1064:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalSmallUML.g:1064:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalSmallUML.g:1065:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalSmallUML.g:1071:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'Enumeration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
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
            // InternalSmallUML.g:1077:2: ( (otherlv_0= 'Enumeration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalSmallUML.g:1078:2: (otherlv_0= 'Enumeration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalSmallUML.g:1078:2: (otherlv_0= 'Enumeration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalSmallUML.g:1079:3: otherlv_0= 'Enumeration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
            		
            // InternalSmallUML.g:1083:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:1084:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:1084:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:1085:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getValueKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSmallUML.g:1114:3: ( (lv_value_5_0= ruleString0 ) )
            // InternalSmallUML.g:1115:4: (lv_value_5_0= ruleString0 )
            {
            // InternalSmallUML.g:1115:4: (lv_value_5_0= ruleString0 )
            // InternalSmallUML.g:1116:5: lv_value_5_0= ruleString0
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

            // InternalSmallUML.g:1133:3: (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==14) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSmallUML.g:1134:4: otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_27); 

            	    				newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalSmallUML.g:1138:4: ( (lv_value_7_0= ruleString0 ) )
            	    // InternalSmallUML.g:1139:5: (lv_value_7_0= ruleString0 )
            	    {
            	    // InternalSmallUML.g:1139:5: (lv_value_7_0= ruleString0 )
            	    // InternalSmallUML.g:1140:6: lv_value_7_0= ruleString0
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
            	    break loop16;
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
    // InternalSmallUML.g:1170:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalSmallUML.g:1170:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalSmallUML.g:1171:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalSmallUML.g:1177:1: ruleCardinality returns [EObject current=null] : (otherlv_0= 'Cardinality' otherlv_1= '{' otherlv_2= 'lowerBound' ( (lv_lowerBound_3_0= ruleEInt ) ) otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) otherlv_6= '}' ) ;
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
            // InternalSmallUML.g:1183:2: ( (otherlv_0= 'Cardinality' otherlv_1= '{' otherlv_2= 'lowerBound' ( (lv_lowerBound_3_0= ruleEInt ) ) otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) otherlv_6= '}' ) )
            // InternalSmallUML.g:1184:2: (otherlv_0= 'Cardinality' otherlv_1= '{' otherlv_2= 'lowerBound' ( (lv_lowerBound_3_0= ruleEInt ) ) otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) otherlv_6= '}' )
            {
            // InternalSmallUML.g:1184:2: (otherlv_0= 'Cardinality' otherlv_1= '{' otherlv_2= 'lowerBound' ( (lv_lowerBound_3_0= ruleEInt ) ) otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) otherlv_6= '}' )
            // InternalSmallUML.g:1185:3: otherlv_0= 'Cardinality' otherlv_1= '{' otherlv_2= 'lowerBound' ( (lv_lowerBound_3_0= ruleEInt ) ) otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCardinalityAccess().getCardinalityKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getCardinalityAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getCardinalityAccess().getLowerBoundKeyword_2());
            		
            // InternalSmallUML.g:1197:3: ( (lv_lowerBound_3_0= ruleEInt ) )
            // InternalSmallUML.g:1198:4: (lv_lowerBound_3_0= ruleEInt )
            {
            // InternalSmallUML.g:1198:4: (lv_lowerBound_3_0= ruleEInt )
            // InternalSmallUML.g:1199:5: lv_lowerBound_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getLowerBoundEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_4=(Token)match(input,42,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getCardinalityAccess().getUpperBoundKeyword_4());
            		
            // InternalSmallUML.g:1220:3: ( (lv_upperBound_5_0= ruleEInt ) )
            // InternalSmallUML.g:1221:4: (lv_upperBound_5_0= ruleEInt )
            {
            // InternalSmallUML.g:1221:4: (lv_upperBound_5_0= ruleEInt )
            // InternalSmallUML.g:1222:5: lv_upperBound_5_0= ruleEInt
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
    // InternalSmallUML.g:1247:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSmallUML.g:1247:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSmallUML.g:1248:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSmallUML.g:1254:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:1260:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSmallUML.g:1261:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSmallUML.g:1261:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSmallUML.g:1262:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSmallUML.g:1262:3: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSmallUML.g:1263:4: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_31); 

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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000648000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000608000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000007F00000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000C0008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});

}