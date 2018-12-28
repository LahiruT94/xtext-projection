package com.ifs.lang.projection.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.ifs.lang.projection.services.ProjectionLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProjectionLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'projection'", "';'", "'component'", "'layer'", "'description'", "'category'", "'entityset'", "'for'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalProjectionLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProjectionLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProjectionLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalProjectionLang.g"; }



     	private ProjectionLangGrammarAccess grammarAccess;

        public InternalProjectionLangParser(TokenStream input, ProjectionLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ProjectionLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalProjectionLang.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalProjectionLang.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalProjectionLang.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalProjectionLang.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalProjectionLang.g:77:2: ( ( (lv_elements_0_0= ruleType ) )* )
            // InternalProjectionLang.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            {
            // InternalProjectionLang.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalProjectionLang.g:79:3: (lv_elements_0_0= ruleType )
            	    {
            	    // InternalProjectionLang.g:79:3: (lv_elements_0_0= ruleType )
            	    // InternalProjectionLang.g:80:4: lv_elements_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"com.ifs.lang.projection.ProjectionLang.Type");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleType"
    // InternalProjectionLang.g:100:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalProjectionLang.g:100:45: (iv_ruleType= ruleType EOF )
            // InternalProjectionLang.g:101:2: iv_ruleType= ruleType EOF
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
    // InternalProjectionLang.g:107:1: ruleType returns [EObject current=null] : (this_Projection_0= ruleProjection | this_Component_1= ruleComponent | this_Layer_2= ruleLayer | this_Description_3= ruleDescription | this_Category_4= ruleCategory | this_Entityset_5= ruleEntityset ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Projection_0 = null;

        EObject this_Component_1 = null;

        EObject this_Layer_2 = null;

        EObject this_Description_3 = null;

        EObject this_Category_4 = null;

        EObject this_Entityset_5 = null;



        	enterRule();

        try {
            // InternalProjectionLang.g:113:2: ( (this_Projection_0= ruleProjection | this_Component_1= ruleComponent | this_Layer_2= ruleLayer | this_Description_3= ruleDescription | this_Category_4= ruleCategory | this_Entityset_5= ruleEntityset ) )
            // InternalProjectionLang.g:114:2: (this_Projection_0= ruleProjection | this_Component_1= ruleComponent | this_Layer_2= ruleLayer | this_Description_3= ruleDescription | this_Category_4= ruleCategory | this_Entityset_5= ruleEntityset )
            {
            // InternalProjectionLang.g:114:2: (this_Projection_0= ruleProjection | this_Component_1= ruleComponent | this_Layer_2= ruleLayer | this_Description_3= ruleDescription | this_Category_4= ruleCategory | this_Entityset_5= ruleEntityset )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            case 17:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalProjectionLang.g:115:3: this_Projection_0= ruleProjection
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getProjectionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Projection_0=ruleProjection();

                    state._fsp--;


                    			current = this_Projection_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProjectionLang.g:124:3: this_Component_1= ruleComponent
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Component_1=ruleComponent();

                    state._fsp--;


                    			current = this_Component_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalProjectionLang.g:133:3: this_Layer_2= ruleLayer
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getLayerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Layer_2=ruleLayer();

                    state._fsp--;


                    			current = this_Layer_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalProjectionLang.g:142:3: this_Description_3= ruleDescription
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDescriptionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Description_3=ruleDescription();

                    state._fsp--;


                    			current = this_Description_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalProjectionLang.g:151:3: this_Category_4= ruleCategory
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getCategoryParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Category_4=ruleCategory();

                    state._fsp--;


                    			current = this_Category_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalProjectionLang.g:160:3: this_Entityset_5= ruleEntityset
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEntitysetParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entityset_5=ruleEntityset();

                    state._fsp--;


                    			current = this_Entityset_5;
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


    // $ANTLR start "entryRuleProjection"
    // InternalProjectionLang.g:172:1: entryRuleProjection returns [EObject current=null] : iv_ruleProjection= ruleProjection EOF ;
    public final EObject entryRuleProjection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjection = null;


        try {
            // InternalProjectionLang.g:172:51: (iv_ruleProjection= ruleProjection EOF )
            // InternalProjectionLang.g:173:2: iv_ruleProjection= ruleProjection EOF
            {
             newCompositeNode(grammarAccess.getProjectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjection=ruleProjection();

            state._fsp--;

             current =iv_ruleProjection; 
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
    // $ANTLR end "entryRuleProjection"


    // $ANTLR start "ruleProjection"
    // InternalProjectionLang.g:179:1: ruleProjection returns [EObject current=null] : (otherlv_0= 'projection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleProjection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalProjectionLang.g:185:2: ( (otherlv_0= 'projection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalProjectionLang.g:186:2: (otherlv_0= 'projection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalProjectionLang.g:186:2: (otherlv_0= 'projection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalProjectionLang.g:187:3: otherlv_0= 'projection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectionAccess().getProjectionKeyword_0());
            		
            // InternalProjectionLang.g:191:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProjectionLang.g:192:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProjectionLang.g:192:4: (lv_name_1_0= RULE_ID )
            // InternalProjectionLang.g:193:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProjectionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectionAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleProjection"


    // $ANTLR start "entryRuleComponent"
    // InternalProjectionLang.g:217:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalProjectionLang.g:217:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalProjectionLang.g:218:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalProjectionLang.g:224:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalProjectionLang.g:230:2: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalProjectionLang.g:231:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalProjectionLang.g:231:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalProjectionLang.g:232:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalProjectionLang.g:236:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProjectionLang.g:237:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProjectionLang.g:237:4: (lv_name_1_0= RULE_ID )
            // InternalProjectionLang.g:238:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleLayer"
    // InternalProjectionLang.g:262:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalProjectionLang.g:262:46: (iv_ruleLayer= ruleLayer EOF )
            // InternalProjectionLang.g:263:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
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
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalProjectionLang.g:269:1: ruleLayer returns [EObject current=null] : (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalProjectionLang.g:275:2: ( (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalProjectionLang.g:276:2: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalProjectionLang.g:276:2: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalProjectionLang.g:277:3: otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLayerAccess().getLayerKeyword_0());
            		
            // InternalProjectionLang.g:281:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProjectionLang.g:282:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProjectionLang.g:282:4: (lv_name_1_0= RULE_ID )
            // InternalProjectionLang.g:283:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLayerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLayerAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleDescription"
    // InternalProjectionLang.g:307:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalProjectionLang.g:307:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalProjectionLang.g:308:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalProjectionLang.g:314:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'description' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalProjectionLang.g:320:2: ( (otherlv_0= 'description' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalProjectionLang.g:321:2: (otherlv_0= 'description' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalProjectionLang.g:321:2: (otherlv_0= 'description' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalProjectionLang.g:322:3: otherlv_0= 'description' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            // InternalProjectionLang.g:326:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProjectionLang.g:327:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProjectionLang.g:327:4: (lv_name_1_0= RULE_STRING )
            // InternalProjectionLang.g:328:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDescriptionAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleCategory"
    // InternalProjectionLang.g:352:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // InternalProjectionLang.g:352:49: (iv_ruleCategory= ruleCategory EOF )
            // InternalProjectionLang.g:353:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
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
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // InternalProjectionLang.g:359:1: ruleCategory returns [EObject current=null] : (otherlv_0= 'category' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalProjectionLang.g:365:2: ( (otherlv_0= 'category' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalProjectionLang.g:366:2: (otherlv_0= 'category' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalProjectionLang.g:366:2: (otherlv_0= 'category' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalProjectionLang.g:367:3: otherlv_0= 'category' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCategoryAccess().getCategoryKeyword_0());
            		
            // InternalProjectionLang.g:371:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProjectionLang.g:372:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProjectionLang.g:372:4: (lv_name_1_0= RULE_ID )
            // InternalProjectionLang.g:373:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCategoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCategoryAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleEntityset"
    // InternalProjectionLang.g:397:1: entryRuleEntityset returns [EObject current=null] : iv_ruleEntityset= ruleEntityset EOF ;
    public final EObject entryRuleEntityset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityset = null;


        try {
            // InternalProjectionLang.g:397:50: (iv_ruleEntityset= ruleEntityset EOF )
            // InternalProjectionLang.g:398:2: iv_ruleEntityset= ruleEntityset EOF
            {
             newCompositeNode(grammarAccess.getEntitysetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityset=ruleEntityset();

            state._fsp--;

             current =iv_ruleEntityset; 
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
    // $ANTLR end "entryRuleEntityset"


    // $ANTLR start "ruleEntityset"
    // InternalProjectionLang.g:404:1: ruleEntityset returns [EObject current=null] : (otherlv_0= 'entityset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_entity_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleEntityset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_entity_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalProjectionLang.g:410:2: ( (otherlv_0= 'entityset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_entity_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalProjectionLang.g:411:2: (otherlv_0= 'entityset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_entity_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalProjectionLang.g:411:2: (otherlv_0= 'entityset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_entity_3_0= RULE_ID ) ) otherlv_4= ';' )
            // InternalProjectionLang.g:412:3: otherlv_0= 'entityset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_entity_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntitysetAccess().getEntitysetKeyword_0());
            		
            // InternalProjectionLang.g:416:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProjectionLang.g:417:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProjectionLang.g:417:4: (lv_name_1_0= RULE_ID )
            // InternalProjectionLang.g:418:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntitysetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntitysetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEntitysetAccess().getForKeyword_2());
            		
            // InternalProjectionLang.g:438:3: ( (lv_entity_3_0= RULE_ID ) )
            // InternalProjectionLang.g:439:4: (lv_entity_3_0= RULE_ID )
            {
            // InternalProjectionLang.g:439:4: (lv_entity_3_0= RULE_ID )
            // InternalProjectionLang.g:440:5: lv_entity_3_0= RULE_ID
            {
            lv_entity_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_entity_3_0, grammarAccess.getEntitysetAccess().getEntityIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntitysetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity",
            						lv_entity_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntitysetAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleEntityset"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000003E802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});

}