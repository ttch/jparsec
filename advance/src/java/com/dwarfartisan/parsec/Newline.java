package com.dwarfartisan.parsec;

import com.sun.tools.classfile.CharacterRangeTable_attribute;

import java.io.EOFException;

/**
 * Created by Mars Liu on 2016-01-07.
 * Newline 尝试匹配换行.这里比 Haskell 版本更敏感, \r, \n, 或 \r\n 都可以解析成功.
 *
 * ---------------
 *
 * 这里把回车和换行分出,独立出去,用户可行自行重新命名和包装.
 * modify by zhaonf on 2016-1-10
 */
public class Newline implements Parsec<String, Character> {
    @Override
    public String parse(State<Character> s) throws EOFException, ParsecException {

        Parsec<String, Character> r = new Try<String, Character>(
                new Ch('\r').then(
                        new Return<String, Character>("\n")
        ));


        return r.parse(s);
    }
}
