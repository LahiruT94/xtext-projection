package com.ifs.lang.projection.ide.contentassist.antlr.internal;

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
import com.ifs.lang.projection.services.ProjectionLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProjectionLangParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(ProjectionLangGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalProjectionLang.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalProjectionLang.g:54:1: ( ruleModel EOF )
            // InternalProjectionLang.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalProjectionLang.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalProjectionLang.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalProjectionLang.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalProjectionLang.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalProjectionLang.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalProjectionLang.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleType"
    // InternalProjectionLang.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalProjectionLang.g:79:1: ( ruleType EOF )
            // InternalProjectionLang.g:80:1: ruleType EOF
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
    // InternalProjectionLang.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalProjectionLang.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalProjectionLang.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalProjectionLang.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalProjectionLang.g:94:3: ( rule__Type__Alternatives )
            // InternalProjectionLang.g:94:4: rule__Type__Alternatives
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


    // $ANTLR start "entryRuleProjection"
    // InternalProjectionLang.g:103:1: entryRuleProjection : ruleProjection EOF ;
    public final void entryRuleProjection() throws RecognitionException {
        try {
            // InternalProjectionLang.g:104:1: ( ruleProjection EOF )
            // InternalProjectionLang.g:105:1: ruleProjection EOF
            {
             before(grammarAccess.getProjectionRule()); 
            pushFollow(FOLLOW_1);
            ruleProjection();

            state._fsp--;

             after(grammarAccess.getProjectionRule()); 
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
    // $ANTLR end "entryRuleProjection"


    // $ANTLR start "ruleProjection"
    // InternalProjectionLang.g:112:1: ruleProjection : ( ( rule__Projection__Group__0 ) ) ;
    public final void ruleProjection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:116:2: ( ( ( rule__Projection__Group__0 ) ) )
            // InternalProjectionLang.g:117:2: ( ( rule__Projection__Group__0 ) )
            {
            // InternalProjectionLang.g:117:2: ( ( rule__Projection__Group__0 ) )
            // InternalProjectionLang.g:118:3: ( rule__Projection__Group__0 )
            {
             before(grammarAccess.getProjectionAccess().getGroup()); 
            // InternalProjectionLang.g:119:3: ( rule__Projection__Group__0 )
            // InternalProjectionLang.g:119:4: rule__Projection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Projection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProjection"


    // $ANTLR start "entryRuleComponent"
    // InternalProjectionLang.g:128:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalProjectionLang.g:129:1: ( ruleComponent EOF )
            // InternalProjectionLang.g:130:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalProjectionLang.g:137:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:141:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalProjectionLang.g:142:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalProjectionLang.g:142:2: ( ( rule__Component__Group__0 ) )
            // InternalProjectionLang.g:143:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalProjectionLang.g:144:3: ( rule__Component__Group__0 )
            // InternalProjectionLang.g:144:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleLayer"
    // InternalProjectionLang.g:153:1: entryRuleLayer : ruleLayer EOF ;
    public final void entryRuleLayer() throws RecognitionException {
        try {
            // InternalProjectionLang.g:154:1: ( ruleLayer EOF )
            // InternalProjectionLang.g:155:1: ruleLayer EOF
            {
             before(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getLayerRule()); 
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
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalProjectionLang.g:162:1: ruleLayer : ( ( rule__Layer__Group__0 ) ) ;
    public final void ruleLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:166:2: ( ( ( rule__Layer__Group__0 ) ) )
            // InternalProjectionLang.g:167:2: ( ( rule__Layer__Group__0 ) )
            {
            // InternalProjectionLang.g:167:2: ( ( rule__Layer__Group__0 ) )
            // InternalProjectionLang.g:168:3: ( rule__Layer__Group__0 )
            {
             before(grammarAccess.getLayerAccess().getGroup()); 
            // InternalProjectionLang.g:169:3: ( rule__Layer__Group__0 )
            // InternalProjectionLang.g:169:4: rule__Layer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleDescription"
    // InternalProjectionLang.g:178:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalProjectionLang.g:179:1: ( ruleDescription EOF )
            // InternalProjectionLang.g:180:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalProjectionLang.g:187:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:191:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalProjectionLang.g:192:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalProjectionLang.g:192:2: ( ( rule__Description__Group__0 ) )
            // InternalProjectionLang.g:193:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalProjectionLang.g:194:3: ( rule__Description__Group__0 )
            // InternalProjectionLang.g:194:4: rule__Description__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleCategory"
    // InternalProjectionLang.g:203:1: entryRuleCategory : ruleCategory EOF ;
    public final void entryRuleCategory() throws RecognitionException {
        try {
            // InternalProjectionLang.g:204:1: ( ruleCategory EOF )
            // InternalProjectionLang.g:205:1: ruleCategory EOF
            {
             before(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_1);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getCategoryRule()); 
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
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // InternalProjectionLang.g:212:1: ruleCategory : ( ( rule__Category__Group__0 ) ) ;
    public final void ruleCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:216:2: ( ( ( rule__Category__Group__0 ) ) )
            // InternalProjectionLang.g:217:2: ( ( rule__Category__Group__0 ) )
            {
            // InternalProjectionLang.g:217:2: ( ( rule__Category__Group__0 ) )
            // InternalProjectionLang.g:218:3: ( rule__Category__Group__0 )
            {
             before(grammarAccess.getCategoryAccess().getGroup()); 
            // InternalProjectionLang.g:219:3: ( rule__Category__Group__0 )
            // InternalProjectionLang.g:219:4: rule__Category__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleEntityset"
    // InternalProjectionLang.g:228:1: entryRuleEntityset : ruleEntityset EOF ;
    public final void entryRuleEntityset() throws RecognitionException {
        try {
            // InternalProjectionLang.g:229:1: ( ruleEntityset EOF )
            // InternalProjectionLang.g:230:1: ruleEntityset EOF
            {
             before(grammarAccess.getEntitysetRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityset();

            state._fsp--;

             after(grammarAccess.getEntitysetRule()); 
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
    // $ANTLR end "entryRuleEntityset"


    // $ANTLR start "ruleEntityset"
    // InternalProjectionLang.g:237:1: ruleEntityset : ( ( rule__Entityset__Group__0 ) ) ;
    public final void ruleEntityset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:241:2: ( ( ( rule__Entityset__Group__0 ) ) )
            // InternalProjectionLang.g:242:2: ( ( rule__Entityset__Group__0 ) )
            {
            // InternalProjectionLang.g:242:2: ( ( rule__Entityset__Group__0 ) )
            // InternalProjectionLang.g:243:3: ( rule__Entityset__Group__0 )
            {
             before(grammarAccess.getEntitysetAccess().getGroup()); 
            // InternalProjectionLang.g:244:3: ( rule__Entityset__Group__0 )
            // InternalProjectionLang.g:244:4: rule__Entityset__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entityset__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntitysetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityset"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalProjectionLang.g:252:1: rule__Type__Alternatives : ( ( ruleProjection ) | ( ruleComponent ) | ( ruleLayer ) | ( ruleDescription ) | ( ruleCategory ) | ( ruleEntityset ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:256:1: ( ( ruleProjection ) | ( ruleComponent ) | ( ruleLayer ) | ( ruleDescription ) | ( ruleCategory ) | ( ruleEntityset ) )
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
                    // InternalProjectionLang.g:257:2: ( ruleProjection )
                    {
                    // InternalProjectionLang.g:257:2: ( ruleProjection )
                    // InternalProjectionLang.g:258:3: ruleProjection
                    {
                     before(grammarAccess.getTypeAccess().getProjectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleProjection();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getProjectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectionLang.g:263:2: ( ruleComponent )
                    {
                    // InternalProjectionLang.g:263:2: ( ruleComponent )
                    // InternalProjectionLang.g:264:3: ruleComponent
                    {
                     before(grammarAccess.getTypeAccess().getComponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getComponentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProjectionLang.g:269:2: ( ruleLayer )
                    {
                    // InternalProjectionLang.g:269:2: ( ruleLayer )
                    // InternalProjectionLang.g:270:3: ruleLayer
                    {
                     before(grammarAccess.getTypeAccess().getLayerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLayer();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getLayerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProjectionLang.g:275:2: ( ruleDescription )
                    {
                    // InternalProjectionLang.g:275:2: ( ruleDescription )
                    // InternalProjectionLang.g:276:3: ruleDescription
                    {
                     before(grammarAccess.getTypeAccess().getDescriptionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDescription();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDescriptionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProjectionLang.g:281:2: ( ruleCategory )
                    {
                    // InternalProjectionLang.g:281:2: ( ruleCategory )
                    // InternalProjectionLang.g:282:3: ruleCategory
                    {
                     before(grammarAccess.getTypeAccess().getCategoryParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCategory();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getCategoryParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalProjectionLang.g:287:2: ( ruleEntityset )
                    {
                    // InternalProjectionLang.g:287:2: ( ruleEntityset )
                    // InternalProjectionLang.g:288:3: ruleEntityset
                    {
                     before(grammarAccess.getTypeAccess().getEntitysetParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleEntityset();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntitysetParserRuleCall_5()); 

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


    // $ANTLR start "rule__Projection__Group__0"
    // InternalProjectionLang.g:297:1: rule__Projection__Group__0 : rule__Projection__Group__0__Impl rule__Projection__Group__1 ;
    public final void rule__Projection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:301:1: ( rule__Projection__Group__0__Impl rule__Projection__Group__1 )
            // InternalProjectionLang.g:302:2: rule__Projection__Group__0__Impl rule__Projection__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Projection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projection__Group__1();

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
    // $ANTLR end "rule__Projection__Group__0"


    // $ANTLR start "rule__Projection__Group__0__Impl"
    // InternalProjectionLang.g:309:1: rule__Projection__Group__0__Impl : ( 'projection' ) ;
    public final void rule__Projection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:313:1: ( ( 'projection' ) )
            // InternalProjectionLang.g:314:1: ( 'projection' )
            {
            // InternalProjectionLang.g:314:1: ( 'projection' )
            // InternalProjectionLang.g:315:2: 'projection'
            {
             before(grammarAccess.getProjectionAccess().getProjectionKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getProjectionAccess().getProjectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__0__Impl"


    // $ANTLR start "rule__Projection__Group__1"
    // InternalProjectionLang.g:324:1: rule__Projection__Group__1 : rule__Projection__Group__1__Impl rule__Projection__Group__2 ;
    public final void rule__Projection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:328:1: ( rule__Projection__Group__1__Impl rule__Projection__Group__2 )
            // InternalProjectionLang.g:329:2: rule__Projection__Group__1__Impl rule__Projection__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Projection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projection__Group__2();

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
    // $ANTLR end "rule__Projection__Group__1"


    // $ANTLR start "rule__Projection__Group__1__Impl"
    // InternalProjectionLang.g:336:1: rule__Projection__Group__1__Impl : ( ( rule__Projection__NameAssignment_1 ) ) ;
    public final void rule__Projection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:340:1: ( ( ( rule__Projection__NameAssignment_1 ) ) )
            // InternalProjectionLang.g:341:1: ( ( rule__Projection__NameAssignment_1 ) )
            {
            // InternalProjectionLang.g:341:1: ( ( rule__Projection__NameAssignment_1 ) )
            // InternalProjectionLang.g:342:2: ( rule__Projection__NameAssignment_1 )
            {
             before(grammarAccess.getProjectionAccess().getNameAssignment_1()); 
            // InternalProjectionLang.g:343:2: ( rule__Projection__NameAssignment_1 )
            // InternalProjectionLang.g:343:3: rule__Projection__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Projection__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__1__Impl"


    // $ANTLR start "rule__Projection__Group__2"
    // InternalProjectionLang.g:351:1: rule__Projection__Group__2 : rule__Projection__Group__2__Impl ;
    public final void rule__Projection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:355:1: ( rule__Projection__Group__2__Impl )
            // InternalProjectionLang.g:356:2: rule__Projection__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Projection__Group__2__Impl();

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
    // $ANTLR end "rule__Projection__Group__2"


    // $ANTLR start "rule__Projection__Group__2__Impl"
    // InternalProjectionLang.g:362:1: rule__Projection__Group__2__Impl : ( ';' ) ;
    public final void rule__Projection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:366:1: ( ( ';' ) )
            // InternalProjectionLang.g:367:1: ( ';' )
            {
            // InternalProjectionLang.g:367:1: ( ';' )
            // InternalProjectionLang.g:368:2: ';'
            {
             before(grammarAccess.getProjectionAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProjectionAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalProjectionLang.g:378:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:382:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalProjectionLang.g:383:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

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
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalProjectionLang.g:390:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:394:1: ( ( 'component' ) )
            // InternalProjectionLang.g:395:1: ( 'component' )
            {
            // InternalProjectionLang.g:395:1: ( 'component' )
            // InternalProjectionLang.g:396:2: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalProjectionLang.g:405:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:409:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalProjectionLang.g:410:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

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
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalProjectionLang.g:417:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:421:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalProjectionLang.g:422:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalProjectionLang.g:422:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalProjectionLang.g:423:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalProjectionLang.g:424:2: ( rule__Component__NameAssignment_1 )
            // InternalProjectionLang.g:424:3: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalProjectionLang.g:432:1: rule__Component__Group__2 : rule__Component__Group__2__Impl ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:436:1: ( rule__Component__Group__2__Impl )
            // InternalProjectionLang.g:437:2: rule__Component__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__2__Impl();

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
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalProjectionLang.g:443:1: rule__Component__Group__2__Impl : ( ';' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:447:1: ( ( ';' ) )
            // InternalProjectionLang.g:448:1: ( ';' )
            {
            // InternalProjectionLang.g:448:1: ( ';' )
            // InternalProjectionLang.g:449:2: ';'
            {
             before(grammarAccess.getComponentAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Layer__Group__0"
    // InternalProjectionLang.g:459:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:463:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // InternalProjectionLang.g:464:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Layer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__1();

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
    // $ANTLR end "rule__Layer__Group__0"


    // $ANTLR start "rule__Layer__Group__0__Impl"
    // InternalProjectionLang.g:471:1: rule__Layer__Group__0__Impl : ( 'layer' ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:475:1: ( ( 'layer' ) )
            // InternalProjectionLang.g:476:1: ( 'layer' )
            {
            // InternalProjectionLang.g:476:1: ( 'layer' )
            // InternalProjectionLang.g:477:2: 'layer'
            {
             before(grammarAccess.getLayerAccess().getLayerKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLayerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__0__Impl"


    // $ANTLR start "rule__Layer__Group__1"
    // InternalProjectionLang.g:486:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl rule__Layer__Group__2 ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:490:1: ( rule__Layer__Group__1__Impl rule__Layer__Group__2 )
            // InternalProjectionLang.g:491:2: rule__Layer__Group__1__Impl rule__Layer__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Layer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__2();

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
    // $ANTLR end "rule__Layer__Group__1"


    // $ANTLR start "rule__Layer__Group__1__Impl"
    // InternalProjectionLang.g:498:1: rule__Layer__Group__1__Impl : ( ( rule__Layer__NameAssignment_1 ) ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:502:1: ( ( ( rule__Layer__NameAssignment_1 ) ) )
            // InternalProjectionLang.g:503:1: ( ( rule__Layer__NameAssignment_1 ) )
            {
            // InternalProjectionLang.g:503:1: ( ( rule__Layer__NameAssignment_1 ) )
            // InternalProjectionLang.g:504:2: ( rule__Layer__NameAssignment_1 )
            {
             before(grammarAccess.getLayerAccess().getNameAssignment_1()); 
            // InternalProjectionLang.g:505:2: ( rule__Layer__NameAssignment_1 )
            // InternalProjectionLang.g:505:3: rule__Layer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Layer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__1__Impl"


    // $ANTLR start "rule__Layer__Group__2"
    // InternalProjectionLang.g:513:1: rule__Layer__Group__2 : rule__Layer__Group__2__Impl ;
    public final void rule__Layer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:517:1: ( rule__Layer__Group__2__Impl )
            // InternalProjectionLang.g:518:2: rule__Layer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group__2__Impl();

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
    // $ANTLR end "rule__Layer__Group__2"


    // $ANTLR start "rule__Layer__Group__2__Impl"
    // InternalProjectionLang.g:524:1: rule__Layer__Group__2__Impl : ( ';' ) ;
    public final void rule__Layer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:528:1: ( ( ';' ) )
            // InternalProjectionLang.g:529:1: ( ';' )
            {
            // InternalProjectionLang.g:529:1: ( ';' )
            // InternalProjectionLang.g:530:2: ';'
            {
             before(grammarAccess.getLayerAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__2__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalProjectionLang.g:540:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:544:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalProjectionLang.g:545:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__1();

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
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // InternalProjectionLang.g:552:1: rule__Description__Group__0__Impl : ( 'description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:556:1: ( ( 'description' ) )
            // InternalProjectionLang.g:557:1: ( 'description' )
            {
            // InternalProjectionLang.g:557:1: ( 'description' )
            // InternalProjectionLang.g:558:2: 'description'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // InternalProjectionLang.g:567:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:571:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // InternalProjectionLang.g:572:2: rule__Description__Group__1__Impl rule__Description__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Description__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__2();

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
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // InternalProjectionLang.g:579:1: rule__Description__Group__1__Impl : ( ( rule__Description__NameAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:583:1: ( ( ( rule__Description__NameAssignment_1 ) ) )
            // InternalProjectionLang.g:584:1: ( ( rule__Description__NameAssignment_1 ) )
            {
            // InternalProjectionLang.g:584:1: ( ( rule__Description__NameAssignment_1 ) )
            // InternalProjectionLang.g:585:2: ( rule__Description__NameAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 
            // InternalProjectionLang.g:586:2: ( rule__Description__NameAssignment_1 )
            // InternalProjectionLang.g:586:3: rule__Description__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Description__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__Description__Group__2"
    // InternalProjectionLang.g:594:1: rule__Description__Group__2 : rule__Description__Group__2__Impl ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:598:1: ( rule__Description__Group__2__Impl )
            // InternalProjectionLang.g:599:2: rule__Description__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__2__Impl();

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
    // $ANTLR end "rule__Description__Group__2"


    // $ANTLR start "rule__Description__Group__2__Impl"
    // InternalProjectionLang.g:605:1: rule__Description__Group__2__Impl : ( ';' ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:609:1: ( ( ';' ) )
            // InternalProjectionLang.g:610:1: ( ';' )
            {
            // InternalProjectionLang.g:610:1: ( ';' )
            // InternalProjectionLang.g:611:2: ';'
            {
             before(grammarAccess.getDescriptionAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__2__Impl"


    // $ANTLR start "rule__Category__Group__0"
    // InternalProjectionLang.g:621:1: rule__Category__Group__0 : rule__Category__Group__0__Impl rule__Category__Group__1 ;
    public final void rule__Category__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:625:1: ( rule__Category__Group__0__Impl rule__Category__Group__1 )
            // InternalProjectionLang.g:626:2: rule__Category__Group__0__Impl rule__Category__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Category__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__1();

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
    // $ANTLR end "rule__Category__Group__0"


    // $ANTLR start "rule__Category__Group__0__Impl"
    // InternalProjectionLang.g:633:1: rule__Category__Group__0__Impl : ( 'category' ) ;
    public final void rule__Category__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:637:1: ( ( 'category' ) )
            // InternalProjectionLang.g:638:1: ( 'category' )
            {
            // InternalProjectionLang.g:638:1: ( 'category' )
            // InternalProjectionLang.g:639:2: 'category'
            {
             before(grammarAccess.getCategoryAccess().getCategoryKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getCategoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__0__Impl"


    // $ANTLR start "rule__Category__Group__1"
    // InternalProjectionLang.g:648:1: rule__Category__Group__1 : rule__Category__Group__1__Impl rule__Category__Group__2 ;
    public final void rule__Category__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:652:1: ( rule__Category__Group__1__Impl rule__Category__Group__2 )
            // InternalProjectionLang.g:653:2: rule__Category__Group__1__Impl rule__Category__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Category__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__2();

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
    // $ANTLR end "rule__Category__Group__1"


    // $ANTLR start "rule__Category__Group__1__Impl"
    // InternalProjectionLang.g:660:1: rule__Category__Group__1__Impl : ( ( rule__Category__NameAssignment_1 ) ) ;
    public final void rule__Category__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:664:1: ( ( ( rule__Category__NameAssignment_1 ) ) )
            // InternalProjectionLang.g:665:1: ( ( rule__Category__NameAssignment_1 ) )
            {
            // InternalProjectionLang.g:665:1: ( ( rule__Category__NameAssignment_1 ) )
            // InternalProjectionLang.g:666:2: ( rule__Category__NameAssignment_1 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_1()); 
            // InternalProjectionLang.g:667:2: ( rule__Category__NameAssignment_1 )
            // InternalProjectionLang.g:667:3: rule__Category__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Category__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__1__Impl"


    // $ANTLR start "rule__Category__Group__2"
    // InternalProjectionLang.g:675:1: rule__Category__Group__2 : rule__Category__Group__2__Impl ;
    public final void rule__Category__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:679:1: ( rule__Category__Group__2__Impl )
            // InternalProjectionLang.g:680:2: rule__Category__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group__2__Impl();

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
    // $ANTLR end "rule__Category__Group__2"


    // $ANTLR start "rule__Category__Group__2__Impl"
    // InternalProjectionLang.g:686:1: rule__Category__Group__2__Impl : ( ';' ) ;
    public final void rule__Category__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:690:1: ( ( ';' ) )
            // InternalProjectionLang.g:691:1: ( ';' )
            {
            // InternalProjectionLang.g:691:1: ( ';' )
            // InternalProjectionLang.g:692:2: ';'
            {
             before(grammarAccess.getCategoryAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__2__Impl"


    // $ANTLR start "rule__Entityset__Group__0"
    // InternalProjectionLang.g:702:1: rule__Entityset__Group__0 : rule__Entityset__Group__0__Impl rule__Entityset__Group__1 ;
    public final void rule__Entityset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:706:1: ( rule__Entityset__Group__0__Impl rule__Entityset__Group__1 )
            // InternalProjectionLang.g:707:2: rule__Entityset__Group__0__Impl rule__Entityset__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entityset__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entityset__Group__1();

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
    // $ANTLR end "rule__Entityset__Group__0"


    // $ANTLR start "rule__Entityset__Group__0__Impl"
    // InternalProjectionLang.g:714:1: rule__Entityset__Group__0__Impl : ( 'entityset' ) ;
    public final void rule__Entityset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:718:1: ( ( 'entityset' ) )
            // InternalProjectionLang.g:719:1: ( 'entityset' )
            {
            // InternalProjectionLang.g:719:1: ( 'entityset' )
            // InternalProjectionLang.g:720:2: 'entityset'
            {
             before(grammarAccess.getEntitysetAccess().getEntitysetKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntitysetAccess().getEntitysetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entityset__Group__0__Impl"


    // $ANTLR start "rule__Entityset__Group__1"
    // InternalProjectionLang.g:729:1: rule__Entityset__Group__1 : rule__Entityset__Group__1__Impl rule__Entityset__Group__2 ;
    public final void rule__Entityset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:733:1: ( rule__Entityset__Group__1__Impl rule__Entityset__Group__2 )
            // InternalProjectionLang.g:734:2: rule__Entityset__Group__1__Impl rule__Entityset__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Entityset__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entityset__Group__2();

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
    // $ANTLR end "rule__Entityset__Group__1"


    // $ANTLR start "rule__Entityset__Group__1__Impl"
    // InternalProjectionLang.g:741:1: rule__Entityset__Group__1__Impl : ( ( rule__Entityset__NameAssignment_1 ) ) ;
    public final void rule__Entityset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:745:1: ( ( ( rule__Entityset__NameAssignment_1 ) ) )
            // InternalProjectionLang.g:746:1: ( ( rule__Entityset__NameAssignment_1 ) )
            {
            // InternalProjectionLang.g:746:1: ( ( rule__Entityset__NameAssignment_1 ) )
            // InternalProjectionLang.g:747:2: ( rule__Entityset__NameAssignment_1 )
            {
             before(grammarAccess.getEntitysetAccess().getNameAssignment_1()); 
            // InternalProjectionLang.g:748:2: ( rule__Entityset__NameAssignment_1 )
            // InternalProjectionLang.g:748:3: rule__Entityset__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entityset__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntitysetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entityset__Group__1__Impl"


    // $ANTLR start "rule__Entityset__Group__2"
    // InternalProjectionLang.g:756:1: rule__Entityset__Group__2 : rule__Entityset__Group__2__Impl rule__Entityset__Group__3 ;
    public final void rule__Entityset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:760:1: ( rule__Entityset__Group__2__Impl rule__Entityset__Group__3 )
            // InternalProjectionLang.g:761:2: rule__Entityset__Group__2__Impl rule__Entityset__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Entityset__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entityset__Group__3();

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
    // $ANTLR end "rule__Entityset__Group__2"


    // $ANTLR start "rule__Entityset__Group__2__Impl"
    // InternalProjectionLang.g:768:1: rule__Entityset__Group__2__Impl : ( 'for' ) ;
    public final void rule__Entityset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:772:1: ( ( 'for' ) )
            // InternalProjectionLang.g:773:1: ( 'for' )
            {
            // InternalProjectionLang.g:773:1: ( 'for' )
            // InternalProjectionLang.g:774:2: 'for'
            {
             before(grammarAccess.getEntitysetAccess().getForKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntitysetAccess().getForKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entityset__Group__2__Impl"


    // $ANTLR start "rule__Entityset__Group__3"
    // InternalProjectionLang.g:783:1: rule__Entityset__Group__3 : rule__Entityset__Group__3__Impl rule__Entityset__Group__4 ;
    public final void rule__Entityset__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:787:1: ( rule__Entityset__Group__3__Impl rule__Entityset__Group__4 )
            // InternalProjectionLang.g:788:2: rule__Entityset__Group__3__Impl rule__Entityset__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Entityset__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entityset__Group__4();

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
    // $ANTLR end "rule__Entityset__Group__3"


    // $ANTLR start "rule__Entityset__Group__3__Impl"
    // InternalProjectionLang.g:795:1: rule__Entityset__Group__3__Impl : ( ( rule__Entityset__EntityAssignment_3 ) ) ;
    public final void rule__Entityset__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:799:1: ( ( ( rule__Entityset__EntityAssignment_3 ) ) )
            // InternalProjectionLang.g:800:1: ( ( rule__Entityset__EntityAssignment_3 ) )
            {
            // InternalProjectionLang.g:800:1: ( ( rule__Entityset__EntityAssignment_3 ) )
            // InternalProjectionLang.g:801:2: ( rule__Entityset__EntityAssignment_3 )
            {
             before(grammarAccess.getEntitysetAccess().getEntityAssignment_3()); 
            // InternalProjectionLang.g:802:2: ( rule__Entityset__EntityAssignment_3 )
            // InternalProjectionLang.g:802:3: rule__Entityset__EntityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Entityset__EntityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntitysetAccess().getEntityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entityset__Group__3__Impl"


    // $ANTLR start "rule__Entityset__Group__4"
    // InternalProjectionLang.g:810:1: rule__Entityset__Group__4 : rule__Entityset__Group__4__Impl ;
    public final void rule__Entityset__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:814:1: ( rule__Entityset__Group__4__Impl )
            // InternalProjectionLang.g:815:2: rule__Entityset__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entityset__Group__4__Impl();

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
    // $ANTLR end "rule__Entityset__Group__4"


    // $ANTLR start "rule__Entityset__Group__4__Impl"
    // InternalProjectionLang.g:821:1: rule__Entityset__Group__4__Impl : ( ';' ) ;
    public final void rule__Entityset__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:825:1: ( ( ';' ) )
            // InternalProjectionLang.g:826:1: ( ';' )
            {
            // InternalProjectionLang.g:826:1: ( ';' )
            // InternalProjectionLang.g:827:2: ';'
            {
             before(grammarAccess.getEntitysetAccess().getSemicolonKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEntitysetAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entityset__Group__4__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalProjectionLang.g:837:1: rule__Model__ElementsAssignment : ( ruleType ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:841:1: ( ( ruleType ) )
            // InternalProjectionLang.g:842:2: ( ruleType )
            {
            // InternalProjectionLang.g:842:2: ( ruleType )
            // InternalProjectionLang.g:843:3: ruleType
            {
             before(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Projection__NameAssignment_1"
    // InternalProjectionLang.g:852:1: rule__Projection__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Projection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:856:1: ( ( RULE_ID ) )
            // InternalProjectionLang.g:857:2: ( RULE_ID )
            {
            // InternalProjectionLang.g:857:2: ( RULE_ID )
            // InternalProjectionLang.g:858:3: RULE_ID
            {
             before(grammarAccess.getProjectionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProjectionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__NameAssignment_1"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalProjectionLang.g:867:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:871:1: ( ( RULE_ID ) )
            // InternalProjectionLang.g:872:2: ( RULE_ID )
            {
            // InternalProjectionLang.g:872:2: ( RULE_ID )
            // InternalProjectionLang.g:873:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Layer__NameAssignment_1"
    // InternalProjectionLang.g:882:1: rule__Layer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Layer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:886:1: ( ( RULE_ID ) )
            // InternalProjectionLang.g:887:2: ( RULE_ID )
            {
            // InternalProjectionLang.g:887:2: ( RULE_ID )
            // InternalProjectionLang.g:888:3: RULE_ID
            {
             before(grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__NameAssignment_1"


    // $ANTLR start "rule__Description__NameAssignment_1"
    // InternalProjectionLang.g:897:1: rule__Description__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:901:1: ( ( RULE_STRING ) )
            // InternalProjectionLang.g:902:2: ( RULE_STRING )
            {
            // InternalProjectionLang.g:902:2: ( RULE_STRING )
            // InternalProjectionLang.g:903:3: RULE_STRING
            {
             before(grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__NameAssignment_1"


    // $ANTLR start "rule__Category__NameAssignment_1"
    // InternalProjectionLang.g:912:1: rule__Category__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Category__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:916:1: ( ( RULE_ID ) )
            // InternalProjectionLang.g:917:2: ( RULE_ID )
            {
            // InternalProjectionLang.g:917:2: ( RULE_ID )
            // InternalProjectionLang.g:918:3: RULE_ID
            {
             before(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__NameAssignment_1"


    // $ANTLR start "rule__Entityset__NameAssignment_1"
    // InternalProjectionLang.g:927:1: rule__Entityset__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entityset__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:931:1: ( ( RULE_ID ) )
            // InternalProjectionLang.g:932:2: ( RULE_ID )
            {
            // InternalProjectionLang.g:932:2: ( RULE_ID )
            // InternalProjectionLang.g:933:3: RULE_ID
            {
             before(grammarAccess.getEntitysetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntitysetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entityset__NameAssignment_1"


    // $ANTLR start "rule__Entityset__EntityAssignment_3"
    // InternalProjectionLang.g:942:1: rule__Entityset__EntityAssignment_3 : ( RULE_ID ) ;
    public final void rule__Entityset__EntityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectionLang.g:946:1: ( ( RULE_ID ) )
            // InternalProjectionLang.g:947:2: ( RULE_ID )
            {
            // InternalProjectionLang.g:947:2: ( RULE_ID )
            // InternalProjectionLang.g:948:3: RULE_ID
            {
             before(grammarAccess.getEntitysetAccess().getEntityIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntitysetAccess().getEntityIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entityset__EntityAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000003E802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});

}