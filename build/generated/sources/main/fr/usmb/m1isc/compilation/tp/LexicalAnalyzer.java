// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: /home/cheddar/Documents/GithubProject/TP2-INFO805/src/main/jflex/AnalyseurLexical.jflex

/* --------------------------Section de Code Utilisateur---------------------*/
package fr.usmb.m1isc.compilation.tp;
import java_cup.runtime.Symbol;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class LexicalAnalyzer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\2\u1f00\1\u2000\7\u1f00\1\u2100\1\u2200\1\u2300"+
    "\1\u1f00\1\u2400\1\u2500\2\u1f00\31\u0100\1\u2600\121\u0100\1\u2700"+
    "\4\u0100\1\u2800\1\u0100\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00"+
    "\1\u2e00\53\u0100\1\u2f00\10\u3000\31\u1f00\1\u0100\1\u3100\1\u3200"+
    "\1\u0100\1\u3300\1\u3400\1\u3500\1\u3600\1\u3700\1\u3800\1\u3900"+
    "\1\u3a00\1\u3b00\1\u0100\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000"+
    "\1\u4100\1\u4200\1\u1f00\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700"+
    "\1\u4800\1\u4900\1\u4a00\1\u4b00\1\u4c00\1\u4d00\1\u4e00\1\u1f00"+
    "\1\u4f00\1\u5000\1\u5100\1\u1f00\3\u0100\1\u5200\1\u5300\1\u5400"+
    "\12\u1f00\4\u0100\1\u5500\17\u1f00\2\u0100\1\u5600\41\u1f00\2\u0100"+
    "\1\u5700\1\u5800\2\u1f00\1\u5900\1\u5a00\27\u0100\1\u5b00\2\u0100"+
    "\1\u5c00\45\u1f00\1\u0100\1\u5d00\1\u5e00\11\u1f00\1\u5f00\24\u1f00"+
    "\1\u6000\1\u6100\1\u1f00\1\u6200\1\u6300\1\u6400\1\u6500\2\u1f00"+
    "\1\u6600\5\u1f00\1\u6700\1\u6800\1\u6900\5\u1f00\1\u6a00\1\u6b00"+
    "\4\u1f00\1\u6c00\2\u1f00\1\u6d00\16\u1f00\246\u0100\1\u6e00\20\u0100"+
    "\1\u6f00\1\u7000\25\u0100\1\u7100\34\u0100\1\u7200\14\u1f00\2\u0100"+
    "\1\u7300\u0b06\u1f00\1\u7400\u02fe\u1f00";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\4\2\22\0\1\1\4\0\1\3\2\0"+
    "\1\4\1\5\1\6\1\7\1\0\1\10\1\11\1\12"+
    "\12\13\1\0\1\14\1\15\1\16\3\0\1\17\2\20"+
    "\1\21\1\22\1\23\1\20\1\24\1\25\2\20\1\26"+
    "\1\27\1\30\1\31\1\32\1\20\1\33\1\34\1\35"+
    "\1\36\1\20\1\37\3\20\4\0\1\40\1\0\1\41"+
    "\2\20\1\42\1\43\1\44\1\20\1\45\1\46\2\20"+
    "\1\47\1\50\1\51\1\52\1\53\1\20\1\54\1\55"+
    "\1\56\1\57\1\20\1\60\3\20\12\0\1\2\32\0"+
    "\1\1\11\0\1\20\12\0\1\20\4\0\1\20\5\0"+
    "\27\20\1\0\37\20\1\0\u01ca\20\4\0\14\20\16\0"+
    "\5\20\7\0\1\20\1\0\1\20\21\0\160\40\5\20"+
    "\1\0\2\20\2\0\4\20\1\0\1\20\6\0\1\20"+
    "\1\0\3\20\1\0\1\20\1\0\24\20\1\0\123\20"+
    "\1\0\213\20\1\0\7\40\246\20\1\0\46\20\2\0"+
    "\1\20\6\0\51\20\10\0\55\40\1\0\1\40\1\0"+
    "\2\40\1\0\2\40\1\0\1\40\10\0\33\20\4\0"+
    "\4\20\35\0\13\40\5\0\53\20\37\40\4\0\2\20"+
    "\1\40\143\20\1\0\1\20\7\40\2\0\6\40\2\20"+
    "\2\40\1\0\4\40\2\20\12\40\3\20\2\0\1\20"+
    "\20\0\1\20\1\40\36\20\33\40\2\0\131\20\13\40"+
    "\1\20\16\0\12\40\41\20\11\40\2\20\4\0\1\20"+
    "\2\0\1\40\2\0\26\20\4\40\1\20\11\40\1\20"+
    "\3\40\1\20\5\40\22\0\31\20\3\40\4\0\13\20"+
    "\65\0\25\20\1\0\10\20\25\0\17\40\1\0\41\40"+
    "\66\20\3\40\1\20\22\40\1\20\7\40\12\20\2\40"+
    "\2\0\12\40\1\0\20\20\3\40\1\0\10\20\2\0"+
    "\2\20\2\0\26\20\1\0\7\20\1\0\1\20\3\0"+
    "\4\20\2\0\1\40\1\20\7\40\2\0\2\40\2\0"+
    "\3\40\1\20\10\0\1\40\4\0\2\20\1\0\3\20"+
    "\2\40\2\0\12\40\2\20\12\0\1\20\1\0\1\40"+
    "\2\0\3\40\1\0\6\20\4\0\2\20\2\0\26\20"+
    "\1\0\7\20\1\0\2\20\1\0\2\20\1\0\2\20"+
    "\2\0\1\40\1\0\5\40\4\0\2\40\2\0\3\40"+
    "\3\0\1\40\7\0\4\20\1\0\1\20\7\0\14\40"+
    "\3\20\1\40\13\0\3\40\1\0\11\20\1\0\3\20"+
    "\1\0\26\20\1\0\7\20\1\0\2\20\1\0\5\20"+
    "\2\0\1\40\1\20\10\40\1\0\3\40\1\0\3\40"+
    "\2\0\1\20\17\0\2\20\2\40\2\0\12\40\11\0"+
    "\1\20\6\40\1\0\3\40\1\0\10\20\2\0\2\20"+
    "\2\0\26\20\1\0\7\20\1\0\2\20\1\0\5\20"+
    "\2\0\1\40\1\20\7\40\2\0\2\40\2\0\3\40"+
    "\10\0\2\40\4\0\2\20\1\0\3\20\2\40\2\0"+
    "\12\40\1\0\1\20\20\0\1\40\1\20\1\0\6\20"+
    "\3\0\3\20\1\0\4\20\3\0\2\20\1\0\1\20"+
    "\1\0\2\20\3\0\2\20\3\0\3\20\3\0\14\20"+
    "\4\0\5\40\3\0\3\40\1\0\4\40\2\0\1\20"+
    "\6\0\1\40\16\0\12\40\20\0\5\40\10\20\1\0"+
    "\3\20\1\0\27\20\1\0\20\20\3\0\1\20\7\40"+
    "\1\0\3\40\1\0\4\40\7\0\2\40\1\0\3\20"+
    "\5\0\2\20\2\40\2\0\12\40\20\0\1\20\3\40"+
    "\1\0\10\20\1\0\3\20\1\0\27\20\1\0\12\20"+
    "\1\0\5\20\2\0\1\40\1\20\7\40\1\0\3\40"+
    "\1\0\4\40\7\0\2\40\7\0\1\20\1\0\2\20"+
    "\2\40\2\0\12\40\1\0\2\20\15\0\4\40\1\0"+
    "\10\20\1\0\3\20\1\0\51\20\2\40\1\20\7\40"+
    "\1\0\3\40\1\0\4\40\1\20\5\0\3\20\1\40"+
    "\7\0\3\20\2\40\2\0\12\40\12\0\6\20\2\0"+
    "\2\40\1\0\22\20\3\0\30\20\1\0\11\20\1\0"+
    "\1\20\2\0\7\20\3\0\1\40\4\0\6\40\1\0"+
    "\1\40\1\0\10\40\6\0\12\40\2\0\2\40\15\0"+
    "\60\20\1\40\2\20\7\40\5\0\7\20\10\40\1\0"+
    "\12\40\47\0\2\20\1\0\1\20\1\0\5\20\1\0"+
    "\30\20\1\0\1\20\1\0\12\20\1\40\2\20\11\40"+
    "\1\20\2\0\5\20\1\0\1\20\1\0\6\40\2\0"+
    "\12\40\2\0\4\20\40\0\1\20\27\0\2\40\6\0"+
    "\12\40\13\0\1\40\1\0\1\40\1\0\1\40\4\0"+
    "\2\40\10\20\1\0\44\20\4\0\24\40\1\0\2\40"+
    "\5\20\13\40\1\0\44\40\11\0\1\40\71\0\53\20"+
    "\24\40\1\20\12\40\6\0\6\20\4\40\4\20\3\40"+
    "\1\20\3\40\2\20\7\40\3\20\4\40\15\20\14\40"+
    "\1\20\17\40\2\0\46\20\1\0\1\20\5\0\1\20"+
    "\2\0\53\20\1\0\115\20\1\0\4\20\2\0\7\20"+
    "\1\0\1\20\1\0\4\20\2\0\51\20\1\0\4\20"+
    "\2\0\41\20\1\0\4\20\2\0\7\20\1\0\1\20"+
    "\1\0\4\20\2\0\17\20\1\0\71\20\1\0\4\20"+
    "\2\0\103\20\2\0\3\40\40\0\20\20\20\0\126\20"+
    "\2\0\6\20\3\0\u016c\20\2\0\21\20\1\1\32\20"+
    "\5\0\113\20\3\0\3\40\10\20\7\0\15\20\1\0"+
    "\4\20\3\40\13\0\22\20\3\40\13\0\22\20\2\40"+
    "\14\0\15\20\1\0\3\20\1\0\2\40\14\0\64\20"+
    "\40\40\3\0\1\20\4\0\1\20\1\40\2\0\12\40"+
    "\41\0\3\40\2\0\12\40\6\0\131\20\7\0\5\20"+
    "\2\40\42\20\1\40\1\20\5\0\106\20\12\0\37\20"+
    "\1\0\14\40\4\0\14\40\12\0\12\40\36\20\2\0"+
    "\5\20\13\0\54\20\4\0\32\20\6\0\12\40\46\0"+
    "\27\20\5\40\4\0\65\20\12\40\1\0\35\40\2\0"+
    "\13\40\6\0\12\40\15\0\1\20\10\0\17\40\101\0"+
    "\5\40\57\20\21\40\7\20\4\0\12\40\21\0\11\40"+
    "\14\0\3\40\36\20\15\40\2\20\12\40\54\20\16\40"+
    "\14\0\44\20\24\40\10\0\12\40\3\0\3\20\12\40"+
    "\44\20\2\0\11\20\7\0\53\20\2\0\3\20\20\0"+
    "\3\40\1\0\25\40\4\20\1\40\6\20\1\40\2\20"+
    "\3\40\1\20\5\0\300\20\72\40\1\0\5\40\26\20"+
    "\2\0\6\20\2\0\46\20\2\0\6\20\2\0\10\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\37\20"+
    "\2\0\65\20\1\0\7\20\1\0\1\20\3\0\3\20"+
    "\1\0\7\20\3\0\4\20\2\0\6\20\4\0\15\20"+
    "\5\0\3\20\1\0\7\20\3\0\13\1\35\0\2\2"+
    "\5\0\1\1\17\0\2\40\23\0\1\40\12\0\1\1"+
    "\21\0\1\20\15\0\1\20\20\0\15\20\63\0\41\40"+
    "\21\0\1\20\4\0\1\20\2\0\12\20\1\0\1\20"+
    "\3\0\5\20\6\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\4\20\1\0\13\20\2\0\4\20\5\0\5\20"+
    "\4\0\1\20\21\0\43\40\2\20\4\40\u022d\0\64\40"+
    "\26\0\57\20\1\0\57\20\1\0\205\20\6\0\4\20"+
    "\3\40\2\20\14\0\46\20\1\0\1\20\5\0\1\20"+
    "\2\0\70\20\7\0\1\20\17\0\1\40\27\20\11\0"+
    "\7\20\1\0\7\20\1\0\7\20\1\0\7\20\1\0"+
    "\7\20\1\0\7\20\1\0\7\20\1\0\7\20\1\0"+
    "\40\40\57\0\1\20\320\0\1\1\4\0\2\20\1\40"+
    "\31\0\17\40\1\0\5\20\2\0\3\40\2\20\4\0"+
    "\126\20\2\0\2\40\2\0\3\20\1\0\132\20\1\0"+
    "\4\20\5\0\53\20\1\0\136\20\21\0\33\20\65\0"+
    "\306\20\112\0\360\20\20\0\215\20\103\0\56\20\2\0"+
    "\15\20\3\0\20\20\12\40\2\20\24\0\57\20\4\40"+
    "\1\0\12\40\1\0\37\20\2\40\106\20\14\40\45\0"+
    "\11\20\2\0\147\20\2\0\65\20\2\0\5\20\60\0"+
    "\13\20\1\40\3\20\1\40\4\20\1\40\27\20\5\40"+
    "\30\0\64\20\14\0\2\40\62\20\22\40\12\0\12\40"+
    "\6\0\22\40\6\20\3\0\1\20\1\0\2\20\13\40"+
    "\34\20\10\40\2\0\27\20\15\40\14\0\35\20\3\0"+
    "\4\40\57\20\16\40\16\0\1\20\12\40\6\0\5\20"+
    "\1\40\12\20\12\40\5\20\1\0\51\20\16\40\11\0"+
    "\3\20\1\40\10\20\2\40\2\0\12\40\6\0\27\20"+
    "\3\0\1\20\3\40\62\20\1\40\1\20\3\40\2\20"+
    "\2\40\5\20\2\40\1\20\1\40\1\20\30\0\3\20"+
    "\2\0\13\20\5\40\2\0\3\20\2\40\12\0\6\20"+
    "\2\0\6\20\2\0\6\20\11\0\7\20\1\0\7\20"+
    "\1\0\53\20\1\0\14\20\10\0\163\20\10\40\1\0"+
    "\2\40\2\0\12\40\6\0\244\20\14\0\27\20\4\0"+
    "\61\20\4\0\u0100\61\156\20\2\0\152\20\46\0\7\20"+
    "\14\0\5\20\5\0\1\20\1\40\12\20\1\0\15\20"+
    "\1\0\5\20\1\0\1\20\1\0\2\20\1\0\2\20"+
    "\1\0\154\20\41\0\153\20\22\0\100\20\2\0\66\20"+
    "\50\0\14\20\4\0\20\40\20\0\20\40\3\0\2\40"+
    "\30\0\3\40\40\0\5\20\1\0\207\20\23\0\12\40"+
    "\7\0\32\20\4\0\1\40\1\0\32\20\13\0\131\20"+
    "\3\0\6\20\2\0\6\20\2\0\6\20\2\0\3\20"+
    "\43\0\14\20\1\0\32\20\1\0\23\20\1\0\2\20"+
    "\1\0\17\20\2\0\16\20\42\0\173\20\105\0\65\40"+
    "\210\0\1\40\202\0\35\20\3\0\61\20\17\0\1\40"+
    "\37\0\40\20\15\0\24\20\1\40\10\20\1\40\5\0"+
    "\46\20\5\40\5\0\36\20\2\0\44\20\4\0\10\20"+
    "\1\0\5\40\52\0\236\20\2\0\12\40\6\0\44\20"+
    "\4\0\44\20\4\0\50\20\10\0\64\20\234\0\67\20"+
    "\11\0\26\20\12\0\10\20\230\0\6\20\2\0\1\20"+
    "\1\0\54\20\1\0\2\20\3\0\1\20\2\0\27\20"+
    "\12\0\27\20\11\0\37\20\101\0\23\20\1\0\2\20"+
    "\12\0\26\20\12\0\32\20\106\0\70\20\6\0\2\20"+
    "\100\0\1\20\3\40\1\0\2\40\5\0\4\40\4\20"+
    "\1\0\3\20\1\0\35\20\2\0\3\40\4\0\1\40"+
    "\40\0\35\20\3\0\35\20\43\0\10\20\1\0\34\20"+
    "\2\40\31\0\66\20\12\0\26\20\12\0\23\20\15\0"+
    "\22\20\156\0\111\20\67\0\63\20\15\0\63\20\15\0"+
    "\44\20\4\40\10\0\12\40\306\0\35\20\12\0\1\20"+
    "\10\0\26\20\13\40\217\0\27\20\11\0\3\40\65\20"+
    "\17\40\37\0\12\40\17\0\4\40\55\20\13\40\25\0"+
    "\31\20\7\0\12\40\6\0\3\40\44\20\16\40\1\0"+
    "\12\40\4\0\1\20\2\40\11\0\43\20\1\40\2\0"+
    "\1\20\11\0\3\40\60\20\16\40\4\20\4\0\4\40"+
    "\3\0\12\40\1\20\1\0\1\20\43\0\22\20\1\0"+
    "\31\20\14\40\6\0\1\40\101\0\7\20\1\0\1\20"+
    "\1\0\4\20\1\0\17\20\1\0\12\20\7\0\57\20"+
    "\14\40\5\0\12\40\6\0\4\40\1\0\10\20\2\0"+
    "\2\20\2\0\26\20\1\0\7\20\1\0\2\20\1\0"+
    "\5\20\1\0\2\40\1\20\7\40\2\0\2\40\2\0"+
    "\3\40\2\0\1\20\6\0\1\40\5\0\5\20\2\40"+
    "\2\0\7\40\3\0\5\40\213\0\65\20\22\40\4\20"+
    "\5\0\12\40\4\0\1\40\1\20\40\0\60\20\24\40"+
    "\2\20\1\0\1\20\10\0\12\40\246\0\57\20\7\40"+
    "\2\0\11\40\27\0\4\20\2\40\42\0\60\20\21\40"+
    "\3\0\1\20\13\0\12\40\46\0\53\20\15\40\1\20"+
    "\7\0\12\40\66\0\33\20\2\0\17\40\4\0\12\40"+
    "\306\0\54\20\17\40\145\0\100\20\12\40\25\0\1\20"+
    "\240\0\10\20\2\0\47\20\7\40\2\0\7\40\1\20"+
    "\1\0\1\20\1\40\33\0\1\20\12\40\50\20\7\40"+
    "\1\20\4\40\10\0\1\40\10\0\1\20\13\40\56\20"+
    "\20\40\3\0\1\20\42\0\71\20\7\0\11\20\1\0"+
    "\45\20\10\40\1\0\10\40\1\20\17\0\12\40\30\0"+
    "\36\20\2\0\26\40\1\0\16\40\111\0\7\20\1\0"+
    "\2\20\1\0\46\20\6\40\3\0\1\40\1\0\2\40"+
    "\1\0\7\40\1\20\1\40\10\0\12\40\6\0\6\20"+
    "\1\0\2\20\1\0\40\20\5\40\1\0\2\40\1\0"+
    "\5\40\1\20\7\0\12\40\u0136\0\23\20\4\40\11\0"+
    "\232\20\146\0\157\40\21\0\304\20\274\0\57\20\321\0"+
    "\107\20\271\0\71\20\7\0\37\20\1\0\12\40\146\0"+
    "\36\20\2\0\5\40\13\0\60\20\7\40\11\0\4\20"+
    "\14\0\12\40\11\0\25\20\5\0\23\20\260\0\100\20"+
    "\200\0\113\20\4\0\1\40\1\20\67\40\7\0\4\40"+
    "\15\20\100\0\2\20\1\0\1\20\34\0\370\20\10\0"+
    "\363\20\15\0\37\20\61\0\3\20\21\0\4\20\10\0"+
    "\u018c\20\4\0\153\20\5\0\15\20\3\0\11\20\7\0"+
    "\12\20\3\0\2\40\306\0\5\40\3\0\6\40\10\0"+
    "\10\40\2\0\7\40\36\0\4\40\224\0\3\40\273\0"+
    "\125\20\1\0\107\20\1\0\2\20\2\0\1\20\2\0"+
    "\2\20\2\0\4\20\1\0\14\20\1\0\1\20\1\0"+
    "\7\20\1\0\101\20\1\0\4\20\2\0\10\20\1\0"+
    "\7\20\1\0\34\20\1\0\4\20\1\0\5\20\1\0"+
    "\1\20\3\0\7\20\1\0\u0154\20\2\0\31\20\1\0"+
    "\31\20\1\0\37\20\1\0\31\20\1\0\37\20\1\0"+
    "\31\20\1\0\37\20\1\0\31\20\1\0\37\20\1\0"+
    "\31\20\1\0\10\20\2\0\151\40\4\0\62\40\10\0"+
    "\1\40\16\0\1\40\26\0\5\40\1\0\17\40\120\0"+
    "\7\40\1\0\21\40\2\0\7\40\1\0\2\40\1\0"+
    "\5\40\325\0\55\20\3\0\7\40\7\20\2\0\12\40"+
    "\4\0\1\20\u0171\0\54\20\16\40\6\0\305\20\13\0"+
    "\7\40\51\0\104\20\7\40\1\20\4\0\12\40\246\0"+
    "\4\20\1\0\33\20\1\0\2\20\1\0\1\20\2\0"+
    "\1\20\1\0\12\20\1\0\4\20\1\0\1\20\1\0"+
    "\1\20\6\0\1\20\4\0\1\20\1\0\1\20\1\0"+
    "\1\20\1\0\3\20\1\0\2\20\1\0\1\20\2\0"+
    "\1\20\1\0\1\20\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\1\0\2\20\1\0\1\20\2\0\4\20\1\0"+
    "\7\20\1\0\4\20\1\0\4\20\1\0\1\20\1\0"+
    "\12\20\1\0\21\20\5\0\3\20\1\0\5\20\1\0"+
    "\21\20\164\0\32\40\6\0\32\40\6\0\32\40\166\0"+
    "\327\20\51\0\65\20\13\0\336\20\2\0\u0182\20\16\0"+
    "\u0131\20\37\0\36\20\342\0\360\40\20\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[29952];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\25\17"+
    "\1\0\1\20\1\21\1\17\1\22\1\17\1\23\5\17"+
    "\1\24\15\17\1\0\1\25\2\17\1\26\1\3\1\27"+
    "\1\30\10\17\1\20\1\31\2\17\1\32\4\17\1\33"+
    "\1\17\1\34\1\17\1\35";

  private static int [] zzUnpackAction() {
    int [] result = new int[92];
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
    "\0\0\0\62\0\62\0\62\0\62\0\62\0\62\0\62"+
    "\0\62\0\62\0\144\0\226\0\62\0\310\0\62\0\372"+
    "\0\u012c\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a"+
    "\0\u02bc\0\u02ee\0\u0320\0\u0352\0\u0384\0\u03b6\0\u03e8\0\u041a"+
    "\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514\0\u0546\0\62\0\u0578"+
    "\0\u012c\0\u05aa\0\u012c\0\u05dc\0\u060e\0\u0640\0\u0672\0\u06a4"+
    "\0\u012c\0\u06d6\0\u0708\0\u073a\0\u076c\0\u079e\0\u07d0\0\u0802"+
    "\0\u0834\0\u0866\0\u0898\0\u08ca\0\u08fc\0\u092e\0\u0960\0\u012c"+
    "\0\u0992\0\u09c4\0\u012c\0\u012c\0\u012c\0\u012c\0\u09f6\0\u0a28"+
    "\0\u0a5a\0\u0a8c\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\62\0\u012c"+
    "\0\u0b86\0\u0bb8\0\u012c\0\u0bea\0\u0c1c\0\u0c4e\0\u0c80\0\u012c"+
    "\0\u0cb2\0\u012c\0\u0ce4\0\u012c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[92];
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
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\2\21\1\24\1\25\1\26\1\27\1\30"+
    "\3\21\1\31\1\21\1\32\1\2\1\33\1\34\1\35"+
    "\2\21\1\36\1\37\1\40\1\41\1\42\3\21\1\43"+
    "\1\21\1\44\71\0\1\45\3\0\1\46\62\0\1\14"+
    "\64\0\1\47\56\0\1\21\3\0\11\21\1\50\30\21"+
    "\14\0\1\21\3\0\42\21\14\0\1\21\3\0\12\21"+
    "\1\51\27\21\14\0\1\21\3\0\7\21\1\52\32\21"+
    "\14\0\1\21\3\0\4\21\1\53\4\21\1\54\30\21"+
    "\14\0\1\21\3\0\3\21\1\55\36\21\14\0\1\21"+
    "\3\0\12\21\1\56\27\21\14\0\1\21\3\0\6\21"+
    "\1\57\3\21\1\60\27\21\14\0\1\21\3\0\14\21"+
    "\1\61\2\21\1\62\22\21\14\0\1\21\3\0\5\21"+
    "\1\63\34\21\14\0\1\21\3\0\5\21\1\64\34\21"+
    "\14\0\1\21\3\0\32\21\1\65\7\21\14\0\1\21"+
    "\3\0\33\21\1\51\6\21\14\0\1\21\3\0\30\21"+
    "\1\66\11\21\14\0\1\21\3\0\25\21\1\53\4\21"+
    "\1\67\7\21\14\0\1\21\3\0\24\21\1\70\15\21"+
    "\14\0\1\21\3\0\33\21\1\71\6\21\14\0\1\21"+
    "\3\0\27\21\1\72\3\21\1\73\6\21\14\0\1\21"+
    "\3\0\35\21\1\61\2\21\1\74\1\21\14\0\1\21"+
    "\3\0\26\21\1\75\13\21\14\0\1\21\3\0\26\21"+
    "\1\76\13\21\1\0\6\45\1\77\53\45\2\46\1\0"+
    "\56\46\14\0\1\21\3\0\2\21\1\100\37\21\14\0"+
    "\1\21\3\0\15\21\1\101\24\21\14\0\1\21\3\0"+
    "\13\21\1\102\26\21\14\0\1\21\3\0\16\21\1\103"+
    "\23\21\14\0\1\21\3\0\2\21\1\104\37\21\14\0"+
    "\1\21\3\0\7\21\1\105\32\21\14\0\1\21\3\0"+
    "\16\21\1\106\23\21\14\0\1\21\3\0\16\21\1\107"+
    "\23\21\14\0\1\21\3\0\3\21\1\110\36\21\14\0"+
    "\1\21\3\0\6\21\1\111\33\21\14\0\1\21\3\0"+
    "\23\21\1\100\16\21\14\0\1\21\3\0\36\21\1\112"+
    "\3\21\14\0\1\21\3\0\34\21\1\113\5\21\14\0"+
    "\1\21\3\0\37\21\1\103\2\21\14\0\1\21\3\0"+
    "\23\21\1\104\16\21\14\0\1\21\3\0\30\21\1\105"+
    "\11\21\14\0\1\21\3\0\37\21\1\106\2\21\14\0"+
    "\1\21\3\0\37\21\1\114\2\21\14\0\1\21\3\0"+
    "\24\21\1\115\15\21\14\0\1\21\3\0\27\21\1\116"+
    "\12\21\1\0\6\45\1\77\3\45\1\117\47\45\13\0"+
    "\1\21\3\0\3\21\1\120\36\21\14\0\1\21\3\0"+
    "\17\21\1\121\22\21\14\0\1\21\3\0\13\21\1\122"+
    "\26\21\14\0\1\21\3\0\11\21\1\123\30\21\14\0"+
    "\1\21\3\0\7\21\1\124\32\21\14\0\1\21\3\0"+
    "\24\21\1\120\15\21\14\0\1\21\3\0\40\21\1\125"+
    "\1\21\14\0\1\21\3\0\34\21\1\126\5\21\14\0"+
    "\1\21\3\0\32\21\1\123\7\21\14\0\1\21\3\0"+
    "\30\21\1\127\11\21\14\0\1\21\3\0\16\21\1\130"+
    "\23\21\14\0\1\21\3\0\17\21\1\131\22\21\14\0"+
    "\1\21\3\0\3\21\1\132\36\21\14\0\1\21\3\0"+
    "\37\21\1\130\2\21\14\0\1\21\3\0\40\21\1\133"+
    "\1\21\14\0\1\21\3\0\24\21\1\132\15\21\14\0"+
    "\1\21\3\0\16\21\1\134\23\21\14\0\1\21\3\0"+
    "\37\21\1\134\2\21\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3350];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\11\11\2\1\1\11\1\1\1\11\25\1\1\0"+
    "\1\1\1\11\27\1\1\0\17\1\1\11\15\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[92];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexicalAnalyzer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return new Symbol(sym.ERROR, yyline, yycolumn) ;
            }
            // fall through
          case 30: break;
          case 2:
            { /*espace : pas d'action*/
            }
            // fall through
          case 31: break;
          case 3:
            { return new Symbol(sym.MOD, yyline, yycolumn) ;
            }
            // fall through
          case 32: break;
          case 4:
            { return new Symbol(sym.PAR_G, yyline, yycolumn) ;
            }
            // fall through
          case 33: break;
          case 5:
            { return new Symbol(sym.PAR_D, yyline, yycolumn) ;
            }
            // fall through
          case 34: break;
          case 6:
            { return new Symbol(sym.MUL, yyline, yycolumn) ;
            }
            // fall through
          case 35: break;
          case 7:
            { return new Symbol(sym.PLUS, yyline, yycolumn) ;
            }
            // fall through
          case 36: break;
          case 8:
            { return new Symbol(sym.MOINS, yyline, yycolumn) ;
            }
            // fall through
          case 37: break;
          case 9:
            { return new Symbol(sym.POINT, yyline, yycolumn) ;
            }
            // fall through
          case 38: break;
          case 10:
            { return new Symbol(sym.DIV, yyline, yycolumn) ;
            }
            // fall through
          case 39: break;
          case 11:
            { return new Symbol(sym.ENTIER, yyline, yycolumn, Integer.valueOf(yytext())) ;
            }
            // fall through
          case 40: break;
          case 12:
            { return new Symbol(sym.SEMI, yyline, yycolumn) ;
            }
            // fall through
          case 41: break;
          case 13:
            { return new Symbol(sym.GT, yyline, yycolumn) ;
            }
            // fall through
          case 42: break;
          case 14:
            { return new Symbol(sym.EGAL, yyline, yycolumn) ;
            }
            // fall through
          case 43: break;
          case 15:
            { return new Symbol(sym.IDENT, yyline, yycolumn, yytext()) ;
            }
            // fall through
          case 44: break;
          case 16:
            { /*commentaire : pas d'action*/
            }
            // fall through
          case 45: break;
          case 17:
            { return new Symbol(sym.GTE, yyline, yycolumn) ;
            }
            // fall through
          case 46: break;
          case 18:
            { return new Symbol(sym.DO, yyline, yycolumn) ;
            }
            // fall through
          case 47: break;
          case 19:
            { return new Symbol(sym.IF, yyline, yycolumn) ;
            }
            // fall through
          case 48: break;
          case 20:
            { return new Symbol(sym.OR, yyline, yycolumn) ;
            }
            // fall through
          case 49: break;
          case 21:
            { return new Symbol(sym.AND, yyline, yycolumn) ;
            }
            // fall through
          case 50: break;
          case 22:
            { return new Symbol(sym.LET, yyline, yycolumn) ;
            }
            // fall through
          case 51: break;
          case 23:
            { return new Symbol(sym.NIL, yyline, yycolumn) ;
            }
            // fall through
          case 52: break;
          case 24:
            { return new Symbol(sym.NOT, yyline, yycolumn) ;
            }
            // fall through
          case 53: break;
          case 25:
            { return new Symbol(sym.ELSE, yyline, yycolumn) ;
            }
            // fall through
          case 54: break;
          case 26:
            { return new Symbol(sym.THEN, yyline, yycolumn) ;
            }
            // fall through
          case 55: break;
          case 27:
            { return new Symbol(sym.INPUT, yyline, yycolumn) ;
            }
            // fall through
          case 56: break;
          case 28:
            { return new Symbol(sym.WHILE, yyline, yycolumn) ;
            }
            // fall through
          case 57: break;
          case 29:
            { return new Symbol(sym.OUTPUT, yyline, yycolumn) ;
            }
            // fall through
          case 58: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
