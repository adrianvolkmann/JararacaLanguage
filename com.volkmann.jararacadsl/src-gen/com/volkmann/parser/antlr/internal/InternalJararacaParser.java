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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'{'", "'}'", "'var'", "'='", "';'", "'int'", "'decimal'", "'boolean'", "'string'", "'or'", "'and'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'not'", "'('", "')'", "'true'", "'false'"
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

                if ( (LA1_0==RULE_ID||LA1_0==15) ) {
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
    // InternalJararaca.g:121:1: ruleStatement returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_Assignment_1= ruleAssignment ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject this_Assignment_1 = null;



        	enterRule();

        try {
            // InternalJararaca.g:127:2: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_Assignment_1= ruleAssignment ) )
            // InternalJararaca.g:128:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_Assignment_1= ruleAssignment )
            {
            // InternalJararaca.g:128:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_Assignment_1= ruleAssignment )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
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


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalJararaca.g:150:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalJararaca.g:150:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalJararaca.g:151:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalJararaca.g:157:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleExpression ) ) )? otherlv_5= ';' ) ;
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
            // InternalJararaca.g:163:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleExpression ) ) )? otherlv_5= ';' ) )
            // InternalJararaca.g:164:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleExpression ) ) )? otherlv_5= ';' )
            {
            // InternalJararaca.g:164:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleExpression ) ) )? otherlv_5= ';' )
            // InternalJararaca.g:165:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleExpression ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalJararaca.g:169:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJararaca.g:170:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJararaca.g:170:4: (lv_name_1_0= RULE_ID )
            // InternalJararaca.g:171:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            // InternalJararaca.g:187:3: ( (lv_type_2_0= ruleType ) )
            // InternalJararaca.g:188:4: (lv_type_2_0= ruleType )
            {
            // InternalJararaca.g:188:4: (lv_type_2_0= ruleType )
            // InternalJararaca.g:189:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalJararaca.g:206:3: (otherlv_3= '=' ( (lv_initialValue_4_0= ruleExpression ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalJararaca.g:207:4: otherlv_3= '=' ( (lv_initialValue_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalJararaca.g:211:4: ( (lv_initialValue_4_0= ruleExpression ) )
                    // InternalJararaca.g:212:5: (lv_initialValue_4_0= ruleExpression )
                    {
                    // InternalJararaca.g:212:5: (lv_initialValue_4_0= ruleExpression )
                    // InternalJararaca.g:213:6: lv_initialValue_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getInitialValueExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

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
    // InternalJararaca.g:239:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalJararaca.g:239:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalJararaca.g:240:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalJararaca.g:246:1: ruleAssignment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalJararaca.g:252:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // InternalJararaca.g:253:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // InternalJararaca.g:253:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';' )
            // InternalJararaca.g:254:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // InternalJararaca.g:254:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalJararaca.g:255:4: (lv_name_0_0= RULE_ID )
            {
            // InternalJararaca.g:255:4: (lv_name_0_0= RULE_ID )
            // InternalJararaca.g:256:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalJararaca.g:276:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalJararaca.g:277:4: (lv_value_2_0= ruleExpression )
            {
            // InternalJararaca.g:277:4: (lv_value_2_0= ruleExpression )
            // InternalJararaca.g:278:5: lv_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

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
    // InternalJararaca.g:303:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalJararaca.g:303:45: (iv_ruleType= ruleType EOF )
            // InternalJararaca.g:304:2: iv_ruleType= ruleType EOF
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
    // InternalJararaca.g:310:1: ruleType returns [EObject current=null] : (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BooleanType_2= ruleBooleanType | this_StringType_3= ruleStringType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_IntType_0 = null;

        EObject this_FloatType_1 = null;

        EObject this_BooleanType_2 = null;

        EObject this_StringType_3 = null;



        	enterRule();

        try {
            // InternalJararaca.g:316:2: ( (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BooleanType_2= ruleBooleanType | this_StringType_3= ruleStringType ) )
            // InternalJararaca.g:317:2: (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BooleanType_2= ruleBooleanType | this_StringType_3= ruleStringType )
            {
            // InternalJararaca.g:317:2: (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BooleanType_2= ruleBooleanType | this_StringType_3= ruleStringType )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            case 21:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalJararaca.g:318:3: this_IntType_0= ruleIntType
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
                    // InternalJararaca.g:327:3: this_FloatType_1= ruleFloatType
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
                    // InternalJararaca.g:336:3: this_BooleanType_2= ruleBooleanType
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
                    // InternalJararaca.g:345:3: this_StringType_3= ruleStringType
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
    // InternalJararaca.g:357:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // InternalJararaca.g:357:48: (iv_ruleIntType= ruleIntType EOF )
            // InternalJararaca.g:358:2: iv_ruleIntType= ruleIntType EOF
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
    // InternalJararaca.g:364:1: ruleIntType returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJararaca.g:370:2: ( ( () otherlv_1= 'int' ) )
            // InternalJararaca.g:371:2: ( () otherlv_1= 'int' )
            {
            // InternalJararaca.g:371:2: ( () otherlv_1= 'int' )
            // InternalJararaca.g:372:3: () otherlv_1= 'int'
            {
            // InternalJararaca.g:372:3: ()
            // InternalJararaca.g:373:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntTypeAccess().getIntTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_2); 

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
    // InternalJararaca.g:387:1: entryRuleFloatType returns [EObject current=null] : iv_ruleFloatType= ruleFloatType EOF ;
    public final EObject entryRuleFloatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatType = null;


        try {
            // InternalJararaca.g:387:50: (iv_ruleFloatType= ruleFloatType EOF )
            // InternalJararaca.g:388:2: iv_ruleFloatType= ruleFloatType EOF
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
    // InternalJararaca.g:394:1: ruleFloatType returns [EObject current=null] : ( () otherlv_1= 'decimal' ) ;
    public final EObject ruleFloatType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJararaca.g:400:2: ( ( () otherlv_1= 'decimal' ) )
            // InternalJararaca.g:401:2: ( () otherlv_1= 'decimal' )
            {
            // InternalJararaca.g:401:2: ( () otherlv_1= 'decimal' )
            // InternalJararaca.g:402:3: () otherlv_1= 'decimal'
            {
            // InternalJararaca.g:402:3: ()
            // InternalJararaca.g:403:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloatTypeAccess().getFloatTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_2); 

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
    // InternalJararaca.g:417:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalJararaca.g:417:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalJararaca.g:418:2: iv_ruleBooleanType= ruleBooleanType EOF
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
    // InternalJararaca.g:424:1: ruleBooleanType returns [EObject current=null] : ( () otherlv_1= 'boolean' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJararaca.g:430:2: ( ( () otherlv_1= 'boolean' ) )
            // InternalJararaca.g:431:2: ( () otherlv_1= 'boolean' )
            {
            // InternalJararaca.g:431:2: ( () otherlv_1= 'boolean' )
            // InternalJararaca.g:432:3: () otherlv_1= 'boolean'
            {
            // InternalJararaca.g:432:3: ()
            // InternalJararaca.g:433:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

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
    // InternalJararaca.g:447:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalJararaca.g:447:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalJararaca.g:448:2: iv_ruleStringType= ruleStringType EOF
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
    // InternalJararaca.g:454:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJararaca.g:460:2: ( ( () otherlv_1= 'string' ) )
            // InternalJararaca.g:461:2: ( () otherlv_1= 'string' )
            {
            // InternalJararaca.g:461:2: ( () otherlv_1= 'string' )
            // InternalJararaca.g:462:3: () otherlv_1= 'string'
            {
            // InternalJararaca.g:462:3: ()
            // InternalJararaca.g:463:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

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
    // InternalJararaca.g:477:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalJararaca.g:477:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalJararaca.g:478:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalJararaca.g:484:1: ruleExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalJararaca.g:490:2: (this_OrExpression_0= ruleOrExpression )
            // InternalJararaca.g:491:2: this_OrExpression_0= ruleOrExpression
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
    // InternalJararaca.g:502:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalJararaca.g:502:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalJararaca.g:503:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalJararaca.g:509:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalJararaca.g:515:2: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalJararaca.g:516:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalJararaca.g:516:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalJararaca.g:517:3: this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJararaca.g:525:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalJararaca.g:526:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalJararaca.g:526:4: ()
            	    // InternalJararaca.g:527:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getOrKeyword_1_1());
            	    			
            	    // InternalJararaca.g:537:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalJararaca.g:538:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalJararaca.g:538:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalJararaca.g:539:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
            	    break loop5;
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
    // InternalJararaca.g:561:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalJararaca.g:561:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalJararaca.g:562:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalJararaca.g:568:1: ruleAndExpression returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalJararaca.g:574:2: ( (this_Comparison_0= ruleComparison ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalJararaca.g:575:2: (this_Comparison_0= ruleComparison ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalJararaca.g:575:2: (this_Comparison_0= ruleComparison ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalJararaca.g:576:3: this_Comparison_0= ruleComparison ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJararaca.g:584:3: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparison ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalJararaca.g:585:4: () otherlv_2= 'and' ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalJararaca.g:585:4: ()
            	    // InternalJararaca.g:586:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1());
            	    			
            	    // InternalJararaca.g:596:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalJararaca.g:597:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalJararaca.g:597:5: (lv_right_3_0= ruleComparison )
            	    // InternalJararaca.g:598:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
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
            	    break loop6;
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
    // InternalJararaca.g:620:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalJararaca.g:620:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalJararaca.g:621:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalJararaca.g:627:1: ruleComparison returns [EObject current=null] : (this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* ) ;
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
            // InternalJararaca.g:633:2: ( (this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* ) )
            // InternalJararaca.g:634:2: (this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* )
            {
            // InternalJararaca.g:634:2: (this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* )
            // InternalJararaca.g:635:3: this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getAdditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Addition_0=ruleAddition();

            state._fsp--;


            			current = this_Addition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJararaca.g:643:3: ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=24 && LA8_0<=29)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJararaca.g:644:4: () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) )
            	    {
            	    // InternalJararaca.g:644:4: ()
            	    // InternalJararaca.g:645:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalJararaca.g:651:4: ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' ) ) )
            	    // InternalJararaca.g:652:5: ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' ) )
            	    {
            	    // InternalJararaca.g:652:5: ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' ) )
            	    // InternalJararaca.g:653:6: (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' )
            	    {
            	    // InternalJararaca.g:653:6: (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<=' | lv_operator_2_4= '>=' | lv_operator_2_5= '<' | lv_operator_2_6= '>' )
            	    int alt7=6;
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
            	    case 28:
            	        {
            	        alt7=5;
            	        }
            	        break;
            	    case 29:
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
            	            // InternalJararaca.g:654:7: lv_operator_2_1= '=='
            	            {
            	            lv_operator_2_1=(Token)match(input,24,FOLLOW_8); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getComparisonAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalJararaca.g:665:7: lv_operator_2_2= '!='
            	            {
            	            lv_operator_2_2=(Token)match(input,25,FOLLOW_8); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getComparisonAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalJararaca.g:676:7: lv_operator_2_3= '<='
            	            {
            	            lv_operator_2_3=(Token)match(input,26,FOLLOW_8); 

            	            							newLeafNode(lv_operator_2_3, grammarAccess.getComparisonAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalJararaca.g:687:7: lv_operator_2_4= '>='
            	            {
            	            lv_operator_2_4=(Token)match(input,27,FOLLOW_8); 

            	            							newLeafNode(lv_operator_2_4, grammarAccess.getComparisonAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_4, null);
            	            						

            	            }
            	            break;
            	        case 5 :
            	            // InternalJararaca.g:698:7: lv_operator_2_5= '<'
            	            {
            	            lv_operator_2_5=(Token)match(input,28,FOLLOW_8); 

            	            							newLeafNode(lv_operator_2_5, grammarAccess.getComparisonAccess().getOperatorLessThanSignKeyword_1_1_0_4());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_5, null);
            	            						

            	            }
            	            break;
            	        case 6 :
            	            // InternalJararaca.g:709:7: lv_operator_2_6= '>'
            	            {
            	            lv_operator_2_6=(Token)match(input,29,FOLLOW_8); 

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

            	    // InternalJararaca.g:722:4: ( (lv_right_3_0= ruleAddition ) )
            	    // InternalJararaca.g:723:5: (lv_right_3_0= ruleAddition )
            	    {
            	    // InternalJararaca.g:723:5: (lv_right_3_0= ruleAddition )
            	    // InternalJararaca.g:724:6: lv_right_3_0= ruleAddition
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightAdditionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleAddition"
    // InternalJararaca.g:746:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalJararaca.g:746:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalJararaca.g:747:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalJararaca.g:753:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalJararaca.g:759:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalJararaca.g:760:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalJararaca.g:760:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalJararaca.g:761:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJararaca.g:769:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=30 && LA10_0<=31)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalJararaca.g:770:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalJararaca.g:770:4: ()
            	    // InternalJararaca.g:771:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalJararaca.g:777:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalJararaca.g:778:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalJararaca.g:778:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalJararaca.g:779:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalJararaca.g:779:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==30) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==31) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalJararaca.g:780:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,30,FOLLOW_8); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalJararaca.g:791:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,31,FOLLOW_8); 

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

            	    // InternalJararaca.g:804:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalJararaca.g:805:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalJararaca.g:805:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalJararaca.g:806:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
            	    break loop10;
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
    // InternalJararaca.g:828:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalJararaca.g:828:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalJararaca.g:829:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalJararaca.g:835:1: ruleMultiplication returns [EObject current=null] : (this_Unary_0= ruleUnary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleUnary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        EObject this_Unary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalJararaca.g:841:2: ( (this_Unary_0= ruleUnary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleUnary ) ) )* ) )
            // InternalJararaca.g:842:2: (this_Unary_0= ruleUnary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleUnary ) ) )* )
            {
            // InternalJararaca.g:842:2: (this_Unary_0= ruleUnary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleUnary ) ) )* )
            // InternalJararaca.g:843:3: this_Unary_0= ruleUnary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleUnary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getUnaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_Unary_0=ruleUnary();

            state._fsp--;


            			current = this_Unary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJararaca.g:851:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleUnary ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=32 && LA12_0<=34)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalJararaca.g:852:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleUnary ) )
            	    {
            	    // InternalJararaca.g:852:4: ()
            	    // InternalJararaca.g:853:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalJararaca.g:859:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) )
            	    // InternalJararaca.g:860:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) )
            	    {
            	    // InternalJararaca.g:860:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) )
            	    // InternalJararaca.g:861:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' )
            	    {
            	    // InternalJararaca.g:861:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' )
            	    int alt11=3;
            	    switch ( input.LA(1) ) {
            	    case 32:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // InternalJararaca.g:862:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,32,FOLLOW_8); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalJararaca.g:873:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,33,FOLLOW_8); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalJararaca.g:884:7: lv_operator_2_3= '%'
            	            {
            	            lv_operator_2_3=(Token)match(input,34,FOLLOW_8); 

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

            	    // InternalJararaca.g:897:4: ( (lv_right_3_0= ruleUnary ) )
            	    // InternalJararaca.g:898:5: (lv_right_3_0= ruleUnary )
            	    {
            	    // InternalJararaca.g:898:5: (lv_right_3_0= ruleUnary )
            	    // InternalJararaca.g:899:6: lv_right_3_0= ruleUnary
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightUnaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
            	    break loop12;
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
    // InternalJararaca.g:921:1: entryRuleUnary returns [EObject current=null] : iv_ruleUnary= ruleUnary EOF ;
    public final EObject entryRuleUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnary = null;


        try {
            // InternalJararaca.g:921:46: (iv_ruleUnary= ruleUnary EOF )
            // InternalJararaca.g:922:2: iv_ruleUnary= ruleUnary EOF
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
    // InternalJararaca.g:928:1: ruleUnary returns [EObject current=null] : ( ( () otherlv_1= 'not' ( (lv_operand_2_0= ruleUnary ) ) ) | ( () otherlv_4= '-' ( (lv_operand_5_0= ruleUnary ) ) ) | this_Primary_6= rulePrimary ) ;
    public final EObject ruleUnary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_operand_2_0 = null;

        EObject lv_operand_5_0 = null;

        EObject this_Primary_6 = null;



        	enterRule();

        try {
            // InternalJararaca.g:934:2: ( ( ( () otherlv_1= 'not' ( (lv_operand_2_0= ruleUnary ) ) ) | ( () otherlv_4= '-' ( (lv_operand_5_0= ruleUnary ) ) ) | this_Primary_6= rulePrimary ) )
            // InternalJararaca.g:935:2: ( ( () otherlv_1= 'not' ( (lv_operand_2_0= ruleUnary ) ) ) | ( () otherlv_4= '-' ( (lv_operand_5_0= ruleUnary ) ) ) | this_Primary_6= rulePrimary )
            {
            // InternalJararaca.g:935:2: ( ( () otherlv_1= 'not' ( (lv_operand_2_0= ruleUnary ) ) ) | ( () otherlv_4= '-' ( (lv_operand_5_0= ruleUnary ) ) ) | this_Primary_6= rulePrimary )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt13=1;
                }
                break;
            case 31:
                {
                alt13=2;
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
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalJararaca.g:936:3: ( () otherlv_1= 'not' ( (lv_operand_2_0= ruleUnary ) ) )
                    {
                    // InternalJararaca.g:936:3: ( () otherlv_1= 'not' ( (lv_operand_2_0= ruleUnary ) ) )
                    // InternalJararaca.g:937:4: () otherlv_1= 'not' ( (lv_operand_2_0= ruleUnary ) )
                    {
                    // InternalJararaca.g:937:4: ()
                    // InternalJararaca.g:938:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryAccess().getNotExpressionAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,35,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getUnaryAccess().getNotKeyword_0_1());
                    			
                    // InternalJararaca.g:948:4: ( (lv_operand_2_0= ruleUnary ) )
                    // InternalJararaca.g:949:5: (lv_operand_2_0= ruleUnary )
                    {
                    // InternalJararaca.g:949:5: (lv_operand_2_0= ruleUnary )
                    // InternalJararaca.g:950:6: lv_operand_2_0= ruleUnary
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
                    // InternalJararaca.g:969:3: ( () otherlv_4= '-' ( (lv_operand_5_0= ruleUnary ) ) )
                    {
                    // InternalJararaca.g:969:3: ( () otherlv_4= '-' ( (lv_operand_5_0= ruleUnary ) ) )
                    // InternalJararaca.g:970:4: () otherlv_4= '-' ( (lv_operand_5_0= ruleUnary ) )
                    {
                    // InternalJararaca.g:970:4: ()
                    // InternalJararaca.g:971:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryAccess().getNegativeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,31,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getUnaryAccess().getHyphenMinusKeyword_1_1());
                    			
                    // InternalJararaca.g:981:4: ( (lv_operand_5_0= ruleUnary ) )
                    // InternalJararaca.g:982:5: (lv_operand_5_0= ruleUnary )
                    {
                    // InternalJararaca.g:982:5: (lv_operand_5_0= ruleUnary )
                    // InternalJararaca.g:983:6: lv_operand_5_0= ruleUnary
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
                    // InternalJararaca.g:1002:3: this_Primary_6= rulePrimary
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
    // InternalJararaca.g:1014:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalJararaca.g:1014:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalJararaca.g:1015:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalJararaca.g:1021:1: rulePrimary returns [EObject current=null] : ( ( () otherlv_1= '(' ( (lv_inner_2_0= ruleExpression ) ) otherlv_3= ')' ) | this_IntLiteral_4= ruleIntLiteral | this_FloatLiteral_5= ruleFloatLiteral | this_BooleanLiteral_6= ruleBooleanLiteral | this_StringLiteral_7= ruleStringLiteral | this_VariableReference_8= ruleVariableReference ) ;
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
            // InternalJararaca.g:1027:2: ( ( ( () otherlv_1= '(' ( (lv_inner_2_0= ruleExpression ) ) otherlv_3= ')' ) | this_IntLiteral_4= ruleIntLiteral | this_FloatLiteral_5= ruleFloatLiteral | this_BooleanLiteral_6= ruleBooleanLiteral | this_StringLiteral_7= ruleStringLiteral | this_VariableReference_8= ruleVariableReference ) )
            // InternalJararaca.g:1028:2: ( ( () otherlv_1= '(' ( (lv_inner_2_0= ruleExpression ) ) otherlv_3= ')' ) | this_IntLiteral_4= ruleIntLiteral | this_FloatLiteral_5= ruleFloatLiteral | this_BooleanLiteral_6= ruleBooleanLiteral | this_StringLiteral_7= ruleStringLiteral | this_VariableReference_8= ruleVariableReference )
            {
            // InternalJararaca.g:1028:2: ( ( () otherlv_1= '(' ( (lv_inner_2_0= ruleExpression ) ) otherlv_3= ')' ) | this_IntLiteral_4= ruleIntLiteral | this_FloatLiteral_5= ruleFloatLiteral | this_BooleanLiteral_6= ruleBooleanLiteral | this_StringLiteral_7= ruleStringLiteral | this_VariableReference_8= ruleVariableReference )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt14=1;
                }
                break;
            case RULE_INT:
                {
                alt14=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt14=3;
                }
                break;
            case 38:
            case 39:
                {
                alt14=4;
                }
                break;
            case RULE_STRING:
                {
                alt14=5;
                }
                break;
            case RULE_ID:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalJararaca.g:1029:3: ( () otherlv_1= '(' ( (lv_inner_2_0= ruleExpression ) ) otherlv_3= ')' )
                    {
                    // InternalJararaca.g:1029:3: ( () otherlv_1= '(' ( (lv_inner_2_0= ruleExpression ) ) otherlv_3= ')' )
                    // InternalJararaca.g:1030:4: () otherlv_1= '(' ( (lv_inner_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    // InternalJararaca.g:1030:4: ()
                    // InternalJararaca.g:1031:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getParenExpressionAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,36,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalJararaca.g:1041:4: ( (lv_inner_2_0= ruleExpression ) )
                    // InternalJararaca.g:1042:5: (lv_inner_2_0= ruleExpression )
                    {
                    // InternalJararaca.g:1042:5: (lv_inner_2_0= ruleExpression )
                    // InternalJararaca.g:1043:6: lv_inner_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getInnerExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJararaca.g:1066:3: this_IntLiteral_4= ruleIntLiteral
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
                    // InternalJararaca.g:1075:3: this_FloatLiteral_5= ruleFloatLiteral
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
                    // InternalJararaca.g:1084:3: this_BooleanLiteral_6= ruleBooleanLiteral
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
                    // InternalJararaca.g:1093:3: this_StringLiteral_7= ruleStringLiteral
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
                    // InternalJararaca.g:1102:3: this_VariableReference_8= ruleVariableReference
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
    // InternalJararaca.g:1114:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalJararaca.g:1114:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalJararaca.g:1115:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalJararaca.g:1121:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalJararaca.g:1127:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalJararaca.g:1128:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalJararaca.g:1128:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalJararaca.g:1129:3: (lv_value_0_0= RULE_INT )
            {
            // InternalJararaca.g:1129:3: (lv_value_0_0= RULE_INT )
            // InternalJararaca.g:1130:4: lv_value_0_0= RULE_INT
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
    // InternalJararaca.g:1149:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // InternalJararaca.g:1149:53: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // InternalJararaca.g:1150:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
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
    // InternalJararaca.g:1156:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalJararaca.g:1162:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalJararaca.g:1163:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalJararaca.g:1163:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalJararaca.g:1164:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalJararaca.g:1164:3: (lv_value_0_0= RULE_FLOAT )
            // InternalJararaca.g:1165:4: lv_value_0_0= RULE_FLOAT
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
    // InternalJararaca.g:1184:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalJararaca.g:1184:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalJararaca.g:1185:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalJararaca.g:1191:1: ruleBooleanLiteral returns [EObject current=null] : (this_TrueLiteral_0= ruleTrueLiteral | this_FalseLiteral_1= ruleFalseLiteral ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_TrueLiteral_0 = null;

        EObject this_FalseLiteral_1 = null;



        	enterRule();

        try {
            // InternalJararaca.g:1197:2: ( (this_TrueLiteral_0= ruleTrueLiteral | this_FalseLiteral_1= ruleFalseLiteral ) )
            // InternalJararaca.g:1198:2: (this_TrueLiteral_0= ruleTrueLiteral | this_FalseLiteral_1= ruleFalseLiteral )
            {
            // InternalJararaca.g:1198:2: (this_TrueLiteral_0= ruleTrueLiteral | this_FalseLiteral_1= ruleFalseLiteral )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            else if ( (LA15_0==39) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalJararaca.g:1199:3: this_TrueLiteral_0= ruleTrueLiteral
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
                    // InternalJararaca.g:1208:3: this_FalseLiteral_1= ruleFalseLiteral
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
    // InternalJararaca.g:1220:1: entryRuleTrueLiteral returns [EObject current=null] : iv_ruleTrueLiteral= ruleTrueLiteral EOF ;
    public final EObject entryRuleTrueLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueLiteral = null;


        try {
            // InternalJararaca.g:1220:52: (iv_ruleTrueLiteral= ruleTrueLiteral EOF )
            // InternalJararaca.g:1221:2: iv_ruleTrueLiteral= ruleTrueLiteral EOF
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
    // InternalJararaca.g:1227:1: ruleTrueLiteral returns [EObject current=null] : ( () otherlv_1= 'true' ) ;
    public final EObject ruleTrueLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJararaca.g:1233:2: ( ( () otherlv_1= 'true' ) )
            // InternalJararaca.g:1234:2: ( () otherlv_1= 'true' )
            {
            // InternalJararaca.g:1234:2: ( () otherlv_1= 'true' )
            // InternalJararaca.g:1235:3: () otherlv_1= 'true'
            {
            // InternalJararaca.g:1235:3: ()
            // InternalJararaca.g:1236:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrueLiteralAccess().getTrueLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_2); 

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
    // InternalJararaca.g:1250:1: entryRuleFalseLiteral returns [EObject current=null] : iv_ruleFalseLiteral= ruleFalseLiteral EOF ;
    public final EObject entryRuleFalseLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFalseLiteral = null;


        try {
            // InternalJararaca.g:1250:53: (iv_ruleFalseLiteral= ruleFalseLiteral EOF )
            // InternalJararaca.g:1251:2: iv_ruleFalseLiteral= ruleFalseLiteral EOF
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
    // InternalJararaca.g:1257:1: ruleFalseLiteral returns [EObject current=null] : ( () otherlv_1= 'false' ) ;
    public final EObject ruleFalseLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJararaca.g:1263:2: ( ( () otherlv_1= 'false' ) )
            // InternalJararaca.g:1264:2: ( () otherlv_1= 'false' )
            {
            // InternalJararaca.g:1264:2: ( () otherlv_1= 'false' )
            // InternalJararaca.g:1265:3: () otherlv_1= 'false'
            {
            // InternalJararaca.g:1265:3: ()
            // InternalJararaca.g:1266:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFalseLiteralAccess().getFalseLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_2); 

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
    // InternalJararaca.g:1280:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalJararaca.g:1280:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalJararaca.g:1281:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalJararaca.g:1287:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalJararaca.g:1293:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalJararaca.g:1294:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalJararaca.g:1294:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalJararaca.g:1295:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalJararaca.g:1295:3: (lv_value_0_0= RULE_STRING )
            // InternalJararaca.g:1296:4: lv_value_0_0= RULE_STRING
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
    // InternalJararaca.g:1315:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // InternalJararaca.g:1315:58: (iv_ruleVariableReference= ruleVariableReference EOF )
            // InternalJararaca.g:1316:2: iv_ruleVariableReference= ruleVariableReference EOF
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
    // InternalJararaca.g:1322:1: ruleVariableReference returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalJararaca.g:1328:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalJararaca.g:1329:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalJararaca.g:1329:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalJararaca.g:1330:3: (lv_name_0_0= RULE_ID )
            {
            // InternalJararaca.g:1330:3: (lv_name_0_0= RULE_ID )
            // InternalJararaca.g:1331:4: lv_name_0_0= RULE_ID
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000D8800000F0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000003F000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000700000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});

}