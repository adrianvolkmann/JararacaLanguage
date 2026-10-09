package com.volkmann.ide.contentassist.antlr.internal;

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
import com.volkmann.services.JararacaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJararacaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'program'", "'{'", "'}'", "'var'", "';'", "'='", "'int'", "'decimal'", "'boolean'", "'string'", "'or'", "'and'", "'not'", "'('", "')'", "'true'", "'false'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int RULE_FLOAT=6;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalJararacaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJararacaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJararacaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJararaca.g"; }


    	private JararacaGrammarAccess grammarAccess;

    	public void setGrammarAccess(JararacaGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalJararaca.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalJararaca.g:54:1: ( ruleProgram EOF )
            // InternalJararaca.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalJararaca.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalJararaca.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalJararaca.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalJararaca.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalJararaca.g:69:3: ( rule__Program__Group__0 )
            // InternalJararaca.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalJararaca.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalJararaca.g:79:1: ( ruleStatement EOF )
            // InternalJararaca.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalJararaca.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalJararaca.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalJararaca.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalJararaca.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalJararaca.g:94:3: ( rule__Statement__Alternatives )
            // InternalJararaca.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalJararaca.g:103:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalJararaca.g:104:1: ( ruleVariableDeclaration EOF )
            // InternalJararaca.g:105:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalJararaca.g:112:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:116:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalJararaca.g:117:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalJararaca.g:117:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalJararaca.g:118:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalJararaca.g:119:3: ( rule__VariableDeclaration__Group__0 )
            // InternalJararaca.g:119:4: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleAssignment"
    // InternalJararaca.g:128:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalJararaca.g:129:1: ( ruleAssignment EOF )
            // InternalJararaca.g:130:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalJararaca.g:137:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:141:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalJararaca.g:142:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalJararaca.g:142:2: ( ( rule__Assignment__Group__0 ) )
            // InternalJararaca.g:143:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalJararaca.g:144:3: ( rule__Assignment__Group__0 )
            // InternalJararaca.g:144:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleType"
    // InternalJararaca.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalJararaca.g:154:1: ( ruleType EOF )
            // InternalJararaca.g:155:1: ruleType EOF
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
    // InternalJararaca.g:162:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:166:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalJararaca.g:167:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalJararaca.g:167:2: ( ( rule__Type__Alternatives ) )
            // InternalJararaca.g:168:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalJararaca.g:169:3: ( rule__Type__Alternatives )
            // InternalJararaca.g:169:4: rule__Type__Alternatives
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


    // $ANTLR start "entryRuleIntType"
    // InternalJararaca.g:178:1: entryRuleIntType : ruleIntType EOF ;
    public final void entryRuleIntType() throws RecognitionException {
        try {
            // InternalJararaca.g:179:1: ( ruleIntType EOF )
            // InternalJararaca.g:180:1: ruleIntType EOF
            {
             before(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleIntType();

            state._fsp--;

             after(grammarAccess.getIntTypeRule()); 
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
    // $ANTLR end "entryRuleIntType"


    // $ANTLR start "ruleIntType"
    // InternalJararaca.g:187:1: ruleIntType : ( ( rule__IntType__Group__0 ) ) ;
    public final void ruleIntType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:191:2: ( ( ( rule__IntType__Group__0 ) ) )
            // InternalJararaca.g:192:2: ( ( rule__IntType__Group__0 ) )
            {
            // InternalJararaca.g:192:2: ( ( rule__IntType__Group__0 ) )
            // InternalJararaca.g:193:3: ( rule__IntType__Group__0 )
            {
             before(grammarAccess.getIntTypeAccess().getGroup()); 
            // InternalJararaca.g:194:3: ( rule__IntType__Group__0 )
            // InternalJararaca.g:194:4: rule__IntType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntType"


    // $ANTLR start "entryRuleFloatType"
    // InternalJararaca.g:203:1: entryRuleFloatType : ruleFloatType EOF ;
    public final void entryRuleFloatType() throws RecognitionException {
        try {
            // InternalJararaca.g:204:1: ( ruleFloatType EOF )
            // InternalJararaca.g:205:1: ruleFloatType EOF
            {
             before(grammarAccess.getFloatTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleFloatType();

            state._fsp--;

             after(grammarAccess.getFloatTypeRule()); 
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
    // $ANTLR end "entryRuleFloatType"


    // $ANTLR start "ruleFloatType"
    // InternalJararaca.g:212:1: ruleFloatType : ( ( rule__FloatType__Group__0 ) ) ;
    public final void ruleFloatType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:216:2: ( ( ( rule__FloatType__Group__0 ) ) )
            // InternalJararaca.g:217:2: ( ( rule__FloatType__Group__0 ) )
            {
            // InternalJararaca.g:217:2: ( ( rule__FloatType__Group__0 ) )
            // InternalJararaca.g:218:3: ( rule__FloatType__Group__0 )
            {
             before(grammarAccess.getFloatTypeAccess().getGroup()); 
            // InternalJararaca.g:219:3: ( rule__FloatType__Group__0 )
            // InternalJararaca.g:219:4: rule__FloatType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FloatType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatType"


    // $ANTLR start "entryRuleBooleanType"
    // InternalJararaca.g:228:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // InternalJararaca.g:229:1: ( ruleBooleanType EOF )
            // InternalJararaca.g:230:1: ruleBooleanType EOF
            {
             before(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getBooleanTypeRule()); 
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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalJararaca.g:237:1: ruleBooleanType : ( ( rule__BooleanType__Group__0 ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:241:2: ( ( ( rule__BooleanType__Group__0 ) ) )
            // InternalJararaca.g:242:2: ( ( rule__BooleanType__Group__0 ) )
            {
            // InternalJararaca.g:242:2: ( ( rule__BooleanType__Group__0 ) )
            // InternalJararaca.g:243:3: ( rule__BooleanType__Group__0 )
            {
             before(grammarAccess.getBooleanTypeAccess().getGroup()); 
            // InternalJararaca.g:244:3: ( rule__BooleanType__Group__0 )
            // InternalJararaca.g:244:4: rule__BooleanType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleStringType"
    // InternalJararaca.g:253:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalJararaca.g:254:1: ( ruleStringType EOF )
            // InternalJararaca.g:255:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleStringType();

            state._fsp--;

             after(grammarAccess.getStringTypeRule()); 
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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalJararaca.g:262:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:266:2: ( ( ( rule__StringType__Group__0 ) ) )
            // InternalJararaca.g:267:2: ( ( rule__StringType__Group__0 ) )
            {
            // InternalJararaca.g:267:2: ( ( rule__StringType__Group__0 ) )
            // InternalJararaca.g:268:3: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // InternalJararaca.g:269:3: ( rule__StringType__Group__0 )
            // InternalJararaca.g:269:4: rule__StringType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleExpression"
    // InternalJararaca.g:278:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalJararaca.g:279:1: ( ruleExpression EOF )
            // InternalJararaca.g:280:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalJararaca.g:287:1: ruleExpression : ( ruleOrExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:291:2: ( ( ruleOrExpression ) )
            // InternalJararaca.g:292:2: ( ruleOrExpression )
            {
            // InternalJararaca.g:292:2: ( ruleOrExpression )
            // InternalJararaca.g:293:3: ruleOrExpression
            {
             before(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalJararaca.g:303:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalJararaca.g:304:1: ( ruleOrExpression EOF )
            // InternalJararaca.g:305:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalJararaca.g:312:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:316:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalJararaca.g:317:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalJararaca.g:317:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalJararaca.g:318:3: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // InternalJararaca.g:319:3: ( rule__OrExpression__Group__0 )
            // InternalJararaca.g:319:4: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalJararaca.g:328:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalJararaca.g:329:1: ( ruleAndExpression EOF )
            // InternalJararaca.g:330:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalJararaca.g:337:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:341:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalJararaca.g:342:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalJararaca.g:342:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalJararaca.g:343:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalJararaca.g:344:3: ( rule__AndExpression__Group__0 )
            // InternalJararaca.g:344:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparison"
    // InternalJararaca.g:353:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalJararaca.g:354:1: ( ruleComparison EOF )
            // InternalJararaca.g:355:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalJararaca.g:362:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:366:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalJararaca.g:367:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalJararaca.g:367:2: ( ( rule__Comparison__Group__0 ) )
            // InternalJararaca.g:368:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalJararaca.g:369:3: ( rule__Comparison__Group__0 )
            // InternalJararaca.g:369:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleAddition"
    // InternalJararaca.g:378:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalJararaca.g:379:1: ( ruleAddition EOF )
            // InternalJararaca.g:380:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalJararaca.g:387:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:391:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalJararaca.g:392:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalJararaca.g:392:2: ( ( rule__Addition__Group__0 ) )
            // InternalJararaca.g:393:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalJararaca.g:394:3: ( rule__Addition__Group__0 )
            // InternalJararaca.g:394:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalJararaca.g:403:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalJararaca.g:404:1: ( ruleMultiplication EOF )
            // InternalJararaca.g:405:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalJararaca.g:412:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:416:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalJararaca.g:417:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalJararaca.g:417:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalJararaca.g:418:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalJararaca.g:419:3: ( rule__Multiplication__Group__0 )
            // InternalJararaca.g:419:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleUnary"
    // InternalJararaca.g:428:1: entryRuleUnary : ruleUnary EOF ;
    public final void entryRuleUnary() throws RecognitionException {
        try {
            // InternalJararaca.g:429:1: ( ruleUnary EOF )
            // InternalJararaca.g:430:1: ruleUnary EOF
            {
             before(grammarAccess.getUnaryRule()); 
            pushFollow(FOLLOW_1);
            ruleUnary();

            state._fsp--;

             after(grammarAccess.getUnaryRule()); 
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
    // $ANTLR end "entryRuleUnary"


    // $ANTLR start "ruleUnary"
    // InternalJararaca.g:437:1: ruleUnary : ( ( rule__Unary__Alternatives ) ) ;
    public final void ruleUnary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:441:2: ( ( ( rule__Unary__Alternatives ) ) )
            // InternalJararaca.g:442:2: ( ( rule__Unary__Alternatives ) )
            {
            // InternalJararaca.g:442:2: ( ( rule__Unary__Alternatives ) )
            // InternalJararaca.g:443:3: ( rule__Unary__Alternatives )
            {
             before(grammarAccess.getUnaryAccess().getAlternatives()); 
            // InternalJararaca.g:444:3: ( rule__Unary__Alternatives )
            // InternalJararaca.g:444:4: rule__Unary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Unary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnary"


    // $ANTLR start "entryRulePrimary"
    // InternalJararaca.g:453:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalJararaca.g:454:1: ( rulePrimary EOF )
            // InternalJararaca.g:455:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalJararaca.g:462:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:466:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalJararaca.g:467:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalJararaca.g:467:2: ( ( rule__Primary__Alternatives ) )
            // InternalJararaca.g:468:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalJararaca.g:469:3: ( rule__Primary__Alternatives )
            // InternalJararaca.g:469:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalJararaca.g:478:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalJararaca.g:479:1: ( ruleIntLiteral EOF )
            // InternalJararaca.g:480:1: ruleIntLiteral EOF
            {
             before(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntLiteral();

            state._fsp--;

             after(grammarAccess.getIntLiteralRule()); 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalJararaca.g:487:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:491:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // InternalJararaca.g:492:2: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // InternalJararaca.g:492:2: ( ( rule__IntLiteral__ValueAssignment ) )
            // InternalJararaca.g:493:3: ( rule__IntLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            // InternalJararaca.g:494:3: ( rule__IntLiteral__ValueAssignment )
            // InternalJararaca.g:494:4: rule__IntLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleFloatLiteral"
    // InternalJararaca.g:503:1: entryRuleFloatLiteral : ruleFloatLiteral EOF ;
    public final void entryRuleFloatLiteral() throws RecognitionException {
        try {
            // InternalJararaca.g:504:1: ( ruleFloatLiteral EOF )
            // InternalJararaca.g:505:1: ruleFloatLiteral EOF
            {
             before(grammarAccess.getFloatLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleFloatLiteral();

            state._fsp--;

             after(grammarAccess.getFloatLiteralRule()); 
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
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // InternalJararaca.g:512:1: ruleFloatLiteral : ( ( rule__FloatLiteral__ValueAssignment ) ) ;
    public final void ruleFloatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:516:2: ( ( ( rule__FloatLiteral__ValueAssignment ) ) )
            // InternalJararaca.g:517:2: ( ( rule__FloatLiteral__ValueAssignment ) )
            {
            // InternalJararaca.g:517:2: ( ( rule__FloatLiteral__ValueAssignment ) )
            // InternalJararaca.g:518:3: ( rule__FloatLiteral__ValueAssignment )
            {
             before(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
            // InternalJararaca.g:519:3: ( rule__FloatLiteral__ValueAssignment )
            // InternalJararaca.g:519:4: rule__FloatLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FloatLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalJararaca.g:528:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalJararaca.g:529:1: ( ruleBooleanLiteral EOF )
            // InternalJararaca.g:530:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalJararaca.g:537:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Alternatives ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:541:2: ( ( ( rule__BooleanLiteral__Alternatives ) ) )
            // InternalJararaca.g:542:2: ( ( rule__BooleanLiteral__Alternatives ) )
            {
            // InternalJararaca.g:542:2: ( ( rule__BooleanLiteral__Alternatives ) )
            // InternalJararaca.g:543:3: ( rule__BooleanLiteral__Alternatives )
            {
             before(grammarAccess.getBooleanLiteralAccess().getAlternatives()); 
            // InternalJararaca.g:544:3: ( rule__BooleanLiteral__Alternatives )
            // InternalJararaca.g:544:4: rule__BooleanLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleTrueLiteral"
    // InternalJararaca.g:553:1: entryRuleTrueLiteral : ruleTrueLiteral EOF ;
    public final void entryRuleTrueLiteral() throws RecognitionException {
        try {
            // InternalJararaca.g:554:1: ( ruleTrueLiteral EOF )
            // InternalJararaca.g:555:1: ruleTrueLiteral EOF
            {
             before(grammarAccess.getTrueLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleTrueLiteral();

            state._fsp--;

             after(grammarAccess.getTrueLiteralRule()); 
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
    // $ANTLR end "entryRuleTrueLiteral"


    // $ANTLR start "ruleTrueLiteral"
    // InternalJararaca.g:562:1: ruleTrueLiteral : ( ( rule__TrueLiteral__Group__0 ) ) ;
    public final void ruleTrueLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:566:2: ( ( ( rule__TrueLiteral__Group__0 ) ) )
            // InternalJararaca.g:567:2: ( ( rule__TrueLiteral__Group__0 ) )
            {
            // InternalJararaca.g:567:2: ( ( rule__TrueLiteral__Group__0 ) )
            // InternalJararaca.g:568:3: ( rule__TrueLiteral__Group__0 )
            {
             before(grammarAccess.getTrueLiteralAccess().getGroup()); 
            // InternalJararaca.g:569:3: ( rule__TrueLiteral__Group__0 )
            // InternalJararaca.g:569:4: rule__TrueLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrueLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrueLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrueLiteral"


    // $ANTLR start "entryRuleFalseLiteral"
    // InternalJararaca.g:578:1: entryRuleFalseLiteral : ruleFalseLiteral EOF ;
    public final void entryRuleFalseLiteral() throws RecognitionException {
        try {
            // InternalJararaca.g:579:1: ( ruleFalseLiteral EOF )
            // InternalJararaca.g:580:1: ruleFalseLiteral EOF
            {
             before(grammarAccess.getFalseLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleFalseLiteral();

            state._fsp--;

             after(grammarAccess.getFalseLiteralRule()); 
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
    // $ANTLR end "entryRuleFalseLiteral"


    // $ANTLR start "ruleFalseLiteral"
    // InternalJararaca.g:587:1: ruleFalseLiteral : ( ( rule__FalseLiteral__Group__0 ) ) ;
    public final void ruleFalseLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:591:2: ( ( ( rule__FalseLiteral__Group__0 ) ) )
            // InternalJararaca.g:592:2: ( ( rule__FalseLiteral__Group__0 ) )
            {
            // InternalJararaca.g:592:2: ( ( rule__FalseLiteral__Group__0 ) )
            // InternalJararaca.g:593:3: ( rule__FalseLiteral__Group__0 )
            {
             before(grammarAccess.getFalseLiteralAccess().getGroup()); 
            // InternalJararaca.g:594:3: ( rule__FalseLiteral__Group__0 )
            // InternalJararaca.g:594:4: rule__FalseLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FalseLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFalseLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFalseLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalJararaca.g:603:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalJararaca.g:604:1: ( ruleStringLiteral EOF )
            // InternalJararaca.g:605:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalJararaca.g:612:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:616:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalJararaca.g:617:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalJararaca.g:617:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalJararaca.g:618:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalJararaca.g:619:3: ( rule__StringLiteral__ValueAssignment )
            // InternalJararaca.g:619:4: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleVariableReference"
    // InternalJararaca.g:628:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // InternalJararaca.g:629:1: ( ruleVariableReference EOF )
            // InternalJararaca.g:630:1: ruleVariableReference EOF
            {
             before(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableReference();

            state._fsp--;

             after(grammarAccess.getVariableReferenceRule()); 
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
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // InternalJararaca.g:637:1: ruleVariableReference : ( ( rule__VariableReference__NameAssignment ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:641:2: ( ( ( rule__VariableReference__NameAssignment ) ) )
            // InternalJararaca.g:642:2: ( ( rule__VariableReference__NameAssignment ) )
            {
            // InternalJararaca.g:642:2: ( ( rule__VariableReference__NameAssignment ) )
            // InternalJararaca.g:643:3: ( rule__VariableReference__NameAssignment )
            {
             before(grammarAccess.getVariableReferenceAccess().getNameAssignment()); 
            // InternalJararaca.g:644:3: ( rule__VariableReference__NameAssignment )
            // InternalJararaca.g:644:4: rule__VariableReference__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableReference__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableReferenceAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalJararaca.g:652:1: rule__Statement__Alternatives : ( ( ruleVariableDeclaration ) | ( ruleAssignment ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:656:1: ( ( ruleVariableDeclaration ) | ( ruleAssignment ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalJararaca.g:657:2: ( ruleVariableDeclaration )
                    {
                    // InternalJararaca.g:657:2: ( ruleVariableDeclaration )
                    // InternalJararaca.g:658:3: ruleVariableDeclaration
                    {
                     before(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJararaca.g:663:2: ( ruleAssignment )
                    {
                    // InternalJararaca.g:663:2: ( ruleAssignment )
                    // InternalJararaca.g:664:3: ruleAssignment
                    {
                     before(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalJararaca.g:673:1: rule__Type__Alternatives : ( ( ruleIntType ) | ( ruleFloatType ) | ( ruleBooleanType ) | ( ruleStringType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:677:1: ( ( ruleIntType ) | ( ruleFloatType ) | ( ruleBooleanType ) | ( ruleStringType ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 31:
                {
                alt2=3;
                }
                break;
            case 32:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalJararaca.g:678:2: ( ruleIntType )
                    {
                    // InternalJararaca.g:678:2: ( ruleIntType )
                    // InternalJararaca.g:679:3: ruleIntType
                    {
                     before(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJararaca.g:684:2: ( ruleFloatType )
                    {
                    // InternalJararaca.g:684:2: ( ruleFloatType )
                    // InternalJararaca.g:685:3: ruleFloatType
                    {
                     before(grammarAccess.getTypeAccess().getFloatTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFloatType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getFloatTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJararaca.g:690:2: ( ruleBooleanType )
                    {
                    // InternalJararaca.g:690:2: ( ruleBooleanType )
                    // InternalJararaca.g:691:3: ruleBooleanType
                    {
                     before(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJararaca.g:696:2: ( ruleStringType )
                    {
                    // InternalJararaca.g:696:2: ( ruleStringType )
                    // InternalJararaca.g:697:3: ruleStringType
                    {
                     before(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStringType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_3()); 

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


    // $ANTLR start "rule__Comparison__OperatorAlternatives_1_1_0"
    // InternalJararaca.g:706:1: rule__Comparison__OperatorAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '<' ) | ( '>' ) );
    public final void rule__Comparison__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:710:1: ( ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '<' ) | ( '>' ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalJararaca.g:711:2: ( '==' )
                    {
                    // InternalJararaca.g:711:2: ( '==' )
                    // InternalJararaca.g:712:3: '=='
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJararaca.g:717:2: ( '!=' )
                    {
                    // InternalJararaca.g:717:2: ( '!=' )
                    // InternalJararaca.g:718:3: '!='
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJararaca.g:723:2: ( '<=' )
                    {
                    // InternalJararaca.g:723:2: ( '<=' )
                    // InternalJararaca.g:724:3: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJararaca.g:729:2: ( '>=' )
                    {
                    // InternalJararaca.g:729:2: ( '>=' )
                    // InternalJararaca.g:730:3: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJararaca.g:735:2: ( '<' )
                    {
                    // InternalJararaca.g:735:2: ( '<' )
                    // InternalJararaca.g:736:3: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorLessThanSignKeyword_1_1_0_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOperatorLessThanSignKeyword_1_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJararaca.g:741:2: ( '>' )
                    {
                    // InternalJararaca.g:741:2: ( '>' )
                    // InternalJararaca.g:742:3: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorGreaterThanSignKeyword_1_1_0_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOperatorGreaterThanSignKeyword_1_1_0_5()); 

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
    // $ANTLR end "rule__Comparison__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Addition__OperatorAlternatives_1_1_0"
    // InternalJararaca.g:751:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:755:1: ( ( '+' ) | ( '-' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJararaca.g:756:2: ( '+' )
                    {
                    // InternalJararaca.g:756:2: ( '+' )
                    // InternalJararaca.g:757:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJararaca.g:762:2: ( '-' )
                    {
                    // InternalJararaca.g:762:2: ( '-' )
                    // InternalJararaca.g:763:3: '-'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Addition__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Multiplication__OperatorAlternatives_1_1_0"
    // InternalJararaca.g:772:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) | ( '%' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:776:1: ( ( '*' ) | ( '/' ) | ( '%' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalJararaca.g:777:2: ( '*' )
                    {
                    // InternalJararaca.g:777:2: ( '*' )
                    // InternalJararaca.g:778:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJararaca.g:783:2: ( '/' )
                    {
                    // InternalJararaca.g:783:2: ( '/' )
                    // InternalJararaca.g:784:3: '/'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJararaca.g:789:2: ( '%' )
                    {
                    // InternalJararaca.g:789:2: ( '%' )
                    // InternalJararaca.g:790:3: '%'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorPercentSignKeyword_1_1_0_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorPercentSignKeyword_1_1_0_2()); 

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
    // $ANTLR end "rule__Multiplication__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Unary__Alternatives"
    // InternalJararaca.g:799:1: rule__Unary__Alternatives : ( ( ( rule__Unary__Group_0__0 ) ) | ( ( rule__Unary__Group_1__0 ) ) | ( rulePrimary ) );
    public final void rule__Unary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:803:1: ( ( ( rule__Unary__Group_0__0 ) ) | ( ( rule__Unary__Group_1__0 ) ) | ( rulePrimary ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_STRING:
            case 36:
            case 38:
            case 39:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalJararaca.g:804:2: ( ( rule__Unary__Group_0__0 ) )
                    {
                    // InternalJararaca.g:804:2: ( ( rule__Unary__Group_0__0 ) )
                    // InternalJararaca.g:805:3: ( rule__Unary__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryAccess().getGroup_0()); 
                    // InternalJararaca.g:806:3: ( rule__Unary__Group_0__0 )
                    // InternalJararaca.g:806:4: rule__Unary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJararaca.g:810:2: ( ( rule__Unary__Group_1__0 ) )
                    {
                    // InternalJararaca.g:810:2: ( ( rule__Unary__Group_1__0 ) )
                    // InternalJararaca.g:811:3: ( rule__Unary__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryAccess().getGroup_1()); 
                    // InternalJararaca.g:812:3: ( rule__Unary__Group_1__0 )
                    // InternalJararaca.g:812:4: rule__Unary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJararaca.g:816:2: ( rulePrimary )
                    {
                    // InternalJararaca.g:816:2: ( rulePrimary )
                    // InternalJararaca.g:817:3: rulePrimary
                    {
                     before(grammarAccess.getUnaryAccess().getPrimaryParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePrimary();

                    state._fsp--;

                     after(grammarAccess.getUnaryAccess().getPrimaryParserRuleCall_2()); 

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
    // $ANTLR end "rule__Unary__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalJararaca.g:826:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleVariableReference ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:830:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleVariableReference ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt7=3;
                }
                break;
            case 38:
            case 39:
                {
                alt7=4;
                }
                break;
            case RULE_STRING:
                {
                alt7=5;
                }
                break;
            case RULE_ID:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalJararaca.g:831:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalJararaca.g:831:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalJararaca.g:832:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalJararaca.g:833:3: ( rule__Primary__Group_0__0 )
                    // InternalJararaca.g:833:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJararaca.g:837:2: ( ruleIntLiteral )
                    {
                    // InternalJararaca.g:837:2: ( ruleIntLiteral )
                    // InternalJararaca.g:838:3: ruleIntLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJararaca.g:843:2: ( ruleFloatLiteral )
                    {
                    // InternalJararaca.g:843:2: ( ruleFloatLiteral )
                    // InternalJararaca.g:844:3: ruleFloatLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getFloatLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFloatLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getFloatLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJararaca.g:849:2: ( ruleBooleanLiteral )
                    {
                    // InternalJararaca.g:849:2: ( ruleBooleanLiteral )
                    // InternalJararaca.g:850:3: ruleBooleanLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJararaca.g:855:2: ( ruleStringLiteral )
                    {
                    // InternalJararaca.g:855:2: ( ruleStringLiteral )
                    // InternalJararaca.g:856:3: ruleStringLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJararaca.g:861:2: ( ruleVariableReference )
                    {
                    // InternalJararaca.g:861:2: ( ruleVariableReference )
                    // InternalJararaca.g:862:3: ruleVariableReference
                    {
                     before(grammarAccess.getPrimaryAccess().getVariableReferenceParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableReference();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getVariableReferenceParserRuleCall_5()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__BooleanLiteral__Alternatives"
    // InternalJararaca.g:871:1: rule__BooleanLiteral__Alternatives : ( ( ruleTrueLiteral ) | ( ruleFalseLiteral ) );
    public final void rule__BooleanLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:875:1: ( ( ruleTrueLiteral ) | ( ruleFalseLiteral ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==38) ) {
                alt8=1;
            }
            else if ( (LA8_0==39) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalJararaca.g:876:2: ( ruleTrueLiteral )
                    {
                    // InternalJararaca.g:876:2: ( ruleTrueLiteral )
                    // InternalJararaca.g:877:3: ruleTrueLiteral
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getTrueLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTrueLiteral();

                    state._fsp--;

                     after(grammarAccess.getBooleanLiteralAccess().getTrueLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJararaca.g:882:2: ( ruleFalseLiteral )
                    {
                    // InternalJararaca.g:882:2: ( ruleFalseLiteral )
                    // InternalJararaca.g:883:3: ruleFalseLiteral
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getFalseLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFalseLiteral();

                    state._fsp--;

                     after(grammarAccess.getBooleanLiteralAccess().getFalseLiteralParserRuleCall_1()); 

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
    // $ANTLR end "rule__BooleanLiteral__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalJararaca.g:892:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:896:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalJararaca.g:897:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

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
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalJararaca.g:904:1: rule__Program__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:908:1: ( ( 'program' ) )
            // InternalJararaca.g:909:1: ( 'program' )
            {
            // InternalJararaca.g:909:1: ( 'program' )
            // InternalJararaca.g:910:2: 'program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalJararaca.g:919:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:923:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalJararaca.g:924:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

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
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalJararaca.g:931:1: rule__Program__Group__1__Impl : ( '{' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:935:1: ( ( '{' ) )
            // InternalJararaca.g:936:1: ( '{' )
            {
            // InternalJararaca.g:936:1: ( '{' )
            // InternalJararaca.g:937:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalJararaca.g:946:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:950:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalJararaca.g:951:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

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
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalJararaca.g:958:1: rule__Program__Group__2__Impl : ( ( rule__Program__StatementsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:962:1: ( ( ( rule__Program__StatementsAssignment_2 )* ) )
            // InternalJararaca.g:963:1: ( ( rule__Program__StatementsAssignment_2 )* )
            {
            // InternalJararaca.g:963:1: ( ( rule__Program__StatementsAssignment_2 )* )
            // InternalJararaca.g:964:2: ( rule__Program__StatementsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getStatementsAssignment_2()); 
            // InternalJararaca.g:965:2: ( rule__Program__StatementsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalJararaca.g:965:3: rule__Program__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Program__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getStatementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalJararaca.g:973:1: rule__Program__Group__3 : rule__Program__Group__3__Impl ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:977:1: ( rule__Program__Group__3__Impl )
            // InternalJararaca.g:978:2: rule__Program__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__3__Impl();

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
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalJararaca.g:984:1: rule__Program__Group__3__Impl : ( '}' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:988:1: ( ( '}' ) )
            // InternalJararaca.g:989:1: ( '}' )
            {
            // InternalJararaca.g:989:1: ( '}' )
            // InternalJararaca.g:990:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalJararaca.g:1000:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1004:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalJararaca.g:1005:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1();

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
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // InternalJararaca.g:1012:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1016:1: ( ( 'var' ) )
            // InternalJararaca.g:1017:1: ( 'var' )
            {
            // InternalJararaca.g:1017:1: ( 'var' )
            // InternalJararaca.g:1018:2: 'var'
            {
             before(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // InternalJararaca.g:1027:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1031:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalJararaca.g:1032:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__2();

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
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // InternalJararaca.g:1039:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1043:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalJararaca.g:1044:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalJararaca.g:1044:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalJararaca.g:1045:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalJararaca.g:1046:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalJararaca.g:1046:3: rule__VariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // InternalJararaca.g:1054:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1058:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalJararaca.g:1059:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3();

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
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // InternalJararaca.g:1066:1: rule__VariableDeclaration__Group__2__Impl : ( ( rule__VariableDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1070:1: ( ( ( rule__VariableDeclaration__TypeAssignment_2 ) ) )
            // InternalJararaca.g:1071:1: ( ( rule__VariableDeclaration__TypeAssignment_2 ) )
            {
            // InternalJararaca.g:1071:1: ( ( rule__VariableDeclaration__TypeAssignment_2 ) )
            // InternalJararaca.g:1072:2: ( rule__VariableDeclaration__TypeAssignment_2 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_2()); 
            // InternalJararaca.g:1073:2: ( rule__VariableDeclaration__TypeAssignment_2 )
            // InternalJararaca.g:1073:3: rule__VariableDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // InternalJararaca.g:1081:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4 ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1085:1: ( rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4 )
            // InternalJararaca.g:1086:2: rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__VariableDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__4();

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
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // InternalJararaca.g:1093:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__Group_3__0 )? ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1097:1: ( ( ( rule__VariableDeclaration__Group_3__0 )? ) )
            // InternalJararaca.g:1098:1: ( ( rule__VariableDeclaration__Group_3__0 )? )
            {
            // InternalJararaca.g:1098:1: ( ( rule__VariableDeclaration__Group_3__0 )? )
            // InternalJararaca.g:1099:2: ( rule__VariableDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup_3()); 
            // InternalJararaca.g:1100:2: ( rule__VariableDeclaration__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJararaca.g:1100:3: rule__VariableDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableDeclaration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__4"
    // InternalJararaca.g:1108:1: rule__VariableDeclaration__Group__4 : rule__VariableDeclaration__Group__4__Impl ;
    public final void rule__VariableDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1112:1: ( rule__VariableDeclaration__Group__4__Impl )
            // InternalJararaca.g:1113:2: rule__VariableDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__4__Impl();

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
    // $ANTLR end "rule__VariableDeclaration__Group__4"


    // $ANTLR start "rule__VariableDeclaration__Group__4__Impl"
    // InternalJararaca.g:1119:1: rule__VariableDeclaration__Group__4__Impl : ( ';' ) ;
    public final void rule__VariableDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1123:1: ( ( ';' ) )
            // InternalJararaca.g:1124:1: ( ';' )
            {
            // InternalJararaca.g:1124:1: ( ';' )
            // InternalJararaca.g:1125:2: ';'
            {
             before(grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__4__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_3__0"
    // InternalJararaca.g:1135:1: rule__VariableDeclaration__Group_3__0 : rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1 ;
    public final void rule__VariableDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1139:1: ( rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1 )
            // InternalJararaca.g:1140:2: rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__VariableDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group_3__1();

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
    // $ANTLR end "rule__VariableDeclaration__Group_3__0"


    // $ANTLR start "rule__VariableDeclaration__Group_3__0__Impl"
    // InternalJararaca.g:1147:1: rule__VariableDeclaration__Group_3__0__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1151:1: ( ( '=' ) )
            // InternalJararaca.g:1152:1: ( '=' )
            {
            // InternalJararaca.g:1152:1: ( '=' )
            // InternalJararaca.g:1153:2: '='
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_3__1"
    // InternalJararaca.g:1162:1: rule__VariableDeclaration__Group_3__1 : rule__VariableDeclaration__Group_3__1__Impl ;
    public final void rule__VariableDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1166:1: ( rule__VariableDeclaration__Group_3__1__Impl )
            // InternalJararaca.g:1167:2: rule__VariableDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group_3__1__Impl();

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
    // $ANTLR end "rule__VariableDeclaration__Group_3__1"


    // $ANTLR start "rule__VariableDeclaration__Group_3__1__Impl"
    // InternalJararaca.g:1173:1: rule__VariableDeclaration__Group_3__1__Impl : ( ( rule__VariableDeclaration__InitialValueAssignment_3_1 ) ) ;
    public final void rule__VariableDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1177:1: ( ( ( rule__VariableDeclaration__InitialValueAssignment_3_1 ) ) )
            // InternalJararaca.g:1178:1: ( ( rule__VariableDeclaration__InitialValueAssignment_3_1 ) )
            {
            // InternalJararaca.g:1178:1: ( ( rule__VariableDeclaration__InitialValueAssignment_3_1 ) )
            // InternalJararaca.g:1179:2: ( rule__VariableDeclaration__InitialValueAssignment_3_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getInitialValueAssignment_3_1()); 
            // InternalJararaca.g:1180:2: ( rule__VariableDeclaration__InitialValueAssignment_3_1 )
            // InternalJararaca.g:1180:3: rule__VariableDeclaration__InitialValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__InitialValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getInitialValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalJararaca.g:1189:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1193:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalJararaca.g:1194:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

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
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalJararaca.g:1201:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__NameAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1205:1: ( ( ( rule__Assignment__NameAssignment_0 ) ) )
            // InternalJararaca.g:1206:1: ( ( rule__Assignment__NameAssignment_0 ) )
            {
            // InternalJararaca.g:1206:1: ( ( rule__Assignment__NameAssignment_0 ) )
            // InternalJararaca.g:1207:2: ( rule__Assignment__NameAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getNameAssignment_0()); 
            // InternalJararaca.g:1208:2: ( rule__Assignment__NameAssignment_0 )
            // InternalJararaca.g:1208:3: rule__Assignment__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalJararaca.g:1216:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1220:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalJararaca.g:1221:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

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
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalJararaca.g:1228:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1232:1: ( ( '=' ) )
            // InternalJararaca.g:1233:1: ( '=' )
            {
            // InternalJararaca.g:1233:1: ( '=' )
            // InternalJararaca.g:1234:2: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalJararaca.g:1243:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1247:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // InternalJararaca.g:1248:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Assignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__3();

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
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalJararaca.g:1255:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1259:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalJararaca.g:1260:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalJararaca.g:1260:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalJararaca.g:1261:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalJararaca.g:1262:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalJararaca.g:1262:3: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__3"
    // InternalJararaca.g:1270:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1274:1: ( rule__Assignment__Group__3__Impl )
            // InternalJararaca.g:1275:2: rule__Assignment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__3__Impl();

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
    // $ANTLR end "rule__Assignment__Group__3"


    // $ANTLR start "rule__Assignment__Group__3__Impl"
    // InternalJararaca.g:1281:1: rule__Assignment__Group__3__Impl : ( ';' ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1285:1: ( ( ';' ) )
            // InternalJararaca.g:1286:1: ( ';' )
            {
            // InternalJararaca.g:1286:1: ( ';' )
            // InternalJararaca.g:1287:2: ';'
            {
             before(grammarAccess.getAssignmentAccess().getSemicolonKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3__Impl"


    // $ANTLR start "rule__IntType__Group__0"
    // InternalJararaca.g:1297:1: rule__IntType__Group__0 : rule__IntType__Group__0__Impl rule__IntType__Group__1 ;
    public final void rule__IntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1301:1: ( rule__IntType__Group__0__Impl rule__IntType__Group__1 )
            // InternalJararaca.g:1302:2: rule__IntType__Group__0__Impl rule__IntType__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__IntType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntType__Group__1();

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
    // $ANTLR end "rule__IntType__Group__0"


    // $ANTLR start "rule__IntType__Group__0__Impl"
    // InternalJararaca.g:1309:1: rule__IntType__Group__0__Impl : ( () ) ;
    public final void rule__IntType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1313:1: ( ( () ) )
            // InternalJararaca.g:1314:1: ( () )
            {
            // InternalJararaca.g:1314:1: ( () )
            // InternalJararaca.g:1315:2: ()
            {
             before(grammarAccess.getIntTypeAccess().getIntTypeAction_0()); 
            // InternalJararaca.g:1316:2: ()
            // InternalJararaca.g:1316:3: 
            {
            }

             after(grammarAccess.getIntTypeAccess().getIntTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntType__Group__0__Impl"


    // $ANTLR start "rule__IntType__Group__1"
    // InternalJararaca.g:1324:1: rule__IntType__Group__1 : rule__IntType__Group__1__Impl ;
    public final void rule__IntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1328:1: ( rule__IntType__Group__1__Impl )
            // InternalJararaca.g:1329:2: rule__IntType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntType__Group__1__Impl();

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
    // $ANTLR end "rule__IntType__Group__1"


    // $ANTLR start "rule__IntType__Group__1__Impl"
    // InternalJararaca.g:1335:1: rule__IntType__Group__1__Impl : ( 'int' ) ;
    public final void rule__IntType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1339:1: ( ( 'int' ) )
            // InternalJararaca.g:1340:1: ( 'int' )
            {
            // InternalJararaca.g:1340:1: ( 'int' )
            // InternalJararaca.g:1341:2: 'int'
            {
             before(grammarAccess.getIntTypeAccess().getIntKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getIntTypeAccess().getIntKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntType__Group__1__Impl"


    // $ANTLR start "rule__FloatType__Group__0"
    // InternalJararaca.g:1351:1: rule__FloatType__Group__0 : rule__FloatType__Group__0__Impl rule__FloatType__Group__1 ;
    public final void rule__FloatType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1355:1: ( rule__FloatType__Group__0__Impl rule__FloatType__Group__1 )
            // InternalJararaca.g:1356:2: rule__FloatType__Group__0__Impl rule__FloatType__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__FloatType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatType__Group__1();

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
    // $ANTLR end "rule__FloatType__Group__0"


    // $ANTLR start "rule__FloatType__Group__0__Impl"
    // InternalJararaca.g:1363:1: rule__FloatType__Group__0__Impl : ( () ) ;
    public final void rule__FloatType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1367:1: ( ( () ) )
            // InternalJararaca.g:1368:1: ( () )
            {
            // InternalJararaca.g:1368:1: ( () )
            // InternalJararaca.g:1369:2: ()
            {
             before(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0()); 
            // InternalJararaca.g:1370:2: ()
            // InternalJararaca.g:1370:3: 
            {
            }

             after(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatType__Group__0__Impl"


    // $ANTLR start "rule__FloatType__Group__1"
    // InternalJararaca.g:1378:1: rule__FloatType__Group__1 : rule__FloatType__Group__1__Impl ;
    public final void rule__FloatType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1382:1: ( rule__FloatType__Group__1__Impl )
            // InternalJararaca.g:1383:2: rule__FloatType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatType__Group__1__Impl();

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
    // $ANTLR end "rule__FloatType__Group__1"


    // $ANTLR start "rule__FloatType__Group__1__Impl"
    // InternalJararaca.g:1389:1: rule__FloatType__Group__1__Impl : ( 'decimal' ) ;
    public final void rule__FloatType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1393:1: ( ( 'decimal' ) )
            // InternalJararaca.g:1394:1: ( 'decimal' )
            {
            // InternalJararaca.g:1394:1: ( 'decimal' )
            // InternalJararaca.g:1395:2: 'decimal'
            {
             before(grammarAccess.getFloatTypeAccess().getDecimalKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFloatTypeAccess().getDecimalKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatType__Group__1__Impl"


    // $ANTLR start "rule__BooleanType__Group__0"
    // InternalJararaca.g:1405:1: rule__BooleanType__Group__0 : rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 ;
    public final void rule__BooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1409:1: ( rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 )
            // InternalJararaca.g:1410:2: rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__BooleanType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanType__Group__1();

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
    // $ANTLR end "rule__BooleanType__Group__0"


    // $ANTLR start "rule__BooleanType__Group__0__Impl"
    // InternalJararaca.g:1417:1: rule__BooleanType__Group__0__Impl : ( () ) ;
    public final void rule__BooleanType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1421:1: ( ( () ) )
            // InternalJararaca.g:1422:1: ( () )
            {
            // InternalJararaca.g:1422:1: ( () )
            // InternalJararaca.g:1423:2: ()
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 
            // InternalJararaca.g:1424:2: ()
            // InternalJararaca.g:1424:3: 
            {
            }

             after(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__0__Impl"


    // $ANTLR start "rule__BooleanType__Group__1"
    // InternalJararaca.g:1432:1: rule__BooleanType__Group__1 : rule__BooleanType__Group__1__Impl ;
    public final void rule__BooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1436:1: ( rule__BooleanType__Group__1__Impl )
            // InternalJararaca.g:1437:2: rule__BooleanType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__Group__1__Impl();

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
    // $ANTLR end "rule__BooleanType__Group__1"


    // $ANTLR start "rule__BooleanType__Group__1__Impl"
    // InternalJararaca.g:1443:1: rule__BooleanType__Group__1__Impl : ( 'boolean' ) ;
    public final void rule__BooleanType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1447:1: ( ( 'boolean' ) )
            // InternalJararaca.g:1448:1: ( 'boolean' )
            {
            // InternalJararaca.g:1448:1: ( 'boolean' )
            // InternalJararaca.g:1449:2: 'boolean'
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__1__Impl"


    // $ANTLR start "rule__StringType__Group__0"
    // InternalJararaca.g:1459:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1463:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalJararaca.g:1464:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__StringType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group__1();

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
    // $ANTLR end "rule__StringType__Group__0"


    // $ANTLR start "rule__StringType__Group__0__Impl"
    // InternalJararaca.g:1471:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1475:1: ( ( () ) )
            // InternalJararaca.g:1476:1: ( () )
            {
            // InternalJararaca.g:1476:1: ( () )
            // InternalJararaca.g:1477:2: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // InternalJararaca.g:1478:2: ()
            // InternalJararaca.g:1478:3: 
            {
            }

             after(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__0__Impl"


    // $ANTLR start "rule__StringType__Group__1"
    // InternalJararaca.g:1486:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1490:1: ( rule__StringType__Group__1__Impl )
            // InternalJararaca.g:1491:2: rule__StringType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group__1__Impl();

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
    // $ANTLR end "rule__StringType__Group__1"


    // $ANTLR start "rule__StringType__Group__1__Impl"
    // InternalJararaca.g:1497:1: rule__StringType__Group__1__Impl : ( 'string' ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1501:1: ( ( 'string' ) )
            // InternalJararaca.g:1502:1: ( 'string' )
            {
            // InternalJararaca.g:1502:1: ( 'string' )
            // InternalJararaca.g:1503:2: 'string'
            {
             before(grammarAccess.getStringTypeAccess().getStringKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalJararaca.g:1513:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1517:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalJararaca.g:1518:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1();

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
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // InternalJararaca.g:1525:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1529:1: ( ( ruleAndExpression ) )
            // InternalJararaca.g:1530:1: ( ruleAndExpression )
            {
            // InternalJararaca.g:1530:1: ( ruleAndExpression )
            // InternalJararaca.g:1531:2: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // InternalJararaca.g:1540:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1544:1: ( rule__OrExpression__Group__1__Impl )
            // InternalJararaca.g:1545:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1__Impl();

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
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // InternalJararaca.g:1551:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1555:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalJararaca.g:1556:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalJararaca.g:1556:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalJararaca.g:1557:2: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // InternalJararaca.g:1558:2: ( rule__OrExpression__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJararaca.g:1558:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // InternalJararaca.g:1567:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1571:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalJararaca.g:1572:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1();

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
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // InternalJararaca.g:1579:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1583:1: ( ( () ) )
            // InternalJararaca.g:1584:1: ( () )
            {
            // InternalJararaca.g:1584:1: ( () )
            // InternalJararaca.g:1585:2: ()
            {
             before(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0()); 
            // InternalJararaca.g:1586:2: ()
            // InternalJararaca.g:1586:3: 
            {
            }

             after(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // InternalJararaca.g:1594:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1598:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalJararaca.g:1599:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2();

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
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // InternalJararaca.g:1606:1: rule__OrExpression__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1610:1: ( ( 'or' ) )
            // InternalJararaca.g:1611:1: ( 'or' )
            {
            // InternalJararaca.g:1611:1: ( 'or' )
            // InternalJararaca.g:1612:2: 'or'
            {
             before(grammarAccess.getOrExpressionAccess().getOrKeyword_1_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getOrExpressionAccess().getOrKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // InternalJararaca.g:1621:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1625:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalJararaca.g:1626:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // InternalJararaca.g:1632:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1636:1: ( ( ( rule__OrExpression__RightAssignment_1_2 ) ) )
            // InternalJararaca.g:1637:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            {
            // InternalJararaca.g:1637:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            // InternalJararaca.g:1638:2: ( rule__OrExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 
            // InternalJararaca.g:1639:2: ( rule__OrExpression__RightAssignment_1_2 )
            // InternalJararaca.g:1639:3: rule__OrExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalJararaca.g:1648:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1652:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalJararaca.g:1653:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

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
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalJararaca.g:1660:1: rule__AndExpression__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1664:1: ( ( ruleComparison ) )
            // InternalJararaca.g:1665:1: ( ruleComparison )
            {
            // InternalJararaca.g:1665:1: ( ruleComparison )
            // InternalJararaca.g:1666:2: ruleComparison
            {
             before(grammarAccess.getAndExpressionAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getComparisonParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalJararaca.g:1675:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1679:1: ( rule__AndExpression__Group__1__Impl )
            // InternalJararaca.g:1680:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

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
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalJararaca.g:1686:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1690:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalJararaca.g:1691:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalJararaca.g:1691:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalJararaca.g:1692:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalJararaca.g:1693:2: ( rule__AndExpression__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalJararaca.g:1693:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalJararaca.g:1702:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1706:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalJararaca.g:1707:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

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
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalJararaca.g:1714:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1718:1: ( ( () ) )
            // InternalJararaca.g:1719:1: ( () )
            {
            // InternalJararaca.g:1719:1: ( () )
            // InternalJararaca.g:1720:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 
            // InternalJararaca.g:1721:2: ()
            // InternalJararaca.g:1721:3: 
            {
            }

             after(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalJararaca.g:1729:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1733:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalJararaca.g:1734:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2();

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
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalJararaca.g:1741:1: rule__AndExpression__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1745:1: ( ( 'and' ) )
            // InternalJararaca.g:1746:1: ( 'and' )
            {
            // InternalJararaca.g:1746:1: ( 'and' )
            // InternalJararaca.g:1747:2: 'and'
            {
             before(grammarAccess.getAndExpressionAccess().getAndKeyword_1_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAndExpressionAccess().getAndKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // InternalJararaca.g:1756:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1760:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalJararaca.g:1761:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // InternalJararaca.g:1767:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1771:1: ( ( ( rule__AndExpression__RightAssignment_1_2 ) ) )
            // InternalJararaca.g:1772:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            {
            // InternalJararaca.g:1772:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            // InternalJararaca.g:1773:2: ( rule__AndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            // InternalJararaca.g:1774:2: ( rule__AndExpression__RightAssignment_1_2 )
            // InternalJararaca.g:1774:3: rule__AndExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalJararaca.g:1783:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1787:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalJararaca.g:1788:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

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
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalJararaca.g:1795:1: rule__Comparison__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1799:1: ( ( ruleAddition ) )
            // InternalJararaca.g:1800:1: ( ruleAddition )
            {
            // InternalJararaca.g:1800:1: ( ruleAddition )
            // InternalJararaca.g:1801:2: ruleAddition
            {
             before(grammarAccess.getComparisonAccess().getAdditionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getAdditionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalJararaca.g:1810:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1814:1: ( rule__Comparison__Group__1__Impl )
            // InternalJararaca.g:1815:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalJararaca.g:1821:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1825:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalJararaca.g:1826:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalJararaca.g:1826:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalJararaca.g:1827:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalJararaca.g:1828:2: ( rule__Comparison__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=12 && LA13_0<=17)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalJararaca.g:1828:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getComparisonAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // InternalJararaca.g:1837:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1841:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalJararaca.g:1842:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1();

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
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // InternalJararaca.g:1849:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1853:1: ( ( () ) )
            // InternalJararaca.g:1854:1: ( () )
            {
            // InternalJararaca.g:1854:1: ( () )
            // InternalJararaca.g:1855:2: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // InternalJararaca.g:1856:2: ()
            // InternalJararaca.g:1856:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // InternalJararaca.g:1864:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1868:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // InternalJararaca.g:1869:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2();

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
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // InternalJararaca.g:1876:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OperatorAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1880:1: ( ( ( rule__Comparison__OperatorAssignment_1_1 ) ) )
            // InternalJararaca.g:1881:1: ( ( rule__Comparison__OperatorAssignment_1_1 ) )
            {
            // InternalJararaca.g:1881:1: ( ( rule__Comparison__OperatorAssignment_1_1 ) )
            // InternalJararaca.g:1882:2: ( rule__Comparison__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOperatorAssignment_1_1()); 
            // InternalJararaca.g:1883:2: ( rule__Comparison__OperatorAssignment_1_1 )
            // InternalJararaca.g:1883:3: rule__Comparison__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__2"
    // InternalJararaca.g:1891:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1895:1: ( rule__Comparison__Group_1__2__Impl )
            // InternalJararaca.g:1896:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1__2"


    // $ANTLR start "rule__Comparison__Group_1__2__Impl"
    // InternalJararaca.g:1902:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1906:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // InternalJararaca.g:1907:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // InternalJararaca.g:1907:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // InternalJararaca.g:1908:2: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // InternalJararaca.g:1909:2: ( rule__Comparison__RightAssignment_1_2 )
            // InternalJararaca.g:1909:3: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__2__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalJararaca.g:1918:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1922:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalJararaca.g:1923:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

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
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalJararaca.g:1930:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1934:1: ( ( ruleMultiplication ) )
            // InternalJararaca.g:1935:1: ( ruleMultiplication )
            {
            // InternalJararaca.g:1935:1: ( ruleMultiplication )
            // InternalJararaca.g:1936:2: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalJararaca.g:1945:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1949:1: ( rule__Addition__Group__1__Impl )
            // InternalJararaca.g:1950:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

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
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalJararaca.g:1956:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1960:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalJararaca.g:1961:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalJararaca.g:1961:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalJararaca.g:1962:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalJararaca.g:1963:2: ( rule__Addition__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=18 && LA14_0<=19)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJararaca.g:1963:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalJararaca.g:1972:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1976:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalJararaca.g:1977:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

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
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalJararaca.g:1984:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1988:1: ( ( () ) )
            // InternalJararaca.g:1989:1: ( () )
            {
            // InternalJararaca.g:1989:1: ( () )
            // InternalJararaca.g:1990:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalJararaca.g:1991:2: ()
            // InternalJararaca.g:1991:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalJararaca.g:1999:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2003:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalJararaca.g:2004:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2();

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
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalJararaca.g:2011:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2015:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalJararaca.g:2016:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalJararaca.g:2016:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalJararaca.g:2017:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalJararaca.g:2018:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalJararaca.g:2018:3: rule__Addition__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__2"
    // InternalJararaca.g:2026:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2030:1: ( rule__Addition__Group_1__2__Impl )
            // InternalJararaca.g:2031:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2__Impl();

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
    // $ANTLR end "rule__Addition__Group_1__2"


    // $ANTLR start "rule__Addition__Group_1__2__Impl"
    // InternalJararaca.g:2037:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2041:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalJararaca.g:2042:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalJararaca.g:2042:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalJararaca.g:2043:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalJararaca.g:2044:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalJararaca.g:2044:3: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalJararaca.g:2053:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2057:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalJararaca.g:2058:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

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
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalJararaca.g:2065:1: rule__Multiplication__Group__0__Impl : ( ruleUnary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2069:1: ( ( ruleUnary ) )
            // InternalJararaca.g:2070:1: ( ruleUnary )
            {
            // InternalJararaca.g:2070:1: ( ruleUnary )
            // InternalJararaca.g:2071:2: ruleUnary
            {
             before(grammarAccess.getMultiplicationAccess().getUnaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUnary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getUnaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalJararaca.g:2080:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2084:1: ( rule__Multiplication__Group__1__Impl )
            // InternalJararaca.g:2085:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalJararaca.g:2091:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2095:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalJararaca.g:2096:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalJararaca.g:2096:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalJararaca.g:2097:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalJararaca.g:2098:2: ( rule__Multiplication__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=20 && LA15_0<=22)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalJararaca.g:2098:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalJararaca.g:2107:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2111:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalJararaca.g:2112:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

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
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalJararaca.g:2119:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2123:1: ( ( () ) )
            // InternalJararaca.g:2124:1: ( () )
            {
            // InternalJararaca.g:2124:1: ( () )
            // InternalJararaca.g:2125:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalJararaca.g:2126:2: ()
            // InternalJararaca.g:2126:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalJararaca.g:2134:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2138:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalJararaca.g:2139:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2();

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
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalJararaca.g:2146:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2150:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalJararaca.g:2151:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalJararaca.g:2151:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalJararaca.g:2152:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalJararaca.g:2153:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalJararaca.g:2153:3: rule__Multiplication__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // InternalJararaca.g:2161:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2165:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalJararaca.g:2166:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1__2"


    // $ANTLR start "rule__Multiplication__Group_1__2__Impl"
    // InternalJararaca.g:2172:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2176:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalJararaca.g:2177:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalJararaca.g:2177:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalJararaca.g:2178:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalJararaca.g:2179:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalJararaca.g:2179:3: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__Unary__Group_0__0"
    // InternalJararaca.g:2188:1: rule__Unary__Group_0__0 : rule__Unary__Group_0__0__Impl rule__Unary__Group_0__1 ;
    public final void rule__Unary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2192:1: ( rule__Unary__Group_0__0__Impl rule__Unary__Group_0__1 )
            // InternalJararaca.g:2193:2: rule__Unary__Group_0__0__Impl rule__Unary__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__Unary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unary__Group_0__1();

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
    // $ANTLR end "rule__Unary__Group_0__0"


    // $ANTLR start "rule__Unary__Group_0__0__Impl"
    // InternalJararaca.g:2200:1: rule__Unary__Group_0__0__Impl : ( () ) ;
    public final void rule__Unary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2204:1: ( ( () ) )
            // InternalJararaca.g:2205:1: ( () )
            {
            // InternalJararaca.g:2205:1: ( () )
            // InternalJararaca.g:2206:2: ()
            {
             before(grammarAccess.getUnaryAccess().getNotExpressionAction_0_0()); 
            // InternalJararaca.g:2207:2: ()
            // InternalJararaca.g:2207:3: 
            {
            }

             after(grammarAccess.getUnaryAccess().getNotExpressionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__Group_0__0__Impl"


    // $ANTLR start "rule__Unary__Group_0__1"
    // InternalJararaca.g:2215:1: rule__Unary__Group_0__1 : rule__Unary__Group_0__1__Impl rule__Unary__Group_0__2 ;
    public final void rule__Unary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2219:1: ( rule__Unary__Group_0__1__Impl rule__Unary__Group_0__2 )
            // InternalJararaca.g:2220:2: rule__Unary__Group_0__1__Impl rule__Unary__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__Unary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unary__Group_0__2();

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
    // $ANTLR end "rule__Unary__Group_0__1"


    // $ANTLR start "rule__Unary__Group_0__1__Impl"
    // InternalJararaca.g:2227:1: rule__Unary__Group_0__1__Impl : ( 'not' ) ;
    public final void rule__Unary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2231:1: ( ( 'not' ) )
            // InternalJararaca.g:2232:1: ( 'not' )
            {
            // InternalJararaca.g:2232:1: ( 'not' )
            // InternalJararaca.g:2233:2: 'not'
            {
             before(grammarAccess.getUnaryAccess().getNotKeyword_0_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getUnaryAccess().getNotKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__Group_0__1__Impl"


    // $ANTLR start "rule__Unary__Group_0__2"
    // InternalJararaca.g:2242:1: rule__Unary__Group_0__2 : rule__Unary__Group_0__2__Impl ;
    public final void rule__Unary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2246:1: ( rule__Unary__Group_0__2__Impl )
            // InternalJararaca.g:2247:2: rule__Unary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Unary__Group_0__2__Impl();

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
    // $ANTLR end "rule__Unary__Group_0__2"


    // $ANTLR start "rule__Unary__Group_0__2__Impl"
    // InternalJararaca.g:2253:1: rule__Unary__Group_0__2__Impl : ( ( rule__Unary__OperandAssignment_0_2 ) ) ;
    public final void rule__Unary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2257:1: ( ( ( rule__Unary__OperandAssignment_0_2 ) ) )
            // InternalJararaca.g:2258:1: ( ( rule__Unary__OperandAssignment_0_2 ) )
            {
            // InternalJararaca.g:2258:1: ( ( rule__Unary__OperandAssignment_0_2 ) )
            // InternalJararaca.g:2259:2: ( rule__Unary__OperandAssignment_0_2 )
            {
             before(grammarAccess.getUnaryAccess().getOperandAssignment_0_2()); 
            // InternalJararaca.g:2260:2: ( rule__Unary__OperandAssignment_0_2 )
            // InternalJararaca.g:2260:3: rule__Unary__OperandAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Unary__OperandAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryAccess().getOperandAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__Group_0__2__Impl"


    // $ANTLR start "rule__Unary__Group_1__0"
    // InternalJararaca.g:2269:1: rule__Unary__Group_1__0 : rule__Unary__Group_1__0__Impl rule__Unary__Group_1__1 ;
    public final void rule__Unary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2273:1: ( rule__Unary__Group_1__0__Impl rule__Unary__Group_1__1 )
            // InternalJararaca.g:2274:2: rule__Unary__Group_1__0__Impl rule__Unary__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__Unary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unary__Group_1__1();

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
    // $ANTLR end "rule__Unary__Group_1__0"


    // $ANTLR start "rule__Unary__Group_1__0__Impl"
    // InternalJararaca.g:2281:1: rule__Unary__Group_1__0__Impl : ( () ) ;
    public final void rule__Unary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2285:1: ( ( () ) )
            // InternalJararaca.g:2286:1: ( () )
            {
            // InternalJararaca.g:2286:1: ( () )
            // InternalJararaca.g:2287:2: ()
            {
             before(grammarAccess.getUnaryAccess().getNegativeAction_1_0()); 
            // InternalJararaca.g:2288:2: ()
            // InternalJararaca.g:2288:3: 
            {
            }

             after(grammarAccess.getUnaryAccess().getNegativeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__Group_1__0__Impl"


    // $ANTLR start "rule__Unary__Group_1__1"
    // InternalJararaca.g:2296:1: rule__Unary__Group_1__1 : rule__Unary__Group_1__1__Impl rule__Unary__Group_1__2 ;
    public final void rule__Unary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2300:1: ( rule__Unary__Group_1__1__Impl rule__Unary__Group_1__2 )
            // InternalJararaca.g:2301:2: rule__Unary__Group_1__1__Impl rule__Unary__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Unary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unary__Group_1__2();

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
    // $ANTLR end "rule__Unary__Group_1__1"


    // $ANTLR start "rule__Unary__Group_1__1__Impl"
    // InternalJararaca.g:2308:1: rule__Unary__Group_1__1__Impl : ( '-' ) ;
    public final void rule__Unary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2312:1: ( ( '-' ) )
            // InternalJararaca.g:2313:1: ( '-' )
            {
            // InternalJararaca.g:2313:1: ( '-' )
            // InternalJararaca.g:2314:2: '-'
            {
             before(grammarAccess.getUnaryAccess().getHyphenMinusKeyword_1_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUnaryAccess().getHyphenMinusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__Group_1__1__Impl"


    // $ANTLR start "rule__Unary__Group_1__2"
    // InternalJararaca.g:2323:1: rule__Unary__Group_1__2 : rule__Unary__Group_1__2__Impl ;
    public final void rule__Unary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2327:1: ( rule__Unary__Group_1__2__Impl )
            // InternalJararaca.g:2328:2: rule__Unary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Unary__Group_1__2__Impl();

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
    // $ANTLR end "rule__Unary__Group_1__2"


    // $ANTLR start "rule__Unary__Group_1__2__Impl"
    // InternalJararaca.g:2334:1: rule__Unary__Group_1__2__Impl : ( ( rule__Unary__OperandAssignment_1_2 ) ) ;
    public final void rule__Unary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2338:1: ( ( ( rule__Unary__OperandAssignment_1_2 ) ) )
            // InternalJararaca.g:2339:1: ( ( rule__Unary__OperandAssignment_1_2 ) )
            {
            // InternalJararaca.g:2339:1: ( ( rule__Unary__OperandAssignment_1_2 ) )
            // InternalJararaca.g:2340:2: ( rule__Unary__OperandAssignment_1_2 )
            {
             before(grammarAccess.getUnaryAccess().getOperandAssignment_1_2()); 
            // InternalJararaca.g:2341:2: ( rule__Unary__OperandAssignment_1_2 )
            // InternalJararaca.g:2341:3: rule__Unary__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Unary__OperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryAccess().getOperandAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalJararaca.g:2350:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2354:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalJararaca.g:2355:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_27);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

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
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalJararaca.g:2362:1: rule__Primary__Group_0__0__Impl : ( () ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2366:1: ( ( () ) )
            // InternalJararaca.g:2367:1: ( () )
            {
            // InternalJararaca.g:2367:1: ( () )
            // InternalJararaca.g:2368:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getParenExpressionAction_0_0()); 
            // InternalJararaca.g:2369:2: ()
            // InternalJararaca.g:2369:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getParenExpressionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalJararaca.g:2377:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2381:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalJararaca.g:2382:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

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
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalJararaca.g:2389:1: rule__Primary__Group_0__1__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2393:1: ( ( '(' ) )
            // InternalJararaca.g:2394:1: ( '(' )
            {
            // InternalJararaca.g:2394:1: ( '(' )
            // InternalJararaca.g:2395:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalJararaca.g:2404:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl rule__Primary__Group_0__3 ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2408:1: ( rule__Primary__Group_0__2__Impl rule__Primary__Group_0__3 )
            // InternalJararaca.g:2409:2: rule__Primary__Group_0__2__Impl rule__Primary__Group_0__3
            {
            pushFollow(FOLLOW_28);
            rule__Primary__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__3();

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
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalJararaca.g:2416:1: rule__Primary__Group_0__2__Impl : ( ( rule__Primary__InnerAssignment_0_2 ) ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2420:1: ( ( ( rule__Primary__InnerAssignment_0_2 ) ) )
            // InternalJararaca.g:2421:1: ( ( rule__Primary__InnerAssignment_0_2 ) )
            {
            // InternalJararaca.g:2421:1: ( ( rule__Primary__InnerAssignment_0_2 ) )
            // InternalJararaca.g:2422:2: ( rule__Primary__InnerAssignment_0_2 )
            {
             before(grammarAccess.getPrimaryAccess().getInnerAssignment_0_2()); 
            // InternalJararaca.g:2423:2: ( rule__Primary__InnerAssignment_0_2 )
            // InternalJararaca.g:2423:3: rule__Primary__InnerAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__InnerAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getInnerAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__3"
    // InternalJararaca.g:2431:1: rule__Primary__Group_0__3 : rule__Primary__Group_0__3__Impl ;
    public final void rule__Primary__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2435:1: ( rule__Primary__Group_0__3__Impl )
            // InternalJararaca.g:2436:2: rule__Primary__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__3__Impl();

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
    // $ANTLR end "rule__Primary__Group_0__3"


    // $ANTLR start "rule__Primary__Group_0__3__Impl"
    // InternalJararaca.g:2442:1: rule__Primary__Group_0__3__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2446:1: ( ( ')' ) )
            // InternalJararaca.g:2447:1: ( ')' )
            {
            // InternalJararaca.g:2447:1: ( ')' )
            // InternalJararaca.g:2448:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__3__Impl"


    // $ANTLR start "rule__TrueLiteral__Group__0"
    // InternalJararaca.g:2458:1: rule__TrueLiteral__Group__0 : rule__TrueLiteral__Group__0__Impl rule__TrueLiteral__Group__1 ;
    public final void rule__TrueLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2462:1: ( rule__TrueLiteral__Group__0__Impl rule__TrueLiteral__Group__1 )
            // InternalJararaca.g:2463:2: rule__TrueLiteral__Group__0__Impl rule__TrueLiteral__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__TrueLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueLiteral__Group__1();

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
    // $ANTLR end "rule__TrueLiteral__Group__0"


    // $ANTLR start "rule__TrueLiteral__Group__0__Impl"
    // InternalJararaca.g:2470:1: rule__TrueLiteral__Group__0__Impl : ( () ) ;
    public final void rule__TrueLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2474:1: ( ( () ) )
            // InternalJararaca.g:2475:1: ( () )
            {
            // InternalJararaca.g:2475:1: ( () )
            // InternalJararaca.g:2476:2: ()
            {
             before(grammarAccess.getTrueLiteralAccess().getTrueLiteralAction_0()); 
            // InternalJararaca.g:2477:2: ()
            // InternalJararaca.g:2477:3: 
            {
            }

             after(grammarAccess.getTrueLiteralAccess().getTrueLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueLiteral__Group__0__Impl"


    // $ANTLR start "rule__TrueLiteral__Group__1"
    // InternalJararaca.g:2485:1: rule__TrueLiteral__Group__1 : rule__TrueLiteral__Group__1__Impl ;
    public final void rule__TrueLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2489:1: ( rule__TrueLiteral__Group__1__Impl )
            // InternalJararaca.g:2490:2: rule__TrueLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrueLiteral__Group__1__Impl();

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
    // $ANTLR end "rule__TrueLiteral__Group__1"


    // $ANTLR start "rule__TrueLiteral__Group__1__Impl"
    // InternalJararaca.g:2496:1: rule__TrueLiteral__Group__1__Impl : ( 'true' ) ;
    public final void rule__TrueLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2500:1: ( ( 'true' ) )
            // InternalJararaca.g:2501:1: ( 'true' )
            {
            // InternalJararaca.g:2501:1: ( 'true' )
            // InternalJararaca.g:2502:2: 'true'
            {
             before(grammarAccess.getTrueLiteralAccess().getTrueKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTrueLiteralAccess().getTrueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueLiteral__Group__1__Impl"


    // $ANTLR start "rule__FalseLiteral__Group__0"
    // InternalJararaca.g:2512:1: rule__FalseLiteral__Group__0 : rule__FalseLiteral__Group__0__Impl rule__FalseLiteral__Group__1 ;
    public final void rule__FalseLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2516:1: ( rule__FalseLiteral__Group__0__Impl rule__FalseLiteral__Group__1 )
            // InternalJararaca.g:2517:2: rule__FalseLiteral__Group__0__Impl rule__FalseLiteral__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__FalseLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FalseLiteral__Group__1();

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
    // $ANTLR end "rule__FalseLiteral__Group__0"


    // $ANTLR start "rule__FalseLiteral__Group__0__Impl"
    // InternalJararaca.g:2524:1: rule__FalseLiteral__Group__0__Impl : ( () ) ;
    public final void rule__FalseLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2528:1: ( ( () ) )
            // InternalJararaca.g:2529:1: ( () )
            {
            // InternalJararaca.g:2529:1: ( () )
            // InternalJararaca.g:2530:2: ()
            {
             before(grammarAccess.getFalseLiteralAccess().getFalseLiteralAction_0()); 
            // InternalJararaca.g:2531:2: ()
            // InternalJararaca.g:2531:3: 
            {
            }

             after(grammarAccess.getFalseLiteralAccess().getFalseLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseLiteral__Group__0__Impl"


    // $ANTLR start "rule__FalseLiteral__Group__1"
    // InternalJararaca.g:2539:1: rule__FalseLiteral__Group__1 : rule__FalseLiteral__Group__1__Impl ;
    public final void rule__FalseLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2543:1: ( rule__FalseLiteral__Group__1__Impl )
            // InternalJararaca.g:2544:2: rule__FalseLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FalseLiteral__Group__1__Impl();

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
    // $ANTLR end "rule__FalseLiteral__Group__1"


    // $ANTLR start "rule__FalseLiteral__Group__1__Impl"
    // InternalJararaca.g:2550:1: rule__FalseLiteral__Group__1__Impl : ( 'false' ) ;
    public final void rule__FalseLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2554:1: ( ( 'false' ) )
            // InternalJararaca.g:2555:1: ( 'false' )
            {
            // InternalJararaca.g:2555:1: ( 'false' )
            // InternalJararaca.g:2556:2: 'false'
            {
             before(grammarAccess.getFalseLiteralAccess().getFalseKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFalseLiteralAccess().getFalseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseLiteral__Group__1__Impl"


    // $ANTLR start "rule__Program__StatementsAssignment_2"
    // InternalJararaca.g:2566:1: rule__Program__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__Program__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2570:1: ( ( ruleStatement ) )
            // InternalJararaca.g:2571:2: ( ruleStatement )
            {
            // InternalJararaca.g:2571:2: ( ruleStatement )
            // InternalJararaca.g:2572:3: ruleStatement
            {
             before(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__StatementsAssignment_2"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalJararaca.g:2581:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2585:1: ( ( RULE_ID ) )
            // InternalJararaca.g:2586:2: ( RULE_ID )
            {
            // InternalJararaca.g:2586:2: ( RULE_ID )
            // InternalJararaca.g:2587:3: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__TypeAssignment_2"
    // InternalJararaca.g:2596:1: rule__VariableDeclaration__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__VariableDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2600:1: ( ( ruleType ) )
            // InternalJararaca.g:2601:2: ( ruleType )
            {
            // InternalJararaca.g:2601:2: ( ruleType )
            // InternalJararaca.g:2602:3: ruleType
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__TypeAssignment_2"


    // $ANTLR start "rule__VariableDeclaration__InitialValueAssignment_3_1"
    // InternalJararaca.g:2611:1: rule__VariableDeclaration__InitialValueAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__VariableDeclaration__InitialValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2615:1: ( ( ruleExpression ) )
            // InternalJararaca.g:2616:2: ( ruleExpression )
            {
            // InternalJararaca.g:2616:2: ( ruleExpression )
            // InternalJararaca.g:2617:3: ruleExpression
            {
             before(grammarAccess.getVariableDeclarationAccess().getInitialValueExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getInitialValueExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__InitialValueAssignment_3_1"


    // $ANTLR start "rule__Assignment__NameAssignment_0"
    // InternalJararaca.g:2626:1: rule__Assignment__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Assignment__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2630:1: ( ( RULE_ID ) )
            // InternalJararaca.g:2631:2: ( RULE_ID )
            {
            // InternalJararaca.g:2631:2: ( RULE_ID )
            // InternalJararaca.g:2632:3: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__NameAssignment_0"


    // $ANTLR start "rule__Assignment__ValueAssignment_2"
    // InternalJararaca.g:2641:1: rule__Assignment__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2645:1: ( ( ruleExpression ) )
            // InternalJararaca.g:2646:2: ( ruleExpression )
            {
            // InternalJararaca.g:2646:2: ( ruleExpression )
            // InternalJararaca.g:2647:3: ruleExpression
            {
             before(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValueAssignment_2"


    // $ANTLR start "rule__OrExpression__RightAssignment_1_2"
    // InternalJararaca.g:2656:1: rule__OrExpression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2660:1: ( ( ruleAndExpression ) )
            // InternalJararaca.g:2661:2: ( ruleAndExpression )
            {
            // InternalJararaca.g:2661:2: ( ruleAndExpression )
            // InternalJararaca.g:2662:3: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__RightAssignment_1_2"


    // $ANTLR start "rule__AndExpression__RightAssignment_1_2"
    // InternalJararaca.g:2671:1: rule__AndExpression__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__AndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2675:1: ( ( ruleComparison ) )
            // InternalJararaca.g:2676:2: ( ruleComparison )
            {
            // InternalJararaca.g:2676:2: ( ruleComparison )
            // InternalJararaca.g:2677:3: ruleComparison
            {
             before(grammarAccess.getAndExpressionAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getRightComparisonParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__RightAssignment_1_2"


    // $ANTLR start "rule__Comparison__OperatorAssignment_1_1"
    // InternalJararaca.g:2686:1: rule__Comparison__OperatorAssignment_1_1 : ( ( rule__Comparison__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2690:1: ( ( ( rule__Comparison__OperatorAlternatives_1_1_0 ) ) )
            // InternalJararaca.g:2691:2: ( ( rule__Comparison__OperatorAlternatives_1_1_0 ) )
            {
            // InternalJararaca.g:2691:2: ( ( rule__Comparison__OperatorAlternatives_1_1_0 ) )
            // InternalJararaca.g:2692:3: ( rule__Comparison__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOperatorAlternatives_1_1_0()); 
            // InternalJararaca.g:2693:3: ( rule__Comparison__OperatorAlternatives_1_1_0 )
            // InternalJararaca.g:2693:4: rule__Comparison__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__OperatorAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_2"
    // InternalJararaca.g:2701:1: rule__Comparison__RightAssignment_1_2 : ( ruleAddition ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2705:1: ( ( ruleAddition ) )
            // InternalJararaca.g:2706:2: ( ruleAddition )
            {
            // InternalJararaca.g:2706:2: ( ruleAddition )
            // InternalJararaca.g:2707:3: ruleAddition
            {
             before(grammarAccess.getComparisonAccess().getRightAdditionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightAdditionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightAssignment_1_2"


    // $ANTLR start "rule__Addition__OperatorAssignment_1_1"
    // InternalJararaca.g:2716:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2720:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalJararaca.g:2721:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalJararaca.g:2721:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalJararaca.g:2722:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalJararaca.g:2723:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalJararaca.g:2723:4: rule__Addition__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__OperatorAssignment_1_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_2"
    // InternalJararaca.g:2731:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2735:1: ( ( ruleMultiplication ) )
            // InternalJararaca.g:2736:2: ( ruleMultiplication )
            {
            // InternalJararaca.g:2736:2: ( ruleMultiplication )
            // InternalJararaca.g:2737:3: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_2"


    // $ANTLR start "rule__Multiplication__OperatorAssignment_1_1"
    // InternalJararaca.g:2746:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2750:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalJararaca.g:2751:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalJararaca.g:2751:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalJararaca.g:2752:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalJararaca.g:2753:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalJararaca.g:2753:4: rule__Multiplication__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OperatorAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_2"
    // InternalJararaca.g:2761:1: rule__Multiplication__RightAssignment_1_2 : ( ruleUnary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2765:1: ( ( ruleUnary ) )
            // InternalJararaca.g:2766:2: ( ruleUnary )
            {
            // InternalJararaca.g:2766:2: ( ruleUnary )
            // InternalJararaca.g:2767:3: ruleUnary
            {
             before(grammarAccess.getMultiplicationAccess().getRightUnaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightUnaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_2"


    // $ANTLR start "rule__Unary__OperandAssignment_0_2"
    // InternalJararaca.g:2776:1: rule__Unary__OperandAssignment_0_2 : ( ruleUnary ) ;
    public final void rule__Unary__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2780:1: ( ( ruleUnary ) )
            // InternalJararaca.g:2781:2: ( ruleUnary )
            {
            // InternalJararaca.g:2781:2: ( ruleUnary )
            // InternalJararaca.g:2782:3: ruleUnary
            {
             before(grammarAccess.getUnaryAccess().getOperandUnaryParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnary();

            state._fsp--;

             after(grammarAccess.getUnaryAccess().getOperandUnaryParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__OperandAssignment_0_2"


    // $ANTLR start "rule__Unary__OperandAssignment_1_2"
    // InternalJararaca.g:2791:1: rule__Unary__OperandAssignment_1_2 : ( ruleUnary ) ;
    public final void rule__Unary__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2795:1: ( ( ruleUnary ) )
            // InternalJararaca.g:2796:2: ( ruleUnary )
            {
            // InternalJararaca.g:2796:2: ( ruleUnary )
            // InternalJararaca.g:2797:3: ruleUnary
            {
             before(grammarAccess.getUnaryAccess().getOperandUnaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnary();

            state._fsp--;

             after(grammarAccess.getUnaryAccess().getOperandUnaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__OperandAssignment_1_2"


    // $ANTLR start "rule__Primary__InnerAssignment_0_2"
    // InternalJararaca.g:2806:1: rule__Primary__InnerAssignment_0_2 : ( ruleExpression ) ;
    public final void rule__Primary__InnerAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2810:1: ( ( ruleExpression ) )
            // InternalJararaca.g:2811:2: ( ruleExpression )
            {
            // InternalJararaca.g:2811:2: ( ruleExpression )
            // InternalJararaca.g:2812:3: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getInnerExpressionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getInnerExpressionParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__InnerAssignment_0_2"


    // $ANTLR start "rule__IntLiteral__ValueAssignment"
    // InternalJararaca.g:2821:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2825:1: ( ( RULE_INT ) )
            // InternalJararaca.g:2826:2: ( RULE_INT )
            {
            // InternalJararaca.g:2826:2: ( RULE_INT )
            // InternalJararaca.g:2827:3: RULE_INT
            {
             before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__ValueAssignment"


    // $ANTLR start "rule__FloatLiteral__ValueAssignment"
    // InternalJararaca.g:2836:1: rule__FloatLiteral__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2840:1: ( ( RULE_FLOAT ) )
            // InternalJararaca.g:2841:2: ( RULE_FLOAT )
            {
            // InternalJararaca.g:2841:2: ( RULE_FLOAT )
            // InternalJararaca.g:2842:3: RULE_FLOAT
            {
             before(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__ValueAssignment"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // InternalJararaca.g:2851:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2855:1: ( ( RULE_STRING ) )
            // InternalJararaca.g:2856:2: ( RULE_STRING )
            {
            // InternalJararaca.g:2856:2: ( RULE_STRING )
            // InternalJararaca.g:2857:3: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__VariableReference__NameAssignment"
    // InternalJararaca.g:2866:1: rule__VariableReference__NameAssignment : ( RULE_ID ) ;
    public final void rule__VariableReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2870:1: ( ( RULE_ID ) )
            // InternalJararaca.g:2871:2: ( RULE_ID )
            {
            // InternalJararaca.g:2871:2: ( RULE_ID )
            // InternalJararaca.g:2872:3: RULE_ID
            {
             before(grammarAccess.getVariableReferenceAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableReferenceAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000006000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000D8000800F0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000003F002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000C000000000L});

}