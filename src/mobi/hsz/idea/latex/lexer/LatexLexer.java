/* The following code was generated by JFlex 1.4.3 on 18.11.15 11:50 */

package mobi.hsz.idea.latex.lexer;

import java.io.File;
import java.util.List;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import static mobi.hsz.idea.latex.psi.LatexTypes.*;
import static com.intellij.psi.TokenType.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 18.11.15 11:50 from the specification file
 * <tt>/home/hsz/Projects/idea-latex/src/mobi/hsz/idea/latex/lexer/Latex.flex</tt>
 */
public class LatexLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int IN_ARGUMENT = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\2\1\0\1\1\1\1\22\0\1\1\2\0\1\10"+
    "\1\10\1\5\1\10\1\0\1\11\1\12\1\17\1\0\1\6\15\0"+
    "\1\16\6\0\32\4\1\13\1\3\1\14\1\10\1\10\1\0\1\4"+
    "\1\20\1\4\1\25\1\21\1\4\1\22\1\4\1\23\4\4\1\24"+
    "\14\4\1\15\1\0\1\7\1\10\53\0\1\4\12\0\1\4\4\0"+
    "\1\4\5\0\27\4\1\0\37\4\1\0\u01ca\4\4\0\14\4\16\0"+
    "\5\4\7\0\1\4\1\0\1\4\201\0\5\4\1\0\2\4\2\0"+
    "\4\4\10\0\1\4\1\0\3\4\1\0\1\4\1\0\24\4\1\0"+
    "\123\4\1\0\213\4\10\0\236\4\11\0\46\4\2\0\1\4\7\0"+
    "\47\4\110\0\33\4\5\0\3\4\55\0\53\4\43\0\2\4\1\0"+
    "\143\4\1\0\1\4\17\0\2\4\7\0\2\4\12\0\3\4\2\0"+
    "\1\4\20\0\1\4\1\0\36\4\35\0\131\4\13\0\1\4\30\0"+
    "\41\4\11\0\2\4\4\0\1\4\5\0\26\4\4\0\1\4\11\0"+
    "\1\4\3\0\1\4\27\0\31\4\107\0\1\4\1\0\13\4\127\0"+
    "\66\4\3\0\1\4\22\0\1\4\7\0\12\4\17\0\7\4\1\0"+
    "\7\4\5\0\10\4\2\0\2\4\2\0\26\4\1\0\7\4\1\0"+
    "\1\4\3\0\4\4\3\0\1\4\20\0\1\4\15\0\2\4\1\0"+
    "\3\4\16\0\2\4\23\0\6\4\4\0\2\4\2\0\26\4\1\0"+
    "\7\4\1\0\2\4\1\0\2\4\1\0\2\4\37\0\4\4\1\0"+
    "\1\4\23\0\3\4\20\0\11\4\1\0\3\4\1\0\26\4\1\0"+
    "\7\4\1\0\2\4\1\0\5\4\3\0\1\4\22\0\1\4\17\0"+
    "\2\4\43\0\10\4\2\0\2\4\2\0\26\4\1\0\7\4\1\0"+
    "\2\4\1\0\5\4\3\0\1\4\36\0\2\4\1\0\3\4\17\0"+
    "\1\4\21\0\1\4\1\0\6\4\3\0\3\4\1\0\4\4\3\0"+
    "\2\4\1\0\1\4\1\0\2\4\3\0\2\4\3\0\3\4\3\0"+
    "\14\4\26\0\1\4\64\0\10\4\1\0\3\4\1\0\27\4\1\0"+
    "\12\4\1\0\5\4\3\0\1\4\32\0\2\4\6\0\2\4\43\0"+
    "\10\4\1\0\3\4\1\0\27\4\1\0\12\4\1\0\5\4\3\0"+
    "\1\4\40\0\1\4\1\0\2\4\17\0\2\4\22\0\10\4\1\0"+
    "\3\4\1\0\51\4\2\0\1\4\20\0\1\4\21\0\2\4\30\0"+
    "\6\4\5\0\22\4\3\0\30\4\1\0\11\4\1\0\1\4\2\0"+
    "\7\4\72\0\60\4\1\0\2\4\14\0\7\4\72\0\2\4\1\0"+
    "\1\4\2\0\2\4\1\0\1\4\2\0\1\4\6\0\4\4\1\0"+
    "\7\4\1\0\3\4\1\0\1\4\1\0\1\4\2\0\2\4\1\0"+
    "\4\4\1\0\2\4\11\0\1\4\2\0\5\4\1\0\1\4\25\0"+
    "\4\4\40\0\1\4\77\0\10\4\1\0\44\4\33\0\5\4\163\0"+
    "\53\4\24\0\1\4\20\0\6\4\4\0\4\4\3\0\1\4\3\0"+
    "\2\4\7\0\3\4\4\0\15\4\14\0\1\4\21\0\46\4\1\0"+
    "\1\4\5\0\1\4\2\0\53\4\1\0\u014d\4\1\0\4\4\2\0"+
    "\7\4\1\0\1\4\1\0\4\4\2\0\51\4\1\0\4\4\2\0"+
    "\41\4\1\0\4\4\2\0\7\4\1\0\1\4\1\0\4\4\2\0"+
    "\17\4\1\0\71\4\1\0\4\4\2\0\103\4\45\0\20\4\20\0"+
    "\125\4\14\0\u026c\4\2\0\21\4\1\0\32\4\5\0\113\4\25\0"+
    "\15\4\1\0\4\4\16\0\22\4\16\0\22\4\16\0\15\4\1\0"+
    "\3\4\17\0\64\4\43\0\1\4\4\0\1\4\103\0\130\4\10\0"+
    "\51\4\1\0\1\4\5\0\106\4\12\0\35\4\63\0\36\4\2\0"+
    "\5\4\13\0\54\4\25\0\7\4\70\0\27\4\11\0\65\4\122\0"+
    "\1\4\135\0\57\4\21\0\7\4\67\0\36\4\15\0\2\4\12\0"+
    "\54\4\32\0\44\4\51\0\3\4\12\0\44\4\153\0\4\4\1\0"+
    "\4\4\3\0\2\4\11\0\300\4\100\0\u0116\4\2\0\6\4\2\0"+
    "\46\4\2\0\6\4\2\0\10\4\1\0\1\4\1\0\1\4\1\0"+
    "\1\4\1\0\37\4\2\0\65\4\1\0\7\4\1\0\1\4\3\0"+
    "\3\4\1\0\7\4\3\0\4\4\2\0\6\4\4\0\15\4\5\0"+
    "\3\4\1\0\7\4\164\0\1\4\15\0\1\4\20\0\15\4\145\0"+
    "\1\4\4\0\1\4\2\0\12\4\1\0\1\4\3\0\5\4\6\0"+
    "\1\4\1\0\1\4\1\0\1\4\1\0\4\4\1\0\13\4\2\0"+
    "\4\4\5\0\5\4\4\0\1\4\64\0\2\4\u0a7b\0\57\4\1\0"+
    "\57\4\1\0\205\4\6\0\4\4\3\0\2\4\14\0\46\4\1\0"+
    "\1\4\5\0\1\4\2\0\70\4\7\0\1\4\20\0\27\4\11\0"+
    "\7\4\1\0\7\4\1\0\7\4\1\0\7\4\1\0\7\4\1\0"+
    "\7\4\1\0\7\4\1\0\7\4\120\0\1\4\u01d5\0\2\4\52\0"+
    "\5\4\5\0\2\4\4\0\126\4\6\0\3\4\1\0\132\4\1\0"+
    "\4\4\5\0\51\4\3\0\136\4\21\0\33\4\65\0\20\4\u0200\0"+
    "\u19b6\4\112\0\u51cd\4\63\0\u048d\4\103\0\56\4\2\0\u010d\4\3\0"+
    "\20\4\12\0\2\4\24\0\57\4\20\0\31\4\10\0\106\4\61\0"+
    "\11\4\2\0\147\4\2\0\4\4\1\0\4\4\14\0\13\4\115\0"+
    "\12\4\1\0\3\4\1\0\4\4\1\0\27\4\35\0\64\4\16\0"+
    "\62\4\76\0\6\4\3\0\1\4\16\0\34\4\12\0\27\4\31\0"+
    "\35\4\7\0\57\4\34\0\1\4\60\0\51\4\27\0\3\4\1\0"+
    "\10\4\24\0\27\4\3\0\1\4\5\0\60\4\1\0\1\4\3\0"+
    "\2\4\2\0\5\4\2\0\1\4\1\0\1\4\30\0\3\4\2\0"+
    "\13\4\7\0\3\4\14\0\6\4\2\0\6\4\2\0\6\4\11\0"+
    "\7\4\1\0\7\4\221\0\43\4\35\0\u2ba4\4\14\0\27\4\4\0"+
    "\61\4\u2104\0\u016e\4\2\0\152\4\46\0\7\4\14\0\5\4\5\0"+
    "\1\4\1\0\12\4\1\0\15\4\1\0\5\4\1\0\1\4\1\0"+
    "\2\4\1\0\2\4\1\0\154\4\41\0\u016b\4\22\0\100\4\2\0"+
    "\66\4\50\0\14\4\164\0\5\4\1\0\207\4\44\0\32\4\6\0"+
    "\32\4\13\0\131\4\3\0\6\4\2\0\6\4\2\0\6\4\2\0"+
    "\3\4\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\3\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\1\1\15"+
    "\1\16\1\0\1\3\1\17\3\3\4\20\1\21\1\20"+
    "\1\22";

  private static int [] zzUnpackAction() {
    int [] result = new int[31];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\26\0\54\0\102\0\130\0\156\0\204\0\54"+
    "\0\204\0\204\0\204\0\204\0\204\0\54\0\54\0\232"+
    "\0\204\0\204\0\260\0\204\0\54\0\306\0\334\0\362"+
    "\0\306\0\u0108\0\u011e\0\u0134\0\306\0\u014a\0\306";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[31];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\1\5\1\3\1\6\1\3\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\6\3"+
    "\3\20\1\21\2\20\1\22\1\21\1\20\5\21\10\20"+
    "\1\3\2\0\1\23\1\3\1\0\1\3\1\0\1\3"+
    "\5\0\10\3\1\0\2\4\23\0\2\24\1\0\1\25"+
    "\1\26\1\10\2\24\1\10\7\24\1\27\1\30\4\26"+
    "\2\6\1\0\23\6\26\0\3\20\1\0\2\20\2\0"+
    "\1\20\5\0\10\20\3\0\1\3\1\0\1\3\2\0"+
    "\1\3\21\0\1\31\13\0\6\31\4\0\1\31\13\0"+
    "\1\31\1\32\4\31\4\0\1\31\13\0\4\31\1\33"+
    "\1\31\4\0\1\31\13\0\2\31\1\34\3\31\4\0"+
    "\1\31\13\0\5\31\1\35\4\0\1\31\13\0\3\31"+
    "\1\36\2\31\4\0\1\31\13\0\4\31\1\37\1\31";

  private static int [] zzUnpackTrans() {
    int [] result = new int[352];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\4\1\1\11\1\1\5\11\3\1\2\11\1\0"+
    "\1\11\13\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[31];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
  public LatexLexer() {
    this((java.io.Reader)null);
  }


  public LatexLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public LatexLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1564) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 8: 
          { yybegin(IN_ARGUMENT); return LBRACKET;
          }
        case 19: break;
        case 14: 
          { return COMMA;
          }
        case 20: break;
        case 3: 
          { return SPECIAL;
          }
        case 21: break;
        case 4: 
          { return COMMENT;
          }
        case 22: break;
        case 16: 
          { return IDENTIFIER;
          }
        case 23: break;
        case 15: 
          { return LINE_BREAK;
          }
        case 24: break;
        case 1: 
          { return ARGUMENT;
          }
        case 25: break;
        case 17: 
          { return IDENTIFIER_END;
          }
        case 26: break;
        case 11: 
          { return COLON;
          }
        case 27: break;
        case 10: 
          { yybegin(IN_ARGUMENT); return LBRACE;
          }
        case 28: break;
        case 13: 
          { yypushback(1); yybegin(YYINITIAL);
          }
        case 29: break;
        case 2: 
          { return WHITE_SPACE;
          }
        case 30: break;
        case 7: 
          { return RPAREN;
          }
        case 31: break;
        case 5: 
          { return RBRACE;
          }
        case 32: break;
        case 18: 
          { return IDENTIFIER_BEGIN;
          }
        case 33: break;
        case 12: 
          { return ASTERISK;
          }
        case 34: break;
        case 6: 
          { yybegin(IN_ARGUMENT); return LPAREN;
          }
        case 35: break;
        case 9: 
          { return RBRACKET;
          }
        case 36: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
