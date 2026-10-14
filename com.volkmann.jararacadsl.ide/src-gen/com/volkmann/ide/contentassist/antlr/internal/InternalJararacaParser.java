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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'program'", "'{'", "'}'", "'if'", "'('", "')'", "'else'", "'while'", "'do'", "';'", "'var'", "'='", "'int'", "'decimal'", "'boolean'", "'string'", "'or'", "'and'", "'not'", "'true'", "'false'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_FLOAT=6;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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


    // $ANTLR start "entryRuleBlock"
    // InternalJararaca.g:103:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalJararaca.g:104:1: ( ruleBlock EOF )
            // InternalJararaca.g:105:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalJararaca.g:112:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:116:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalJararaca.g:117:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalJararaca.g:117:2: ( ( rule__Block__Group__0 ) )
            // InternalJararaca.g:118:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalJararaca.g:119:3: ( rule__Block__Group__0 )
            // InternalJararaca.g:119:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleIfStatement"
    // InternalJararaca.g:128:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalJararaca.g:129:1: ( ruleIfStatement EOF )
            // InternalJararaca.g:130:1: ruleIfStatement EOF
            {
             before(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleIfStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementRule()); 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalJararaca.g:137:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:141:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalJararaca.g:142:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalJararaca.g:142:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalJararaca.g:143:3: ( rule__IfStatement__Group__0 )
            {
             before(grammarAccess.getIfStatementAccess().getGroup()); 
            // InternalJararaca.g:144:3: ( rule__IfStatement__Group__0 )
            // InternalJararaca.g:144:4: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleElsePart"
    // InternalJararaca.g:153:1: entryRuleElsePart : ruleElsePart EOF ;
    public final void entryRuleElsePart() throws RecognitionException {
        try {
            // InternalJararaca.g:154:1: ( ruleElsePart EOF )
            // InternalJararaca.g:155:1: ruleElsePart EOF
            {
             before(grammarAccess.getElsePartRule()); 
            pushFollow(FOLLOW_1);
            ruleElsePart();

            state._fsp--;

             after(grammarAccess.getElsePartRule()); 
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
    // $ANTLR end "entryRuleElsePart"


    // $ANTLR start "ruleElsePart"
    // InternalJararaca.g:162:1: ruleElsePart : ( ( rule__ElsePart__Alternatives ) ) ;
    public final void ruleElsePart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:166:2: ( ( ( rule__ElsePart__Alternatives ) ) )
            // InternalJararaca.g:167:2: ( ( rule__ElsePart__Alternatives ) )
            {
            // InternalJararaca.g:167:2: ( ( rule__ElsePart__Alternatives ) )
            // InternalJararaca.g:168:3: ( rule__ElsePart__Alternatives )
            {
             before(grammarAccess.getElsePartAccess().getAlternatives()); 
            // InternalJararaca.g:169:3: ( rule__ElsePart__Alternatives )
            // InternalJararaca.g:169:4: rule__ElsePart__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ElsePart__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElsePartAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElsePart"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalJararaca.g:178:1: entryRuleWhileStatement : ruleWhileStatement EOF ;
    public final void entryRuleWhileStatement() throws RecognitionException {
        try {
            // InternalJararaca.g:179:1: ( ruleWhileStatement EOF )
            // InternalJararaca.g:180:1: ruleWhileStatement EOF
            {
             before(grammarAccess.getWhileStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleWhileStatement();

            state._fsp--;

             after(grammarAccess.getWhileStatementRule()); 
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
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalJararaca.g:187:1: ruleWhileStatement : ( ( rule__WhileStatement__Group__0 ) ) ;
    public final void ruleWhileStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:191:2: ( ( ( rule__WhileStatement__Group__0 ) ) )
            // InternalJararaca.g:192:2: ( ( rule__WhileStatement__Group__0 ) )
            {
            // InternalJararaca.g:192:2: ( ( rule__WhileStatement__Group__0 ) )
            // InternalJararaca.g:193:3: ( rule__WhileStatement__Group__0 )
            {
             before(grammarAccess.getWhileStatementAccess().getGroup()); 
            // InternalJararaca.g:194:3: ( rule__WhileStatement__Group__0 )
            // InternalJararaca.g:194:4: rule__WhileStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleDoWhileStatement"
    // InternalJararaca.g:203:1: entryRuleDoWhileStatement : ruleDoWhileStatement EOF ;
    public final void entryRuleDoWhileStatement() throws RecognitionException {
        try {
            // InternalJararaca.g:204:1: ( ruleDoWhileStatement EOF )
            // InternalJararaca.g:205:1: ruleDoWhileStatement EOF
            {
             before(grammarAccess.getDoWhileStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleDoWhileStatement();

            state._fsp--;

             after(grammarAccess.getDoWhileStatementRule()); 
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
    // $ANTLR end "entryRuleDoWhileStatement"


    // $ANTLR start "ruleDoWhileStatement"
    // InternalJararaca.g:212:1: ruleDoWhileStatement : ( ( rule__DoWhileStatement__Group__0 ) ) ;
    public final void ruleDoWhileStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:216:2: ( ( ( rule__DoWhileStatement__Group__0 ) ) )
            // InternalJararaca.g:217:2: ( ( rule__DoWhileStatement__Group__0 ) )
            {
            // InternalJararaca.g:217:2: ( ( rule__DoWhileStatement__Group__0 ) )
            // InternalJararaca.g:218:3: ( rule__DoWhileStatement__Group__0 )
            {
             before(grammarAccess.getDoWhileStatementAccess().getGroup()); 
            // InternalJararaca.g:219:3: ( rule__DoWhileStatement__Group__0 )
            // InternalJararaca.g:219:4: rule__DoWhileStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoWhileStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoWhileStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoWhileStatement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalJararaca.g:228:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalJararaca.g:229:1: ( ruleVariableDeclaration EOF )
            // InternalJararaca.g:230:1: ruleVariableDeclaration EOF
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
    // InternalJararaca.g:237:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:241:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalJararaca.g:242:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalJararaca.g:242:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalJararaca.g:243:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalJararaca.g:244:3: ( rule__VariableDeclaration__Group__0 )
            // InternalJararaca.g:244:4: rule__VariableDeclaration__Group__0
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
    // InternalJararaca.g:253:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalJararaca.g:254:1: ( ruleAssignment EOF )
            // InternalJararaca.g:255:1: ruleAssignment EOF
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
    // InternalJararaca.g:262:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:266:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalJararaca.g:267:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalJararaca.g:267:2: ( ( rule__Assignment__Group__0 ) )
            // InternalJararaca.g:268:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalJararaca.g:269:3: ( rule__Assignment__Group__0 )
            // InternalJararaca.g:269:4: rule__Assignment__Group__0
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
    // InternalJararaca.g:278:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalJararaca.g:279:1: ( ruleType EOF )
            // InternalJararaca.g:280:1: ruleType EOF
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
    // InternalJararaca.g:287:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:291:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalJararaca.g:292:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalJararaca.g:292:2: ( ( rule__Type__Alternatives ) )
            // InternalJararaca.g:293:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalJararaca.g:294:3: ( rule__Type__Alternatives )
            // InternalJararaca.g:294:4: rule__Type__Alternatives
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
    // InternalJararaca.g:303:1: entryRuleIntType : ruleIntType EOF ;
    public final void entryRuleIntType() throws RecognitionException {
        try {
            // InternalJararaca.g:304:1: ( ruleIntType EOF )
            // InternalJararaca.g:305:1: ruleIntType EOF
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
    // InternalJararaca.g:312:1: ruleIntType : ( ( rule__IntType__Group__0 ) ) ;
    public final void ruleIntType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:316:2: ( ( ( rule__IntType__Group__0 ) ) )
            // InternalJararaca.g:317:2: ( ( rule__IntType__Group__0 ) )
            {
            // InternalJararaca.g:317:2: ( ( rule__IntType__Group__0 ) )
            // InternalJararaca.g:318:3: ( rule__IntType__Group__0 )
            {
             before(grammarAccess.getIntTypeAccess().getGroup()); 
            // InternalJararaca.g:319:3: ( rule__IntType__Group__0 )
            // InternalJararaca.g:319:4: rule__IntType__Group__0
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
    // InternalJararaca.g:328:1: entryRuleFloatType : ruleFloatType EOF ;
    public final void entryRuleFloatType() throws RecognitionException {
        try {
            // InternalJararaca.g:329:1: ( ruleFloatType EOF )
            // InternalJararaca.g:330:1: ruleFloatType EOF
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
    // InternalJararaca.g:337:1: ruleFloatType : ( ( rule__FloatType__Group__0 ) ) ;
    public final void ruleFloatType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:341:2: ( ( ( rule__FloatType__Group__0 ) ) )
            // InternalJararaca.g:342:2: ( ( rule__FloatType__Group__0 ) )
            {
            // InternalJararaca.g:342:2: ( ( rule__FloatType__Group__0 ) )
            // InternalJararaca.g:343:3: ( rule__FloatType__Group__0 )
            {
             before(grammarAccess.getFloatTypeAccess().getGroup()); 
            // InternalJararaca.g:344:3: ( rule__FloatType__Group__0 )
            // InternalJararaca.g:344:4: rule__FloatType__Group__0
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
    // InternalJararaca.g:353:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // InternalJararaca.g:354:1: ( ruleBooleanType EOF )
            // InternalJararaca.g:355:1: ruleBooleanType EOF
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
    // InternalJararaca.g:362:1: ruleBooleanType : ( ( rule__BooleanType__Group__0 ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:366:2: ( ( ( rule__BooleanType__Group__0 ) ) )
            // InternalJararaca.g:367:2: ( ( rule__BooleanType__Group__0 ) )
            {
            // InternalJararaca.g:367:2: ( ( rule__BooleanType__Group__0 ) )
            // InternalJararaca.g:368:3: ( rule__BooleanType__Group__0 )
            {
             before(grammarAccess.getBooleanTypeAccess().getGroup()); 
            // InternalJararaca.g:369:3: ( rule__BooleanType__Group__0 )
            // InternalJararaca.g:369:4: rule__BooleanType__Group__0
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
    // InternalJararaca.g:378:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalJararaca.g:379:1: ( ruleStringType EOF )
            // InternalJararaca.g:380:1: ruleStringType EOF
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
    // InternalJararaca.g:387:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:391:2: ( ( ( rule__StringType__Group__0 ) ) )
            // InternalJararaca.g:392:2: ( ( rule__StringType__Group__0 ) )
            {
            // InternalJararaca.g:392:2: ( ( rule__StringType__Group__0 ) )
            // InternalJararaca.g:393:3: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // InternalJararaca.g:394:3: ( rule__StringType__Group__0 )
            // InternalJararaca.g:394:4: rule__StringType__Group__0
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
    // InternalJararaca.g:403:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalJararaca.g:404:1: ( ruleExpression EOF )
            // InternalJararaca.g:405:1: ruleExpression EOF
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
    // InternalJararaca.g:412:1: ruleExpression : ( ruleOrExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:416:2: ( ( ruleOrExpression ) )
            // InternalJararaca.g:417:2: ( ruleOrExpression )
            {
            // InternalJararaca.g:417:2: ( ruleOrExpression )
            // InternalJararaca.g:418:3: ruleOrExpression
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
    // InternalJararaca.g:428:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalJararaca.g:429:1: ( ruleOrExpression EOF )
            // InternalJararaca.g:430:1: ruleOrExpression EOF
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
    // InternalJararaca.g:437:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:441:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalJararaca.g:442:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalJararaca.g:442:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalJararaca.g:443:3: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // InternalJararaca.g:444:3: ( rule__OrExpression__Group__0 )
            // InternalJararaca.g:444:4: rule__OrExpression__Group__0
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
    // InternalJararaca.g:453:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalJararaca.g:454:1: ( ruleAndExpression EOF )
            // InternalJararaca.g:455:1: ruleAndExpression EOF
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
    // InternalJararaca.g:462:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:466:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalJararaca.g:467:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalJararaca.g:467:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalJararaca.g:468:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalJararaca.g:469:3: ( rule__AndExpression__Group__0 )
            // InternalJararaca.g:469:4: rule__AndExpression__Group__0
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
    // InternalJararaca.g:478:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalJararaca.g:479:1: ( ruleComparison EOF )
            // InternalJararaca.g:480:1: ruleComparison EOF
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
    // InternalJararaca.g:487:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:491:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalJararaca.g:492:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalJararaca.g:492:2: ( ( rule__Comparison__Group__0 ) )
            // InternalJararaca.g:493:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalJararaca.g:494:3: ( rule__Comparison__Group__0 )
            // InternalJararaca.g:494:4: rule__Comparison__Group__0
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
    // InternalJararaca.g:503:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalJararaca.g:504:1: ( ruleAddition EOF )
            // InternalJararaca.g:505:1: ruleAddition EOF
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
    // InternalJararaca.g:512:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:516:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalJararaca.g:517:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalJararaca.g:517:2: ( ( rule__Addition__Group__0 ) )
            // InternalJararaca.g:518:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalJararaca.g:519:3: ( rule__Addition__Group__0 )
            // InternalJararaca.g:519:4: rule__Addition__Group__0
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
    // InternalJararaca.g:528:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalJararaca.g:529:1: ( ruleMultiplication EOF )
            // InternalJararaca.g:530:1: ruleMultiplication EOF
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
    // InternalJararaca.g:537:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:541:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalJararaca.g:542:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalJararaca.g:542:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalJararaca.g:543:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalJararaca.g:544:3: ( rule__Multiplication__Group__0 )
            // InternalJararaca.g:544:4: rule__Multiplication__Group__0
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
    // InternalJararaca.g:553:1: entryRuleUnary : ruleUnary EOF ;
    public final void entryRuleUnary() throws RecognitionException {
        try {
            // InternalJararaca.g:554:1: ( ruleUnary EOF )
            // InternalJararaca.g:555:1: ruleUnary EOF
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
    // InternalJararaca.g:562:1: ruleUnary : ( ( rule__Unary__Alternatives ) ) ;
    public final void ruleUnary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:566:2: ( ( ( rule__Unary__Alternatives ) ) )
            // InternalJararaca.g:567:2: ( ( rule__Unary__Alternatives ) )
            {
            // InternalJararaca.g:567:2: ( ( rule__Unary__Alternatives ) )
            // InternalJararaca.g:568:3: ( rule__Unary__Alternatives )
            {
             before(grammarAccess.getUnaryAccess().getAlternatives()); 
            // InternalJararaca.g:569:3: ( rule__Unary__Alternatives )
            // InternalJararaca.g:569:4: rule__Unary__Alternatives
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
    // InternalJararaca.g:578:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalJararaca.g:579:1: ( rulePrimary EOF )
            // InternalJararaca.g:580:1: rulePrimary EOF
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
    // InternalJararaca.g:587:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:591:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalJararaca.g:592:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalJararaca.g:592:2: ( ( rule__Primary__Alternatives ) )
            // InternalJararaca.g:593:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalJararaca.g:594:3: ( rule__Primary__Alternatives )
            // InternalJararaca.g:594:4: rule__Primary__Alternatives
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
    // InternalJararaca.g:603:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalJararaca.g:604:1: ( ruleIntLiteral EOF )
            // InternalJararaca.g:605:1: ruleIntLiteral EOF
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
    // InternalJararaca.g:612:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:616:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // InternalJararaca.g:617:2: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // InternalJararaca.g:617:2: ( ( rule__IntLiteral__ValueAssignment ) )
            // InternalJararaca.g:618:3: ( rule__IntLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            // InternalJararaca.g:619:3: ( rule__IntLiteral__ValueAssignment )
            // InternalJararaca.g:619:4: rule__IntLiteral__ValueAssignment
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
    // InternalJararaca.g:628:1: entryRuleFloatLiteral : ruleFloatLiteral EOF ;
    public final void entryRuleFloatLiteral() throws RecognitionException {
        try {
            // InternalJararaca.g:629:1: ( ruleFloatLiteral EOF )
            // InternalJararaca.g:630:1: ruleFloatLiteral EOF
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
    // InternalJararaca.g:637:1: ruleFloatLiteral : ( ( rule__FloatLiteral__ValueAssignment ) ) ;
    public final void ruleFloatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:641:2: ( ( ( rule__FloatLiteral__ValueAssignment ) ) )
            // InternalJararaca.g:642:2: ( ( rule__FloatLiteral__ValueAssignment ) )
            {
            // InternalJararaca.g:642:2: ( ( rule__FloatLiteral__ValueAssignment ) )
            // InternalJararaca.g:643:3: ( rule__FloatLiteral__ValueAssignment )
            {
             before(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
            // InternalJararaca.g:644:3: ( rule__FloatLiteral__ValueAssignment )
            // InternalJararaca.g:644:4: rule__FloatLiteral__ValueAssignment
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
    // InternalJararaca.g:653:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalJararaca.g:654:1: ( ruleBooleanLiteral EOF )
            // InternalJararaca.g:655:1: ruleBooleanLiteral EOF
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
    // InternalJararaca.g:662:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Alternatives ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:666:2: ( ( ( rule__BooleanLiteral__Alternatives ) ) )
            // InternalJararaca.g:667:2: ( ( rule__BooleanLiteral__Alternatives ) )
            {
            // InternalJararaca.g:667:2: ( ( rule__BooleanLiteral__Alternatives ) )
            // InternalJararaca.g:668:3: ( rule__BooleanLiteral__Alternatives )
            {
             before(grammarAccess.getBooleanLiteralAccess().getAlternatives()); 
            // InternalJararaca.g:669:3: ( rule__BooleanLiteral__Alternatives )
            // InternalJararaca.g:669:4: rule__BooleanLiteral__Alternatives
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
    // InternalJararaca.g:678:1: entryRuleTrueLiteral : ruleTrueLiteral EOF ;
    public final void entryRuleTrueLiteral() throws RecognitionException {
        try {
            // InternalJararaca.g:679:1: ( ruleTrueLiteral EOF )
            // InternalJararaca.g:680:1: ruleTrueLiteral EOF
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
    // InternalJararaca.g:687:1: ruleTrueLiteral : ( ( rule__TrueLiteral__Group__0 ) ) ;
    public final void ruleTrueLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:691:2: ( ( ( rule__TrueLiteral__Group__0 ) ) )
            // InternalJararaca.g:692:2: ( ( rule__TrueLiteral__Group__0 ) )
            {
            // InternalJararaca.g:692:2: ( ( rule__TrueLiteral__Group__0 ) )
            // InternalJararaca.g:693:3: ( rule__TrueLiteral__Group__0 )
            {
             before(grammarAccess.getTrueLiteralAccess().getGroup()); 
            // InternalJararaca.g:694:3: ( rule__TrueLiteral__Group__0 )
            // InternalJararaca.g:694:4: rule__TrueLiteral__Group__0
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
    // InternalJararaca.g:703:1: entryRuleFalseLiteral : ruleFalseLiteral EOF ;
    public final void entryRuleFalseLiteral() throws RecognitionException {
        try {
            // InternalJararaca.g:704:1: ( ruleFalseLiteral EOF )
            // InternalJararaca.g:705:1: ruleFalseLiteral EOF
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
    // InternalJararaca.g:712:1: ruleFalseLiteral : ( ( rule__FalseLiteral__Group__0 ) ) ;
    public final void ruleFalseLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:716:2: ( ( ( rule__FalseLiteral__Group__0 ) ) )
            // InternalJararaca.g:717:2: ( ( rule__FalseLiteral__Group__0 ) )
            {
            // InternalJararaca.g:717:2: ( ( rule__FalseLiteral__Group__0 ) )
            // InternalJararaca.g:718:3: ( rule__FalseLiteral__Group__0 )
            {
             before(grammarAccess.getFalseLiteralAccess().getGroup()); 
            // InternalJararaca.g:719:3: ( rule__FalseLiteral__Group__0 )
            // InternalJararaca.g:719:4: rule__FalseLiteral__Group__0
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
    // InternalJararaca.g:728:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalJararaca.g:729:1: ( ruleStringLiteral EOF )
            // InternalJararaca.g:730:1: ruleStringLiteral EOF
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
    // InternalJararaca.g:737:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:741:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalJararaca.g:742:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalJararaca.g:742:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalJararaca.g:743:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalJararaca.g:744:3: ( rule__StringLiteral__ValueAssignment )
            // InternalJararaca.g:744:4: rule__StringLiteral__ValueAssignment
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
    // InternalJararaca.g:753:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // InternalJararaca.g:754:1: ( ruleVariableReference EOF )
            // InternalJararaca.g:755:1: ruleVariableReference EOF
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
    // InternalJararaca.g:762:1: ruleVariableReference : ( ( rule__VariableReference__NameAssignment ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:766:2: ( ( ( rule__VariableReference__NameAssignment ) ) )
            // InternalJararaca.g:767:2: ( ( rule__VariableReference__NameAssignment ) )
            {
            // InternalJararaca.g:767:2: ( ( rule__VariableReference__NameAssignment ) )
            // InternalJararaca.g:768:3: ( rule__VariableReference__NameAssignment )
            {
             before(grammarAccess.getVariableReferenceAccess().getNameAssignment()); 
            // InternalJararaca.g:769:3: ( rule__VariableReference__NameAssignment )
            // InternalJararaca.g:769:4: rule__VariableReference__NameAssignment
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
    // InternalJararaca.g:777:1: rule__Statement__Alternatives : ( ( ruleVariableDeclaration ) | ( ruleAssignment ) | ( ruleIfStatement ) | ( ruleWhileStatement ) | ( ruleDoWhileStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:781:1: ( ( ruleVariableDeclaration ) | ( ruleAssignment ) | ( ruleIfStatement ) | ( ruleWhileStatement ) | ( ruleDoWhileStatement ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
                {
                alt1=2;
                }
                break;
            case 26:
                {
                alt1=3;
                }
                break;
            case 30:
                {
                alt1=4;
                }
                break;
            case 31:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalJararaca.g:782:2: ( ruleVariableDeclaration )
                    {
                    // InternalJararaca.g:782:2: ( ruleVariableDeclaration )
                    // InternalJararaca.g:783:3: ruleVariableDeclaration
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
                    // InternalJararaca.g:788:2: ( ruleAssignment )
                    {
                    // InternalJararaca.g:788:2: ( ruleAssignment )
                    // InternalJararaca.g:789:3: ruleAssignment
                    {
                     before(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJararaca.g:794:2: ( ruleIfStatement )
                    {
                    // InternalJararaca.g:794:2: ( ruleIfStatement )
                    // InternalJararaca.g:795:3: ruleIfStatement
                    {
                     before(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIfStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJararaca.g:800:2: ( ruleWhileStatement )
                    {
                    // InternalJararaca.g:800:2: ( ruleWhileStatement )
                    // InternalJararaca.g:801:3: ruleWhileStatement
                    {
                     before(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleWhileStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJararaca.g:806:2: ( ruleDoWhileStatement )
                    {
                    // InternalJararaca.g:806:2: ( ruleDoWhileStatement )
                    // InternalJararaca.g:807:3: ruleDoWhileStatement
                    {
                     before(grammarAccess.getStatementAccess().getDoWhileStatementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDoWhileStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDoWhileStatementParserRuleCall_4()); 

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


    // $ANTLR start "rule__ElsePart__Alternatives"
    // InternalJararaca.g:816:1: rule__ElsePart__Alternatives : ( ( ruleIfStatement ) | ( ruleBlock ) );
    public final void rule__ElsePart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:820:1: ( ( ruleIfStatement ) | ( ruleBlock ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            else if ( (LA2_0==24) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJararaca.g:821:2: ( ruleIfStatement )
                    {
                    // InternalJararaca.g:821:2: ( ruleIfStatement )
                    // InternalJararaca.g:822:3: ruleIfStatement
                    {
                     before(grammarAccess.getElsePartAccess().getIfStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIfStatement();

                    state._fsp--;

                     after(grammarAccess.getElsePartAccess().getIfStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJararaca.g:827:2: ( ruleBlock )
                    {
                    // InternalJararaca.g:827:2: ( ruleBlock )
                    // InternalJararaca.g:828:3: ruleBlock
                    {
                     before(grammarAccess.getElsePartAccess().getBlockParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBlock();

                    state._fsp--;

                     after(grammarAccess.getElsePartAccess().getBlockParserRuleCall_1()); 

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
    // $ANTLR end "rule__ElsePart__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalJararaca.g:837:1: rule__Type__Alternatives : ( ( ruleIntType ) | ( ruleFloatType ) | ( ruleBooleanType ) | ( ruleStringType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:841:1: ( ( ruleIntType ) | ( ruleFloatType ) | ( ruleBooleanType ) | ( ruleStringType ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt3=1;
                }
                break;
            case 36:
                {
                alt3=2;
                }
                break;
            case 37:
                {
                alt3=3;
                }
                break;
            case 38:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalJararaca.g:842:2: ( ruleIntType )
                    {
                    // InternalJararaca.g:842:2: ( ruleIntType )
                    // InternalJararaca.g:843:3: ruleIntType
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
                    // InternalJararaca.g:848:2: ( ruleFloatType )
                    {
                    // InternalJararaca.g:848:2: ( ruleFloatType )
                    // InternalJararaca.g:849:3: ruleFloatType
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
                    // InternalJararaca.g:854:2: ( ruleBooleanType )
                    {
                    // InternalJararaca.g:854:2: ( ruleBooleanType )
                    // InternalJararaca.g:855:3: ruleBooleanType
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
                    // InternalJararaca.g:860:2: ( ruleStringType )
                    {
                    // InternalJararaca.g:860:2: ( ruleStringType )
                    // InternalJararaca.g:861:3: ruleStringType
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
    // InternalJararaca.g:870:1: rule__Comparison__OperatorAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '<' ) | ( '>' ) );
    public final void rule__Comparison__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:874:1: ( ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '<' ) | ( '>' ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            case 16:
                {
                alt4=5;
                }
                break;
            case 17:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalJararaca.g:875:2: ( '==' )
                    {
                    // InternalJararaca.g:875:2: ( '==' )
                    // InternalJararaca.g:876:3: '=='
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJararaca.g:881:2: ( '!=' )
                    {
                    // InternalJararaca.g:881:2: ( '!=' )
                    // InternalJararaca.g:882:3: '!='
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJararaca.g:887:2: ( '<=' )
                    {
                    // InternalJararaca.g:887:2: ( '<=' )
                    // InternalJararaca.g:888:3: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJararaca.g:893:2: ( '>=' )
                    {
                    // InternalJararaca.g:893:2: ( '>=' )
                    // InternalJararaca.g:894:3: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJararaca.g:899:2: ( '<' )
                    {
                    // InternalJararaca.g:899:2: ( '<' )
                    // InternalJararaca.g:900:3: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorLessThanSignKeyword_1_1_0_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOperatorLessThanSignKeyword_1_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJararaca.g:905:2: ( '>' )
                    {
                    // InternalJararaca.g:905:2: ( '>' )
                    // InternalJararaca.g:906:3: '>'
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
    // InternalJararaca.g:915:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:919:1: ( ( '+' ) | ( '-' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalJararaca.g:920:2: ( '+' )
                    {
                    // InternalJararaca.g:920:2: ( '+' )
                    // InternalJararaca.g:921:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJararaca.g:926:2: ( '-' )
                    {
                    // InternalJararaca.g:926:2: ( '-' )
                    // InternalJararaca.g:927:3: '-'
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
    // InternalJararaca.g:936:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) | ( '%' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:940:1: ( ( '*' ) | ( '/' ) | ( '%' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
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
                    // InternalJararaca.g:941:2: ( '*' )
                    {
                    // InternalJararaca.g:941:2: ( '*' )
                    // InternalJararaca.g:942:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJararaca.g:947:2: ( '/' )
                    {
                    // InternalJararaca.g:947:2: ( '/' )
                    // InternalJararaca.g:948:3: '/'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJararaca.g:953:2: ( '%' )
                    {
                    // InternalJararaca.g:953:2: ( '%' )
                    // InternalJararaca.g:954:3: '%'
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
    // InternalJararaca.g:963:1: rule__Unary__Alternatives : ( ( ( rule__Unary__Group_0__0 ) ) | ( ( rule__Unary__Group_1__0 ) ) | ( rulePrimary ) );
    public final void rule__Unary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:967:1: ( ( ( rule__Unary__Group_0__0 ) ) | ( ( rule__Unary__Group_1__0 ) ) | ( rulePrimary ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_STRING:
            case 27:
            case 42:
            case 43:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalJararaca.g:968:2: ( ( rule__Unary__Group_0__0 ) )
                    {
                    // InternalJararaca.g:968:2: ( ( rule__Unary__Group_0__0 ) )
                    // InternalJararaca.g:969:3: ( rule__Unary__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryAccess().getGroup_0()); 
                    // InternalJararaca.g:970:3: ( rule__Unary__Group_0__0 )
                    // InternalJararaca.g:970:4: rule__Unary__Group_0__0
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
                    // InternalJararaca.g:974:2: ( ( rule__Unary__Group_1__0 ) )
                    {
                    // InternalJararaca.g:974:2: ( ( rule__Unary__Group_1__0 ) )
                    // InternalJararaca.g:975:3: ( rule__Unary__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryAccess().getGroup_1()); 
                    // InternalJararaca.g:976:3: ( rule__Unary__Group_1__0 )
                    // InternalJararaca.g:976:4: rule__Unary__Group_1__0
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
                    // InternalJararaca.g:980:2: ( rulePrimary )
                    {
                    // InternalJararaca.g:980:2: ( rulePrimary )
                    // InternalJararaca.g:981:3: rulePrimary
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
    // InternalJararaca.g:990:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleVariableReference ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:994:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleVariableReference ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
                {
                alt8=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt8=3;
                }
                break;
            case 42:
            case 43:
                {
                alt8=4;
                }
                break;
            case RULE_STRING:
                {
                alt8=5;
                }
                break;
            case RULE_ID:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalJararaca.g:995:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalJararaca.g:995:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalJararaca.g:996:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalJararaca.g:997:3: ( rule__Primary__Group_0__0 )
                    // InternalJararaca.g:997:4: rule__Primary__Group_0__0
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
                    // InternalJararaca.g:1001:2: ( ruleIntLiteral )
                    {
                    // InternalJararaca.g:1001:2: ( ruleIntLiteral )
                    // InternalJararaca.g:1002:3: ruleIntLiteral
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
                    // InternalJararaca.g:1007:2: ( ruleFloatLiteral )
                    {
                    // InternalJararaca.g:1007:2: ( ruleFloatLiteral )
                    // InternalJararaca.g:1008:3: ruleFloatLiteral
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
                    // InternalJararaca.g:1013:2: ( ruleBooleanLiteral )
                    {
                    // InternalJararaca.g:1013:2: ( ruleBooleanLiteral )
                    // InternalJararaca.g:1014:3: ruleBooleanLiteral
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
                    // InternalJararaca.g:1019:2: ( ruleStringLiteral )
                    {
                    // InternalJararaca.g:1019:2: ( ruleStringLiteral )
                    // InternalJararaca.g:1020:3: ruleStringLiteral
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
                    // InternalJararaca.g:1025:2: ( ruleVariableReference )
                    {
                    // InternalJararaca.g:1025:2: ( ruleVariableReference )
                    // InternalJararaca.g:1026:3: ruleVariableReference
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
    // InternalJararaca.g:1035:1: rule__BooleanLiteral__Alternatives : ( ( ruleTrueLiteral ) | ( ruleFalseLiteral ) );
    public final void rule__BooleanLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1039:1: ( ( ruleTrueLiteral ) | ( ruleFalseLiteral ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==42) ) {
                alt9=1;
            }
            else if ( (LA9_0==43) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalJararaca.g:1040:2: ( ruleTrueLiteral )
                    {
                    // InternalJararaca.g:1040:2: ( ruleTrueLiteral )
                    // InternalJararaca.g:1041:3: ruleTrueLiteral
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
                    // InternalJararaca.g:1046:2: ( ruleFalseLiteral )
                    {
                    // InternalJararaca.g:1046:2: ( ruleFalseLiteral )
                    // InternalJararaca.g:1047:3: ruleFalseLiteral
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
    // InternalJararaca.g:1056:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1060:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalJararaca.g:1061:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalJararaca.g:1068:1: rule__Program__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1072:1: ( ( 'program' ) )
            // InternalJararaca.g:1073:1: ( 'program' )
            {
            // InternalJararaca.g:1073:1: ( 'program' )
            // InternalJararaca.g:1074:2: 'program'
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
    // InternalJararaca.g:1083:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1087:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalJararaca.g:1088:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalJararaca.g:1095:1: rule__Program__Group__1__Impl : ( '{' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1099:1: ( ( '{' ) )
            // InternalJararaca.g:1100:1: ( '{' )
            {
            // InternalJararaca.g:1100:1: ( '{' )
            // InternalJararaca.g:1101:2: '{'
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
    // InternalJararaca.g:1110:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1114:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalJararaca.g:1115:2: rule__Program__Group__2__Impl rule__Program__Group__3
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
    // InternalJararaca.g:1122:1: rule__Program__Group__2__Impl : ( ( rule__Program__StatementsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1126:1: ( ( ( rule__Program__StatementsAssignment_2 )* ) )
            // InternalJararaca.g:1127:1: ( ( rule__Program__StatementsAssignment_2 )* )
            {
            // InternalJararaca.g:1127:1: ( ( rule__Program__StatementsAssignment_2 )* )
            // InternalJararaca.g:1128:2: ( rule__Program__StatementsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getStatementsAssignment_2()); 
            // InternalJararaca.g:1129:2: ( rule__Program__StatementsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==26||(LA10_0>=30 && LA10_0<=31)||LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalJararaca.g:1129:3: rule__Program__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Program__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalJararaca.g:1137:1: rule__Program__Group__3 : rule__Program__Group__3__Impl ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1141:1: ( rule__Program__Group__3__Impl )
            // InternalJararaca.g:1142:2: rule__Program__Group__3__Impl
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
    // InternalJararaca.g:1148:1: rule__Program__Group__3__Impl : ( '}' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1152:1: ( ( '}' ) )
            // InternalJararaca.g:1153:1: ( '}' )
            {
            // InternalJararaca.g:1153:1: ( '}' )
            // InternalJararaca.g:1154:2: '}'
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


    // $ANTLR start "rule__Block__Group__0"
    // InternalJararaca.g:1164:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1168:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalJararaca.g:1169:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalJararaca.g:1176:1: rule__Block__Group__0__Impl : ( '{' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1180:1: ( ( '{' ) )
            // InternalJararaca.g:1181:1: ( '{' )
            {
            // InternalJararaca.g:1181:1: ( '{' )
            // InternalJararaca.g:1182:2: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalJararaca.g:1191:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1195:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalJararaca.g:1196:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalJararaca.g:1203:1: rule__Block__Group__1__Impl : ( ( rule__Block__StatementsAssignment_1 )* ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1207:1: ( ( ( rule__Block__StatementsAssignment_1 )* ) )
            // InternalJararaca.g:1208:1: ( ( rule__Block__StatementsAssignment_1 )* )
            {
            // InternalJararaca.g:1208:1: ( ( rule__Block__StatementsAssignment_1 )* )
            // InternalJararaca.g:1209:2: ( rule__Block__StatementsAssignment_1 )*
            {
             before(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 
            // InternalJararaca.g:1210:2: ( rule__Block__StatementsAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==26||(LA11_0>=30 && LA11_0<=31)||LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJararaca.g:1210:3: rule__Block__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Block__StatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalJararaca.g:1218:1: rule__Block__Group__2 : rule__Block__Group__2__Impl ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1222:1: ( rule__Block__Group__2__Impl )
            // InternalJararaca.g:1223:2: rule__Block__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalJararaca.g:1229:1: rule__Block__Group__2__Impl : ( '}' ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1233:1: ( ( '}' ) )
            // InternalJararaca.g:1234:1: ( '}' )
            {
            // InternalJararaca.g:1234:1: ( '}' )
            // InternalJararaca.g:1235:2: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalJararaca.g:1245:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1249:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalJararaca.g:1250:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // InternalJararaca.g:1257:1: rule__IfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1261:1: ( ( 'if' ) )
            // InternalJararaca.g:1262:1: ( 'if' )
            {
            // InternalJararaca.g:1262:1: ( 'if' )
            // InternalJararaca.g:1263:2: 'if'
            {
             before(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // InternalJararaca.g:1272:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1276:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalJararaca.g:1277:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // InternalJararaca.g:1284:1: rule__IfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1288:1: ( ( '(' ) )
            // InternalJararaca.g:1289:1: ( '(' )
            {
            // InternalJararaca.g:1289:1: ( '(' )
            // InternalJararaca.g:1290:2: '('
            {
             before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // InternalJararaca.g:1299:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1303:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalJararaca.g:1304:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // InternalJararaca.g:1311:1: rule__IfStatement__Group__2__Impl : ( ( rule__IfStatement__ConditionAssignment_2 ) ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1315:1: ( ( ( rule__IfStatement__ConditionAssignment_2 ) ) )
            // InternalJararaca.g:1316:1: ( ( rule__IfStatement__ConditionAssignment_2 ) )
            {
            // InternalJararaca.g:1316:1: ( ( rule__IfStatement__ConditionAssignment_2 ) )
            // InternalJararaca.g:1317:2: ( rule__IfStatement__ConditionAssignment_2 )
            {
             before(grammarAccess.getIfStatementAccess().getConditionAssignment_2()); 
            // InternalJararaca.g:1318:2: ( rule__IfStatement__ConditionAssignment_2 )
            // InternalJararaca.g:1318:3: rule__IfStatement__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__3"
    // InternalJararaca.g:1326:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1330:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalJararaca.g:1331:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3"


    // $ANTLR start "rule__IfStatement__Group__3__Impl"
    // InternalJararaca.g:1338:1: rule__IfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1342:1: ( ( ')' ) )
            // InternalJararaca.g:1343:1: ( ')' )
            {
            // InternalJararaca.g:1343:1: ( ')' )
            // InternalJararaca.g:1344:2: ')'
            {
             before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3__Impl"


    // $ANTLR start "rule__IfStatement__Group__4"
    // InternalJararaca.g:1353:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1357:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalJararaca.g:1358:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__IfStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4"


    // $ANTLR start "rule__IfStatement__Group__4__Impl"
    // InternalJararaca.g:1365:1: rule__IfStatement__Group__4__Impl : ( ( rule__IfStatement__BlockAssignment_4 ) ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1369:1: ( ( ( rule__IfStatement__BlockAssignment_4 ) ) )
            // InternalJararaca.g:1370:1: ( ( rule__IfStatement__BlockAssignment_4 ) )
            {
            // InternalJararaca.g:1370:1: ( ( rule__IfStatement__BlockAssignment_4 ) )
            // InternalJararaca.g:1371:2: ( rule__IfStatement__BlockAssignment_4 )
            {
             before(grammarAccess.getIfStatementAccess().getBlockAssignment_4()); 
            // InternalJararaca.g:1372:2: ( rule__IfStatement__BlockAssignment_4 )
            // InternalJararaca.g:1372:3: rule__IfStatement__BlockAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__BlockAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getBlockAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__IfStatement__Group__5"
    // InternalJararaca.g:1380:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1384:1: ( rule__IfStatement__Group__5__Impl )
            // InternalJararaca.g:1385:2: rule__IfStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__5"


    // $ANTLR start "rule__IfStatement__Group__5__Impl"
    // InternalJararaca.g:1391:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__Group_5__0 )? ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1395:1: ( ( ( rule__IfStatement__Group_5__0 )? ) )
            // InternalJararaca.g:1396:1: ( ( rule__IfStatement__Group_5__0 )? )
            {
            // InternalJararaca.g:1396:1: ( ( rule__IfStatement__Group_5__0 )? )
            // InternalJararaca.g:1397:2: ( rule__IfStatement__Group_5__0 )?
            {
             before(grammarAccess.getIfStatementAccess().getGroup_5()); 
            // InternalJararaca.g:1398:2: ( rule__IfStatement__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJararaca.g:1398:3: rule__IfStatement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfStatement__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfStatementAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__5__Impl"


    // $ANTLR start "rule__IfStatement__Group_5__0"
    // InternalJararaca.g:1407:1: rule__IfStatement__Group_5__0 : rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1 ;
    public final void rule__IfStatement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1411:1: ( rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1 )
            // InternalJararaca.g:1412:2: rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__IfStatement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__0"


    // $ANTLR start "rule__IfStatement__Group_5__0__Impl"
    // InternalJararaca.g:1419:1: rule__IfStatement__Group_5__0__Impl : ( 'else' ) ;
    public final void rule__IfStatement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1423:1: ( ( 'else' ) )
            // InternalJararaca.g:1424:1: ( 'else' )
            {
            // InternalJararaca.g:1424:1: ( 'else' )
            // InternalJararaca.g:1425:2: 'else'
            {
             before(grammarAccess.getIfStatementAccess().getElseKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getElseKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_5__1"
    // InternalJararaca.g:1434:1: rule__IfStatement__Group_5__1 : rule__IfStatement__Group_5__1__Impl ;
    public final void rule__IfStatement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1438:1: ( rule__IfStatement__Group_5__1__Impl )
            // InternalJararaca.g:1439:2: rule__IfStatement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__1"


    // $ANTLR start "rule__IfStatement__Group_5__1__Impl"
    // InternalJararaca.g:1445:1: rule__IfStatement__Group_5__1__Impl : ( ( rule__IfStatement__ElsePartAssignment_5_1 ) ) ;
    public final void rule__IfStatement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1449:1: ( ( ( rule__IfStatement__ElsePartAssignment_5_1 ) ) )
            // InternalJararaca.g:1450:1: ( ( rule__IfStatement__ElsePartAssignment_5_1 ) )
            {
            // InternalJararaca.g:1450:1: ( ( rule__IfStatement__ElsePartAssignment_5_1 ) )
            // InternalJararaca.g:1451:2: ( rule__IfStatement__ElsePartAssignment_5_1 )
            {
             before(grammarAccess.getIfStatementAccess().getElsePartAssignment_5_1()); 
            // InternalJararaca.g:1452:2: ( rule__IfStatement__ElsePartAssignment_5_1 )
            // InternalJararaca.g:1452:3: rule__IfStatement__ElsePartAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ElsePartAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getElsePartAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__1__Impl"


    // $ANTLR start "rule__WhileStatement__Group__0"
    // InternalJararaca.g:1461:1: rule__WhileStatement__Group__0 : rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 ;
    public final void rule__WhileStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1465:1: ( rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 )
            // InternalJararaca.g:1466:2: rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__WhileStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__0"


    // $ANTLR start "rule__WhileStatement__Group__0__Impl"
    // InternalJararaca.g:1473:1: rule__WhileStatement__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1477:1: ( ( 'while' ) )
            // InternalJararaca.g:1478:1: ( 'while' )
            {
            // InternalJararaca.g:1478:1: ( 'while' )
            // InternalJararaca.g:1479:2: 'while'
            {
             before(grammarAccess.getWhileStatementAccess().getWhileKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getWhileStatementAccess().getWhileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__0__Impl"


    // $ANTLR start "rule__WhileStatement__Group__1"
    // InternalJararaca.g:1488:1: rule__WhileStatement__Group__1 : rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 ;
    public final void rule__WhileStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1492:1: ( rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 )
            // InternalJararaca.g:1493:2: rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__WhileStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__1"


    // $ANTLR start "rule__WhileStatement__Group__1__Impl"
    // InternalJararaca.g:1500:1: rule__WhileStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__WhileStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1504:1: ( ( '(' ) )
            // InternalJararaca.g:1505:1: ( '(' )
            {
            // InternalJararaca.g:1505:1: ( '(' )
            // InternalJararaca.g:1506:2: '('
            {
             before(grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__1__Impl"


    // $ANTLR start "rule__WhileStatement__Group__2"
    // InternalJararaca.g:1515:1: rule__WhileStatement__Group__2 : rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 ;
    public final void rule__WhileStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1519:1: ( rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 )
            // InternalJararaca.g:1520:2: rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__WhileStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__2"


    // $ANTLR start "rule__WhileStatement__Group__2__Impl"
    // InternalJararaca.g:1527:1: rule__WhileStatement__Group__2__Impl : ( ( rule__WhileStatement__ConditionAssignment_2 ) ) ;
    public final void rule__WhileStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1531:1: ( ( ( rule__WhileStatement__ConditionAssignment_2 ) ) )
            // InternalJararaca.g:1532:1: ( ( rule__WhileStatement__ConditionAssignment_2 ) )
            {
            // InternalJararaca.g:1532:1: ( ( rule__WhileStatement__ConditionAssignment_2 ) )
            // InternalJararaca.g:1533:2: ( rule__WhileStatement__ConditionAssignment_2 )
            {
             before(grammarAccess.getWhileStatementAccess().getConditionAssignment_2()); 
            // InternalJararaca.g:1534:2: ( rule__WhileStatement__ConditionAssignment_2 )
            // InternalJararaca.g:1534:3: rule__WhileStatement__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhileStatementAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__2__Impl"


    // $ANTLR start "rule__WhileStatement__Group__3"
    // InternalJararaca.g:1542:1: rule__WhileStatement__Group__3 : rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 ;
    public final void rule__WhileStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1546:1: ( rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 )
            // InternalJararaca.g:1547:2: rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__WhileStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__3"


    // $ANTLR start "rule__WhileStatement__Group__3__Impl"
    // InternalJararaca.g:1554:1: rule__WhileStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__WhileStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1558:1: ( ( ')' ) )
            // InternalJararaca.g:1559:1: ( ')' )
            {
            // InternalJararaca.g:1559:1: ( ')' )
            // InternalJararaca.g:1560:2: ')'
            {
             before(grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__3__Impl"


    // $ANTLR start "rule__WhileStatement__Group__4"
    // InternalJararaca.g:1569:1: rule__WhileStatement__Group__4 : rule__WhileStatement__Group__4__Impl ;
    public final void rule__WhileStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1573:1: ( rule__WhileStatement__Group__4__Impl )
            // InternalJararaca.g:1574:2: rule__WhileStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__4"


    // $ANTLR start "rule__WhileStatement__Group__4__Impl"
    // InternalJararaca.g:1580:1: rule__WhileStatement__Group__4__Impl : ( ( rule__WhileStatement__BlockAssignment_4 ) ) ;
    public final void rule__WhileStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1584:1: ( ( ( rule__WhileStatement__BlockAssignment_4 ) ) )
            // InternalJararaca.g:1585:1: ( ( rule__WhileStatement__BlockAssignment_4 ) )
            {
            // InternalJararaca.g:1585:1: ( ( rule__WhileStatement__BlockAssignment_4 ) )
            // InternalJararaca.g:1586:2: ( rule__WhileStatement__BlockAssignment_4 )
            {
             before(grammarAccess.getWhileStatementAccess().getBlockAssignment_4()); 
            // InternalJararaca.g:1587:2: ( rule__WhileStatement__BlockAssignment_4 )
            // InternalJararaca.g:1587:3: rule__WhileStatement__BlockAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__BlockAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWhileStatementAccess().getBlockAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__4__Impl"


    // $ANTLR start "rule__DoWhileStatement__Group__0"
    // InternalJararaca.g:1596:1: rule__DoWhileStatement__Group__0 : rule__DoWhileStatement__Group__0__Impl rule__DoWhileStatement__Group__1 ;
    public final void rule__DoWhileStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1600:1: ( rule__DoWhileStatement__Group__0__Impl rule__DoWhileStatement__Group__1 )
            // InternalJararaca.g:1601:2: rule__DoWhileStatement__Group__0__Impl rule__DoWhileStatement__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DoWhileStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoWhileStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileStatement__Group__0"


    // $ANTLR start "rule__DoWhileStatement__Group__0__Impl"
    // InternalJararaca.g:1608:1: rule__DoWhileStatement__Group__0__Impl : ( 'do' ) ;
    public final void rule__DoWhileStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1612:1: ( ( 'do' ) )
            // InternalJararaca.g:1613:1: ( 'do' )
            {
            // InternalJararaca.g:1613:1: ( 'do' )
            // InternalJararaca.g:1614:2: 'do'
            {
             before(grammarAccess.getDoWhileStatementAccess().getDoKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDoWhileStatementAccess().getDoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileStatement__Group__0__Impl"


    // $ANTLR start "rule__DoWhileStatement__Group__1"
    // InternalJararaca.g:1623:1: rule__DoWhileStatement__Group__1 : rule__DoWhileStatement__Group__1__Impl rule__DoWhileStatement__Group__2 ;
    public final void rule__DoWhileStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1627:1: ( rule__DoWhileStatement__Group__1__Impl rule__DoWhileStatement__Group__2 )
            // InternalJararaca.g:1628:2: rule__DoWhileStatement__Group__1__Impl rule__DoWhileStatement__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__DoWhileStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoWhileStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileStatement__Group__1"


    // $ANTLR start "rule__DoWhileStatement__Group__1__Impl"
    // InternalJararaca.g:1635:1: rule__DoWhileStatement__Group__1__Impl : ( ( rule__DoWhileStatement__BlockAssignment_1 ) ) ;
    public final void rule__DoWhileStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1639:1: ( ( ( rule__DoWhileStatement__BlockAssignment_1 ) ) )
            // InternalJararaca.g:1640:1: ( ( rule__DoWhileStatement__BlockAssignment_1 ) )
            {
            // InternalJararaca.g:1640:1: ( ( rule__DoWhileStatement__BlockAssignment_1 ) )
            // InternalJararaca.g:1641:2: ( rule__DoWhileStatement__BlockAssignment_1 )
            {
             before(grammarAccess.getDoWhileStatementAccess().getBlockAssignment_1()); 
            // InternalJararaca.g:1642:2: ( rule__DoWhileStatement__BlockAssignment_1 )
            // InternalJararaca.g:1642:3: rule__DoWhileStatement__BlockAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DoWhileStatement__BlockAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDoWhileStatementAccess().getBlockAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileStatement__Group__1__Impl"


    // $ANTLR start "rule__DoWhileStatement__Group__2"
    // InternalJararaca.g:1650:1: rule__DoWhileStatement__Group__2 : rule__DoWhileStatement__Group__2__Impl rule__DoWhileStatement__Group__3 ;
    public final void rule__DoWhileStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1654:1: ( rule__DoWhileStatement__Group__2__Impl rule__DoWhileStatement__Group__3 )
            // InternalJararaca.g:1655:2: rule__DoWhileStatement__Group__2__Impl rule__DoWhileStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DoWhileStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoWhileStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileStatement__Group__2"


    // $ANTLR start "rule__DoWhileStatement__Group__2__Impl"
    // InternalJararaca.g:1662:1: rule__DoWhileStatement__Group__2__Impl : ( 'while' ) ;
    public final void rule__DoWhileStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1666:1: ( ( 'while' ) )
            // InternalJararaca.g:1667:1: ( 'while' )
            {
            // InternalJararaca.g:1667:1: ( 'while' )
            // InternalJararaca.g:1668:2: 'while'
            {
             before(grammarAccess.getDoWhileStatementAccess().getWhileKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDoWhileStatementAccess().getWhileKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileStatement__Group__2__Impl"


    // $ANTLR start "rule__DoWhileStatement__Group__3"
    // InternalJararaca.g:1677:1: rule__DoWhileStatement__Group__3 : rule__DoWhileStatement__Group__3__Impl rule__DoWhileStatement__Group__4 ;
    public final void rule__DoWhileStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1681:1: ( rule__DoWhileStatement__Group__3__Impl rule__DoWhileStatement__Group__4 )
            // InternalJararaca.g:1682:2: rule__DoWhileStatement__Group__3__Impl rule__DoWhileStatement__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__DoWhileStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoWhileStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileStatement__Group__3"


    // $ANTLR start "rule__DoWhileStatement__Group__3__Impl"
    // InternalJararaca.g:1689:1: rule__DoWhileStatement__Group__3__Impl : ( '(' ) ;
    public final void rule__DoWhileStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1693:1: ( ( '(' ) )
            // InternalJararaca.g:1694:1: ( '(' )
            {
            // InternalJararaca.g:1694:1: ( '(' )
            // InternalJararaca.g:1695:2: '('
            {
             before(grammarAccess.getDoWhileStatementAccess().getLeftParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDoWhileStatementAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileStatement__Group__3__Impl"


    // $ANTLR start "rule__DoWhileStatement__Group__4"
    // InternalJararaca.g:1704:1: rule__DoWhileStatement__Group__4 : rule__DoWhileStatement__Group__4__Impl rule__DoWhileStatement__Group__5 ;
    public final void rule__DoWhileStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1708:1: ( rule__DoWhileStatement__Group__4__Impl rule__DoWhileStatement__Group__5 )
            // InternalJararaca.g:1709:2: rule__DoWhileStatement__Group__4__Impl rule__DoWhileStatement__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__DoWhileStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoWhileStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileStatement__Group__4"


    // $ANTLR start "rule__DoWhileStatement__Group__4__Impl"
    // InternalJararaca.g:1716:1: rule__DoWhileStatement__Group__4__Impl : ( ( rule__DoWhileStatement__ConditionAssignment_4 ) ) ;
    public final void rule__DoWhileStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1720:1: ( ( ( rule__DoWhileStatement__ConditionAssignment_4 ) ) )
            // InternalJararaca.g:1721:1: ( ( rule__DoWhileStatement__ConditionAssignment_4 ) )
            {
            // InternalJararaca.g:1721:1: ( ( rule__DoWhileStatement__ConditionAssignment_4 ) )
            // InternalJararaca.g:1722:2: ( rule__DoWhileStatement__ConditionAssignment_4 )
            {
             before(grammarAccess.getDoWhileStatementAccess().getConditionAssignment_4()); 
            // InternalJararaca.g:1723:2: ( rule__DoWhileStatement__ConditionAssignment_4 )
            // InternalJararaca.g:1723:3: rule__DoWhileStatement__ConditionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DoWhileStatement__ConditionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDoWhileStatementAccess().getConditionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileStatement__Group__4__Impl"


    // $ANTLR start "rule__DoWhileStatement__Group__5"
    // InternalJararaca.g:1731:1: rule__DoWhileStatement__Group__5 : rule__DoWhileStatement__Group__5__Impl rule__DoWhileStatement__Group__6 ;
    public final void rule__DoWhileStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1735:1: ( rule__DoWhileStatement__Group__5__Impl rule__DoWhileStatement__Group__6 )
            // InternalJararaca.g:1736:2: rule__DoWhileStatement__Group__5__Impl rule__DoWhileStatement__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__DoWhileStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoWhileStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileStatement__Group__5"


    // $ANTLR start "rule__DoWhileStatement__Group__5__Impl"
    // InternalJararaca.g:1743:1: rule__DoWhileStatement__Group__5__Impl : ( ')' ) ;
    public final void rule__DoWhileStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1747:1: ( ( ')' ) )
            // InternalJararaca.g:1748:1: ( ')' )
            {
            // InternalJararaca.g:1748:1: ( ')' )
            // InternalJararaca.g:1749:2: ')'
            {
             before(grammarAccess.getDoWhileStatementAccess().getRightParenthesisKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDoWhileStatementAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileStatement__Group__5__Impl"


    // $ANTLR start "rule__DoWhileStatement__Group__6"
    // InternalJararaca.g:1758:1: rule__DoWhileStatement__Group__6 : rule__DoWhileStatement__Group__6__Impl ;
    public final void rule__DoWhileStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1762:1: ( rule__DoWhileStatement__Group__6__Impl )
            // InternalJararaca.g:1763:2: rule__DoWhileStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoWhileStatement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileStatement__Group__6"


    // $ANTLR start "rule__DoWhileStatement__Group__6__Impl"
    // InternalJararaca.g:1769:1: rule__DoWhileStatement__Group__6__Impl : ( ';' ) ;
    public final void rule__DoWhileStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1773:1: ( ( ';' ) )
            // InternalJararaca.g:1774:1: ( ';' )
            {
            // InternalJararaca.g:1774:1: ( ';' )
            // InternalJararaca.g:1775:2: ';'
            {
             before(grammarAccess.getDoWhileStatementAccess().getSemicolonKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDoWhileStatementAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileStatement__Group__6__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalJararaca.g:1785:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1789:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalJararaca.g:1790:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalJararaca.g:1797:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1801:1: ( ( 'var' ) )
            // InternalJararaca.g:1802:1: ( 'var' )
            {
            // InternalJararaca.g:1802:1: ( 'var' )
            // InternalJararaca.g:1803:2: 'var'
            {
             before(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalJararaca.g:1812:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1816:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalJararaca.g:1817:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalJararaca.g:1824:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1828:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalJararaca.g:1829:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalJararaca.g:1829:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalJararaca.g:1830:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalJararaca.g:1831:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalJararaca.g:1831:3: rule__VariableDeclaration__NameAssignment_1
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
    // InternalJararaca.g:1839:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1843:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalJararaca.g:1844:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalJararaca.g:1851:1: rule__VariableDeclaration__Group__2__Impl : ( ( rule__VariableDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1855:1: ( ( ( rule__VariableDeclaration__TypeAssignment_2 ) ) )
            // InternalJararaca.g:1856:1: ( ( rule__VariableDeclaration__TypeAssignment_2 ) )
            {
            // InternalJararaca.g:1856:1: ( ( rule__VariableDeclaration__TypeAssignment_2 ) )
            // InternalJararaca.g:1857:2: ( rule__VariableDeclaration__TypeAssignment_2 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_2()); 
            // InternalJararaca.g:1858:2: ( rule__VariableDeclaration__TypeAssignment_2 )
            // InternalJararaca.g:1858:3: rule__VariableDeclaration__TypeAssignment_2
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
    // InternalJararaca.g:1866:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4 ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1870:1: ( rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4 )
            // InternalJararaca.g:1871:2: rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalJararaca.g:1878:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__Group_3__0 )? ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1882:1: ( ( ( rule__VariableDeclaration__Group_3__0 )? ) )
            // InternalJararaca.g:1883:1: ( ( rule__VariableDeclaration__Group_3__0 )? )
            {
            // InternalJararaca.g:1883:1: ( ( rule__VariableDeclaration__Group_3__0 )? )
            // InternalJararaca.g:1884:2: ( rule__VariableDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup_3()); 
            // InternalJararaca.g:1885:2: ( rule__VariableDeclaration__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJararaca.g:1885:3: rule__VariableDeclaration__Group_3__0
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
    // InternalJararaca.g:1893:1: rule__VariableDeclaration__Group__4 : rule__VariableDeclaration__Group__4__Impl ;
    public final void rule__VariableDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1897:1: ( rule__VariableDeclaration__Group__4__Impl )
            // InternalJararaca.g:1898:2: rule__VariableDeclaration__Group__4__Impl
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
    // InternalJararaca.g:1904:1: rule__VariableDeclaration__Group__4__Impl : ( ';' ) ;
    public final void rule__VariableDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1908:1: ( ( ';' ) )
            // InternalJararaca.g:1909:1: ( ';' )
            {
            // InternalJararaca.g:1909:1: ( ';' )
            // InternalJararaca.g:1910:2: ';'
            {
             before(grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalJararaca.g:1920:1: rule__VariableDeclaration__Group_3__0 : rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1 ;
    public final void rule__VariableDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1924:1: ( rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1 )
            // InternalJararaca.g:1925:2: rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalJararaca.g:1932:1: rule__VariableDeclaration__Group_3__0__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1936:1: ( ( '=' ) )
            // InternalJararaca.g:1937:1: ( '=' )
            {
            // InternalJararaca.g:1937:1: ( '=' )
            // InternalJararaca.g:1938:2: '='
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalJararaca.g:1947:1: rule__VariableDeclaration__Group_3__1 : rule__VariableDeclaration__Group_3__1__Impl ;
    public final void rule__VariableDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1951:1: ( rule__VariableDeclaration__Group_3__1__Impl )
            // InternalJararaca.g:1952:2: rule__VariableDeclaration__Group_3__1__Impl
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
    // InternalJararaca.g:1958:1: rule__VariableDeclaration__Group_3__1__Impl : ( ( rule__VariableDeclaration__InitialValueAssignment_3_1 ) ) ;
    public final void rule__VariableDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1962:1: ( ( ( rule__VariableDeclaration__InitialValueAssignment_3_1 ) ) )
            // InternalJararaca.g:1963:1: ( ( rule__VariableDeclaration__InitialValueAssignment_3_1 ) )
            {
            // InternalJararaca.g:1963:1: ( ( rule__VariableDeclaration__InitialValueAssignment_3_1 ) )
            // InternalJararaca.g:1964:2: ( rule__VariableDeclaration__InitialValueAssignment_3_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getInitialValueAssignment_3_1()); 
            // InternalJararaca.g:1965:2: ( rule__VariableDeclaration__InitialValueAssignment_3_1 )
            // InternalJararaca.g:1965:3: rule__VariableDeclaration__InitialValueAssignment_3_1
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
    // InternalJararaca.g:1974:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1978:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalJararaca.g:1979:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalJararaca.g:1986:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__NameAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:1990:1: ( ( ( rule__Assignment__NameAssignment_0 ) ) )
            // InternalJararaca.g:1991:1: ( ( rule__Assignment__NameAssignment_0 ) )
            {
            // InternalJararaca.g:1991:1: ( ( rule__Assignment__NameAssignment_0 ) )
            // InternalJararaca.g:1992:2: ( rule__Assignment__NameAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getNameAssignment_0()); 
            // InternalJararaca.g:1993:2: ( rule__Assignment__NameAssignment_0 )
            // InternalJararaca.g:1993:3: rule__Assignment__NameAssignment_0
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
    // InternalJararaca.g:2001:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2005:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalJararaca.g:2006:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalJararaca.g:2013:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2017:1: ( ( '=' ) )
            // InternalJararaca.g:2018:1: ( '=' )
            {
            // InternalJararaca.g:2018:1: ( '=' )
            // InternalJararaca.g:2019:2: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalJararaca.g:2028:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2032:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // InternalJararaca.g:2033:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalJararaca.g:2040:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2044:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalJararaca.g:2045:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalJararaca.g:2045:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalJararaca.g:2046:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalJararaca.g:2047:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalJararaca.g:2047:3: rule__Assignment__ValueAssignment_2
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
    // InternalJararaca.g:2055:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2059:1: ( rule__Assignment__Group__3__Impl )
            // InternalJararaca.g:2060:2: rule__Assignment__Group__3__Impl
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
    // InternalJararaca.g:2066:1: rule__Assignment__Group__3__Impl : ( ';' ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2070:1: ( ( ';' ) )
            // InternalJararaca.g:2071:1: ( ';' )
            {
            // InternalJararaca.g:2071:1: ( ';' )
            // InternalJararaca.g:2072:2: ';'
            {
             before(grammarAccess.getAssignmentAccess().getSemicolonKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalJararaca.g:2082:1: rule__IntType__Group__0 : rule__IntType__Group__0__Impl rule__IntType__Group__1 ;
    public final void rule__IntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2086:1: ( rule__IntType__Group__0__Impl rule__IntType__Group__1 )
            // InternalJararaca.g:2087:2: rule__IntType__Group__0__Impl rule__IntType__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalJararaca.g:2094:1: rule__IntType__Group__0__Impl : ( () ) ;
    public final void rule__IntType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2098:1: ( ( () ) )
            // InternalJararaca.g:2099:1: ( () )
            {
            // InternalJararaca.g:2099:1: ( () )
            // InternalJararaca.g:2100:2: ()
            {
             before(grammarAccess.getIntTypeAccess().getIntTypeAction_0()); 
            // InternalJararaca.g:2101:2: ()
            // InternalJararaca.g:2101:3: 
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
    // InternalJararaca.g:2109:1: rule__IntType__Group__1 : rule__IntType__Group__1__Impl ;
    public final void rule__IntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2113:1: ( rule__IntType__Group__1__Impl )
            // InternalJararaca.g:2114:2: rule__IntType__Group__1__Impl
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
    // InternalJararaca.g:2120:1: rule__IntType__Group__1__Impl : ( 'int' ) ;
    public final void rule__IntType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2124:1: ( ( 'int' ) )
            // InternalJararaca.g:2125:1: ( 'int' )
            {
            // InternalJararaca.g:2125:1: ( 'int' )
            // InternalJararaca.g:2126:2: 'int'
            {
             before(grammarAccess.getIntTypeAccess().getIntKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalJararaca.g:2136:1: rule__FloatType__Group__0 : rule__FloatType__Group__0__Impl rule__FloatType__Group__1 ;
    public final void rule__FloatType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2140:1: ( rule__FloatType__Group__0__Impl rule__FloatType__Group__1 )
            // InternalJararaca.g:2141:2: rule__FloatType__Group__0__Impl rule__FloatType__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalJararaca.g:2148:1: rule__FloatType__Group__0__Impl : ( () ) ;
    public final void rule__FloatType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2152:1: ( ( () ) )
            // InternalJararaca.g:2153:1: ( () )
            {
            // InternalJararaca.g:2153:1: ( () )
            // InternalJararaca.g:2154:2: ()
            {
             before(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0()); 
            // InternalJararaca.g:2155:2: ()
            // InternalJararaca.g:2155:3: 
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
    // InternalJararaca.g:2163:1: rule__FloatType__Group__1 : rule__FloatType__Group__1__Impl ;
    public final void rule__FloatType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2167:1: ( rule__FloatType__Group__1__Impl )
            // InternalJararaca.g:2168:2: rule__FloatType__Group__1__Impl
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
    // InternalJararaca.g:2174:1: rule__FloatType__Group__1__Impl : ( 'decimal' ) ;
    public final void rule__FloatType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2178:1: ( ( 'decimal' ) )
            // InternalJararaca.g:2179:1: ( 'decimal' )
            {
            // InternalJararaca.g:2179:1: ( 'decimal' )
            // InternalJararaca.g:2180:2: 'decimal'
            {
             before(grammarAccess.getFloatTypeAccess().getDecimalKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalJararaca.g:2190:1: rule__BooleanType__Group__0 : rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 ;
    public final void rule__BooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2194:1: ( rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 )
            // InternalJararaca.g:2195:2: rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalJararaca.g:2202:1: rule__BooleanType__Group__0__Impl : ( () ) ;
    public final void rule__BooleanType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2206:1: ( ( () ) )
            // InternalJararaca.g:2207:1: ( () )
            {
            // InternalJararaca.g:2207:1: ( () )
            // InternalJararaca.g:2208:2: ()
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 
            // InternalJararaca.g:2209:2: ()
            // InternalJararaca.g:2209:3: 
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
    // InternalJararaca.g:2217:1: rule__BooleanType__Group__1 : rule__BooleanType__Group__1__Impl ;
    public final void rule__BooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2221:1: ( rule__BooleanType__Group__1__Impl )
            // InternalJararaca.g:2222:2: rule__BooleanType__Group__1__Impl
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
    // InternalJararaca.g:2228:1: rule__BooleanType__Group__1__Impl : ( 'boolean' ) ;
    public final void rule__BooleanType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2232:1: ( ( 'boolean' ) )
            // InternalJararaca.g:2233:1: ( 'boolean' )
            {
            // InternalJararaca.g:2233:1: ( 'boolean' )
            // InternalJararaca.g:2234:2: 'boolean'
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalJararaca.g:2244:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2248:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalJararaca.g:2249:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalJararaca.g:2256:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2260:1: ( ( () ) )
            // InternalJararaca.g:2261:1: ( () )
            {
            // InternalJararaca.g:2261:1: ( () )
            // InternalJararaca.g:2262:2: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // InternalJararaca.g:2263:2: ()
            // InternalJararaca.g:2263:3: 
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
    // InternalJararaca.g:2271:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2275:1: ( rule__StringType__Group__1__Impl )
            // InternalJararaca.g:2276:2: rule__StringType__Group__1__Impl
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
    // InternalJararaca.g:2282:1: rule__StringType__Group__1__Impl : ( 'string' ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2286:1: ( ( 'string' ) )
            // InternalJararaca.g:2287:1: ( 'string' )
            {
            // InternalJararaca.g:2287:1: ( 'string' )
            // InternalJararaca.g:2288:2: 'string'
            {
             before(grammarAccess.getStringTypeAccess().getStringKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalJararaca.g:2298:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2302:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalJararaca.g:2303:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalJararaca.g:2310:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2314:1: ( ( ruleAndExpression ) )
            // InternalJararaca.g:2315:1: ( ruleAndExpression )
            {
            // InternalJararaca.g:2315:1: ( ruleAndExpression )
            // InternalJararaca.g:2316:2: ruleAndExpression
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
    // InternalJararaca.g:2325:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2329:1: ( rule__OrExpression__Group__1__Impl )
            // InternalJararaca.g:2330:2: rule__OrExpression__Group__1__Impl
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
    // InternalJararaca.g:2336:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2340:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalJararaca.g:2341:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalJararaca.g:2341:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalJararaca.g:2342:2: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // InternalJararaca.g:2343:2: ( rule__OrExpression__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==39) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJararaca.g:2343:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalJararaca.g:2352:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2356:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalJararaca.g:2357:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalJararaca.g:2364:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2368:1: ( ( () ) )
            // InternalJararaca.g:2369:1: ( () )
            {
            // InternalJararaca.g:2369:1: ( () )
            // InternalJararaca.g:2370:2: ()
            {
             before(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0()); 
            // InternalJararaca.g:2371:2: ()
            // InternalJararaca.g:2371:3: 
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
    // InternalJararaca.g:2379:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2383:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalJararaca.g:2384:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalJararaca.g:2391:1: rule__OrExpression__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2395:1: ( ( 'or' ) )
            // InternalJararaca.g:2396:1: ( 'or' )
            {
            // InternalJararaca.g:2396:1: ( 'or' )
            // InternalJararaca.g:2397:2: 'or'
            {
             before(grammarAccess.getOrExpressionAccess().getOrKeyword_1_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalJararaca.g:2406:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2410:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalJararaca.g:2411:2: rule__OrExpression__Group_1__2__Impl
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
    // InternalJararaca.g:2417:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2421:1: ( ( ( rule__OrExpression__RightAssignment_1_2 ) ) )
            // InternalJararaca.g:2422:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            {
            // InternalJararaca.g:2422:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            // InternalJararaca.g:2423:2: ( rule__OrExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 
            // InternalJararaca.g:2424:2: ( rule__OrExpression__RightAssignment_1_2 )
            // InternalJararaca.g:2424:3: rule__OrExpression__RightAssignment_1_2
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
    // InternalJararaca.g:2433:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2437:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalJararaca.g:2438:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalJararaca.g:2445:1: rule__AndExpression__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2449:1: ( ( ruleComparison ) )
            // InternalJararaca.g:2450:1: ( ruleComparison )
            {
            // InternalJararaca.g:2450:1: ( ruleComparison )
            // InternalJararaca.g:2451:2: ruleComparison
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
    // InternalJararaca.g:2460:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2464:1: ( rule__AndExpression__Group__1__Impl )
            // InternalJararaca.g:2465:2: rule__AndExpression__Group__1__Impl
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
    // InternalJararaca.g:2471:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2475:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalJararaca.g:2476:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalJararaca.g:2476:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalJararaca.g:2477:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalJararaca.g:2478:2: ( rule__AndExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==40) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalJararaca.g:2478:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalJararaca.g:2487:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2491:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalJararaca.g:2492:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalJararaca.g:2499:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2503:1: ( ( () ) )
            // InternalJararaca.g:2504:1: ( () )
            {
            // InternalJararaca.g:2504:1: ( () )
            // InternalJararaca.g:2505:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 
            // InternalJararaca.g:2506:2: ()
            // InternalJararaca.g:2506:3: 
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
    // InternalJararaca.g:2514:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2518:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalJararaca.g:2519:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalJararaca.g:2526:1: rule__AndExpression__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2530:1: ( ( 'and' ) )
            // InternalJararaca.g:2531:1: ( 'and' )
            {
            // InternalJararaca.g:2531:1: ( 'and' )
            // InternalJararaca.g:2532:2: 'and'
            {
             before(grammarAccess.getAndExpressionAccess().getAndKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalJararaca.g:2541:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2545:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalJararaca.g:2546:2: rule__AndExpression__Group_1__2__Impl
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
    // InternalJararaca.g:2552:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2556:1: ( ( ( rule__AndExpression__RightAssignment_1_2 ) ) )
            // InternalJararaca.g:2557:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            {
            // InternalJararaca.g:2557:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            // InternalJararaca.g:2558:2: ( rule__AndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            // InternalJararaca.g:2559:2: ( rule__AndExpression__RightAssignment_1_2 )
            // InternalJararaca.g:2559:3: rule__AndExpression__RightAssignment_1_2
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
    // InternalJararaca.g:2568:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2572:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalJararaca.g:2573:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalJararaca.g:2580:1: rule__Comparison__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2584:1: ( ( ruleAddition ) )
            // InternalJararaca.g:2585:1: ( ruleAddition )
            {
            // InternalJararaca.g:2585:1: ( ruleAddition )
            // InternalJararaca.g:2586:2: ruleAddition
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
    // InternalJararaca.g:2595:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2599:1: ( rule__Comparison__Group__1__Impl )
            // InternalJararaca.g:2600:2: rule__Comparison__Group__1__Impl
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
    // InternalJararaca.g:2606:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2610:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalJararaca.g:2611:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalJararaca.g:2611:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalJararaca.g:2612:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalJararaca.g:2613:2: ( rule__Comparison__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=12 && LA16_0<=17)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalJararaca.g:2613:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalJararaca.g:2622:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2626:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalJararaca.g:2627:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalJararaca.g:2634:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2638:1: ( ( () ) )
            // InternalJararaca.g:2639:1: ( () )
            {
            // InternalJararaca.g:2639:1: ( () )
            // InternalJararaca.g:2640:2: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // InternalJararaca.g:2641:2: ()
            // InternalJararaca.g:2641:3: 
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
    // InternalJararaca.g:2649:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2653:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // InternalJararaca.g:2654:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalJararaca.g:2661:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OperatorAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2665:1: ( ( ( rule__Comparison__OperatorAssignment_1_1 ) ) )
            // InternalJararaca.g:2666:1: ( ( rule__Comparison__OperatorAssignment_1_1 ) )
            {
            // InternalJararaca.g:2666:1: ( ( rule__Comparison__OperatorAssignment_1_1 ) )
            // InternalJararaca.g:2667:2: ( rule__Comparison__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOperatorAssignment_1_1()); 
            // InternalJararaca.g:2668:2: ( rule__Comparison__OperatorAssignment_1_1 )
            // InternalJararaca.g:2668:3: rule__Comparison__OperatorAssignment_1_1
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
    // InternalJararaca.g:2676:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2680:1: ( rule__Comparison__Group_1__2__Impl )
            // InternalJararaca.g:2681:2: rule__Comparison__Group_1__2__Impl
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
    // InternalJararaca.g:2687:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2691:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // InternalJararaca.g:2692:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // InternalJararaca.g:2692:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // InternalJararaca.g:2693:2: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // InternalJararaca.g:2694:2: ( rule__Comparison__RightAssignment_1_2 )
            // InternalJararaca.g:2694:3: rule__Comparison__RightAssignment_1_2
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
    // InternalJararaca.g:2703:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2707:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalJararaca.g:2708:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalJararaca.g:2715:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2719:1: ( ( ruleMultiplication ) )
            // InternalJararaca.g:2720:1: ( ruleMultiplication )
            {
            // InternalJararaca.g:2720:1: ( ruleMultiplication )
            // InternalJararaca.g:2721:2: ruleMultiplication
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
    // InternalJararaca.g:2730:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2734:1: ( rule__Addition__Group__1__Impl )
            // InternalJararaca.g:2735:2: rule__Addition__Group__1__Impl
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
    // InternalJararaca.g:2741:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2745:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalJararaca.g:2746:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalJararaca.g:2746:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalJararaca.g:2747:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalJararaca.g:2748:2: ( rule__Addition__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=18 && LA17_0<=19)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalJararaca.g:2748:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalJararaca.g:2757:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2761:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalJararaca.g:2762:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalJararaca.g:2769:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2773:1: ( ( () ) )
            // InternalJararaca.g:2774:1: ( () )
            {
            // InternalJararaca.g:2774:1: ( () )
            // InternalJararaca.g:2775:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalJararaca.g:2776:2: ()
            // InternalJararaca.g:2776:3: 
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
    // InternalJararaca.g:2784:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2788:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalJararaca.g:2789:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalJararaca.g:2796:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2800:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalJararaca.g:2801:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalJararaca.g:2801:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalJararaca.g:2802:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalJararaca.g:2803:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalJararaca.g:2803:3: rule__Addition__OperatorAssignment_1_1
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
    // InternalJararaca.g:2811:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2815:1: ( rule__Addition__Group_1__2__Impl )
            // InternalJararaca.g:2816:2: rule__Addition__Group_1__2__Impl
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
    // InternalJararaca.g:2822:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2826:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalJararaca.g:2827:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalJararaca.g:2827:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalJararaca.g:2828:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalJararaca.g:2829:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalJararaca.g:2829:3: rule__Addition__RightAssignment_1_2
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
    // InternalJararaca.g:2838:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2842:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalJararaca.g:2843:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalJararaca.g:2850:1: rule__Multiplication__Group__0__Impl : ( ruleUnary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2854:1: ( ( ruleUnary ) )
            // InternalJararaca.g:2855:1: ( ruleUnary )
            {
            // InternalJararaca.g:2855:1: ( ruleUnary )
            // InternalJararaca.g:2856:2: ruleUnary
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
    // InternalJararaca.g:2865:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2869:1: ( rule__Multiplication__Group__1__Impl )
            // InternalJararaca.g:2870:2: rule__Multiplication__Group__1__Impl
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
    // InternalJararaca.g:2876:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2880:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalJararaca.g:2881:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalJararaca.g:2881:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalJararaca.g:2882:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalJararaca.g:2883:2: ( rule__Multiplication__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=20 && LA18_0<=22)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalJararaca.g:2883:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalJararaca.g:2892:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2896:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalJararaca.g:2897:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalJararaca.g:2904:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2908:1: ( ( () ) )
            // InternalJararaca.g:2909:1: ( () )
            {
            // InternalJararaca.g:2909:1: ( () )
            // InternalJararaca.g:2910:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalJararaca.g:2911:2: ()
            // InternalJararaca.g:2911:3: 
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
    // InternalJararaca.g:2919:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2923:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalJararaca.g:2924:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalJararaca.g:2931:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2935:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalJararaca.g:2936:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalJararaca.g:2936:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalJararaca.g:2937:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalJararaca.g:2938:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalJararaca.g:2938:3: rule__Multiplication__OperatorAssignment_1_1
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
    // InternalJararaca.g:2946:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2950:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalJararaca.g:2951:2: rule__Multiplication__Group_1__2__Impl
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
    // InternalJararaca.g:2957:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2961:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalJararaca.g:2962:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalJararaca.g:2962:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalJararaca.g:2963:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalJararaca.g:2964:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalJararaca.g:2964:3: rule__Multiplication__RightAssignment_1_2
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
    // InternalJararaca.g:2973:1: rule__Unary__Group_0__0 : rule__Unary__Group_0__0__Impl rule__Unary__Group_0__1 ;
    public final void rule__Unary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2977:1: ( rule__Unary__Group_0__0__Impl rule__Unary__Group_0__1 )
            // InternalJararaca.g:2978:2: rule__Unary__Group_0__0__Impl rule__Unary__Group_0__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalJararaca.g:2985:1: rule__Unary__Group_0__0__Impl : ( () ) ;
    public final void rule__Unary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:2989:1: ( ( () ) )
            // InternalJararaca.g:2990:1: ( () )
            {
            // InternalJararaca.g:2990:1: ( () )
            // InternalJararaca.g:2991:2: ()
            {
             before(grammarAccess.getUnaryAccess().getNotExpressionAction_0_0()); 
            // InternalJararaca.g:2992:2: ()
            // InternalJararaca.g:2992:3: 
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
    // InternalJararaca.g:3000:1: rule__Unary__Group_0__1 : rule__Unary__Group_0__1__Impl rule__Unary__Group_0__2 ;
    public final void rule__Unary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3004:1: ( rule__Unary__Group_0__1__Impl rule__Unary__Group_0__2 )
            // InternalJararaca.g:3005:2: rule__Unary__Group_0__1__Impl rule__Unary__Group_0__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalJararaca.g:3012:1: rule__Unary__Group_0__1__Impl : ( 'not' ) ;
    public final void rule__Unary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3016:1: ( ( 'not' ) )
            // InternalJararaca.g:3017:1: ( 'not' )
            {
            // InternalJararaca.g:3017:1: ( 'not' )
            // InternalJararaca.g:3018:2: 'not'
            {
             before(grammarAccess.getUnaryAccess().getNotKeyword_0_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalJararaca.g:3027:1: rule__Unary__Group_0__2 : rule__Unary__Group_0__2__Impl ;
    public final void rule__Unary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3031:1: ( rule__Unary__Group_0__2__Impl )
            // InternalJararaca.g:3032:2: rule__Unary__Group_0__2__Impl
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
    // InternalJararaca.g:3038:1: rule__Unary__Group_0__2__Impl : ( ( rule__Unary__OperandAssignment_0_2 ) ) ;
    public final void rule__Unary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3042:1: ( ( ( rule__Unary__OperandAssignment_0_2 ) ) )
            // InternalJararaca.g:3043:1: ( ( rule__Unary__OperandAssignment_0_2 ) )
            {
            // InternalJararaca.g:3043:1: ( ( rule__Unary__OperandAssignment_0_2 ) )
            // InternalJararaca.g:3044:2: ( rule__Unary__OperandAssignment_0_2 )
            {
             before(grammarAccess.getUnaryAccess().getOperandAssignment_0_2()); 
            // InternalJararaca.g:3045:2: ( rule__Unary__OperandAssignment_0_2 )
            // InternalJararaca.g:3045:3: rule__Unary__OperandAssignment_0_2
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
    // InternalJararaca.g:3054:1: rule__Unary__Group_1__0 : rule__Unary__Group_1__0__Impl rule__Unary__Group_1__1 ;
    public final void rule__Unary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3058:1: ( rule__Unary__Group_1__0__Impl rule__Unary__Group_1__1 )
            // InternalJararaca.g:3059:2: rule__Unary__Group_1__0__Impl rule__Unary__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalJararaca.g:3066:1: rule__Unary__Group_1__0__Impl : ( () ) ;
    public final void rule__Unary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3070:1: ( ( () ) )
            // InternalJararaca.g:3071:1: ( () )
            {
            // InternalJararaca.g:3071:1: ( () )
            // InternalJararaca.g:3072:2: ()
            {
             before(grammarAccess.getUnaryAccess().getNegativeAction_1_0()); 
            // InternalJararaca.g:3073:2: ()
            // InternalJararaca.g:3073:3: 
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
    // InternalJararaca.g:3081:1: rule__Unary__Group_1__1 : rule__Unary__Group_1__1__Impl rule__Unary__Group_1__2 ;
    public final void rule__Unary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3085:1: ( rule__Unary__Group_1__1__Impl rule__Unary__Group_1__2 )
            // InternalJararaca.g:3086:2: rule__Unary__Group_1__1__Impl rule__Unary__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalJararaca.g:3093:1: rule__Unary__Group_1__1__Impl : ( '-' ) ;
    public final void rule__Unary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3097:1: ( ( '-' ) )
            // InternalJararaca.g:3098:1: ( '-' )
            {
            // InternalJararaca.g:3098:1: ( '-' )
            // InternalJararaca.g:3099:2: '-'
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
    // InternalJararaca.g:3108:1: rule__Unary__Group_1__2 : rule__Unary__Group_1__2__Impl ;
    public final void rule__Unary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3112:1: ( rule__Unary__Group_1__2__Impl )
            // InternalJararaca.g:3113:2: rule__Unary__Group_1__2__Impl
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
    // InternalJararaca.g:3119:1: rule__Unary__Group_1__2__Impl : ( ( rule__Unary__OperandAssignment_1_2 ) ) ;
    public final void rule__Unary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3123:1: ( ( ( rule__Unary__OperandAssignment_1_2 ) ) )
            // InternalJararaca.g:3124:1: ( ( rule__Unary__OperandAssignment_1_2 ) )
            {
            // InternalJararaca.g:3124:1: ( ( rule__Unary__OperandAssignment_1_2 ) )
            // InternalJararaca.g:3125:2: ( rule__Unary__OperandAssignment_1_2 )
            {
             before(grammarAccess.getUnaryAccess().getOperandAssignment_1_2()); 
            // InternalJararaca.g:3126:2: ( rule__Unary__OperandAssignment_1_2 )
            // InternalJararaca.g:3126:3: rule__Unary__OperandAssignment_1_2
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
    // InternalJararaca.g:3135:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3139:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalJararaca.g:3140:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalJararaca.g:3147:1: rule__Primary__Group_0__0__Impl : ( () ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3151:1: ( ( () ) )
            // InternalJararaca.g:3152:1: ( () )
            {
            // InternalJararaca.g:3152:1: ( () )
            // InternalJararaca.g:3153:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getParenExpressionAction_0_0()); 
            // InternalJararaca.g:3154:2: ()
            // InternalJararaca.g:3154:3: 
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
    // InternalJararaca.g:3162:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3166:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalJararaca.g:3167:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalJararaca.g:3174:1: rule__Primary__Group_0__1__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3178:1: ( ( '(' ) )
            // InternalJararaca.g:3179:1: ( '(' )
            {
            // InternalJararaca.g:3179:1: ( '(' )
            // InternalJararaca.g:3180:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalJararaca.g:3189:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl rule__Primary__Group_0__3 ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3193:1: ( rule__Primary__Group_0__2__Impl rule__Primary__Group_0__3 )
            // InternalJararaca.g:3194:2: rule__Primary__Group_0__2__Impl rule__Primary__Group_0__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalJararaca.g:3201:1: rule__Primary__Group_0__2__Impl : ( ( rule__Primary__InnerAssignment_0_2 ) ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3205:1: ( ( ( rule__Primary__InnerAssignment_0_2 ) ) )
            // InternalJararaca.g:3206:1: ( ( rule__Primary__InnerAssignment_0_2 ) )
            {
            // InternalJararaca.g:3206:1: ( ( rule__Primary__InnerAssignment_0_2 ) )
            // InternalJararaca.g:3207:2: ( rule__Primary__InnerAssignment_0_2 )
            {
             before(grammarAccess.getPrimaryAccess().getInnerAssignment_0_2()); 
            // InternalJararaca.g:3208:2: ( rule__Primary__InnerAssignment_0_2 )
            // InternalJararaca.g:3208:3: rule__Primary__InnerAssignment_0_2
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
    // InternalJararaca.g:3216:1: rule__Primary__Group_0__3 : rule__Primary__Group_0__3__Impl ;
    public final void rule__Primary__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3220:1: ( rule__Primary__Group_0__3__Impl )
            // InternalJararaca.g:3221:2: rule__Primary__Group_0__3__Impl
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
    // InternalJararaca.g:3227:1: rule__Primary__Group_0__3__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3231:1: ( ( ')' ) )
            // InternalJararaca.g:3232:1: ( ')' )
            {
            // InternalJararaca.g:3232:1: ( ')' )
            // InternalJararaca.g:3233:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalJararaca.g:3243:1: rule__TrueLiteral__Group__0 : rule__TrueLiteral__Group__0__Impl rule__TrueLiteral__Group__1 ;
    public final void rule__TrueLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3247:1: ( rule__TrueLiteral__Group__0__Impl rule__TrueLiteral__Group__1 )
            // InternalJararaca.g:3248:2: rule__TrueLiteral__Group__0__Impl rule__TrueLiteral__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalJararaca.g:3255:1: rule__TrueLiteral__Group__0__Impl : ( () ) ;
    public final void rule__TrueLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3259:1: ( ( () ) )
            // InternalJararaca.g:3260:1: ( () )
            {
            // InternalJararaca.g:3260:1: ( () )
            // InternalJararaca.g:3261:2: ()
            {
             before(grammarAccess.getTrueLiteralAccess().getTrueLiteralAction_0()); 
            // InternalJararaca.g:3262:2: ()
            // InternalJararaca.g:3262:3: 
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
    // InternalJararaca.g:3270:1: rule__TrueLiteral__Group__1 : rule__TrueLiteral__Group__1__Impl ;
    public final void rule__TrueLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3274:1: ( rule__TrueLiteral__Group__1__Impl )
            // InternalJararaca.g:3275:2: rule__TrueLiteral__Group__1__Impl
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
    // InternalJararaca.g:3281:1: rule__TrueLiteral__Group__1__Impl : ( 'true' ) ;
    public final void rule__TrueLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3285:1: ( ( 'true' ) )
            // InternalJararaca.g:3286:1: ( 'true' )
            {
            // InternalJararaca.g:3286:1: ( 'true' )
            // InternalJararaca.g:3287:2: 'true'
            {
             before(grammarAccess.getTrueLiteralAccess().getTrueKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalJararaca.g:3297:1: rule__FalseLiteral__Group__0 : rule__FalseLiteral__Group__0__Impl rule__FalseLiteral__Group__1 ;
    public final void rule__FalseLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3301:1: ( rule__FalseLiteral__Group__0__Impl rule__FalseLiteral__Group__1 )
            // InternalJararaca.g:3302:2: rule__FalseLiteral__Group__0__Impl rule__FalseLiteral__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalJararaca.g:3309:1: rule__FalseLiteral__Group__0__Impl : ( () ) ;
    public final void rule__FalseLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3313:1: ( ( () ) )
            // InternalJararaca.g:3314:1: ( () )
            {
            // InternalJararaca.g:3314:1: ( () )
            // InternalJararaca.g:3315:2: ()
            {
             before(grammarAccess.getFalseLiteralAccess().getFalseLiteralAction_0()); 
            // InternalJararaca.g:3316:2: ()
            // InternalJararaca.g:3316:3: 
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
    // InternalJararaca.g:3324:1: rule__FalseLiteral__Group__1 : rule__FalseLiteral__Group__1__Impl ;
    public final void rule__FalseLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3328:1: ( rule__FalseLiteral__Group__1__Impl )
            // InternalJararaca.g:3329:2: rule__FalseLiteral__Group__1__Impl
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
    // InternalJararaca.g:3335:1: rule__FalseLiteral__Group__1__Impl : ( 'false' ) ;
    public final void rule__FalseLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3339:1: ( ( 'false' ) )
            // InternalJararaca.g:3340:1: ( 'false' )
            {
            // InternalJararaca.g:3340:1: ( 'false' )
            // InternalJararaca.g:3341:2: 'false'
            {
             before(grammarAccess.getFalseLiteralAccess().getFalseKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalJararaca.g:3351:1: rule__Program__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__Program__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3355:1: ( ( ruleStatement ) )
            // InternalJararaca.g:3356:2: ( ruleStatement )
            {
            // InternalJararaca.g:3356:2: ( ruleStatement )
            // InternalJararaca.g:3357:3: ruleStatement
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


    // $ANTLR start "rule__Block__StatementsAssignment_1"
    // InternalJararaca.g:3366:1: rule__Block__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Block__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3370:1: ( ( ruleStatement ) )
            // InternalJararaca.g:3371:2: ( ruleStatement )
            {
            // InternalJararaca.g:3371:2: ( ruleStatement )
            // InternalJararaca.g:3372:3: ruleStatement
            {
             before(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__StatementsAssignment_1"


    // $ANTLR start "rule__IfStatement__ConditionAssignment_2"
    // InternalJararaca.g:3381:1: rule__IfStatement__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__IfStatement__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3385:1: ( ( ruleExpression ) )
            // InternalJararaca.g:3386:2: ( ruleExpression )
            {
            // InternalJararaca.g:3386:2: ( ruleExpression )
            // InternalJararaca.g:3387:3: ruleExpression
            {
             before(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ConditionAssignment_2"


    // $ANTLR start "rule__IfStatement__BlockAssignment_4"
    // InternalJararaca.g:3396:1: rule__IfStatement__BlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__IfStatement__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3400:1: ( ( ruleBlock ) )
            // InternalJararaca.g:3401:2: ( ruleBlock )
            {
            // InternalJararaca.g:3401:2: ( ruleBlock )
            // InternalJararaca.g:3402:3: ruleBlock
            {
             before(grammarAccess.getIfStatementAccess().getBlockBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getBlockBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__BlockAssignment_4"


    // $ANTLR start "rule__IfStatement__ElsePartAssignment_5_1"
    // InternalJararaca.g:3411:1: rule__IfStatement__ElsePartAssignment_5_1 : ( ruleElsePart ) ;
    public final void rule__IfStatement__ElsePartAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3415:1: ( ( ruleElsePart ) )
            // InternalJararaca.g:3416:2: ( ruleElsePart )
            {
            // InternalJararaca.g:3416:2: ( ruleElsePart )
            // InternalJararaca.g:3417:3: ruleElsePart
            {
             before(grammarAccess.getIfStatementAccess().getElsePartElsePartParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElsePart();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getElsePartElsePartParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ElsePartAssignment_5_1"


    // $ANTLR start "rule__WhileStatement__ConditionAssignment_2"
    // InternalJararaca.g:3426:1: rule__WhileStatement__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__WhileStatement__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3430:1: ( ( ruleExpression ) )
            // InternalJararaca.g:3431:2: ( ruleExpression )
            {
            // InternalJararaca.g:3431:2: ( ruleExpression )
            // InternalJararaca.g:3432:3: ruleExpression
            {
             before(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__ConditionAssignment_2"


    // $ANTLR start "rule__WhileStatement__BlockAssignment_4"
    // InternalJararaca.g:3441:1: rule__WhileStatement__BlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__WhileStatement__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3445:1: ( ( ruleBlock ) )
            // InternalJararaca.g:3446:2: ( ruleBlock )
            {
            // InternalJararaca.g:3446:2: ( ruleBlock )
            // InternalJararaca.g:3447:3: ruleBlock
            {
             before(grammarAccess.getWhileStatementAccess().getBlockBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getWhileStatementAccess().getBlockBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__BlockAssignment_4"


    // $ANTLR start "rule__DoWhileStatement__BlockAssignment_1"
    // InternalJararaca.g:3456:1: rule__DoWhileStatement__BlockAssignment_1 : ( ruleBlock ) ;
    public final void rule__DoWhileStatement__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3460:1: ( ( ruleBlock ) )
            // InternalJararaca.g:3461:2: ( ruleBlock )
            {
            // InternalJararaca.g:3461:2: ( ruleBlock )
            // InternalJararaca.g:3462:3: ruleBlock
            {
             before(grammarAccess.getDoWhileStatementAccess().getBlockBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getDoWhileStatementAccess().getBlockBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileStatement__BlockAssignment_1"


    // $ANTLR start "rule__DoWhileStatement__ConditionAssignment_4"
    // InternalJararaca.g:3471:1: rule__DoWhileStatement__ConditionAssignment_4 : ( ruleExpression ) ;
    public final void rule__DoWhileStatement__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3475:1: ( ( ruleExpression ) )
            // InternalJararaca.g:3476:2: ( ruleExpression )
            {
            // InternalJararaca.g:3476:2: ( ruleExpression )
            // InternalJararaca.g:3477:3: ruleExpression
            {
             before(grammarAccess.getDoWhileStatementAccess().getConditionExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getDoWhileStatementAccess().getConditionExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileStatement__ConditionAssignment_4"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalJararaca.g:3486:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3490:1: ( ( RULE_ID ) )
            // InternalJararaca.g:3491:2: ( RULE_ID )
            {
            // InternalJararaca.g:3491:2: ( RULE_ID )
            // InternalJararaca.g:3492:3: RULE_ID
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
    // InternalJararaca.g:3501:1: rule__VariableDeclaration__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__VariableDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3505:1: ( ( ruleType ) )
            // InternalJararaca.g:3506:2: ( ruleType )
            {
            // InternalJararaca.g:3506:2: ( ruleType )
            // InternalJararaca.g:3507:3: ruleType
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
    // InternalJararaca.g:3516:1: rule__VariableDeclaration__InitialValueAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__VariableDeclaration__InitialValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3520:1: ( ( ruleExpression ) )
            // InternalJararaca.g:3521:2: ( ruleExpression )
            {
            // InternalJararaca.g:3521:2: ( ruleExpression )
            // InternalJararaca.g:3522:3: ruleExpression
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
    // InternalJararaca.g:3531:1: rule__Assignment__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Assignment__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3535:1: ( ( RULE_ID ) )
            // InternalJararaca.g:3536:2: ( RULE_ID )
            {
            // InternalJararaca.g:3536:2: ( RULE_ID )
            // InternalJararaca.g:3537:3: RULE_ID
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
    // InternalJararaca.g:3546:1: rule__Assignment__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3550:1: ( ( ruleExpression ) )
            // InternalJararaca.g:3551:2: ( ruleExpression )
            {
            // InternalJararaca.g:3551:2: ( ruleExpression )
            // InternalJararaca.g:3552:3: ruleExpression
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
    // InternalJararaca.g:3561:1: rule__OrExpression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3565:1: ( ( ruleAndExpression ) )
            // InternalJararaca.g:3566:2: ( ruleAndExpression )
            {
            // InternalJararaca.g:3566:2: ( ruleAndExpression )
            // InternalJararaca.g:3567:3: ruleAndExpression
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
    // InternalJararaca.g:3576:1: rule__AndExpression__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__AndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3580:1: ( ( ruleComparison ) )
            // InternalJararaca.g:3581:2: ( ruleComparison )
            {
            // InternalJararaca.g:3581:2: ( ruleComparison )
            // InternalJararaca.g:3582:3: ruleComparison
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
    // InternalJararaca.g:3591:1: rule__Comparison__OperatorAssignment_1_1 : ( ( rule__Comparison__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3595:1: ( ( ( rule__Comparison__OperatorAlternatives_1_1_0 ) ) )
            // InternalJararaca.g:3596:2: ( ( rule__Comparison__OperatorAlternatives_1_1_0 ) )
            {
            // InternalJararaca.g:3596:2: ( ( rule__Comparison__OperatorAlternatives_1_1_0 ) )
            // InternalJararaca.g:3597:3: ( rule__Comparison__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOperatorAlternatives_1_1_0()); 
            // InternalJararaca.g:3598:3: ( rule__Comparison__OperatorAlternatives_1_1_0 )
            // InternalJararaca.g:3598:4: rule__Comparison__OperatorAlternatives_1_1_0
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
    // InternalJararaca.g:3606:1: rule__Comparison__RightAssignment_1_2 : ( ruleAddition ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3610:1: ( ( ruleAddition ) )
            // InternalJararaca.g:3611:2: ( ruleAddition )
            {
            // InternalJararaca.g:3611:2: ( ruleAddition )
            // InternalJararaca.g:3612:3: ruleAddition
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
    // InternalJararaca.g:3621:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3625:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalJararaca.g:3626:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalJararaca.g:3626:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalJararaca.g:3627:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalJararaca.g:3628:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalJararaca.g:3628:4: rule__Addition__OperatorAlternatives_1_1_0
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
    // InternalJararaca.g:3636:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3640:1: ( ( ruleMultiplication ) )
            // InternalJararaca.g:3641:2: ( ruleMultiplication )
            {
            // InternalJararaca.g:3641:2: ( ruleMultiplication )
            // InternalJararaca.g:3642:3: ruleMultiplication
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
    // InternalJararaca.g:3651:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3655:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalJararaca.g:3656:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalJararaca.g:3656:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalJararaca.g:3657:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalJararaca.g:3658:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalJararaca.g:3658:4: rule__Multiplication__OperatorAlternatives_1_1_0
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
    // InternalJararaca.g:3666:1: rule__Multiplication__RightAssignment_1_2 : ( ruleUnary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3670:1: ( ( ruleUnary ) )
            // InternalJararaca.g:3671:2: ( ruleUnary )
            {
            // InternalJararaca.g:3671:2: ( ruleUnary )
            // InternalJararaca.g:3672:3: ruleUnary
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
    // InternalJararaca.g:3681:1: rule__Unary__OperandAssignment_0_2 : ( ruleUnary ) ;
    public final void rule__Unary__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3685:1: ( ( ruleUnary ) )
            // InternalJararaca.g:3686:2: ( ruleUnary )
            {
            // InternalJararaca.g:3686:2: ( ruleUnary )
            // InternalJararaca.g:3687:3: ruleUnary
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
    // InternalJararaca.g:3696:1: rule__Unary__OperandAssignment_1_2 : ( ruleUnary ) ;
    public final void rule__Unary__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3700:1: ( ( ruleUnary ) )
            // InternalJararaca.g:3701:2: ( ruleUnary )
            {
            // InternalJararaca.g:3701:2: ( ruleUnary )
            // InternalJararaca.g:3702:3: ruleUnary
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
    // InternalJararaca.g:3711:1: rule__Primary__InnerAssignment_0_2 : ( ruleExpression ) ;
    public final void rule__Primary__InnerAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3715:1: ( ( ruleExpression ) )
            // InternalJararaca.g:3716:2: ( ruleExpression )
            {
            // InternalJararaca.g:3716:2: ( ruleExpression )
            // InternalJararaca.g:3717:3: ruleExpression
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
    // InternalJararaca.g:3726:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3730:1: ( ( RULE_INT ) )
            // InternalJararaca.g:3731:2: ( RULE_INT )
            {
            // InternalJararaca.g:3731:2: ( RULE_INT )
            // InternalJararaca.g:3732:3: RULE_INT
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
    // InternalJararaca.g:3741:1: rule__FloatLiteral__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3745:1: ( ( RULE_FLOAT ) )
            // InternalJararaca.g:3746:2: ( RULE_FLOAT )
            {
            // InternalJararaca.g:3746:2: ( RULE_FLOAT )
            // InternalJararaca.g:3747:3: RULE_FLOAT
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
    // InternalJararaca.g:3756:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3760:1: ( ( RULE_STRING ) )
            // InternalJararaca.g:3761:2: ( RULE_STRING )
            {
            // InternalJararaca.g:3761:2: ( RULE_STRING )
            // InternalJararaca.g:3762:3: RULE_STRING
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
    // InternalJararaca.g:3771:1: rule__VariableReference__NameAssignment : ( RULE_ID ) ;
    public final void rule__VariableReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJararaca.g:3775:1: ( ( RULE_ID ) )
            // InternalJararaca.g:3776:2: ( RULE_ID )
            {
            // InternalJararaca.g:3776:2: ( RULE_ID )
            // InternalJararaca.g:3777:3: RULE_ID
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000002C6000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000002C4000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000E00080800F0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000003F002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000C0000000000L});

}