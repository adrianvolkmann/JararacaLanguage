package com.volkmann.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.volkmann.services.JararacaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJararacaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'{'", "'}'", "'if'", "'('", "')'", "'else'", "'while'", "'do'", "';'", "'var'", "'='", "'int'", "'decimal'", "'boolean'", "'string'", "'or'", "'and'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'not'", "'true'", "'false'"
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

        public InternalJararacaParser(TokenStream input, JararacaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected JararacaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalJararaca.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalJararaca.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalJararaca.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalJararaca.g:71:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalJararaca.g:77:2: ( (otherlv_0= 'program' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // InternalJararaca.g:78:2: (otherlv_0= 'program' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // InternalJararaca.g:78:2: (otherlv_0= 'program' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // InternalJararaca.g:79:3: otherlv_0= 'program' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalJararaca.g:87:3: ( (lv_statements_2_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==15||(LA1_0>=19 && LA1_0<=20)||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJararaca.g:88:4: (lv_statements_2_0= ruleStatement )
            	    {
            	    // InternalJararaca.g:88:4: (lv_statements_2_0= ruleStatement )
            	    // InternalJararaca.g:89:5: lv_statements_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_2_0,
            	    						"com.volkmann.Jararaca.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalJararaca.g:114:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalJararaca.g:114:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalJararaca.g:115:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalJararaca.g:121:1: ruleStatement returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_Assignment_1= ruleAssignment | this_IfStatement_2= ruleIfStatement | this_WhileStatement_3= ruleWhileStatement | this_DoWhileStatement_4= ruleDoWhileStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_IfStatement_2 = null;

        EObject this_WhileStatement_3 = null;

        EObject this_DoWhileStatement_4 = null;



        	enterRule();

        try {
            // InternalJararaca.g:127:2: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_Assignment_1= ruleAssignment | this_IfStatement_2= ruleIfStatement | this_WhileStatement_3= ruleWhileStatement | this_DoWhileStatement_4= ruleDoWhileStatement ) )
            // InternalJararaca.g:128:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_Assignment_1= ruleAssignment | this_IfStatement_2= ruleIfStatement | this_WhileStatement_3= ruleWhileStatement | this_DoWhileStatement_4= ruleDoWhileStatement )
            {
            // InternalJararaca.g:128:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_Assignment_1= ruleAssignment | this_IfStatement_2= ruleIfStatement | this_WhileStatement_3= ruleWhileStatement | this_DoWhileStatement_4= ruleDoWhileStatement )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalJararaca.g:129:3: this_VariableDeclaration_0= ruleVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_0=ruleVariableDeclaration();

                    state._fsp--;


                    			current = this_VariableDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJararaca.g:138:3: this_Assignment_1= ruleAssignment
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assignment_1=ruleAssignment();

                    state._fsp--;


                    			current = this_Assignment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJararaca.g:147:3: this_IfStatement_2= ruleIfStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStatement_2=ruleIfStatement();

                    state._fsp--;


                    			current = this_IfStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJararaca.g:156:3: this_WhileStatement_3= ruleWhileStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileStatement_3=ruleWhileStatement();

                    state._fsp--;


                    			current = this_WhileStatement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJararaca.g:165:3: this_DoWhileStatement_4= ruleDoWhileStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDoWhileStatementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoWhileStatement_4=ruleDoWhileStatement();

                    state._fsp--;


                    			current = this_DoWhileStatement_4;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleBlock"
    // InternalJararaca.g:177:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalJararaca.g:177:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalJararaca.g:178:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalJararaca.g:184:1: ruleBlock returns [EObject current=null] : (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalJararaca.g:190:2: ( (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) )
            // InternalJararaca.g:191:2: (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' )
            {
            // InternalJararaca.g:191:2: (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' )
            // InternalJararaca.g:192:3: otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalJararaca.g:196:3: ( (lv_statements_1_0= ruleStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==15||(LA3_0>=19 && LA3_0<=20)||LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJararaca.g:197:4: (lv_statements_1_0= ruleStatement )
            	    {
            	    // InternalJararaca.g:197:4: (lv_statements_1_0= ruleStatement )
            	    // InternalJararaca.g:198:5: lv_statements_1_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_statements_1_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_1_0,
            	    						"com.volkmann.Jararaca.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleIfStatement"
    // InternalJararaca.g:223:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalJararaca.g:223:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalJararaca.g:224:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalJararaca.g:230:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elsePart_6_0= ruleElsePart ) ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_block_4_0 = null;

        EObject lv_elsePart_6_0 = null;



        	enterRule();

        try {
            // InternalJararaca.g:236:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elsePart_6_0= ruleElsePart ) ) )? ) )
            // InternalJararaca.g:237:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elsePart_6_0= ruleElsePart ) ) )? )
            {
            // InternalJararaca.g:237:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elsePart_6_0= ruleElsePart ) ) )? )
            // InternalJararaca.g:238:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elsePart_6_0= ruleElsePart ) ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalJararaca.g:246:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalJararaca.g:247:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalJararaca.g:247:4: (lv_condition_2_0= ruleExpression )
            // InternalJararaca.g:248:5: lv_condition_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_condition_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"com.volkmann.Jararaca.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
            		
            // InternalJararaca.g:269:3: ( (lv_block_4_0= ruleBlock ) )
            // InternalJararaca.g:270:4: (lv_block_4_0= ruleBlock )
            {
            // InternalJararaca.g:270:4: (lv_block_4_0= ruleBlock )
            // InternalJararaca.g:271:5: lv_block_4_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getBlockBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_block_4_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_4_0,
            						"com.volkmann.Jararaca.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJararaca.g:288:3: (otherlv_5= 'else' ( (lv_elsePart_6_0= ruleElsePart ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJararaca.g:289:4: otherlv_5= 'else' ( (lv_elsePart_6_0= ruleElsePart ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                    			
                    // InternalJararaca.g:293:4: ( (lv_elsePart_6_0= ruleElsePart ) )
                    // InternalJararaca.g:294:5: (lv_elsePart_6_0= ruleElsePart )
                    {
                    // InternalJararaca.g:294:5: (lv_elsePart_6_0= ruleElsePart )
                    // InternalJararaca.g:295:6: lv_elsePart_6_0= ruleElsePart
                    {

                    						newCompositeNode(grammarAccess.getIfStatementAccess().getElsePartElsePartParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elsePart_6_0=ruleElsePart();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    						}
                    						set(
                    							current,
                    							"elsePart",
                    							lv_elsePart_6_0,
                    							"com.volkmann.Jararaca.ElsePart");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleElsePart"
    // InternalJararaca.g:317:1: entryRuleElsePart returns [EObject current=null] : iv_ruleElsePart= ruleElsePart EOF ;
    public final EObject entryRuleElsePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElsePart = null;


        try {
            // InternalJararaca.g:317:49: (iv_ruleElsePart= ruleElsePart EOF )
            // InternalJararaca.g:318:2: iv_ruleElsePart= ruleElsePart EOF
            {
             newCompositeNode(grammarAccess.getElsePartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElsePart=ruleElsePart();

            state._fsp--;

             current =iv_ruleElsePart; 
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
    // $ANTLR end "entryRuleElsePart"


    // $ANTLR start "ruleElsePart"
    // InternalJararaca.g:324:1: ruleElsePart returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_Block_1= ruleBlock ) ;
    public final EObject ruleElsePart() throws RecognitionException {
        EObject current = null;

        EObject this_IfStatement_0 = null;

        EObject this_Block_1 = null;



        	enterRule();

        try {
            // InternalJararaca.g:330:2: ( (this_IfStatement_0= ruleIfStatement | this_Block_1= ruleBlock ) )
            // InternalJararaca.g:331:2: (this_IfStatement_0= ruleIfStatement | this_Block_1= ruleBlock )
            {
            // InternalJararaca.g:331:2: (this_IfStatement_0= ruleIfStatement | this_Block_1= ruleBlock )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalJararaca.g:332:3: this_IfStatement_0= ruleIfStatement
                    {

                    			newCompositeNode(grammarAccess.getElsePartAccess().getIfStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStatement_0=ruleIfStatement();

                    state._fsp--;


                    			current = this_IfStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJararaca.g:341:3: this_Block_1= ruleBlock
                    {

                    			newCompositeNode(grammarAccess.getElsePartAccess().getBlockParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Block_1=ruleBlock();

                    state._fsp--;


                    			current = this_Block_1;
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
    // $ANTLR end "ruleElsePart"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalJararaca.g:353:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalJararaca.g:353:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalJararaca.g:354:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
             newCompositeNode(grammarAccess.getWhileStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;

             current =iv_ruleWhileStatement; 
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
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalJararaca.g:360:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_block_4_0 = null;



        	enterRule();

        try {
            // InternalJararaca.g:366:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) )
            // InternalJararaca.g:367:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
            {
            // InternalJararaca.g:367:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
            // InternalJararaca.g:368:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalJararaca.g:376:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalJararaca.g:377:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalJararaca.g:377:4: (lv_condition_2_0= ruleExpression )
            // InternalJararaca.g:378:5: lv_condition_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_condition_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"com.volkmann.Jararaca.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3());
            		
            // InternalJararaca.g:399:3: ( (lv_block_4_0= ruleBlock ) )
            // InternalJararaca.g:400:4: (lv_block_4_0= ruleBlock )
            {
            // InternalJararaca.g:400:4: (lv_block_4_0= ruleBlock )
            // InternalJararaca.g:401:5: lv_block_4_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getWhileStatementAccess().getBlockBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_4_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_4_0,
            						"com.volkmann.Jararaca.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleDoWhileStatement"
    // InternalJararaca.g:422:1: entryRuleDoWhileStatement returns [EObject current=null] : iv_ruleDoWhileStatement= ruleDoWhileStatement EOF ;
    public final EObject entryRuleDoWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWhileStatement = null;


        try {
            // InternalJararaca.g:422:57: (iv_ruleDoWhileStatement= ruleDoWhileStatement EOF )
            // InternalJararaca.g:423:2: iv_ruleDoWhileStatement= ruleDoWhileStatement EOF
            {
             newCompositeNode(grammarAccess.getDoWhileStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoWhileStatement=ruleDoWhileStatement();

            state._fsp--;

             current =iv_ruleDoWhileStatement; 
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
    // $ANTLR end "entryRuleDoWhileStatement"


    // $ANTLR start "ruleDoWhileStatement"
    // InternalJararaca.g:429:1: ruleDoWhileStatement returns [EObject current=null] : (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleDoWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_block_1_0 = null;

        EObject lv_condition_4_0 = null;



        	enterRule();

        try {
            // InternalJararaca.g:435:2: ( (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalJararaca.g:436:2: (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalJararaca.g:436:2: (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalJararaca.g:437:3: otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDoWhileStatementAccess().getDoKeyword_0());
            		
            // InternalJararaca.g:441:3: ( (lv_block_1_0= ruleBlock ) )
            // InternalJararaca.g:442:4: (lv_block_1_0= ruleBlock )
            {
            // InternalJararaca.g:442:4: (lv_block_1_0= ruleBlock )
            // InternalJararaca.g:443:5: lv_block_1_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getDoWhileStatementAccess().getBlockBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_block_1_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoWhileStatementRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_1_0,
            						"com.volkmann.Jararaca.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDoWhileStatementAccess().getWhileKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getDoWhileStatementAccess().getLeftParenthesisKeyword_3());
            		
            // InternalJararaca.g:468:3: ( (lv_condition_4_0= ruleExpression ) )
            // InternalJararaca.g:469:4: (lv_condition_4_0= ruleExpression )
            {
            // InternalJararaca.g:469:4: (lv_condition_4_0= ruleExpression )
            // InternalJararaca.g:470:5: lv_condition_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDoWhileStatementAccess().getConditionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_condition_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoWhileStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_4_0,
            						"com.volkmann.Jararaca.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getDoWhileStatementAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDoWhileStatementAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleDoWhileStatement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalJararaca.g:499:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalJararaca.g:499:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalJararaca.g:500:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalJararaca.g:506:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleExpression ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_2_0 = null;

        EObject lv_initialValue_4_0 = null;



        	enterRule();

        try {
            // InternalJararaca.g:512:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleExpression ) ) )? otherlv_5= ';' ) )
            // InternalJararaca.g:513:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleExpression ) ) )? otherlv_5= ';' )
            {
            // InternalJararaca.g:513:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleExpression ) ) )? otherlv_5= ';' )
            // InternalJararaca.g:514:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleExpression ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalJararaca.g:518:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJararaca.g:519:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJararaca.g:519:4: (lv_name_1_0= RULE_ID )
            // InternalJararaca.g:520:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalJararaca.g:536:3: ( (lv_type_2_0= ruleType ) )
            // InternalJararaca.g:537:4: (lv_type_2_0= ruleType )
            {
            // InternalJararaca.g:537:4: (lv_type_2_0= ruleType )
            // InternalJararaca.g:538:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"com.volkmann.Jararaca.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJararaca.g:555:3: (otherlv_3= '=' ( (lv_initialValue_4_0= ruleExpression ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJararaca.g:556:4: otherlv_3= '=' ( (lv_initialValue_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalJararaca.g:560:4: ( (lv_initialValue_4_0= ruleExpression ) )
                    // InternalJararaca.g:561:5: (lv_initialValue_4_0= ruleExpression )
                    {
                    // InternalJararaca.g:561:5: (lv_initialValue_4_0= ruleExpression )
                    // InternalJararaca.g:562:6: lv_initialValue_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getInitialValueExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_initialValue_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"initialValue",
                    							lv_initialValue_4_0,
                    							"com.volkmann.Jararaca.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleAssignment"
    // InternalJararaca.g:588:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalJararaca.g:588:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalJararaca.g:589:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalJararaca.g:595:1: ruleAssignment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalJararaca.g:601:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // InternalJararaca.g:602:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // InternalJararaca.g:602:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';' )
            // InternalJararaca.g:603:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // InternalJararaca.g:603:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalJararaca.g:604:4: (lv_name_0_0= RULE_ID )
            {
            // InternalJararaca.g:604:4: (lv_name_0_0= RULE_ID )
            // InternalJararaca.g:605:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalJararaca.g:625:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalJararaca.g:626:4: (lv_value_2_0= ruleExpression )
            {
            // InternalJararaca.g:626:4: (lv_value_2_0= ruleExpression )
            // InternalJararaca.g:627:5: lv_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.volkmann.Jararaca.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleType"
    // InternalJararaca.g:652:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalJararaca.g:652:45: (iv_ruleType= ruleType EOF )
            // InternalJararaca.g:653:2: iv_ruleType= ruleType EOF
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
    // InternalJararaca.g:659:1: ruleType returns [EObject current=null] : (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BooleanType_2= ruleBooleanType | this_StringType_3= ruleStringType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_IntType_0 = null;

        EObject this_FloatType_1 = null;

        EObject this_BooleanType_2 = null;

        EObject this_StringType_3 = null;



        	enterRule();

        try {
            // InternalJararaca.g:665:2: ( (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BooleanType_2= ruleBooleanType | this_StringType_3= ruleStringType ) )
            // InternalJararaca.g:666:2: (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BooleanType_2= ruleBooleanType | this_StringType_3= ruleStringType )
            {
            // InternalJararaca.g:666:2: (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BooleanType_2= ruleBooleanType | this_StringType_3= ruleStringType )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            case 27:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalJararaca.g:667:3: this_IntType_0= ruleIntType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntType_0=ruleIntType();

                    state._fsp--;


                    			current = this_IntType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJararaca.g:676:3: this_FloatType_1= ruleFloatType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getFloatTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatType_1=ruleFloatType();

                    state._fsp--;


                    			current = this_FloatType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJararaca.g:685:3: this_BooleanType_2= ruleBooleanType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanType_2=ruleBooleanType();

                    state._fsp--;


                    			current = this_BooleanType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJararaca.g:694:3: this_StringType_3= ruleStringType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringType_3=ruleStringType();

                    state._fsp--;


                    			current = this_StringType_3;
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


    // $ANTLR start "entryRuleIntType"
    // InternalJararaca.g:706:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // InternalJararaca.g:706:48: (iv_ruleIntType= ruleIntType EOF )
            // InternalJararaca.g:707:2: iv_ruleIntType= ruleIntType EOF
            {
             newCompositeNode(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntType=ruleIntType();

            state._fsp--;

             current =iv_ruleIntType; 
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
    // $ANTLR end "entryRuleIntType"


    // $ANTLR start "ruleIntType"
    // InternalJararaca.g:713:1: ruleIntType returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJararaca.g:719:2: ( ( () otherlv_1= 'int' ) )
            // InternalJararaca.g:720:2: ( () otherlv_1= 'int' )
            {
            // InternalJararaca.g:720:2: ( () otherlv_1= 'int' )
            // InternalJararaca.g:721:3: () otherlv_1= 'int'
            {
            // InternalJararaca.g:721:3: ()
            // InternalJararaca.g:722:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntTypeAccess().getIntTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getIntTypeAccess().getIntKeyword_1());
            		

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
    // $ANTLR end "ruleIntType"


    // $ANTLR start "entryRuleFloatType"
    // InternalJararaca.g:736:1: entryRuleFloatType returns [EObject current=null] : iv_ruleFloatType= ruleFloatType EOF ;
    public final EObject entryRuleFloatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatType = null;


        try {
            // InternalJararaca.g:736:50: (iv_ruleFloatType= ruleFloatType EOF )
            // InternalJararaca.g:737:2: iv_ruleFloatType= ruleFloatType EOF
            {
             newCompositeNode(grammarAccess.getFloatTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatType=ruleFloatType();

            state._fsp--;

             current =iv_ruleFloatType; 
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
    // $ANTLR end "entryRuleFloatType"


    // $ANTLR start "ruleFloatType"
    // InternalJararaca.g:743:1: ruleFloatType returns [EObject current=null] : ( () otherlv_1= 'decimal' ) ;
    public final EObject ruleFloatType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJararaca.g:749:2: ( ( () otherlv_1= 'decimal' ) )
            // InternalJararaca.g:750:2: ( () otherlv_1= 'decimal' )
            {
            // InternalJararaca.g:750:2: ( () otherlv_1= 'decimal' )
            // InternalJararaca.g:751:3: () otherlv_1= 'decimal'
            {
            // InternalJararaca.g:751:3: ()
            // InternalJararaca.g:752:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloatTypeAccess().getFloatTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFloatTypeAccess().getDecimalKeyword_1());
            		

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
    // $ANTLR end "ruleFloatType"


    // $ANTLR start "entryRuleBooleanType"
    // InternalJararaca.g:766:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalJararaca.g:766:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalJararaca.g:767:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalJararaca.g:773:1: ruleBooleanType returns [EObject current=null] : ( () otherlv_1= 'boolean' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJararaca.g:779:2: ( ( () otherlv_1= 'boolean' ) )
            // InternalJararaca.g:780:2: ( () otherlv_1= 'boolean' )
            {
            // InternalJararaca.g:780:2: ( () otherlv_1= 'boolean' )
            // InternalJararaca.g:781:3: () otherlv_1= 'boolean'
            {
            // InternalJararaca.g:781:3: ()
            // InternalJararaca.g:782:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1());
            		

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
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleStringType"
    // InternalJararaca.g:796:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalJararaca.g:796:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalJararaca.g:797:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalJararaca.g:803:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJararaca.g:809:2: ( ( () otherlv_1= 'string' ) )
            // InternalJararaca.g:810:2: ( () otherlv_1= 'string' )
            {
            // InternalJararaca.g:810:2: ( () otherlv_1= 'string' )
            // InternalJararaca.g:811:3: () otherlv_1= 'string'
            {
            // InternalJararaca.g:811:3: ()
            // InternalJararaca.g:812:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStringTypeAccess().getStringKeyword_1());
            		

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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleExpression"
    // InternalJararaca.g:826:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalJararaca.g:826:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalJararaca.g:827:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalJararaca.g:833:1: ruleExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalJararaca.g:839:2: (this_OrExpression_0= ruleOrExpression )
            // InternalJararaca.g:840:2: this_OrExpression_0= ruleOrExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;


            		current = this_OrExpression_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalJararaca.g:851:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalJararaca.g:851:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalJararaca.g:852:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalJararaca.g:858:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalJararaca.g:864:2: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalJararaca.g:865:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalJararaca.g:865:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalJararaca.g:866:3: this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJararaca.g:874:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJararaca.g:875:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalJararaca.g:875:4: ()
            	    // InternalJararaca.g:876:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getOrKeyword_1_1());
            	    			
            	    // InternalJararaca.g:886:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalJararaca.g:887:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalJararaca.g:887:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalJararaca.g:888:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.volkmann.Jararaca.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalJararaca.g:910:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalJararaca.g:910:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalJararaca.g:911:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalJararaca.g:917:1: ruleAndExpression returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalJararaca.g:923:2: ( (this_Comparison_0= ruleComparison ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalJararaca.g:924:2: (this_Comparison_0= ruleComparison ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalJararaca.g:924:2: (this_Comparison_0= ruleComparison ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalJararaca.g:925:3: this_Comparison_0= ruleComparison ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJararaca.g:933:3: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparison ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalJararaca.g:934:4: () otherlv_2= 'and' ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalJararaca.g:934:4: ()
            	    // InternalJararaca.g:935:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1());
            	    			
            	    // InternalJararaca.g:945:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalJararaca.g:946:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalJararaca.g:946:5: (lv_right_3_0= ruleComparison )
            	    // InternalJararaca.g:947:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.volkmann.Jararaca.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparison"
    // InternalJararaca.g:969:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalJararaca.g:969:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalJararaca.g:970:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalJararaca.g:976:1: ruleComparison returns [EObject current=null] : (this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        Token lv_operator_2_4=null;
        Token lv_operator_2_5=null;
        Token lv_operator_2_6=null;
        EObject this_Addition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalJararaca.g:982:2: ( (this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* ) )
            // InternalJararaca.g:983:2: (this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* )
            {
            // InternalJararaca.g:983:2: (this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* )
            // InternalJararaca.g:984:3: this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getAdditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_Addition_0=ruleAddition();

            state._fsp--;


            			current = this_Addition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJararaca.g:992:3: ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=30 && LA11_0<=35)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJararaca.g:993:4: () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) )
            	    {
            	    // InternalJararaca.g:993:4: ()
            	    // InternalJararaca.g:994:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalJararaca.g:1000:4: ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' ) ) )
            	    // InternalJararaca.g:1001:5: ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' ) )
            	    {
            	    // InternalJararaca.g:1001:5: ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' ) )
            	    // InternalJararaca.g:1002:6: (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' )
            	    {
            	    // InternalJararaca.g:1002:6: (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' )
            	    int alt10=6;
            	    switch ( input.LA(1) ) {
            	    case 30:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt10=3;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt10=4;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt10=5;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt10=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // InternalJararaca.g:1003:7: lv_operator_2_1= '=='
            	            {
            	            lv_operator_2_1=(Token)match(input,30,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getComparisonAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalJararaca.g:1014:7: lv_operator_2_2= '!='
            	            {
            	            lv_operator_2_2=(Token)match(input,31,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getComparisonAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalJararaca.g:1025:7: lv_operator_2_3= '<='
            	            {
            	            lv_operator_2_3=(Token)match(input,32,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_3, grammarAccess.getComparisonAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalJararaca.g:1036:7: lv_operator_2_4= '>='
            	            {
            	            lv_operator_2_4=(Token)match(input,33,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_4, grammarAccess.getComparisonAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_4, null);
            	            						

            	            }
            	            break;
            	        case 5 :
            	            // InternalJararaca.g:1047:7: lv_operator_2_5= '<'
            	            {
            	            lv_operator_2_5=(Token)match(input,34,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_5, grammarAccess.getComparisonAccess().getOperatorLessThanSignKeyword_1_1_0_4());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_5, null);
            	            						

            	            }
            	            break;
            	        case 6 :
            	            // InternalJararaca.g:1058:7: lv_operator_2_6= '>'
            	            {
            	            lv_operator_2_6=(Token)match(input,35,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_6, grammarAccess.getComparisonAccess().getOperatorGreaterThanSignKeyword_1_1_0_5());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_6, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalJararaca.g:1071:4: ( (lv_right_3_0= ruleAddition ) )
            	    // InternalJararaca.g:1072:5: (lv_right_3_0= ruleAddition )
            	    {
            	    // InternalJararaca.g:1072:5: (lv_right_3_0= ruleAddition )
            	    // InternalJararaca.g:1073:6: lv_right_3_0= ruleAddition
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightAdditionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=ruleAddition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.volkmann.Jararaca.Addition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleAddition"
    // InternalJararaca.g:1095:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalJararaca.g:1095:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalJararaca.g:1096:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalJararaca.g:1102:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalJararaca.g:1108:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalJararaca.g:1109:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalJararaca.g:1109:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalJararaca.g:1110:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJararaca.g:1118:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=36 && LA13_0<=37)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalJararaca.g:1119:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalJararaca.g:1119:4: ()
            	    // InternalJararaca.g:1120:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalJararaca.g:1126:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalJararaca.g:1127:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalJararaca.g:1127:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalJararaca.g:1128:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalJararaca.g:1128:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==36) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==37) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalJararaca.g:1129:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,36,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalJararaca.g:1140:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,37,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalJararaca.g:1153:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalJararaca.g:1154:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalJararaca.g:1154:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalJararaca.g:1155:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.volkmann.Jararaca.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalJararaca.g:1177:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalJararaca.g:1177:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalJararaca.g:1178:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalJararaca.g:1184:1: ruleMultiplication returns [EObject current=null] : (this_Unary_0= ruleUnary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleUnary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        EObject this_Unary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalJararaca.g:1190:2: ( (this_Unary_0= ruleUnary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleUnary ) ) )* ) )
            // InternalJararaca.g:1191:2: (this_Unary_0= ruleUnary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleUnary ) ) )* )
            {
            // InternalJararaca.g:1191:2: (this_Unary_0= ruleUnary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleUnary ) ) )* )
            // InternalJararaca.g:1192:3: this_Unary_0= ruleUnary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleUnary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getUnaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Unary_0=ruleUnary();

            state._fsp--;


            			current = this_Unary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJararaca.g:1200:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleUnary ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=38 && LA15_0<=40)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalJararaca.g:1201:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleUnary ) )
            	    {
            	    // InternalJararaca.g:1201:4: ()
            	    // InternalJararaca.g:1202:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalJararaca.g:1208:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) )
            	    // InternalJararaca.g:1209:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) )
            	    {
            	    // InternalJararaca.g:1209:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) )
            	    // InternalJararaca.g:1210:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' )
            	    {
            	    // InternalJararaca.g:1210:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' )
            	    int alt14=3;
            	    switch ( input.LA(1) ) {
            	    case 38:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt14) {
            	        case 1 :
            	            // InternalJararaca.g:1211:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,38,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalJararaca.g:1222:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,39,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalJararaca.g:1233:7: lv_operator_2_3= '%'
            	            {
            	            lv_operator_2_3=(Token)match(input,40,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_3, grammarAccess.getMultiplicationAccess().getOperatorPercentSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalJararaca.g:1246:4: ( (lv_right_3_0= ruleUnary ) )
            	    // InternalJararaca.g:1247:5: (lv_right_3_0= ruleUnary )
            	    {
            	    // InternalJararaca.g:1247:5: (lv_right_3_0= ruleUnary )
            	    // InternalJararaca.g:1248:6: lv_right_3_0= ruleUnary
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightUnaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleUnary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.volkmann.Jararaca.Unary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleUnary"
    // InternalJararaca.g:1270:1: entryRuleUnary returns [EObject current=null] : iv_ruleUnary= ruleUnary EOF ;
    public final EObject entryRuleUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnary = null;


        try {
            // InternalJararaca.g:1270:46: (iv_ruleUnary= ruleUnary EOF )
            // InternalJararaca.g:1271:2: iv_ruleUnary= ruleUnary EOF
            {
             newCompositeNode(grammarAccess.getUnaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnary=ruleUnary();

            state._fsp--;

             current =iv_ruleUnary; 
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
    // $ANTLR end "entryRuleUnary"


    // $ANTLR start "ruleUnary"
    // InternalJararaca.g:1277:1: ruleUnary returns [EObject current=null] : ( ( () otherlv_1= 'not' ( (lv_operand_2_0= ruleUnary ) ) ) | ( () otherlv_4= '-' ( (lv_operand_5_0= ruleUnary ) ) ) | this_Primary_6= rulePrimary ) ;
    public final EObject ruleUnary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_operand_2_0 = null;

        EObject lv_operand_5_0 = null;

        EObject this_Primary_6 = null;



        	enterRule();

        try {
            // InternalJararaca.g:1283:2: ( ( ( () otherlv_1= 'not' ( (lv_operand_2_0= ruleUnary ) ) ) | ( () otherlv_4= '-' ( (lv_operand_5_0= ruleUnary ) ) ) | this_Primary_6= rulePrimary ) )
            // InternalJararaca.g:1284:2: ( ( () otherlv_1= 'not' ( (lv_operand_2_0= ruleUnary ) ) ) | ( () otherlv_4= '-' ( (lv_operand_5_0= ruleUnary ) ) ) | this_Primary_6= rulePrimary )
            {
            // InternalJararaca.g:1284:2: ( ( () otherlv_1= 'not' ( (lv_operand_2_0= ruleUnary ) ) ) | ( () otherlv_4= '-' ( (lv_operand_5_0= ruleUnary ) ) ) | this_Primary_6= rulePrimary )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt16=1;
                }
                break;
            case 37:
                {
                alt16=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_STRING:
            case 16:
            case 42:
            case 43:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalJararaca.g:1285:3: ( () otherlv_1= 'not' ( (lv_operand_2_0= ruleUnary ) ) )
                    {
                    // InternalJararaca.g:1285:3: ( () otherlv_1= 'not' ( (lv_operand_2_0= ruleUnary ) ) )
                    // InternalJararaca.g:1286:4: () otherlv_1= 'not' ( (lv_operand_2_0= ruleUnary ) )
                    {
                    // InternalJararaca.g:1286:4: ()
                    // InternalJararaca.g:1287:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryAccess().getNotExpressionAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,41,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getUnaryAccess().getNotKeyword_0_1());
                    			
                    // InternalJararaca.g:1297:4: ( (lv_operand_2_0= ruleUnary ) )
                    // InternalJararaca.g:1298:5: (lv_operand_2_0= ruleUnary )
                    {
                    // InternalJararaca.g:1298:5: (lv_operand_2_0= ruleUnary )
                    // InternalJararaca.g:1299:6: lv_operand_2_0= ruleUnary
                    {

                    						newCompositeNode(grammarAccess.getUnaryAccess().getOperandUnaryParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_2_0=ruleUnary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryRule());
                    						}
                    						set(
                    							current,
                    							"operand",
                    							lv_operand_2_0,
                    							"com.volkmann.Jararaca.Unary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJararaca.g:1318:3: ( () otherlv_4= '-' ( (lv_operand_5_0= ruleUnary ) ) )
                    {
                    // InternalJararaca.g:1318:3: ( () otherlv_4= '-' ( (lv_operand_5_0= ruleUnary ) ) )
                    // InternalJararaca.g:1319:4: () otherlv_4= '-' ( (lv_operand_5_0= ruleUnary ) )
                    {
                    // InternalJararaca.g:1319:4: ()
                    // InternalJararaca.g:1320:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryAccess().getNegativeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,37,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getUnaryAccess().getHyphenMinusKeyword_1_1());
                    			
                    // InternalJararaca.g:1330:4: ( (lv_operand_5_0= ruleUnary ) )
                    // InternalJararaca.g:1331:5: (lv_operand_5_0= ruleUnary )
                    {
                    // InternalJararaca.g:1331:5: (lv_operand_5_0= ruleUnary )
                    // InternalJararaca.g:1332:6: lv_operand_5_0= ruleUnary
                    {

                    						newCompositeNode(grammarAccess.getUnaryAccess().getOperandUnaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_5_0=ruleUnary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryRule());
                    						}
                    						set(
                    							current,
                    							"operand",
                    							lv_operand_5_0,
                    							"com.volkmann.Jararaca.Unary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJararaca.g:1351:3: this_Primary_6= rulePrimary
                    {

                    			newCompositeNode(grammarAccess.getUnaryAccess().getPrimaryParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Primary_6=rulePrimary();

                    state._fsp--;


                    			current = this_Primary_6;
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
    // $ANTLR end "ruleUnary"


    // $ANTLR start "entryRulePrimary"
    // InternalJararaca.g:1363:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalJararaca.g:1363:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalJararaca.g:1364:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalJararaca.g:1370:1: rulePrimary returns [EObject current=null] : ( ( () otherlv_1= '(' ( (lv_inner_2_0= ruleExpression ) ) otherlv_3= ')' ) | this_IntLiteral_4= ruleIntLiteral | this_FloatLiteral_5= ruleFloatLiteral | this_BooleanLiteral_6= ruleBooleanLiteral | this_StringLiteral_7= ruleStringLiteral | this_VariableReference_8= ruleVariableReference ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inner_2_0 = null;

        EObject this_IntLiteral_4 = null;

        EObject this_FloatLiteral_5 = null;

        EObject this_BooleanLiteral_6 = null;

        EObject this_StringLiteral_7 = null;

        EObject this_VariableReference_8 = null;



        	enterRule();

        try {
            // InternalJararaca.g:1376:2: ( ( ( () otherlv_1= '(' ( (lv_inner_2_0= ruleExpression ) ) otherlv_3= ')' ) | this_IntLiteral_4= ruleIntLiteral | this_FloatLiteral_5= ruleFloatLiteral | this_BooleanLiteral_6= ruleBooleanLiteral | this_StringLiteral_7= ruleStringLiteral | this_VariableReference_8= ruleVariableReference ) )
            // InternalJararaca.g:1377:2: ( ( () otherlv_1= '(' ( (lv_inner_2_0= ruleExpression ) ) otherlv_3= ')' ) | this_IntLiteral_4= ruleIntLiteral | this_FloatLiteral_5= ruleFloatLiteral | this_BooleanLiteral_6= ruleBooleanLiteral | this_StringLiteral_7= ruleStringLiteral | this_VariableReference_8= ruleVariableReference )
            {
            // InternalJararaca.g:1377:2: ( ( () otherlv_1= '(' ( (lv_inner_2_0= ruleExpression ) ) otherlv_3= ')' ) | this_IntLiteral_4= ruleIntLiteral | this_FloatLiteral_5= ruleFloatLiteral | this_BooleanLiteral_6= ruleBooleanLiteral | this_StringLiteral_7= ruleStringLiteral | this_VariableReference_8= ruleVariableReference )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt17=1;
                }
                break;
            case RULE_INT:
                {
                alt17=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt17=3;
                }
                break;
            case 42:
            case 43:
                {
                alt17=4;
                }
                break;
            case RULE_STRING:
                {
                alt17=5;
                }
                break;
            case RULE_ID:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalJararaca.g:1378:3: ( () otherlv_1= '(' ( (lv_inner_2_0= ruleExpression ) ) otherlv_3= ')' )
                    {
                    // InternalJararaca.g:1378:3: ( () otherlv_1= '(' ( (lv_inner_2_0= ruleExpression ) ) otherlv_3= ')' )
                    // InternalJararaca.g:1379:4: () otherlv_1= '(' ( (lv_inner_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    // InternalJararaca.g:1379:4: ()
                    // InternalJararaca.g:1380:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getParenExpressionAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalJararaca.g:1390:4: ( (lv_inner_2_0= ruleExpression ) )
                    // InternalJararaca.g:1391:5: (lv_inner_2_0= ruleExpression )
                    {
                    // InternalJararaca.g:1391:5: (lv_inner_2_0= ruleExpression )
                    // InternalJararaca.g:1392:6: lv_inner_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getInnerExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_inner_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"inner",
                    							lv_inner_2_0,
                    							"com.volkmann.Jararaca.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJararaca.g:1415:3: this_IntLiteral_4= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_4=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJararaca.g:1424:3: this_FloatLiteral_5= ruleFloatLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getFloatLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatLiteral_5=ruleFloatLiteral();

                    state._fsp--;


                    			current = this_FloatLiteral_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJararaca.g:1433:3: this_BooleanLiteral_6= ruleBooleanLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_6=ruleBooleanLiteral();

                    state._fsp--;


                    			current = this_BooleanLiteral_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJararaca.g:1442:3: this_StringLiteral_7= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_7=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalJararaca.g:1451:3: this_VariableReference_8= ruleVariableReference
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableReferenceParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableReference_8=ruleVariableReference();

                    state._fsp--;


                    			current = this_VariableReference_8;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalJararaca.g:1463:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalJararaca.g:1463:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalJararaca.g:1464:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalJararaca.g:1470:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalJararaca.g:1476:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalJararaca.g:1477:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalJararaca.g:1477:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalJararaca.g:1478:3: (lv_value_0_0= RULE_INT )
            {
            // InternalJararaca.g:1478:3: (lv_value_0_0= RULE_INT )
            // InternalJararaca.g:1479:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleFloatLiteral"
    // InternalJararaca.g:1498:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // InternalJararaca.g:1498:53: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // InternalJararaca.g:1499:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
             newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;

             current =iv_ruleFloatLiteral; 
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
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // InternalJararaca.g:1505:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalJararaca.g:1511:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalJararaca.g:1512:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalJararaca.g:1512:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalJararaca.g:1513:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalJararaca.g:1513:3: (lv_value_0_0= RULE_FLOAT )
            // InternalJararaca.g:1514:4: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFloatLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"com.volkmann.Jararaca.FLOAT");
            			

            }


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
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalJararaca.g:1533:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalJararaca.g:1533:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalJararaca.g:1534:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalJararaca.g:1540:1: ruleBooleanLiteral returns [EObject current=null] : (this_TrueLiteral_0= ruleTrueLiteral | this_FalseLiteral_1= ruleFalseLiteral ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_TrueLiteral_0 = null;

        EObject this_FalseLiteral_1 = null;



        	enterRule();

        try {
            // InternalJararaca.g:1546:2: ( (this_TrueLiteral_0= ruleTrueLiteral | this_FalseLiteral_1= ruleFalseLiteral ) )
            // InternalJararaca.g:1547:2: (this_TrueLiteral_0= ruleTrueLiteral | this_FalseLiteral_1= ruleFalseLiteral )
            {
            // InternalJararaca.g:1547:2: (this_TrueLiteral_0= ruleTrueLiteral | this_FalseLiteral_1= ruleFalseLiteral )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==42) ) {
                alt18=1;
            }
            else if ( (LA18_0==43) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalJararaca.g:1548:3: this_TrueLiteral_0= ruleTrueLiteral
                    {

                    			newCompositeNode(grammarAccess.getBooleanLiteralAccess().getTrueLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TrueLiteral_0=ruleTrueLiteral();

                    state._fsp--;


                    			current = this_TrueLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJararaca.g:1557:3: this_FalseLiteral_1= ruleFalseLiteral
                    {

                    			newCompositeNode(grammarAccess.getBooleanLiteralAccess().getFalseLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FalseLiteral_1=ruleFalseLiteral();

                    state._fsp--;


                    			current = this_FalseLiteral_1;
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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleTrueLiteral"
    // InternalJararaca.g:1569:1: entryRuleTrueLiteral returns [EObject current=null] : iv_ruleTrueLiteral= ruleTrueLiteral EOF ;
    public final EObject entryRuleTrueLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueLiteral = null;


        try {
            // InternalJararaca.g:1569:52: (iv_ruleTrueLiteral= ruleTrueLiteral EOF )
            // InternalJararaca.g:1570:2: iv_ruleTrueLiteral= ruleTrueLiteral EOF
            {
             newCompositeNode(grammarAccess.getTrueLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrueLiteral=ruleTrueLiteral();

            state._fsp--;

             current =iv_ruleTrueLiteral; 
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
    // $ANTLR end "entryRuleTrueLiteral"


    // $ANTLR start "ruleTrueLiteral"
    // InternalJararaca.g:1576:1: ruleTrueLiteral returns [EObject current=null] : ( () otherlv_1= 'true' ) ;
    public final EObject ruleTrueLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJararaca.g:1582:2: ( ( () otherlv_1= 'true' ) )
            // InternalJararaca.g:1583:2: ( () otherlv_1= 'true' )
            {
            // InternalJararaca.g:1583:2: ( () otherlv_1= 'true' )
            // InternalJararaca.g:1584:3: () otherlv_1= 'true'
            {
            // InternalJararaca.g:1584:3: ()
            // InternalJararaca.g:1585:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrueLiteralAccess().getTrueLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTrueLiteralAccess().getTrueKeyword_1());
            		

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
    // $ANTLR end "ruleTrueLiteral"


    // $ANTLR start "entryRuleFalseLiteral"
    // InternalJararaca.g:1599:1: entryRuleFalseLiteral returns [EObject current=null] : iv_ruleFalseLiteral= ruleFalseLiteral EOF ;
    public final EObject entryRuleFalseLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFalseLiteral = null;


        try {
            // InternalJararaca.g:1599:53: (iv_ruleFalseLiteral= ruleFalseLiteral EOF )
            // InternalJararaca.g:1600:2: iv_ruleFalseLiteral= ruleFalseLiteral EOF
            {
             newCompositeNode(grammarAccess.getFalseLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFalseLiteral=ruleFalseLiteral();

            state._fsp--;

             current =iv_ruleFalseLiteral; 
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
    // $ANTLR end "entryRuleFalseLiteral"


    // $ANTLR start "ruleFalseLiteral"
    // InternalJararaca.g:1606:1: ruleFalseLiteral returns [EObject current=null] : ( () otherlv_1= 'false' ) ;
    public final EObject ruleFalseLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJararaca.g:1612:2: ( ( () otherlv_1= 'false' ) )
            // InternalJararaca.g:1613:2: ( () otherlv_1= 'false' )
            {
            // InternalJararaca.g:1613:2: ( () otherlv_1= 'false' )
            // InternalJararaca.g:1614:3: () otherlv_1= 'false'
            {
            // InternalJararaca.g:1614:3: ()
            // InternalJararaca.g:1615:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFalseLiteralAccess().getFalseLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFalseLiteralAccess().getFalseKeyword_1());
            		

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
    // $ANTLR end "ruleFalseLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalJararaca.g:1629:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalJararaca.g:1629:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalJararaca.g:1630:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalJararaca.g:1636:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalJararaca.g:1642:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalJararaca.g:1643:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalJararaca.g:1643:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalJararaca.g:1644:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalJararaca.g:1644:3: (lv_value_0_0= RULE_STRING )
            // InternalJararaca.g:1645:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleVariableReference"
    // InternalJararaca.g:1664:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // InternalJararaca.g:1664:58: (iv_ruleVariableReference= ruleVariableReference EOF )
            // InternalJararaca.g:1665:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
             newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;

             current =iv_ruleVariableReference; 
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
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // InternalJararaca.g:1671:1: ruleVariableReference returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalJararaca.g:1677:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalJararaca.g:1678:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalJararaca.g:1678:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalJararaca.g:1679:3: (lv_name_0_0= RULE_ID )
            {
            // InternalJararaca.g:1679:3: (lv_name_0_0= RULE_ID )
            // InternalJararaca.g:1680:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableReferenceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableReferenceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


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
    // $ANTLR end "ruleVariableReference"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000058C010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000E20000100F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000FC0000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000001C000000002L});

}