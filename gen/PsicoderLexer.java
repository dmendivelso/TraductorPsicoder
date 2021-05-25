// Generated from R:/Documentos/Unal/7mo Semestre/Lng/ANTLR/ProyectoPsicoder/grammar\Psicoder.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PsicoderLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, COMMENT=2, LINE_COMMENT=3, WS=4, FUNCION_PRINCIPAL=5, FIN_PRINCIPAL=6, 
		ESTRUCTURA=7, FIN_ESTRUCTURA=8, RETURN=9, BOOLEANO=10, CARACTER=11, ENTERO=12, 
		REAL=13, CADENA=14, FUNCION=15, FIN_FUNCION=16, HACER=17, COMA=18, PYC=19, 
		DOS_P=20, LEER=21, IMPRIMIR=22, SI=23, ENTONCES=24, SI_NO=25, FIN_SI=26, 
		MIENTRAS=27, PAR_IZQ=28, PAR_DER=29, FIN_MIENTRAS=30, PARA=31, FIN_PARA=32, 
		SELECCIONAR=33, CASO=34, DEFECTO=35, ROMPER=36, FIN_SELECCIONAR=37, ASIG=38, 
		MAS=39, MENOS=40, MULT=41, DIV=42, MOD=43, MENOR=44, MAYOR=45, MENOR_IGUAL=46, 
		MAYOR_IGUAL=47, IGUAL=48, Y=49, O=50, DIF=51, NEG=52, ID=53, DATA_ENTERO=54, 
		DATA_REAL=55, DATA_CARACTER=56, DATA_CADENA=57, FALSO=58, VERDADERO=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "COMMENT", "LINE_COMMENT", "WS", "FUNCION_PRINCIPAL", "FIN_PRINCIPAL", 
			"ESTRUCTURA", "FIN_ESTRUCTURA", "RETURN", "BOOLEANO", "CARACTER", "ENTERO", 
			"REAL", "CADENA", "FUNCION", "FIN_FUNCION", "HACER", "COMA", "PYC", "DOS_P", 
			"LEER", "IMPRIMIR", "SI", "ENTONCES", "SI_NO", "FIN_SI", "MIENTRAS", 
			"PAR_IZQ", "PAR_DER", "FIN_MIENTRAS", "PARA", "FIN_PARA", "SELECCIONAR", 
			"CASO", "DEFECTO", "ROMPER", "FIN_SELECCIONAR", "ASIG", "MAS", "MENOS", 
			"MULT", "DIV", "MOD", "MENOR", "MAYOR", "MENOR_IGUAL", "MAYOR_IGUAL", 
			"IGUAL", "Y", "O", "DIF", "NEG", "ID", "DATA_ENTERO", "DATA_REAL", "DATA_CARACTER", 
			"DATA_CADENA", "FALSO", "VERDADERO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", null, null, null, "'funcion_principal'", "'fin_principal'", 
			"'estructura'", "'fin_estructura'", "'retornar'", "'booleano'", "'caracter'", 
			"'entero'", "'real'", "'cadena'", "'funcion'", "'fin_funcion'", "'hacer'", 
			"','", "';'", "':'", "'leer'", "'imprimir'", "'si'", "'entonces'", "'si_no'", 
			"'fin_si'", "'mientras'", "'('", "')'", "'fin_mientras'", "'para'", "'fin_para'", 
			"'seleccionar'", "'caso'", "'defecto'", "'romper'", "'fin_seleccionar'", 
			"'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'&&'", "'||'", "'!='", "'!'", null, null, null, null, null, 
			"'falso'", "'verdadero'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "COMMENT", "LINE_COMMENT", "WS", "FUNCION_PRINCIPAL", "FIN_PRINCIPAL", 
			"ESTRUCTURA", "FIN_ESTRUCTURA", "RETURN", "BOOLEANO", "CARACTER", "ENTERO", 
			"REAL", "CADENA", "FUNCION", "FIN_FUNCION", "HACER", "COMA", "PYC", "DOS_P", 
			"LEER", "IMPRIMIR", "SI", "ENTONCES", "SI_NO", "FIN_SI", "MIENTRAS", 
			"PAR_IZQ", "PAR_DER", "FIN_MIENTRAS", "PARA", "FIN_PARA", "SELECCIONAR", 
			"CASO", "DEFECTO", "ROMPER", "FIN_SELECCIONAR", "ASIG", "MAS", "MENOS", 
			"MULT", "DIV", "MOD", "MENOR", "MAYOR", "MENOR_IGUAL", "MAYOR_IGUAL", 
			"IGUAL", "Y", "O", "DIF", "NEG", "ID", "DATA_ENTERO", "DATA_REAL", "DATA_CARACTER", 
			"DATA_CADENA", "FALSO", "VERDADERO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public PsicoderLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Psicoder.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u01fa\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\7\3\u0080\n\3\f\3\16\3\u0083\13\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\7\4\u008e\n\4\f\4\16\4\u0091\13\4\3\4\3\4\3\5\6\5\u0096"+
		"\n\5\r\5\16\5\u0097\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,"+
		"\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\7\66\u01c9\n\66\f\66\16"+
		"\66\u01cc\13\66\3\67\6\67\u01cf\n\67\r\67\16\67\u01d0\38\68\u01d4\n8\r"+
		"8\168\u01d5\38\38\68\u01da\n8\r8\168\u01db\39\39\39\39\3:\3:\7:\u01e4"+
		"\n:\f:\16:\u01e7\13:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3\u0081\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=\3\2\b\4\2\f\f\17\17\5\2\13\f\17\17\"\"\4\2C\\"+
		"c|\6\2\62;C\\aac|\3\2\62;\7\2\"\"\62;C\\aac|\2\u0201\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5{\3\2\2\2\7\u0089"+
		"\3\2\2\2\t\u0095\3\2\2\2\13\u009b\3\2\2\2\r\u00ad\3\2\2\2\17\u00bb\3\2"+
		"\2\2\21\u00c6\3\2\2\2\23\u00d5\3\2\2\2\25\u00de\3\2\2\2\27\u00e7\3\2\2"+
		"\2\31\u00f0\3\2\2\2\33\u00f7\3\2\2\2\35\u00fc\3\2\2\2\37\u0103\3\2\2\2"+
		"!\u010b\3\2\2\2#\u0117\3\2\2\2%\u011d\3\2\2\2\'\u011f\3\2\2\2)\u0121\3"+
		"\2\2\2+\u0123\3\2\2\2-\u0128\3\2\2\2/\u0131\3\2\2\2\61\u0134\3\2\2\2\63"+
		"\u013d\3\2\2\2\65\u0143\3\2\2\2\67\u014a\3\2\2\29\u0153\3\2\2\2;\u0155"+
		"\3\2\2\2=\u0157\3\2\2\2?\u0164\3\2\2\2A\u0169\3\2\2\2C\u0172\3\2\2\2E"+
		"\u017e\3\2\2\2G\u0183\3\2\2\2I\u018b\3\2\2\2K\u0192\3\2\2\2M\u01a2\3\2"+
		"\2\2O\u01a4\3\2\2\2Q\u01a6\3\2\2\2S\u01a8\3\2\2\2U\u01aa\3\2\2\2W\u01ac"+
		"\3\2\2\2Y\u01ae\3\2\2\2[\u01b0\3\2\2\2]\u01b2\3\2\2\2_\u01b5\3\2\2\2a"+
		"\u01b8\3\2\2\2c\u01bb\3\2\2\2e\u01be\3\2\2\2g\u01c1\3\2\2\2i\u01c4\3\2"+
		"\2\2k\u01c6\3\2\2\2m\u01ce\3\2\2\2o\u01d3\3\2\2\2q\u01dd\3\2\2\2s\u01e1"+
		"\3\2\2\2u\u01ea\3\2\2\2w\u01f0\3\2\2\2yz\7\60\2\2z\4\3\2\2\2{|\7\61\2"+
		"\2|}\7,\2\2}\u0081\3\2\2\2~\u0080\13\2\2\2\177~\3\2\2\2\u0080\u0083\3"+
		"\2\2\2\u0081\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\7,\2\2\u0085\u0086\7\61\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\b\3\2\2\u0088\6\3\2\2\2\u0089\u008a\7\61\2\2\u008a\u008b"+
		"\7\61\2\2\u008b\u008f\3\2\2\2\u008c\u008e\n\2\2\2\u008d\u008c\3\2\2\2"+
		"\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\b\4\2\2\u0093\b\3\2\2\2\u0094"+
		"\u0096\t\3\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\5\2\2\u009a"+
		"\n\3\2\2\2\u009b\u009c\7h\2\2\u009c\u009d\7w\2\2\u009d\u009e\7p\2\2\u009e"+
		"\u009f\7e\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7p\2\2"+
		"\u00a2\u00a3\7a\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6"+
		"\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7k\2\2\u00a9"+
		"\u00aa\7r\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7n\2\2\u00ac\f\3\2\2\2\u00ad"+
		"\u00ae\7h\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7a\2\2"+
		"\u00b1\u00b2\7r\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5"+
		"\7p\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7r\2\2\u00b8"+
		"\u00b9\7c\2\2\u00b9\u00ba\7n\2\2\u00ba\16\3\2\2\2\u00bb\u00bc\7g\2\2\u00bc"+
		"\u00bd\7u\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7w\2\2"+
		"\u00c0\u00c1\7e\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4"+
		"\7t\2\2\u00c4\u00c5\7c\2\2\u00c5\20\3\2\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8"+
		"\7k\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7a\2\2\u00ca\u00cb\7g\2\2\u00cb"+
		"\u00cc\7u\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7w\2\2"+
		"\u00cf\u00d0\7e\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3"+
		"\7t\2\2\u00d3\u00d4\7c\2\2\u00d4\22\3\2\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7"+
		"\7g\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7t\2\2\u00da"+
		"\u00db\7p\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7t\2\2\u00dd\24\3\2\2\2\u00de"+
		"\u00df\7d\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7n\2\2"+
		"\u00e2\u00e3\7g\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6"+
		"\7q\2\2\u00e6\26\3\2\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea"+
		"\7t\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed\7v\2\2\u00ed"+
		"\u00ee\7g\2\2\u00ee\u00ef\7t\2\2\u00ef\30\3\2\2\2\u00f0\u00f1\7g\2\2\u00f1"+
		"\u00f2\7p\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7t\2\2"+
		"\u00f5\u00f6\7q\2\2\u00f6\32\3\2\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7"+
		"g\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7n\2\2\u00fb\34\3\2\2\2\u00fc\u00fd"+
		"\7e\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7f\2\2\u00ff\u0100\7g\2\2\u0100"+
		"\u0101\7p\2\2\u0101\u0102\7c\2\2\u0102\36\3\2\2\2\u0103\u0104\7h\2\2\u0104"+
		"\u0105\7w\2\2\u0105\u0106\7p\2\2\u0106\u0107\7e\2\2\u0107\u0108\7k\2\2"+
		"\u0108\u0109\7q\2\2\u0109\u010a\7p\2\2\u010a \3\2\2\2\u010b\u010c\7h\2"+
		"\2\u010c\u010d\7k\2\2\u010d\u010e\7p\2\2\u010e\u010f\7a\2\2\u010f\u0110"+
		"\7h\2\2\u0110\u0111\7w\2\2\u0111\u0112\7p\2\2\u0112\u0113\7e\2\2\u0113"+
		"\u0114\7k\2\2\u0114\u0115\7q\2\2\u0115\u0116\7p\2\2\u0116\"\3\2\2\2\u0117"+
		"\u0118\7j\2\2\u0118\u0119\7c\2\2\u0119\u011a\7e\2\2\u011a\u011b\7g\2\2"+
		"\u011b\u011c\7t\2\2\u011c$\3\2\2\2\u011d\u011e\7.\2\2\u011e&\3\2\2\2\u011f"+
		"\u0120\7=\2\2\u0120(\3\2\2\2\u0121\u0122\7<\2\2\u0122*\3\2\2\2\u0123\u0124"+
		"\7n\2\2\u0124\u0125\7g\2\2\u0125\u0126\7g\2\2\u0126\u0127\7t\2\2\u0127"+
		",\3\2\2\2\u0128\u0129\7k\2\2\u0129\u012a\7o\2\2\u012a\u012b\7r\2\2\u012b"+
		"\u012c\7t\2\2\u012c\u012d\7k\2\2\u012d\u012e\7o\2\2\u012e\u012f\7k\2\2"+
		"\u012f\u0130\7t\2\2\u0130.\3\2\2\2\u0131\u0132\7u\2\2\u0132\u0133\7k\2"+
		"\2\u0133\60\3\2\2\2\u0134\u0135\7g\2\2\u0135\u0136\7p\2\2\u0136\u0137"+
		"\7v\2\2\u0137\u0138\7q\2\2\u0138\u0139\7p\2\2\u0139\u013a\7e\2\2\u013a"+
		"\u013b\7g\2\2\u013b\u013c\7u\2\2\u013c\62\3\2\2\2\u013d\u013e\7u\2\2\u013e"+
		"\u013f\7k\2\2\u013f\u0140\7a\2\2\u0140\u0141\7p\2\2\u0141\u0142\7q\2\2"+
		"\u0142\64\3\2\2\2\u0143\u0144\7h\2\2\u0144\u0145\7k\2\2\u0145\u0146\7"+
		"p\2\2\u0146\u0147\7a\2\2\u0147\u0148\7u\2\2\u0148\u0149\7k\2\2\u0149\66"+
		"\3\2\2\2\u014a\u014b\7o\2\2\u014b\u014c\7k\2\2\u014c\u014d\7g\2\2\u014d"+
		"\u014e\7p\2\2\u014e\u014f\7v\2\2\u014f\u0150\7t\2\2\u0150\u0151\7c\2\2"+
		"\u0151\u0152\7u\2\2\u01528\3\2\2\2\u0153\u0154\7*\2\2\u0154:\3\2\2\2\u0155"+
		"\u0156\7+\2\2\u0156<\3\2\2\2\u0157\u0158\7h\2\2\u0158\u0159\7k\2\2\u0159"+
		"\u015a\7p\2\2\u015a\u015b\7a\2\2\u015b\u015c\7o\2\2\u015c\u015d\7k\2\2"+
		"\u015d\u015e\7g\2\2\u015e\u015f\7p\2\2\u015f\u0160\7v\2\2\u0160\u0161"+
		"\7t\2\2\u0161\u0162\7c\2\2\u0162\u0163\7u\2\2\u0163>\3\2\2\2\u0164\u0165"+
		"\7r\2\2\u0165\u0166\7c\2\2\u0166\u0167\7t\2\2\u0167\u0168\7c\2\2\u0168"+
		"@\3\2\2\2\u0169\u016a\7h\2\2\u016a\u016b\7k\2\2\u016b\u016c\7p\2\2\u016c"+
		"\u016d\7a\2\2\u016d\u016e\7r\2\2\u016e\u016f\7c\2\2\u016f\u0170\7t\2\2"+
		"\u0170\u0171\7c\2\2\u0171B\3\2\2\2\u0172\u0173\7u\2\2\u0173\u0174\7g\2"+
		"\2\u0174\u0175\7n\2\2\u0175\u0176\7g\2\2\u0176\u0177\7e\2\2\u0177\u0178"+
		"\7e\2\2\u0178\u0179\7k\2\2\u0179\u017a\7q\2\2\u017a\u017b\7p\2\2\u017b"+
		"\u017c\7c\2\2\u017c\u017d\7t\2\2\u017dD\3\2\2\2\u017e\u017f\7e\2\2\u017f"+
		"\u0180\7c\2\2\u0180\u0181\7u\2\2\u0181\u0182\7q\2\2\u0182F\3\2\2\2\u0183"+
		"\u0184\7f\2\2\u0184\u0185\7g\2\2\u0185\u0186\7h\2\2\u0186\u0187\7g\2\2"+
		"\u0187\u0188\7e\2\2\u0188\u0189\7v\2\2\u0189\u018a\7q\2\2\u018aH\3\2\2"+
		"\2\u018b\u018c\7t\2\2\u018c\u018d\7q\2\2\u018d\u018e\7o\2\2\u018e\u018f"+
		"\7r\2\2\u018f\u0190\7g\2\2\u0190\u0191\7t\2\2\u0191J\3\2\2\2\u0192\u0193"+
		"\7h\2\2\u0193\u0194\7k\2\2\u0194\u0195\7p\2\2\u0195\u0196\7a\2\2\u0196"+
		"\u0197\7u\2\2\u0197\u0198\7g\2\2\u0198\u0199\7n\2\2\u0199\u019a\7g\2\2"+
		"\u019a\u019b\7e\2\2\u019b\u019c\7e\2\2\u019c\u019d\7k\2\2\u019d\u019e"+
		"\7q\2\2\u019e\u019f\7p\2\2\u019f\u01a0\7c\2\2\u01a0\u01a1\7t\2\2\u01a1"+
		"L\3\2\2\2\u01a2\u01a3\7?\2\2\u01a3N\3\2\2\2\u01a4\u01a5\7-\2\2\u01a5P"+
		"\3\2\2\2\u01a6\u01a7\7/\2\2\u01a7R\3\2\2\2\u01a8\u01a9\7,\2\2\u01a9T\3"+
		"\2\2\2\u01aa\u01ab\7\61\2\2\u01abV\3\2\2\2\u01ac\u01ad\7\'\2\2\u01adX"+
		"\3\2\2\2\u01ae\u01af\7>\2\2\u01afZ\3\2\2\2\u01b0\u01b1\7@\2\2\u01b1\\"+
		"\3\2\2\2\u01b2\u01b3\7>\2\2\u01b3\u01b4\7?\2\2\u01b4^\3\2\2\2\u01b5\u01b6"+
		"\7@\2\2\u01b6\u01b7\7?\2\2\u01b7`\3\2\2\2\u01b8\u01b9\7?\2\2\u01b9\u01ba"+
		"\7?\2\2\u01bab\3\2\2\2\u01bb\u01bc\7(\2\2\u01bc\u01bd\7(\2\2\u01bdd\3"+
		"\2\2\2\u01be\u01bf\7~\2\2\u01bf\u01c0\7~\2\2\u01c0f\3\2\2\2\u01c1\u01c2"+
		"\7#\2\2\u01c2\u01c3\7?\2\2\u01c3h\3\2\2\2\u01c4\u01c5\7#\2\2\u01c5j\3"+
		"\2\2\2\u01c6\u01ca\t\4\2\2\u01c7\u01c9\t\5\2\2\u01c8\u01c7\3\2\2\2\u01c9"+
		"\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cbl\3\2\2\2"+
		"\u01cc\u01ca\3\2\2\2\u01cd\u01cf\t\6\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d0"+
		"\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1n\3\2\2\2\u01d2"+
		"\u01d4\t\6\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d3\3\2"+
		"\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\7\60\2\2\u01d8"+
		"\u01da\t\6\2\2\u01d9\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01d9\3\2"+
		"\2\2\u01db\u01dc\3\2\2\2\u01dcp\3\2\2\2\u01dd\u01de\7)\2\2\u01de\u01df"+
		"\t\7\2\2\u01df\u01e0\7)\2\2\u01e0r\3\2\2\2\u01e1\u01e5\7$\2\2\u01e2\u01e4"+
		"\t\7\2\2\u01e3\u01e2\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01e9\7$"+
		"\2\2\u01e9t\3\2\2\2\u01ea\u01eb\7h\2\2\u01eb\u01ec\7c\2\2\u01ec\u01ed"+
		"\7n\2\2\u01ed\u01ee\7u\2\2\u01ee\u01ef\7q\2\2\u01efv\3\2\2\2\u01f0\u01f1"+
		"\7x\2\2\u01f1\u01f2\7g\2\2\u01f2\u01f3\7t\2\2\u01f3\u01f4\7f\2\2\u01f4"+
		"\u01f5\7c\2\2\u01f5\u01f6\7f\2\2\u01f6\u01f7\7g\2\2\u01f7\u01f8\7t\2\2"+
		"\u01f8\u01f9\7q\2\2\u01f9x\3\2\2\2\13\2\u0081\u008f\u0097\u01ca\u01d0"+
		"\u01d5\u01db\u01e5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}