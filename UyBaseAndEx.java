package com.almas;




/**
 * 基本区扩展区互换
 *
 * @author alimjan
 */
public class UyBaseAndEx {

    private static char[] UChar600 = {'ت', 'پ', 'ب', 'ر', 'د', 'چ', 'ج',
            'ز', 'ف', 'ق', 'ك', 'ش', 'گ', 'س', 'ڭ', 'ن', 'م', 'ۋ', 'ل', 'خ',
            'غ', 'ژ', 'ي', 'ا', 'ە', 'و', 'ۈ', 'ۆ', 'ۇ', 'ې', 'ى', 'ھ', 'ئ'};
    private static char[] UCharExB = {'ﺗ', 'ﭘ', 'ﺑ', 'ﺭ', 'ﺩ', 'ﭼ', 'ﺟ',
            'ﺯ', 'ﻓ', 'ﻗ', 'ﻛ', 'ﺷ', 'ﮔ', 'ﺳ', 'ﯕ', 'ﻧ', 'ﻣ', 'ﯞ', 'ﻟ', 'ﺧ',
            'ﻏ', 'ﮊ', 'ﻳ', 'ﺍ', 'ﻩ', 'ﻭ', 'ﯛ', 'ﯙ', 'ﯗ', 'ﯦ', 'ﯨ', 'ﮬ', 'ﺋ'};
    private static char[] UCharExO = {'ﺘ', 'ﭙ', 'ﺒ', 'ﺮ', 'ﺪ', 'ﭽ', 'ﺠ',
            'ﺰ', 'ﻔ', 'ﻘ', 'ﻜ', 'ﺸ', 'ﮕ', 'ﺴ', 'ﯖ', 'ﻨ', 'ﻤ', 'ﯟ', 'ﻠ', 'ﺨ',
            'ﻐ', 'ﮋ', 'ﻴ', 'ﺎ', 'ﻪ', 'ﻮ', 'ﯜ', 'ﯚ', 'ﯘ', 'ﯧ', 'ﯩ', 'ﮭ', 'ﺌ'};
    private static char[] UCharExA = {'ﺖ', 'ﭗ', 'ﺐ', 'ﺮ', 'ﺪ', 'ﭻ', 'ﺞ',
            'ﺰ', 'ﻒ', 'ﻖ', 'ﻚ', 'ﺶ', 'ﮓ', 'ﺲ', 'ﯔ', 'ﻦ', 'ﻢ', 'ﯟ', 'ﻞ', 'ﺦ',
            'ﻎ', 'ﮋ', 'ﻲ', 'ﺎ', 'ﻪ', 'ﻮ', 'ﯜ', 'ﯚ', 'ﯘ', 'ﯥ', 'ﻰ', 'ﮫ', 'ﺌ'};
    private static char[] UCharExY = {'ﺕ', 'ﭖ', 'ﺏ', 'ﺭ', 'ﺩ', 'ﭺ', 'ﺝ',
            'ﺯ', 'ﻑ', 'ﻕ', 'ﻙ', 'ﺵ', 'ﮒ', 'ﺱ', 'ﯓ', 'ﻥ', 'ﻡ', 'ﯞ', 'ﻝ', 'ﺥ',
            'ﻍ', 'ﮊ', 'ﻱ', 'ﺍ', 'ﻩ', 'ﻭ', 'ﯛ', 'ﯙ', 'ﯗ', 'ﯤ', 'ﻯ', 'ﮪ', 'ﺋ'};
    private static char[] SOL_KOL = {'ت', 'ئ', 'خ', 'چ', 'ج', 'پ', 'ب', 'س',
            'ش', 'غ', 'ف', 'ق', 'ك', 'گ', 'ڭ', 'ل', 'م', 'ن', 'ھ', 'ې', 'ى',
            'ي'};
    private static LA_Class la1 = new LA_Class('ﻟ', 'ﺎ', 'ﻻ');

    ;
    private static LA_Class la2 = new LA_Class('ﻠ', 'ﺎ', 'ﻼ');
    private static String[] strArrSelawenOrigin = {"ئا", "ئە", "ئې", "ئى", "ئو", "ئۇ", "ئۆ", "ئۈ", "ا", "ە", "ې", "ى", "و", "ۇ", "ۆ", "ۈ", "ش", "ڭ", "غ", "چ", "ب", "د", "ف", "گ", "ھ", "ج", "ك", "ل", "م", "ن", "پ", "ق", "ر", "س", "ت", "ۋ", "ي", "ز", "خ", "،", "؟", "؛", "ژ"};
    private static String[] strArrSelawen = {"a", "e", "é", "i", "o", "u", "ö", "ü", "a", "e", "é", "i", "o", "u", "ö", "ü", "sh", "ng", "gh", "ch", "b", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "w", "y", "z", "x", ",", "?", ";", "j"};

