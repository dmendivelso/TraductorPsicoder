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
		T__0=1, FUNCION_PRINCIPAL=2, FIN_PRINCIPAL=3, ESTRUCTURA=4, FIN_ESTRUCTURA=5, 
		RETURN=6, BOOLEANO=7, CARACTER=8, ENTERO=9, REAL=10, CADENA=11, FUNCION=12, 
		FIN_FUNCION=13, HACER=14, COMA=15, PYC=16, DOS_P=17, LEER=18, IMPRIMIR=19, 
		SI=20, ENTONCES=21, SI_NO=22, FIN_SI=23, MIENTRAS=24, PAR_IZQ=25, PAR_DER=26, 
		FIN_MIENTRAS=27, PARA=28, FIN_PARA=29, SELECCIONAR=30, ENTRE=31, CASO=32, 
		DEFECTO=33, ROMPER=34, FIN_SELECCIONAR=35, ASIG=36, MAS=37, MENOS=38, 
		MULT=39, DIV=40, MOD=41, MENOR=42, MAYOR=43, MENOR_IGUAL=44, MAYOR_IGUAL=45, 
		IGUAL=46, Y=47, O=48, DIF=49, NEG=50, ID=51, DATA_ENTERO=52, DATA_REAL=53, 
		DATA_CARACTER=54, DATA_CADENA=55, FALSO=56, VERDADERO=57, COMMENT=58, 
		LINE_COMMENT=59, WS=60;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "FUNCION_PRINCIPAL", "FIN_PRINCIPAL", "ESTRUCTURA", "FIN_ESTRUCTURA", 
			"RETURN", "BOOLEANO", "CARACTER", "ENTERO", "REAL", "CADENA", "FUNCION", 
			"FIN_FUNCION", "HACER", "COMA", "PYC", "DOS_P", "LEER", "IMPRIMIR", "SI", 
			"ENTONCES", "SI_NO", "FIN_SI", "MIENTRAS", "PAR_IZQ", "PAR_DER", "FIN_MIENTRAS", 
			"PARA", "FIN_PARA", "SELECCIONAR", "ENTRE", "CASO", "DEFECTO", "ROMPER", 
			"FIN_SELECCIONAR", "ASIG", "MAS", "MENOS", "MULT", "DIV", "MOD", "MENOR", 
			"MAYOR", "MENOR_IGUAL", "MAYOR_IGUAL", "IGUAL", "Y", "O", "DIF", "NEG", 
			"ID", "DATA_ENTERO", "DATA_REAL", "DATA_CARACTER", "DATA_CADENA", "FALSO", 
			"VERDADERO", "COMMENT", "LINE_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'funcion_principal'", "'fin_principal'", "'estructura'", 
			"'fin_estructura'", "'retornar'", "'booleano'", "'caracter'", "'entero'", 
			"'real'", "'cadena'", "'funcion'", "'fin_funcion'", "'hacer'", "','", 
			"';'", "':'", "'leer'", "'imprimir'", "'si'", "'entonces'", "'si_no'", 
			"'fin_si'", "'mientras'", "'('", "')'", "'fin_mientras'", "'para'", "'fin_para'", 
			"'seleccionar'", "'entre'", "'caso'", "'defecto'", "'romper'", "'fin_seleccionar'", 
			"'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'&&'", "'||'", "'!='", "'!'", null, null, null, null, null, 
			"'falso'", "'verdadero'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "FUNCION_PRINCIPAL", "FIN_PRINCIPAL", "ESTRUCTURA", "FIN_ESTRUCTURA", 
			"RETURN", "BOOLEANO", "CARACTER", "ENTERO", "REAL", "CADENA", "FUNCION", 
			"FIN_FUNCION", "HACER", "COMA", "PYC", "DOS_P", "LEER", "IMPRIMIR", "SI", 
			"ENTONCES", "SI_NO", "FIN_SI", "MIENTRAS", "PAR_IZQ", "PAR_DER", "FIN_MIENTRAS", 
			"PARA", "FIN_PARA", "SELECCIONAR", "ENTRE", "CASO", "DEFECTO", "ROMPER", 
			"FIN_SELECCIONAR", "ASIG", "MAS", "MENOS", "MULT", "DIV", "MOD", "MENOR", 
			"MAYOR", "MENOR_IGUAL", "MAYOR_IGUAL", "IGUAL", "Y", "O", "DIF", "NEG", 
			"ID", "DATA_ENTERO", "DATA_REAL", "DATA_CARACTER", "DATA_CADENA", "FALSO", 
			"VERDADERO", "COMMENT", "LINE_COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u0202\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#"+
		"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\7\64\u01b1\n\64"+
		"\f\64\16\64\u01b4\13\64\3\65\6\65\u01b7\n\65\r\65\16\65\u01b8\3\66\6\66"+
		"\u01bc\n\66\r\66\16\66\u01bd\3\66\3\66\6\66\u01c2\n\66\r\66\16\66\u01c3"+
		"\3\67\3\67\3\67\3\67\38\38\78\u01cc\n8\f8\168\u01cf\138\38\38\39\39\3"+
		"9\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\7;\u01e7\n;\f;\16"+
		";\u01ea\13;\3;\3;\3;\3;\3;\3<\3<\3<\3<\7<\u01f5\n<\f<\16<\u01f8\13<\3"+
		"<\3<\3=\6=\u01fd\n=\r=\16=\u01fe\3=\3=\3\u01e8\2>\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>\3\2\b\4\2"+
		"C\\c|\6\2\62;C\\aac|\3\2\62;\7\2\"\"\62;C\\aac|\4\2\f\f\17\17\5\2\13\f"+
		"\17\17\"\"\2\u0209\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\3{\3\2\2\2\5}\3\2\2\2\7\u008f\3\2\2\2\t\u009d\3\2\2\2"+
		"\13\u00a8\3\2\2\2\r\u00b7\3\2\2\2\17\u00c0\3\2\2\2\21\u00c9\3\2\2\2\23"+
		"\u00d2\3\2\2\2\25\u00d9\3\2\2\2\27\u00de\3\2\2\2\31\u00e5\3\2\2\2\33\u00ed"+
		"\3\2\2\2\35\u00f9\3\2\2\2\37\u00ff\3\2\2\2!\u0101\3\2\2\2#\u0103\3\2\2"+
		"\2%\u0105\3\2\2\2\'\u010a\3\2\2\2)\u0113\3\2\2\2+\u0116\3\2\2\2-\u011f"+
		"\3\2\2\2/\u0125\3\2\2\2\61\u012c\3\2\2\2\63\u0135\3\2\2\2\65\u0137\3\2"+
		"\2\2\67\u0139\3\2\2\29\u0146\3\2\2\2;\u014b\3\2\2\2=\u0154\3\2\2\2?\u0160"+
		"\3\2\2\2A\u0166\3\2\2\2C\u016b\3\2\2\2E\u0173\3\2\2\2G\u017a\3\2\2\2I"+
		"\u018a\3\2\2\2K\u018c\3\2\2\2M\u018e\3\2\2\2O\u0190\3\2\2\2Q\u0192\3\2"+
		"\2\2S\u0194\3\2\2\2U\u0196\3\2\2\2W\u0198\3\2\2\2Y\u019a\3\2\2\2[\u019d"+
		"\3\2\2\2]\u01a0\3\2\2\2_\u01a3\3\2\2\2a\u01a6\3\2\2\2c\u01a9\3\2\2\2e"+
		"\u01ac\3\2\2\2g\u01ae\3\2\2\2i\u01b6\3\2\2\2k\u01bb\3\2\2\2m\u01c5\3\2"+
		"\2\2o\u01c9\3\2\2\2q\u01d2\3\2\2\2s\u01d8\3\2\2\2u\u01e2\3\2\2\2w\u01f0"+
		"\3\2\2\2y\u01fc\3\2\2\2{|\7\60\2\2|\4\3\2\2\2}~\7h\2\2~\177\7w\2\2\177"+
		"\u0080\7p\2\2\u0080\u0081\7e\2\2\u0081\u0082\7k\2\2\u0082\u0083\7q\2\2"+
		"\u0083\u0084\7p\2\2\u0084\u0085\7a\2\2\u0085\u0086\7r\2\2\u0086\u0087"+
		"\7t\2\2\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2\u0089\u008a\7e\2\2\u008a"+
		"\u008b\7k\2\2\u008b\u008c\7r\2\2\u008c\u008d\7c\2\2\u008d\u008e\7n\2\2"+
		"\u008e\6\3\2\2\2\u008f\u0090\7h\2\2\u0090\u0091\7k\2\2\u0091\u0092\7p"+
		"\2\2\u0092\u0093\7a\2\2\u0093\u0094\7r\2\2\u0094\u0095\7t\2\2\u0095\u0096"+
		"\7k\2\2\u0096\u0097\7p\2\2\u0097\u0098\7e\2\2\u0098\u0099\7k\2\2\u0099"+
		"\u009a\7r\2\2\u009a\u009b\7c\2\2\u009b\u009c\7n\2\2\u009c\b\3\2\2\2\u009d"+
		"\u009e\7g\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7t\2\2"+
		"\u00a1\u00a2\7w\2\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5"+
		"\7w\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7c\2\2\u00a7\n\3\2\2\2\u00a8\u00a9"+
		"\7h\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7a\2\2\u00ac"+
		"\u00ad\7g\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7t\2\2"+
		"\u00b0\u00b1\7w\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4"+
		"\7w\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7c\2\2\u00b6\f\3\2\2\2\u00b7\u00b8"+
		"\7t\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7q\2\2\u00bb"+
		"\u00bc\7t\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7t\2\2"+
		"\u00bf\16\3\2\2\2\u00c0\u00c1\7d\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7"+
		"q\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7"+
		"\7p\2\2\u00c7\u00c8\7q\2\2\u00c8\20\3\2\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb"+
		"\7c\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7e\2\2\u00ce"+
		"\u00cf\7v\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7t\2\2\u00d1\22\3\2\2\2\u00d2"+
		"\u00d3\7g\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7g\2\2"+
		"\u00d6\u00d7\7t\2\2\u00d7\u00d8\7q\2\2\u00d8\24\3\2\2\2\u00d9\u00da\7"+
		"t\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7n\2\2\u00dd\26"+
		"\3\2\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7f\2\2\u00e1"+
		"\u00e2\7g\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7c\2\2\u00e4\30\3\2\2\2\u00e5"+
		"\u00e6\7h\2\2\u00e6\u00e7\7w\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7e\2\2"+
		"\u00e9\u00ea\7k\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7p\2\2\u00ec\32\3\2"+
		"\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1"+
		"\7a\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7p\2\2\u00f4"+
		"\u00f5\7e\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7p\2\2"+
		"\u00f8\34\3\2\2\2\u00f9\u00fa\7j\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7"+
		"e\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7t\2\2\u00fe\36\3\2\2\2\u00ff\u0100"+
		"\7.\2\2\u0100 \3\2\2\2\u0101\u0102\7=\2\2\u0102\"\3\2\2\2\u0103\u0104"+
		"\7<\2\2\u0104$\3\2\2\2\u0105\u0106\7n\2\2\u0106\u0107\7g\2\2\u0107\u0108"+
		"\7g\2\2\u0108\u0109\7t\2\2\u0109&\3\2\2\2\u010a\u010b\7k\2\2\u010b\u010c"+
		"\7o\2\2\u010c\u010d\7r\2\2\u010d\u010e\7t\2\2\u010e\u010f\7k\2\2\u010f"+
		"\u0110\7o\2\2\u0110\u0111\7k\2\2\u0111\u0112\7t\2\2\u0112(\3\2\2\2\u0113"+
		"\u0114\7u\2\2\u0114\u0115\7k\2\2\u0115*\3\2\2\2\u0116\u0117\7g\2\2\u0117"+
		"\u0118\7p\2\2\u0118\u0119\7v\2\2\u0119\u011a\7q\2\2\u011a\u011b\7p\2\2"+
		"\u011b\u011c\7e\2\2\u011c\u011d\7g\2\2\u011d\u011e\7u\2\2\u011e,\3\2\2"+
		"\2\u011f\u0120\7u\2\2\u0120\u0121\7k\2\2\u0121\u0122\7a\2\2\u0122\u0123"+
		"\7p\2\2\u0123\u0124\7q\2\2\u0124.\3\2\2\2\u0125\u0126\7h\2\2\u0126\u0127"+
		"\7k\2\2\u0127\u0128\7p\2\2\u0128\u0129\7a\2\2\u0129\u012a\7u\2\2\u012a"+
		"\u012b\7k\2\2\u012b\60\3\2\2\2\u012c\u012d\7o\2\2\u012d\u012e\7k\2\2\u012e"+
		"\u012f\7g\2\2\u012f\u0130\7p\2\2\u0130\u0131\7v\2\2\u0131\u0132\7t\2\2"+
		"\u0132\u0133\7c\2\2\u0133\u0134\7u\2\2\u0134\62\3\2\2\2\u0135\u0136\7"+
		"*\2\2\u0136\64\3\2\2\2\u0137\u0138\7+\2\2\u0138\66\3\2\2\2\u0139\u013a"+
		"\7h\2\2\u013a\u013b\7k\2\2\u013b\u013c\7p\2\2\u013c\u013d\7a\2\2\u013d"+
		"\u013e\7o\2\2\u013e\u013f\7k\2\2\u013f\u0140\7g\2\2\u0140\u0141\7p\2\2"+
		"\u0141\u0142\7v\2\2\u0142\u0143\7t\2\2\u0143\u0144\7c\2\2\u0144\u0145"+
		"\7u\2\2\u01458\3\2\2\2\u0146\u0147\7r\2\2\u0147\u0148\7c\2\2\u0148\u0149"+
		"\7t\2\2\u0149\u014a\7c\2\2\u014a:\3\2\2\2\u014b\u014c\7h\2\2\u014c\u014d"+
		"\7k\2\2\u014d\u014e\7p\2\2\u014e\u014f\7a\2\2\u014f\u0150\7r\2\2\u0150"+
		"\u0151\7c\2\2\u0151\u0152\7t\2\2\u0152\u0153\7c\2\2\u0153<\3\2\2\2\u0154"+
		"\u0155\7u\2\2\u0155\u0156\7g\2\2\u0156\u0157\7n\2\2\u0157\u0158\7g\2\2"+
		"\u0158\u0159\7e\2\2\u0159\u015a\7e\2\2\u015a\u015b\7k\2\2\u015b\u015c"+
		"\7q\2\2\u015c\u015d\7p\2\2\u015d\u015e\7c\2\2\u015e\u015f\7t\2\2\u015f"+
		">\3\2\2\2\u0160\u0161\7g\2\2\u0161\u0162\7p\2\2\u0162\u0163\7v\2\2\u0163"+
		"\u0164\7t\2\2\u0164\u0165\7g\2\2\u0165@\3\2\2\2\u0166\u0167\7e\2\2\u0167"+
		"\u0168\7c\2\2\u0168\u0169\7u\2\2\u0169\u016a\7q\2\2\u016aB\3\2\2\2\u016b"+
		"\u016c\7f\2\2\u016c\u016d\7g\2\2\u016d\u016e\7h\2\2\u016e\u016f\7g\2\2"+
		"\u016f\u0170\7e\2\2\u0170\u0171\7v\2\2\u0171\u0172\7q\2\2\u0172D\3\2\2"+
		"\2\u0173\u0174\7t\2\2\u0174\u0175\7q\2\2\u0175\u0176\7o\2\2\u0176\u0177"+
		"\7r\2\2\u0177\u0178\7g\2\2\u0178\u0179\7t\2\2\u0179F\3\2\2\2\u017a\u017b"+
		"\7h\2\2\u017b\u017c\7k\2\2\u017c\u017d\7p\2\2\u017d\u017e\7a\2\2\u017e"+
		"\u017f\7u\2\2\u017f\u0180\7g\2\2\u0180\u0181\7n\2\2\u0181\u0182\7g\2\2"+
		"\u0182\u0183\7e\2\2\u0183\u0184\7e\2\2\u0184\u0185\7k\2\2\u0185\u0186"+
		"\7q\2\2\u0186\u0187\7p\2\2\u0187\u0188\7c\2\2\u0188\u0189\7t\2\2\u0189"+
		"H\3\2\2\2\u018a\u018b\7?\2\2\u018bJ\3\2\2\2\u018c\u018d\7-\2\2\u018dL"+
		"\3\2\2\2\u018e\u018f\7/\2\2\u018fN\3\2\2\2\u0190\u0191\7,\2\2\u0191P\3"+
		"\2\2\2\u0192\u0193\7\61\2\2\u0193R\3\2\2\2\u0194\u0195\7\'\2\2\u0195T"+
		"\3\2\2\2\u0196\u0197\7>\2\2\u0197V\3\2\2\2\u0198\u0199\7@\2\2\u0199X\3"+
		"\2\2\2\u019a\u019b\7>\2\2\u019b\u019c\7?\2\2\u019cZ\3\2\2\2\u019d\u019e"+
		"\7@\2\2\u019e\u019f\7?\2\2\u019f\\\3\2\2\2\u01a0\u01a1\7?\2\2\u01a1\u01a2"+
		"\7?\2\2\u01a2^\3\2\2\2\u01a3\u01a4\7(\2\2\u01a4\u01a5\7(\2\2\u01a5`\3"+
		"\2\2\2\u01a6\u01a7\7~\2\2\u01a7\u01a8\7~\2\2\u01a8b\3\2\2\2\u01a9\u01aa"+
		"\7#\2\2\u01aa\u01ab\7?\2\2\u01abd\3\2\2\2\u01ac\u01ad\7#\2\2\u01adf\3"+
		"\2\2\2\u01ae\u01b2\t\2\2\2\u01af\u01b1\t\3\2\2\u01b0\u01af\3\2\2\2\u01b1"+
		"\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3h\3\2\2\2"+
		"\u01b4\u01b2\3\2\2\2\u01b5\u01b7\t\4\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9j\3\2\2\2\u01ba"+
		"\u01bc\t\4\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bb\3\2"+
		"\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\7\60\2\2\u01c0"+
		"\u01c2\t\4\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c1\3\2"+
		"\2\2\u01c3\u01c4\3\2\2\2\u01c4l\3\2\2\2\u01c5\u01c6\7)\2\2\u01c6\u01c7"+
		"\t\5\2\2\u01c7\u01c8\7)\2\2\u01c8n\3\2\2\2\u01c9\u01cd\7$\2\2\u01ca\u01cc"+
		"\t\5\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d1\7$"+
		"\2\2\u01d1p\3\2\2\2\u01d2\u01d3\7h\2\2\u01d3\u01d4\7c\2\2\u01d4\u01d5"+
		"\7n\2\2\u01d5\u01d6\7u\2\2\u01d6\u01d7\7q\2\2\u01d7r\3\2\2\2\u01d8\u01d9"+
		"\7x\2\2\u01d9\u01da\7g\2\2\u01da\u01db\7t\2\2\u01db\u01dc\7f\2\2\u01dc"+
		"\u01dd\7c\2\2\u01dd\u01de\7f\2\2\u01de\u01df\7g\2\2\u01df\u01e0\7t\2\2"+
		"\u01e0\u01e1\7q\2\2\u01e1t\3\2\2\2\u01e2\u01e3\7\61\2\2\u01e3\u01e4\7"+
		",\2\2\u01e4\u01e8\3\2\2\2\u01e5\u01e7\13\2\2\2\u01e6\u01e5\3\2\2\2\u01e7"+
		"\u01ea\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01eb\3\2"+
		"\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ec\7,\2\2\u01ec\u01ed\7\61\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01ef\b;\2\2\u01efv\3\2\2\2\u01f0\u01f1\7\61\2\2"+
		"\u01f1\u01f2\7\61\2\2\u01f2\u01f6\3\2\2\2\u01f3\u01f5\n\6\2\2\u01f4\u01f3"+
		"\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f9\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fa\b<\2\2\u01fax\3\2\2\2\u01fb"+
		"\u01fd\t\7\2\2\u01fc\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01fc\3\2"+
		"\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\b=\2\2\u0201"+
		"z\3\2\2\2\13\2\u01b2\u01b8\u01bd\u01c3\u01cd\u01e8\u01f6\u01fe\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}