    private static int containsInArray(char[] arr, char s) {
        int rtn = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                rtn = i;
                break;
            }
        }
        return rtn;
    }



    private static String ProLA_HAMZE(String aWord) {

        char[] tmp = aWord.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tmp.length - 1; i++) {
            if (tmp[i] == la1.base1 && tmp[i + 1] == la1.base2) {
                sb.append(la1.ex);
                i++;
            } else if (tmp[i] == la2.base1 && tmp[i + 1] == la2.base2) {
                sb.append(la2.ex);
                i++;
            } else {
                sb.append(tmp[i]);
            }
        }
        if (aWord.length() < 2) {
            sb.append(aWord);
        } else {
            if (tmp[tmp.length - 2] == la1.base1 && tmp[tmp.length - 1] == la1.base2) {

            } else if (tmp[tmp.length - 2] == la2.base1 && tmp[tmp.length - 1] == la2.base2) {

            } else {
                sb.append(tmp[tmp.length - 1]);
            }
        }
        return sb.toString();
    }

    private static char getExChar(char achar, UyHarp k) {
        // 获取一个基本去字符对应的扩展区字符
        int indx = containsInArray(UChar600, achar);
        if (indx > -1) {
            switch (k) {
                case BASH:
                    return UCharExB[indx];
                case OTTURA:
                    return UCharExO[indx];
                case AHIR:
                    return UCharExA[indx];
                case YALGHUZ:
                    return UCharExY[indx];
            }
        }
        return achar;
    }


    /**
     * 转扩展去
     *
     * @param s
     * @return
     */
    public static String toEx(String s) {

        if (s.length() > 0 && s != null) {
            StringBuilder exWord = new StringBuilder();

            int indx, indx2, indx3 = -1;
            char c1, c2, c3, c1Ex, c2Ex;
            char[] tmp = s.toCharArray();
            if (s.length() == 1) {
                indx = containsInArray(UChar600, s.charAt(0));
                if (indx != -1)
                    return UCharExY[indx] + "";
                else
                    return s;
            }
            if (s.length() == 2) {
                c1 = tmp[0];
                c2 = tmp[1];

                if (containsInArray(SOL_KOL, c1) > -1) {
                    c1Ex = getExChar(c1, UyHarp.BASH);
                    c2Ex = getExChar(c2, UyHarp.AHIR);
                    return "" + c1Ex + c2Ex;
                }
            }
            c1 = tmp[0];
            c1Ex = getExChar(c1, UyHarp.BASH);
            exWord.append(c1Ex);

            for (int i = 1; i < tmp.length - 1; i++) {
                c1 = tmp[i - 1];
                c2 = tmp[i];
                c3 = tmp[i + 1];
                indx3 = containsInArray(UChar600, c3);
                indx2 = containsInArray(UChar600, c2);
                if (indx2 > -1) {
                    if (containsInArray(SOL_KOL, c1) > -1) {
                        if (indx3 > -1) {
                            c2Ex = getExChar(c2, UyHarp.OTTURA);
                        } else {
                            c2Ex = getExChar(c2, UyHarp.AHIR);
                        }
                    } else {
                        if (indx3 > -1) {
                            c2Ex = getExChar(c2, UyHarp.BASH);
                        } else {
                            c2Ex = getExChar(c2, UyHarp.YALGHUZ);
                        }
                    }
                } else
                    c2Ex = c2;
                exWord.append(c2Ex);
            }

            if (containsInArray(SOL_KOL, tmp[tmp.length - 2]) > -1) {
                c2Ex = getExChar(tmp[tmp.length - 1],
                        UyHarp.AHIR);
            } else {
                c2Ex = getExChar(tmp[tmp.length - 1],
                        UyHarp.YALGHUZ);
            }
            exWord.append(c2Ex);
            return ProLA_HAMZE(exWord.toString());
        }
        return "";
    }

    /**
     * 转换成基本区
     *
     * @param str 扩展区字符串
     * @return 返回基本区
     */
    public static String toBase(String str) {
        str = str.replace("ﻻ", "ﻟﺎ");
        str = str.replace("ﻼ", "ﻠﺎ");
        char[] tmp = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tmp.length; i++) {
            char base = tmp[i];
            for (int j = 0; j < UChar600.length; j++) {

                if (UCharExA[j] == tmp[i] ||
                        UCharExB[j] == tmp[i] ||
                        UCharExO[j] == tmp[i] ||
                        UCharExY[j] == tmp[i]) {
                    base = UChar600[j];
                    break;
                }
            }
            sb.append(base);
        }
        return sb.toString();
    }

    /**
     * 获取维吾尔语的Selawen文字
     *
     * @param word
     * @return
     */
    public static String toSelawen(String word) {
        String rtn = word;
        int i = 0;
        for (String s : strArrSelawenOrigin) {
            if (rtn.contains(s)) {
                rtn = rtn.replace(s, strArrSelawen[i]);
            }
            ++i;
        }
        return rtn;
    }
    private static enum UyHarp {
        BASH, OTTURA, AHIR, YALGHUZ
    }

    private static class LA_Class {
        public char base1, base2;
        public char ex;

        public LA_Class(char base1, char base2, char ex) {
            this.base1 = base1;
            this.base2 = base2;
            this.ex = ex;
        }
    }

}